package uilab.pages;
import org.openqa.selenium.*;
public class HomePage {
  private final WebDriver d; public HomePage(WebDriver d){this.d=d;}
  public void open(){d.get("https://quickpizza.grafana.com/");}
  public WebElement calories(){return d.findElement(By.xpath("//label[normalize-space()='Max Calories per Slice']/../input"));}
  public void pizza(String name){calories().clear(); calories().sendKeys("600"); d.findElement(By.cssSelector("select")).click(); d.findElement(By.cssSelector("select option[value='Knife']")).click(); d.findElement(By.id("default-checkbox")).click(); d.findElement(By.cssSelector("input#pizza-name")).sendKeys(name); d.findElement(By.name("pizza-please")).click();}
}
