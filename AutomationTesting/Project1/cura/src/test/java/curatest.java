import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class curatest {

    WebDriver driver;

    @BeforeTest
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void end(){
        driver.quit();
    }

    @Test
    public void openwebsite() throws InterruptedException {
        Thread.sleep(1000);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        //book appointment

        driver.findElement(By.id("btn-make-appointment")).click();
        //login

        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");

        driver.findElement(By.id("btn-login")).click();

        //TO Select Drop Down List

        WebElement w =driver.findElement(By.id("combo_facility"));
        Select dropdown= new Select(w);
        dropdown.selectByIndex(1);

        //check-box
        driver.findElement(By.id("chk_hospotal_readmission")).click();

        //radio-button
        driver.findElement(By.id("radio_program_medicaid")).click();

        //birth date
        driver.findElement(By.id("txt_visit_date")).sendKeys("23/03/2003");

        //comment
        driver.findElement(By.id("txt_comment")).sendKeys("Dear Doctor,\n" +
                "\n" +
                "I urgently need an appointment due to severe abdominal pain. My symptoms have worsened, and immediate attention is necessary. Please let me know if you can fit me in as soon as possible.\n" +
                "\n" +
                "Thank you");

        //book appointment
        driver.findElement(By.id("btn-book-appointment")).click();

        //back to the home page
        driver.findElement(By.linkText("Go to Homepage")).click();
    }
}
