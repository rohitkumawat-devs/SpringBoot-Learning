package in.coderarmy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        OrderService order  = context.getBean(OrderService.class);
//        order.placeOrder();

//        UserService userService = context.getBean(UserService.class);
//        userService.setBeanName("MyBean"); // this will only print on screen not change bean name in ioc container
    }
}
