import core.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by pfatula on 21.02.2017.
 */
public class OtherTest {

    private By locator = By.("asdfas");

    @Test
    public void generateException(){

        WebDriverManager.getDriver().findElement(locator);


        throw new RuntimeException("life is pain");
    }

    @Test
    public void creatingNULLpointer(){
        WebDriverManager.getDriver().navigate().to("http://google.com");
    }
}
