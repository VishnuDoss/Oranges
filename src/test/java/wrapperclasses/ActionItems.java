package wrapperclasses;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.Assertion;


public class ActionItems{


public static final Logger logger=LogManager.getLogger(ActionItems.class.getName());	
public void clickElement(WebElement element) throws Exception 
		{
			try{
				element.click();
				logger.info(element+" is clicked");
			}
			catch(NoSuchElementException exception) {
				
				logger.info(element+" is not present");
				
			}
			catch(ElementNotVisibleException exception)
			{
				logger.info(element+" is not visible");
				
			}
			catch(WebDriverException exception)
			{
				logger.info("Webdriver Exception "+ element);
				
			}
		
		}

public void sendKeysElement(WebElement element, String data) throws Exception 
		{
			try{
				element.sendKeys(data);
				logger.info(element+" is enterd");
				
			}
			catch(NoSuchElementException exception) {
				
				logger.info(element+" is not enterd");
				
			}
			catch(ElementNotVisibleException exception)
			{
				logger.info(element+" is not enterd");
			
			}
			catch(WebDriverException exception)
			{
				logger.info("Webdriver Exception "+ element);
			
			}
			
		}

public void verifyEnabled(WebElement element) throws Exception 
{
	try{
		Assert.assertEquals(!element.isEnabled(), false);
		logger.info(element+" is not Enabled");
	
	}
	catch(AssertionError exeception)
	{
		logger.info("Assertion Error");
	}
	catch(NoSuchElementException exception) {
		
		logger.info(element+" is Enabled");
		
		
	}
	catch(ElementNotVisibleException exception)
	{
		logger.info(element+" Enabled");
	
	}
	catch(WebDriverException exception)
	{
		logger.info("Webdriver Exception "+ element);

	}
}


}
