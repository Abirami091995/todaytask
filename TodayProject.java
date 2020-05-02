package task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodayProject {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Project\\Today\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-server/3.141.59");
	driver.quit();
}
}
