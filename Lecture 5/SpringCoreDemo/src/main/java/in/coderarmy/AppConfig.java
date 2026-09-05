package in.coderarmy;

import in.coderarmy.payment.CardPayment;
import in.coderarmy.payment.PaymentService;
import in.coderarmy.payment.UpiPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("in.coderarmy")
public class AppConfig {

    @Bean
    public User createUser(){
        return new User("Rohit",21);
    }

    @Bean
//    @Primary
    @Qualifier
    public PaymentService createCardPayment(){
        return new CardPayment();
    }

    @Bean
    @Qualifier
    public PaymentService createUpiPayment(){
        return new UpiPayment();
    }

    @Bean
    public OrderService createOrderService(@Qualifier("createUpiPayment") PaymentService payment){
        return new OrderService(payment);
    }
}
