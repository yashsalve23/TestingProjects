/* package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.DriverManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class cura {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //fullscreenscre
        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        //book appointment
        Thread.sleep(1000);
        driver.findElement(By.id("btn-make-appointment")).click();
        //login
        Thread.sleep(1000);
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        Thread.sleep(1000);
        driver.findElement(By.id("btn-login")).click();

    //TO Select Drop Down List
        Thread.sleep(1000);
        WebElement w =driver.findElement(By.id("combo_facility"));
        Select dropdown= new Select(w);
        dropdown.selectByIndex(1);

        Thread.sleep(1000);
        driver.findElement(By.id("chk_hospotal_readmission")).click();

        Thread.sleep(1000);
        driver.findElement(By.id("radio_program_medicaid")).click();

        Thread.sleep(1000);
        driver.findElement(By.id("txt_visit_date")).sendKeys("23/03/2003");

        Thread.sleep(1000);
        driver.findElement(By.id("txt_comment")).sendKeys("Dear Doctor,\n" +
                "\n" +
                "I urgently need an appointment due to severe abdominal pain. My symptoms have worsened, and immediate attention is necessary. Please let me know if you can fit me in as soon as possible.\n" +
                "\n" +
                "Thank you");

        Thread.sleep(1000);
        driver.findElement(By.id("btn-book-appointment")).click();

        Thread.sleep(1000);
        driver.findElement(By.linkText("Go to Homepage")).click();

        Thread.sleep(1000);
        driver.quit();

    }
}
*/