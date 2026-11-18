package Observable;
import Observable.StocksObservable;
import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {


    public List<NotificationAlertObserver> observeList=new ArrayList<>();
    public int stockCount=0;


    @Override
    public void add(NotificationAlertObserver observer) {
        observeList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer){
        observeList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer:observeList){
            observer.update();
        }
    }

    public void setStockCount(int newStockadded){
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount=stockCount+newStockadded;
    }
    public int getStockCount(){
        return stockCount;
    }
}