package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmployeeTest {
Employee employee;

@BeforeMethod
public void setUp(){
    employee = new Employee();
}

@Test
    public void testName(){
            employee.setName("Siliwangi");
        Assert.assertEquals(employee.getName(), "Siliwangi");
    }

    @Test
    public void testAddress() {
        employee.setAddress("Jakarta");
        Assert.assertEquals(employee.getAddress(), "Jakarta");
    }

    @Test
    public void testSalary(){
    employee.setSalary(10000);
    Assert.assertEquals(employee.getSalary(),10000);
    }

//    @Test redundan
//    public void testName(){
//        Employee employee = new Employee();
//        employee.setName("Siliwangi");
//        Assert.assertEquals(employee.getName(), "Siliwangi");
//    }    @Test
//    public void testAddress(){
//        Employee employee = new Employee();
//        employee.setAddress("Jakarta");
//        Assert.assertEquals(employee.getAddress(),"Jakarta" );
//    } //Redundan


}
