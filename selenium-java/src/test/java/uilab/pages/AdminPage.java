package uilab.pages;
import org.openqa.selenium.*;
public class AdminPage {
  private final WebDriver d; public AdminPage(WebDriver d){this.d=d;}
  public void login(String user,String pass){d.get("https://quickpizza.grafana.com/admin"); d.findElement(By.id("username")).clear(); d.findElement(By.id("username")).sendKeys(user); d.findElement(By.id("password")).clear(); d.findElement(By.id("password")).sendKeys(pass); d.findElement(By.cssSelector("button[type='submit']")).click();}
}
