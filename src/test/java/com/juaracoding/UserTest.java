package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserTest {

    User user;

    @BeforeMethod
    public void setUp(){
        user = new User();
    }

    @Test(enabled = false)
    public void checkLogin(){
        user.setUsername("Dicky");
        user.setPassword("123");
        Assert.assertTrue(user.checklogin());
    }
    @Test(priority = 0)
    public void testErrorMassage(){
        boolean result = user.getErrorMessage().contains("Invalid Username & Password");//kalo error isi invalid atau yang tidak sama dengan output
        Assert.assertTrue(result);
    }
}
