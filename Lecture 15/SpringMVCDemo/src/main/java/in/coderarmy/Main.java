package in.coderarmy;

import in.coderarmy.config.WebConfig;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws LifecycleException {

        // boiler plate
        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8080);
        tomcat.getConnector(); // so that can connect to port 8080

        String contextPath = "";
        String baseDoc = new File("C:\\\\Users\\\\Rohit Kumawat\\\\SpringBoot\\\\Lecture 15\\\\SpringMVCDemo\\\\src\\\\main\\\\webapp").getAbsolutePath();

        Context context = tomcat.addContext(contextPath,baseDoc);

        // IOC container app
        AnnotationConfigWebApplicationContext springContext = new AnnotationConfigWebApplicationContext();
        springContext.register(WebConfig.class);

        // dispatcher servelet
        DispatcherServlet dispatcherServlet = new DispatcherServlet(springContext);
        Tomcat.addServlet(context ,"dispatcherServlet" , dispatcherServlet);

        context.addServletMappingDecoded("/" , "dispatcherServlet");
        tomcat.start();

        System.out.println("Tomcat Started at port 8080");

        // keep server running
        tomcat.getServer().await();
    }
}
