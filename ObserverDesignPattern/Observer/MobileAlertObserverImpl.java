package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String username;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String username, StockObservable observable) {
        this.username = username;
        this.stockObservable = observable;
    }


    @Override
    public void update() {
        sendMegOnMobile(username, "product is in stock hurry up!");
    }

    private void sendMegOnMobile(String username, String message) {
        System.out.println("sms sent to:" + username );
    }
}
