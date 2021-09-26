package testng_concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestAnnotationDemo {

    @Test
    public void test1(){
        System.out.println("test method one");
        Reporter.log("test method one");
    }

    @Test
    public void test2() {
        System.out.println("test method two");
        Reporter.log("test method two");
    }
}
