package in.coderarmy.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier
@Qualifier("up")
public class UpiPayment implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Paying via UPI Payment");
    }
}
