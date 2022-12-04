package using_dataprovider_for_multiple;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;


public class DataProviderHome {
	/*
	 * Follow the following steps when we use dataprovider for multiple tests
	 * 1. Create a separate package and class of @DataProvider
	 * 2. Create a separate test script package and classes - "TestsUsingDataProviderMethod"
	 * 3. Make sure the DataProvider method is a static 
	 * 4. Link the Classes passing the dataProviderClass = className.class
	 * 		@Test(dataProviderClass = DataProviderHome.class)
	 * 5. Link the dataProvider method witht the test classes 
	 * 		@Test(dataProvider = "dataProviderMethod")
	 * 	- Step 4 and 5 will be together 
	 * 		@Test(dataProviderClass = DataProviderHome.class,dataProvider = "dataProviderMethod")
	 * 6. Set-up the test methods parameter to accept the dataProvider argument 
	 * 		public void methodName(Object fName, Object lName, Object ID, Object course)
	 * 7. Pass Method as an input parameter inside the method of the @DataProvider
	 * 		public static Object[][] dataProviderMethod(Method name)
	 */
	
	@DataProvider
	public static Object[][] dataProviderMethod(Method name){
		System.out.println(name.getName());
		Object[][] input = new Object[3][4];
		
		input[0][0]="First_Name";
		input[0][1]="Last_Name";
		input[0][2]="Student_ID";
		input[0][3]="Course_Name";
	
		input[1][0]="Jhon";
		input[1][1]="Do little";
		input[1][2]=1001;
		input[1][3]="Java 1";
		
		input[2][0]="Betty";
		input[2][1]="West";
		input[2][2]=1002;
		input[2][3]="Java 2";
		
		
		return input;
	}

}
