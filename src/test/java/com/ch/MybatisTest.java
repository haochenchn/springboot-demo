package com.ch;

import com.ch.pojo.User;
import com.ch.system.dao.DaoSupport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(HelloApplication.class)
public class MybatisTest {
    @Autowired
    private DaoSupport daoSupport;

    @Test
    public void test1() throws Exception {
        User user = (User) daoSupport.findForObject("userMapper.findUserById","d");
        System.out.println(user.toString());
    }
}
