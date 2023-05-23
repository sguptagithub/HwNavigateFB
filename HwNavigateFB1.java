package HwNavigateFB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwNavigateFB1 {
    /*HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new account

     */
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement createUser = driver.findElement(By.xpath("//a[text()='Create new account]"));
        Thread.sleep(2000);
        createUser.click();
        Thread.sleep(2000);

       driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sunny");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("William");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("568-444-9787");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='reg_email_']")).sendKeys("swilliam@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='reg_passwd_']")).sendKeys("Sunny9787");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='birthday_month']")).sendKeys("March");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='birthday_day']")).sendKeys("04");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='birthday_year']")).sendKeys("1977");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='gender']")).sendKeys("Female");
        Thread.sleep(2000);

       driver.findElement(By.xpath("//input[@name='Sign Up']")).sendKeys("click");
        Thread.sleep(2000);

        driver.close();

        driver.quit();
    }
}
