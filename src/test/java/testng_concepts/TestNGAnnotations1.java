package testng_concepts;

import org.testng.annotations.*;

public class TestNGAnnotations1 {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite: first @Test of first class of first test tag");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite: last @Test of last class of last test tag");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("\t\tBefore class: class 2 first @Test method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("\t\tAfter class: class 2 last @Test method");
    }

    @Test
    public void test3() {
        System.out.println("\t\t\t\tsecond class test 3 method");
    }
}
