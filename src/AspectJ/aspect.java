package AspectJ;

//import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class aspect {

  @Before("allGetter() && before()")
  public void beforeGetName(JoinPoint joinpoint) {

    System.out.println("Before Method" + joinpoint.toString());

  }

  @AfterReturning(pointcut = "args(name)", returning = "returnName")
  public void AfterGetName(JoinPoint joinPoint, String name, String returnName) {

    System.out.println(joinPoint.toString() + " ++ " + name + " ++ " + returnName);

  }

  @Before("args(name)")
  public void beforeSet(String name) {
    System.out.println("-------- before set -------------------  " + name);

  }

  @After("args(name)")
  public void afterSet(String name) {
    System.out.println("-------- after set -------------------  " + name);

  }

  @Pointcut("execution(* get*())")
  public void allGetter() {

  }

  @Pointcut("within(springRevision.HelloWorld)")
  public void before() {
  }

  // use around insteab of before and after ......
  @Around("allGetter()")
  public void aroundGetter(ProceedingJoinPoint joinPoint) {

    System.out.println("Before");
    try {
      joinPoint.proceed();
      System.out.println("After");

    } catch (Throwable e) {
      // TODO Auto-generated catch block
      System.out.println("Exception");
    }
    System.out.println("finally");

  }

  // Using loggable annotations ......
  @Around("@annotation(AspectJ.loggable)")
  public void aroundGetterAnnotation(ProceedingJoinPoint joinPoint) {

    System.out.println("Before //////////////////");
    try {
      joinPoint.proceed();
      System.out.println("After ///////////////");

    } catch (Throwable e) {
      // TODO Auto-generated catch block
      System.out.println("Exception");
    }
    System.out.println("finally ///////////");

  }

}
