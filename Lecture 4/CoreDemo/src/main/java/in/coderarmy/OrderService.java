package in.coderarmy;

import in.coderarmy.Notification.EmailService;
import in.coderarmy.Notification.NotificationService;
import in.coderarmy.Notification.PopUpService;
import in.coderarmy.Notification.SmsService;

public class OrderService {
    NotificationService notification; // here we just Create refernce

    // creating cunstructor
    public OrderService(NotificationService notification){ // this in which its service is added throw main this is called service injection
        this.notification = notification;
    }
    public OrderService(){

    }
    public void placeOrder(){
        System.out.println("Order Placed");
        notification.sendNotification();
    }

    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }
}
