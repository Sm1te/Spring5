import com.robin.Li.UserLiImpl;
import com.robin.Li.UserLiMysqlImpl;
import com.robin.Service.UserService;
import com.robin.Service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    public static void main(String[] args) {
//        //用户实际调用的业务层，li层不用接触
//        //UserService service = new UserServiceImpl();
//        UserService service = new UserServiceImpl();
//        ((UserServiceImpl) service).setUserLi(new UserLiImpl());
//        service.getUser();
        //获取ApplicationContext, 拿到容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
