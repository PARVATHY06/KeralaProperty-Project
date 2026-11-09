package test_pkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_pkg.Kerala_Baseclass;

public class Kerala_logintest extends Kerala_Baseclass
{
	@Test(priority=1)
	public void kerala_titleverification_mthd()
	{
		String actual_title=kerala_loginobj.kerala_title_mthd();
		Assert.assertEquals(actual_title,"Kerala Property");
	}
	
	@Test(priority=2)
	public void kerala_loginverification_mthd()
	{
		kerala_loginobj.kerala_login_mthd("parvathykrishnan862@gmail.com", "parvathy@62");
	}

}
