import core.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

/**
 * Created by pfatula on 17.02.2017.
 */
@RunWith(Parameterized.class)
public class SimpleTest {

    private int a;
    private int b;

    private static Object[][] generateRndArr(int arrLenght){
        Object[][] arr = new Object[arrLenght][2];
        for(int i = 0; i<arrLenght; i++){
            arr[i][0] = new Random().nextInt(10);
            arr[i][1] = new Random().nextInt(10);
        }

        return arr;
    }


    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(generateRndArr(10));
    }

    public SimpleTest(int fir, int sec){
        this.a = fir;
        this.b = sec;
    }

    @Test
    public void test(){
        Assert.assertEquals("not match", a , b );
//        WebDriver driver = WebDriverManager.createInstanceFor("chrome");
//        driver.navigate().to("http://www.google.com");
    }




}
