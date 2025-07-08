package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class locatorTests {
WebDriver driver;
@BeforeClass
public void setUpDriver(){
    driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/login");

}



@Test
    public void testLocators(){
    WebElement username = driver.findElement(By.id("username"));
username.sendKeys("tomsmith");
    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys("SuperSecretPassword!");
WebElement logInButton = driver.findElement(By.className("radius"));
logInButton.click();
WebElement FlashMessage = driver.findElement(By.cssSelector("#flash"));
    System.out.println("Flash message :" + FlashMessage.getText());
    // xpath
    // "//tagName[@attribute='value']"
WebElement logOut = driver.findElement(By.xpath("//a[@class='button secondary radius']"));
logOut.click();

}
@AfterTest
    public void close() throws InterruptedException {
    Thread.sleep(3000);
    driver.close();
}






}
