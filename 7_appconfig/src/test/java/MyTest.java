import com.robin.config.RobinConfig;
import com.robin.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RobinConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());
    }
}
