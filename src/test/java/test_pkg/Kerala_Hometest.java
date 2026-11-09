package test_pkg;

import org.testng.annotations.Test;

import base_pkg.Kerala_Baseclass;

public class Kerala_Hometest extends Kerala_Baseclass
{
	
	@Test
	public void kerala_homemthd()
	{
		kerala_homeobj.addpropertydetails_mthd();
	}

}
