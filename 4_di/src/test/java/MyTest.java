import com.robin.pojo.Student;
import com.robin.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = (User) context.getBean("user2");
        System.out.println(user.toString());
    }
}
