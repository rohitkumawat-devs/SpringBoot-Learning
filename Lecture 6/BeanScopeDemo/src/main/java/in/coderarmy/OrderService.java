package in.coderarmy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//// by default
@Scope("singleton")
//@Scope("prototype") // lazy initialization

public class OrderService {

    public OrderService(){
        System.out.println("Order Service Created");
    }

    public void placeOrder(){
        System.out.println("Order Placed");
    }
}
