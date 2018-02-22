package lsk.AOP;

/**
 * Created by lsk10238 on 2018/2/22.
 */
public class Logging {
    public void beforeAdvice(){
        System.out.println("正在执行 beforeAdvice ：准备构建学生信息。。。");
    }

    public void afterAdvice(){
        System.out.println("正在执行 afterAdvice ：学生信息已构建好了。。。");
    }

    public void afterReturningAdvice(Object retVal){
        System.out.println("正在执行 afterReturningAdvice :返回的信息是：" + retVal.toString() );
    }

    public void afterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("抛异常出来了，异常信息是：" + ex.toString());
    }
}
