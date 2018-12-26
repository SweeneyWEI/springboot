package springTest;

import com.org.Application;
import com.org.service.IUserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by weixin on 17-8-29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class springTest {

    @Autowired

    private IUserService userService;

}
