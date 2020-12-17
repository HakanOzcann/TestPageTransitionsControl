package TestPageTransitions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestPageTransitions
{
    WebDriver driver;
    @BeforeTest
    public void driverChrome() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/geckodriver");
        driver = new ChromeDriver();
        String baseUrl = "https://www.getir.com/";
        driver.get(baseUrl);

    }

    @Test(priority = 1)
    public void checkFood()
    {
        driver.manage().window().maximize();
        WebElement getirHomepage = driver.findElement(By.xpath("//*[@id=\"menu-why\"]"));
        WebElement getirFood= driver.findElement(By.xpath("//*[@id=\"features\"]/div[1]/div/h2"));

        getirHomepage.isDisplayed();
        getirHomepage.click();
        Assert.assertEquals(true, getirFood.isDisplayed());
        // System.out.println(getirFood.getText()); //control for next page.

    }

    @Test(priority = 2)
    public void checkCareer()
    {
        WebElement checkCareer = driver.findElement(By.xpath("//*[@id=\"menu-career\"]"));
        checkCareer.click();

    }

    @Test(priority = 3)
    public void checkDealerShip()
    {
        WebElement checkDealerShip = driver.findElement(By.xpath("//*[@id=\"menu-career\"]"));
        checkDealerShip.click();

    }

    @Test(priority = 4)
    public void checkContact()
    {
        WebElement checkContact = driver.findElement(By.xpath("//*[@id=\"menu-contact\"]"));
        checkContact.click();

    }

    @Test(priority = 4)
    public void checkCovidAnnouncement()
    {
        WebElement checkCovidAnnouncement = driver.findElement(By.xpath("//*[@id=\"menu-announcement\"]"));
        checkCovidAnnouncement.click();

    }

    @Test(priority = 4)
    public void checkLanguage()
    {
        WebElement checkLanguage = driver.findElement(By.xpath("//*[@id=\"menu-en\"]"));
        checkLanguage.click();

    }

    @Test(priority = 5)
    public void closeBrowser()
    {
    driver.close();
    }

}

