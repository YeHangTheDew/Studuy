package Server;

import com.ye.bean.User;
import com.ye.service.Impl.UserServiceImpl;
import com.ye.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args){
        ApplicationContext context=new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        UserServiceImpl us= (UserServiceImpl) context.getBean("userService");
       User user=us.getUser("23");
       System.out.println(user);
       User user1=new User();
       user1.setPageNum(0);
       user1.setPageSize(5);
        List<User> list=us.getALLUser(user1);
        for(User s:list){
            System.out.println(s);
        }
        System.out.println(list);
    }
}
