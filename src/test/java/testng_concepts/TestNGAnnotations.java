package testng_concepts;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @BeforeTest
    public void beforeTest() {
        System.out.println("\tBefore Test: first @Test method of first class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("\tAfter Test: last @Test method of last class");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("\t\tbefore class: first @Test method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("\t\tafter class: last @Test method");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("\t\t\tbefore @Test method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("\t\t\tafter @Test method");
    }

    @Test
    public void test1() {
        System.out.println("\t\t\t\ttest method one");
    }

    @Test
    public void abctest() {
        System.out.println("\t\t\t\ttest method two");
    }

    @Test
    public void ABCTest() {
        System.out.println("\t\t\t\ttest method three");
    }


}
