package SamplePkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) {
	//File f=new File("C:\\eclipse-workspace\\Automation\\abc.xlsx");
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	//System.out.println(33)
	driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
	driver.navigate().refresh();
	driver.findElement(By.id("firstname")).sendKeys("Aditya");
	driver.findElement(By.id("lastname")).sendKeys("Das Choudhury");
	driver.findElement(By.id("email_address")).sendKeys("aditya.orangi@gmail.com");
	driver.findElement(By.id("password")).sendKeys("adc123ADC!");
	driver.findElement(By.id("password-confirmation")).sendKeys("adc123ADC!");
	driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();
	

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
	driver.findElement(By.id("email")).sendKeys("aditya.orangi@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("adc123ADC!");
	driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.id("search")).sendKeys("bag");
	WebElement glass = driver.findElement(By.xpath("//*[@id=\"search_mini_form\"]/div[2]/button"));
    glass.submit();
	 WebElement dropdownElement = driver.findElement(By.id("sorter"));

     Select dropdown = new Select(dropdownElement);

     // Select an option by visible text
     dropdown.selectByVisibleText("Price");

     driver.get("https://magento.softwaretestingboard.com/crown-summit-backpack.html");
     
  	try {
 		Thread.sleep(5000);
 	} catch (InterruptedException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
     
     driver.get("https://magento.softwaretestingboard.com/crown-summit-backpack.html#review-form");
	
  // Find the element representing the stars (adjust the selector accordingly)
     WebElement starRatingElement = driver.findElement(By.id("Rating_5_label"));
     WebElement fourthStar = starRatingElement.findElement(By.xpath(".//span[4]"));
     fourthStar.click();
     driver.findElement(By.id("nickname_field")).sendKeys("Aditya");
     driver.findElement(By.id("summary_field")).sendKeys("Good bag");
     driver.findElement(By.id("review_field")).sendKeys("Good bag. Great design.");
     WebElement subbutton = driver.findElement(By.xpath("//*[@id=\"review-form\"]/div/div/button"));
     subbutton.submit();
     
 	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     driver.quit();
	}

}

//issue - submit button does not get clicked
//create ac, sign in search bag in search bar, sort by price, select backpack, provide review