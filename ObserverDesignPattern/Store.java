package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneObservableImpl;
import ObserverDesignPattern.Observable.StockObservable;
import ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("xyz_username", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);

    }
}
