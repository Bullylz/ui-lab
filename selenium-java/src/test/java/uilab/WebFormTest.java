package uilab;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WebFormTest extends BaseTest {
  @Test void submitsWebForm(){
    open("https://www.selenium.dev/selenium/web/web-form.html");
    driver.findElement(By.id("my-text-id")).sendKeys("Phumat UI Lab");
    driver.findElement(By.cssSelector("button[type='submit']")).click();
    assertEquals("Received!", driver.findElement(By.id("message")).getText());
  }
}
