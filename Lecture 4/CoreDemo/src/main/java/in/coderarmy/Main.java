package in.coderarmy;

import in.coderarmy.Notification.EmailService;
import in.coderarmy.Notification.NotificationService;
import in.coderarmy.Notification.PopUpService;
import in.coderarmy.Notification.SmsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        NotificationService service = new SmsService();
//        OrderService order = new OrderService(service);
        OrderService order  =  new OrderService();
        order.setNotification(service);
        order.placeOrder();
        }
    }


// a class should ask what it need and not build everything

// IOC - Inversion of Control