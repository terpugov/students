import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.inno.students.User;
import ru.inno.students.UserRepository;

import javax.jws.soap.SOAPBinding;

/**
 * Created by mikhail on 21/01/17.
 */
@ContextConfiguration("classpath:test-aplication.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest {

    @Autowired
    private UserRepository userRepository;
    @Test
    public void selectTest(){
        Iterable<User> users = userRepository.findAll();

        for (User u: users){
            System.out.printf("%3d | %10s | %s" , u.getId(), u.getName(), u.getPassword());
        }
    }
}
