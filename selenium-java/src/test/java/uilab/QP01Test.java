package uilab;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.jupiter.api.Assertions.*;

class QP01Test extends BaseTest {
  @Test void customPizzaReachesAdminList(){
    open("https://quickpizza.grafana.com/");
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1")));
    driver.findElement(By.xpath("//label[.//span[normalize-space()='Advanced']]")).click();
    var calories=By.xpath("//label[normalize-space()='Max Calories per Slice']/../input");
    wait.until(ExpectedConditions.visibilityOfElementLocated(calories)).clear();
    driver.findElement(calories).sendKeys("600");
    driver.findElement(By.cssSelector("select")).click();
    driver.findElement(By.cssSelector("select option[value='Knife']")).click();
    driver.findElement(By.id("default-checkbox")).click();
    String name="Lab Pizza "+System.currentTimeMillis();
    driver.findElement(By.cssSelector("input#pizza-name")).clear();
    driver.findElement(By.cssSelector("input#pizza-name")).sendKeys(name);
    driver.findElement(By.name("pizza-please")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[starts-with(., 'Name:')]")));
    assertTrue(driver.findElement(By.xpath("//p[starts-with(., 'Name:')]" )).getText().contains(name));
    driver.findElement(By.name("rate-5")).click();
    assertEquals("Please log in first.",wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rate-result"))).getText());
  }
}
