package in.coderarmy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
//@Lazy
@Scope("prototype")
public class CartService implements BeanNameAware, ApplicationContextAware
        /*DisposableBean*/
        /*implements InitializingBean*/ {
    HashMap<Integer,String> mp ;

    public CartService(){
        mp = new HashMap<>();
        System.out.println("CartService Constructor Called");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Initialization Callback");
//        mp.put(1,"Rohit");
//        mp.put(2,"Rohan");
//    }

//    public void start(){
//        System.out.println("Initialization Callback");
//        mp.put(1,"Rohit");
//        mp.put(2,"Rohan");
//    }

    @PostConstruct
    public void start2(){
        System.out.println("Initialization Callback");
        mp.put(1,"Rohit");
        mp.put(2,"Rohan");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanName is "+ name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext name is " + applicationContext.getClass());
    }

    public void addToCart(){
        System.out.println("Added to Cart");
    }
    public String getValue(int key){
        return mp.get(key);
    }

//    @Override
//    public void destroy() throws Exception {
//        mp.clear();
//        System.out.println("Bean is Getting Destroyed");
//    }

//    public void stop(){
//        mp.clear();
//        System.out.println("Bean is Getting Destroyed");
//    }
    @PreDestroy
    public void stop2(){
        mp.clear();
        System.out.println("Bean is Getting Destroyed");
    }
}
