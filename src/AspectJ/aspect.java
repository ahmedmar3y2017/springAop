package AspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class aspect {

  @Before("execution(String getName())")
  public void beforeGetName() {

    System.out.println("Before Method");

  }

}
