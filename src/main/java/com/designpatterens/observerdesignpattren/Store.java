package com.designpatterens.observerdesignpattren;

import com.designpatterens.observerdesignpattren.observable.IPhoneObservableImpl;
import com.designpatterens.observerdesignpattren.observable.StockObservable;
import com.designpatterens.observerdesignpattren.observer.EmailAlertObserverImpl;
import com.designpatterens.observerdesignpattren.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IPhoneObservableImpl();


        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyza@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("xyzb@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer4 = new EmailAlertObserverImpl("xyzc@gmail.com",iphoneStockObservable);


        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);
        iphoneStockObservable.add(observer4);

        iphoneStockObservable.setStockCount(0);
    }
}
