package test_method_of_dataProvider_home;

import org.testng.annotations.Test;


import using_dataprovider_for_multiple.DataProviderHome;



public class TestsUsingDataProviderMethod {
	
	@Test(priority = 1,dataProviderClass = DataProviderHome.class,dataProvider = "dataProviderMethod")
	public void openManiPage(Object fName, Object lName, Object ID, Object course) {
		System.out.println("Opening the Home page");
	}
	
	@Test(priority = 2,dataProviderClass = DataProviderHome.class,dataProvider = "dataProviderMethod")
	public void singIn(Object fName, Object lName, Object ID, Object course) {
		System.out.println("Sign in page");
		
	}
	
	@Test(priority = 3,dataProviderClass = DataProviderHome.class,dataProvider = "dataProviderMethod")
	public void navigateToCart(Object fName, Object lName, Object ID, Object course) {
		System.out.println("locating the cart page");
		
	}
	
	@Test(priority = 4,dataProviderClass = DataProviderHome.class,dataProvider = "dataProviderMethod")
	public void logOut(Object fName, Object lName, Object ID, Object course) {
		System.out.println("Logout from the page");
		
	}

}
