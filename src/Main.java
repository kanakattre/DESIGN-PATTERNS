import Observable.StocksObservable;
import Observer.EmailIMpl;
import Observer.NotificationAlertObserver;
import Observable.IphoneObservableImpl;

public class Main{


    public static void main(String args[]){


        StocksObservable iphoneStockObservable=new IphoneObservableImpl();
        NotificationAlertObserver observer1=new EmailIMpl("axy@gmail.com",iphoneStockObservable);
        iphoneStockObservable.add(observer1);
        iphoneStockObservable.setStockCount(10);
    }
}
