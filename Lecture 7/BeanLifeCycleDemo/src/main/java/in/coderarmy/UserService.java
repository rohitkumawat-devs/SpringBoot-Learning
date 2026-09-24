package in.coderarmy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//@Component
//@Component("userBean") // can also do like this
public class UserService implements BeanNameAware , ApplicationContextAware {
    public UserService(){
        System.out.println("UserService Constructor Called");
    }

    @Override
    // method which are called by spring are called callback method
    public void setBeanName(String name){
        System.out.println("BeanName is "+ name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext name is " + applicationContext.getClass());
    }
}
