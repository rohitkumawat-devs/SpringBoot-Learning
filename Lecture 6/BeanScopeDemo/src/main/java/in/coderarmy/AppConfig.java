package in.coderarmy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public OrderService getOrder(){
        return  new OrderService();
    }

    @Bean
    public OrderService getOrder1(){
        return new OrderService();
    }
}
