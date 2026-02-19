package com.designpatterens.observerdesignpattren.observer;

import com.designpatterens.observerdesignpattren.observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    String username;
    StockObservable observable;

    public MobileAlertObserver(String username, StockObservable observable) {
    username = this.username;
    this.observable = observable;
    }

    private void sendMsgOnMobile(String username,String msg){
        System.out.println("msg sent to:"+username);
    }

    @Override
    public void update() {

    }
}
