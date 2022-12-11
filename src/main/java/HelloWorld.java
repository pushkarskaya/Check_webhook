import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class HelloWorld {
   // private Logger logger = LogManager.getLogger(HelloWorld.class);


    private WebDriver wb;
    List<String> browserOptions=new ArrayList<>();
    String url="https://mail.ru/";

    public static void main(String [] args)
    {
       // System.out.println("Hello, World");


    }
    @Test
    public void testMail(){
        browserOptions.add("--incognito");
        wb=WebDriverFactory.createNewDriver(webDriverName.CHROME,browserOptions);
        wb.get(url);
    };

}
