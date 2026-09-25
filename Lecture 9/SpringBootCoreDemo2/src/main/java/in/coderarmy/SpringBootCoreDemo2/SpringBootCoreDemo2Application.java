package in.coderarmy.SpringBootCoreDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.BasicJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages = "in.coderArmy")
// /\ if we want it to ComponentScan in diff dirctory
// here it contains @SpringBootConfiguration internally so
// we can use beans here in main folder
public class SpringBootCoreDemo2Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootCoreDemo2Application.class, args);
		OrderService orderService = context.getBean(OrderService.class);
		orderService.placeOrder();


	}
//	@Bean
//	public UserService getUserService(){
//		return new UserService();
//	}

//	@Bean
//	public JsonParser getJsonParser(){
//		return new BasicJsonParser();
//	}
}
