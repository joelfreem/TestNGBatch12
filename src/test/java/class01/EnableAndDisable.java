package class01;

import org.testng.annotations.Test;

public class EnableAndDisable {

    @Test(enabled = false)
    public void First(){
        System.out.println("1st");
    }
    @Test
    public void Second(){
        System.out.println("2nd");
    }
    @Test
    public void Third(){
        System.out.println("3rd");
    }
}
