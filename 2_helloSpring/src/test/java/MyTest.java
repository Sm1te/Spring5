import com.robin.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文对象！
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //对象目前都在spring中管理，如果要使用，直接去取出来就行
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());;
    }
}
