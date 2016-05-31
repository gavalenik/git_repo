package MarketPages;

import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {

	protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    protected void type(WebElement webElement, String text) {
        webElement.clear();
        webElement.sendKeys(text);
    }

    public static boolean isElementPresent(WebElement element) {
        try {
            element.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    
    protected void scrollUp() {
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("scroll(0, 0);");
    }
}