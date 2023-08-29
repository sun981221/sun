package com.testing.class11;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginSampleTest {
    private  LoginSample ls;

    @Before
    public void setUp() throws Exception {
        LoginSample ls = new LoginSample();

    }

    @After
    public void tearDown() throws Exception {
    }


    //测试登陆成功
    @Test
    public void loginSuccess() {
        ls.login("Roy","123456");
        assertEquals("恭喜您，登录成功",ls.getResultMSG());
    }

    @Test
    public void loginFial() {
        ls.login( "null","123456");
        assertEquals("用户名密码长度应是3-16位！",ls.getResultMSG());
        fail("啥也没做，测试失败");
    }
}