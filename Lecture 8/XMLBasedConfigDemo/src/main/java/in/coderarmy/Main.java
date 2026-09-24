package in.coderarmy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // Get bean by type
        // this will not work when we have more than one bean
        // OrderService orderService = context.getBean(OrderService.class);


        // using id
        // OrderService orderService = (OrderService) context.getBean("orderService");

        // we pass both orderService bean and id
        OrderService orderService = context.getBean("orderServiceBean2",OrderService.class);

        PaymentService payment = context.getBean("paymentService" , PaymentService.class);
        payment.pay();
        orderService.placeOrder();
    }
}
