package springRevision;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class start {
  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
    HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
    obj.setName("ddd");
    System.out.println(obj.nn("eslam"));
    System.out.println(obj.getName());
    System.out.println(obj.getAddress());

  }
}
