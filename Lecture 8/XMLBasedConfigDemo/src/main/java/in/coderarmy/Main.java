package in.coderarmy;

import com.sun.tools.jconsole.JConsoleContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
        // Get bean by type
        // this will not work when we have more than one bean
        // OrderService orderService = context.getBean(OrderService.class);


        // using id
        // OrderService orderService = (OrderService) context.getBean("orderService");

        // we pass both orderService bean and id
//        OrderService orderService = context.getBean("orderService",OrderService.class);
//        orderService.placeOrder();
        UserService user = context.getBean(UserService.class);
//        System.out.println(user.getUserNames());
        context.close();
    }
}
