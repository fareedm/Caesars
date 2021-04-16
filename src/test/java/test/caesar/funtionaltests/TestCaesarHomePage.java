package test.caesar.funtionaltests;

import java.util.Hashtable;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import aut.caesar.page.LoginPage;
import test.templates.TestTemplate;


public class TestCaesarHomePage  extends TestTemplate{
	
    private static final Logger LOG = Logger.getLogger(TestCaesarHomePage.class);

	@Test(dataProvider = "getDataFromExcel")
	public void validateLoginPage(Hashtable<String, String> data) throws Exception
	{
		String userName = data.get("UserName");
		String password = data.get("Password");
	
        LoginPage loginPage = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		boolean isSuccess = loginPage.login(this.url, userName, password);
		if(isSuccess)
		{
			LOG.info(String.format("Login Successful for user - %s", userName));
		}
		else
		{
			LOG.error(String.format("Login Not Successful for user - %s", userName));
		}
		
    }
}
