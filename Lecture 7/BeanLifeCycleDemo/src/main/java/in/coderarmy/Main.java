package in.coderarmy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        OrderService order  = context.getBean(OrderService.class);
//        order.placeOrder();

//        UserService userService = context.getBean(UserService.class);
//        userService.setBeanName("MyBean"); // this will only print on screen not change bean name in ioc container
        CartService cart = context.getBean(CartService.class);
        System.out.println(cart.getValue(1));

        context.close(); // it exist in child not of Application Context so we use ConfigurationApplicationContext
    }
}
