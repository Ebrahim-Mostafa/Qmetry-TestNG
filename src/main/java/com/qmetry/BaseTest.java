package com.qmetry;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void beforeEachTest() {
        System.out.println("This is executed before each Test");
    }

    @AfterTest
    public void afterEachTest() {
        System.out.println("This is exceuted after each Test");
    }
}
