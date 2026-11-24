package uilab;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

public abstract class BaseTest {
  protected ChromeDriver driver; protected WebDriverWait wait;
  @BeforeEach void start(){ driver=new ChromeDriver(); wait=new WebDriverWait(driver,Duration.ofSeconds(10)); }
  @AfterEach void stop(){ if(driver!=null) driver.quit(); }
  protected void open(String url){ driver.get(url); }
}
