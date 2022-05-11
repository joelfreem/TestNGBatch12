package class01;

import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 3)
    public void First(){
        System.out.println("1st");
    }
    @Test(priority = 2)
    public void Second(){
        System.out.println("2nd");
    }
    @Test(priority = 1)
    public void Third(){
        System.out.println("3rd");
    }
}
