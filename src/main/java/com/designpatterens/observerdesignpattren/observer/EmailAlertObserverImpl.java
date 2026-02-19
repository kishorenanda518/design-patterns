package com.designpatterens.observerdesignpattren.observer;

import com.designpatterens.observerdesignpattren.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;
    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
     sendEmail(emailId,"Product is in stock hurry up!");
    }
    private void sendEmail(String emailId,String msg){
        System.out.println("mail sent to "+emailId);
    }
}
