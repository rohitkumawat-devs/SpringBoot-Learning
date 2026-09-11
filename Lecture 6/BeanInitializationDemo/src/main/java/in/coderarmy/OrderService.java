package in.coderarmy;

import jdk.jfr.Label;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class OrderService {
    PaymentService paymentService;
    public OrderService(@Lazy PaymentService paymentService){
        this.paymentService = paymentService;
//        System.out.println("Order Service Created");
    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order Placed");
    }

    public void  getOrderDetails(){
        System.out.println("Order details");
    }
}
