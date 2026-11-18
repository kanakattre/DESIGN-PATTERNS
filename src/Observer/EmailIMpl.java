package Observer;

import Observable.StocksObservable;

public class EmailIMpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable observable;


   public EmailIMpl( String emailId,StocksObservable observable){
        this.emailId=emailId;
        this.observable=observable;
    }

    @Override
    public void update(){
        sendEmail(emailId,"product in stock");
    }

    private void sendEmail(String emailId,String msg){
        System.out.println("mail"+ emailId);
    }



}
