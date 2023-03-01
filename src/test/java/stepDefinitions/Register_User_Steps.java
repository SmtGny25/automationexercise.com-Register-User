package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.AddHasCasting;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.nio.channels.Selector;
import java.util.random.RandomGenerator;


public class Register_User_Steps {
    private WebDriver driver;
    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    public String generateRandomNumber (int length) {
        return RandomStringUtils.randomNumeric(length);
    }
    public String generateRandomString (int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }
    @Given("I access the Automation Exercise website homepage")
    public void ı_access_the_automation_exercise_website_homepage() {
        driver.get("https://www.automationexercise.com/");

    }
    @When("I click on SingupLogin button")
    public void ı_click_on_singup_login_button() {
       driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
    }
    @And("I enter a name user name")
    public void ı_enter_a_name_user_name()  {
        driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]")).sendKeys("AutoUN" );

    }
    @And("I enter a email {string}")
    public void ı_enter_a_email(String string) {
        driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("AutoEMail" + generateRandomString(3)+ "@mail.com");

    }
    @And("I click Signup")
    public void ı_click_signup()  {
        driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();

    }
    @Then("I should see submission on the page that opened")
    public void ı_should_see_on_the_page_that_opened()  {
        WebElement registerUser_submission_message = driver.findElement(By.xpath("//h2[@class=\"title text-center\"]/b[text()='Enter Account Information']"));
        Assert.assertEquals(registerUser_submission_message.getText(), "ENTER ACCOUNT INFORMATION");

    }
    @When("I click Mr. Button")
    public void ı_click_mr_button()  {
        driver.findElement(By.xpath("//div[@id=\"uniform-id_gender1\"]")).click();
    }
    @When("I fill a name {string}")
    public void ı_fill_a_name(String string) {
    }
    @When("I fill a password")
    public void ı_fill_a_password()  {
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("AutoP" +generateRandomNumber(5) );

    }
    @When("I fill a date")
    public void ı_fill_a_date()  {
       Select dropdown = new Select(driver.findElement(By.xpath("//select[@id=\"days\"]")));
       dropdown.selectByIndex(5);//random integer değer komutu girilecek

    }
    @When("I fill a month")
    public void ı_fill_a_month()  {
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@data-qa=\"months\"]")));
        dropdown.selectByIndex(5);//random integer değer komutu girilecek

    }
    @When("I fill a year")
    public void ı_fill_a_year()  {
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@data-qa=\"years\"]")));
        dropdown.selectByIndex(5);//random integer değer komutu girilecek

    }

    @And("I click the Sign up for our newsletter!")
    public void ıClickTheSignUpForOurNewsletter() {
        driver.findElement(By.xpath("//input[@id=\"newsletter\"]")).click();

    }

    @Then("I click the Receive special offers from our partners!")
    public void ıClickTheReceiveSpecialOffersFromOurPartners() {
        driver.findElement(By.xpath("//input[@id=\"optin\"]")).click();
    }
    @When("I enter First Name {string}")
    public void ı_enter_first_name(String string) {
        driver.findElement(By.xpath("//input[@data-qa=\"first_name\"]")).sendKeys("AutoFN" +generateRandomNumber(5) );
    }
    @When("I enter Last Name {string}")
    public void ı_enter_last_name(String string) {
        driver.findElement(By.xpath("//input[@data-qa=\"last_name\"]")).sendKeys("AutoLN" +generateRandomNumber(5) );
    }
    @When("I enter Company {string}")
    public void ı_enter_company(String string) {
        driver.findElement(By.xpath("//input[@data-qa=\"company\"]")).sendKeys("AutoComp." +generateRandomNumber(5) );
    }
    @When("I enter address {string}")
    public void ı_enter_address(String string) {
        driver.findElement(By.xpath("//input[@data-qa=\"address\"]")).sendKeys("AutoAdress" +generateRandomNumber(5) + "Street." );
    }
    @When("I enter address {int} {string}")
    public void ı_enter_address(Integer int1, String string) {
        driver.findElement(By.xpath("//input[@data-qa=\"address2\"]")).sendKeys("AutoAdress" +generateRandomNumber(5) + "Street.");
    }
    @When("I enter Country {string}")
    public void ı_enter_country(String string) {
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@data-qa=\"country\"]")));
        dropdown.selectByIndex(5);//random integer değer komutu girilecek

    }
    @When("I enter State {string}")
    public void ı_enter_state(String string) {
        driver.findElement(By.xpath("//input[@data-qa=\"state\"]")).sendKeys("AutoState" +generateRandomNumber(5));
    }
    @When("I enter City {string}")
    public void ı_enter_city(String string) {
        driver.findElement(By.xpath("//input[@data-qa=\"city\"]")).sendKeys("AutoCity" +generateRandomNumber(5));
    }
    @When("I enter Zipcode {string}")
    public void ı_enter_zipcode(String string) {
        driver.findElement(By.xpath("//input[@data-qa=\"zipcode\"]")).sendKeys(generateRandomNumber(5));
    }
    @When("I enter Mobile Number {string}")
    public void ı_enter_mobile_number(String string) {
        driver.findElement(By.xpath("//input[@data-qa=\"mobile_number\"]")).sendKeys(generateRandomNumber(9));
    }
    @When("I click to Create Account Button")
    public void ı_click_to_create_acoount_button() {
        driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]")).click();

    }
    @Then("I should be presented signup message {string}")
    public void ı_should_be_presented_signup_message(String string)  {
        WebElement registerUser_submission_message = driver.findElement(By.xpath("//h2[@class=\"title text-center\"]/b[text()='Account Created!']"));
        Assert.assertEquals(registerUser_submission_message.getText(), "ACCOUNT CREATED!");
    }
    @When("I click to {string} Button")
    public void ı_click_to_button(String string) throws InterruptedException {
       driver.findElement(By.xpath("//a[@data-qa=\"continue-button\"]")).click();
       Thread.sleep(2000);
    }
    @Then("I should be presented Logged in as")
    public void ı_should_be_presented_logged_in_as() throws InterruptedException {
        WebElement registerUser_submission_message = driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]/li[10]/a[text()=' Logged in as ']"));
        Assert.assertEquals(registerUser_submission_message.getText(), "Logged in as AutoUN");
        Thread.sleep(2000);

    }
    @When("I click on Delete Acoount button")
    public void ı_click_on_delete_acoount_button() throws InterruptedException {
        driver.findElement(By.xpath("//i[@class=\"fa fa-trash-o\"]")).click();
        Thread.sleep(2000);
    }
    @Then("I should be presented delete account message {string}")
    public void ı_should_be_presented_delete_account_message(String string) throws InterruptedException {
        WebElement registerUser_submission_message = driver.findElement(By.xpath("//h2[@class=\"title text-center\"]/b[text()='Account Deleted!']"));
        Assert.assertEquals(registerUser_submission_message.getText(),"ACCOUNT DELETED!");
        Thread.sleep(2000);
    }
}
