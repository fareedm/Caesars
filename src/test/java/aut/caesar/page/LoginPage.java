package aut.caesar.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.config.IConstants;
import com.testreport.IReporter;
import aut.pages.templates.PageTemplate;


public class LoginPage extends PageTemplate {	
	private static final Logger LOG = Logger.getLogger(LoginPage.class);
	public LoginPage(WebDriver webDriver, IReporter testReport) {
		super(webDriver, testReport);
		
	}
	
	public boolean login(String url, String userName, String password) throws Exception
	{
		boolean isSuccess = false;
		try
		{
			String bySignin = this.reUsableLib.getElementLocator(IConstants.LOCATORSFILENAME,"SignIn");
			String byUserName = this.reUsableLib.getElementLocator(IConstants.LOCATORSFILENAME,"UserName");
			String byPassword = this.reUsableLib.getElementLocator(IConstants.LOCATORSFILENAME,"Password");
			String byButtonSignIn = this.reUsableLib.getElementLocator(IConstants.LOCATORSFILENAME,"ButtonSignIn");
			String byMyAccount = this.reUsableLib.getElementLocator(IConstants.LOCATORSFILENAME,"MyAccount");		
			String byMyAccountDetails = this.reUsableLib.getElementLocator(IConstants.LOCATORSFILENAME,"MyAccountDetails");		
			
			String MyRewards = this.reUsableLib.getElementLocator(IConstants.LOCATORSFILENAME,"MyRewards");	
			String Myoffer = this.reUsableLib.getElementLocator(IConstants.LOCATORSFILENAME,"Myoffer");	
			String MyExchangeOffer = this.reUsableLib.getElementLocator(IConstants.LOCATORSFILENAME,"MyExchangeOffer");
			String MyLeaderBoard = this.reUsableLib.getElementLocator(IConstants.LOCATORSFILENAME,"MyLeaderBoard");
			String QuestForRewards = this.reUsableLib.getElementLocator(IConstants.LOCATORSFILENAME,"QuestForRewards");
			String Reservations = this.reUsableLib.getElementLocator(IConstants.LOCATORSFILENAME,"Reservations");
			
			String priceAlert = this.reUsableLib.getElementLocator(IConstants.LOCATORSFILENAME,"priceAlert");
			String winLoss = this.reUsableLib.getElementLocator(IConstants.LOCATORSFILENAME,"winLoss");
			String rewardsStatement = this.reUsableLib.getElementLocator(IConstants.LOCATORSFILENAME,"rewardsStatement");
								
			
			this.driver.get(url);
			this.waitUntilElementIsClickable(By.xpath(bySignin));
			this.testReport.logSuccess("Sign In Page", String.format("Login Test For User - %s", userName), this.getScreenShotName());
			this.Click(By.xpath(bySignin));
					
			
			this.SendKeys(By.name(byUserName), userName);
			this.SendKeys(By.name(byPassword), password);
			this.Click(By.xpath(byButtonSignIn));
			this.Click(By.xpath(byMyAccount));
			this.Click(By.xpath(byMyAccountDetails));
			this.Click(By.xpath(MyRewards));
			Thread.sleep(2000);	this.Click(By.xpath(Myoffer));
			Thread.sleep(2000); this.Click(By.xpath(MyExchangeOffer));
			Thread.sleep(2000);	this.Click(By.xpath(MyLeaderBoard));
			Thread.sleep(2000); this.Click(By.xpath(QuestForRewards));
			Thread.sleep(2000);	this.Click(By.xpath(Reservations));
			Thread.sleep(2000); this.Click(By.xpath(priceAlert));
			Thread.sleep(2000); this.Click(By.xpath(winLoss));
			Thread.sleep(2000);	this.Click(By.xpath(rewardsStatement));
			isSuccess = true;
		}
		catch(Exception ex)
		{
			isSuccess = false;
			LOG.error(String.format("Exception Encountered - %s", ex.getMessage()));
			this.testReport.logFailure(
					String.format("Class Name - %s , Method Name - %s, Line Number - %s, Exception Encountered - %s",
					ex.getStackTrace()[2].getClassName(), ex.getStackTrace()[2].getMethodName(),
					ex.getStackTrace()[2].getLineNumber(), ex.getMessage()));
			throw ex;
		}
		
		return isSuccess;
	}
	
    public void clickableAll() {
    	
    }

}
