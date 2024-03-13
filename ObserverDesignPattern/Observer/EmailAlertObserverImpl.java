package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.stockObservable = observable;
    }


    @Override
    public void update() {
        sendEmail(emailId, "product is in stock hurry up!");
    }

    private void sendEmail(String emailId, String message) {
        System.out.println("mail sent to:" + emailId );
    }
}
