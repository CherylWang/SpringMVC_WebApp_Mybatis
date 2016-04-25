import dao.sql.UserEntitySQL;
import model.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;


import java.util.List;

/**
 * Created by wanghaiyan on 2016/4/13.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
@TransactionConfiguration(defaultRollback = false)


public class SQLTest {
    String string="hello world";

    @Autowired
    private UserEntitySQL  userEntitySQL;
    @Test
    public void Test(){

    }


}
