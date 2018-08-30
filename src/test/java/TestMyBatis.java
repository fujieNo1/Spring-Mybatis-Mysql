import com.alibaba.fastjson.JSON;
import com.fj.pojo.User;
import com.fj.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Resource
    private UserService userService;

    @Test
    public void test(){
//        User user = new User();
//        user.setId("3");
//        user.setName("fff");
//        user.setPassword("admin");
//        userService.save(user);
        User user = userService.getUserById("1");
        logger.info(JSON.toJSON(user));
    }
}
