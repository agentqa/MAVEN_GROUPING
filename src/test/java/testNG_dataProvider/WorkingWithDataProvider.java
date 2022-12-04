package testNG_dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {
	
	/*
	 * Rules we need to remember when we ar working on DataProvider
	 * 1. @DataProvider will return a two Dimensional Object Array [][]
	 * 2. We need to add all the entries of the array 
	 * 3. We need to pass dataProvider = name of the method which @DataProvider is residing 
	 * 4. We need to pass the parameters in the method of @Test == cols of the two D array 
	 */
	
	@DataProvider 
	public Object[][] ourDataProviderArry() {
		Object[][] array = new Object[3][4];
		
		array[0][0]="UserName";
		array[0][1]="Password";
		array[0][2]=12345;
		array[0][3]="Comment";
		
		array[1][0]="UserName1";
		array[1][1]="Password1";
		array[1][2]=123456;
		array[1][3]="Comment1";
		
		array[2][0]="UserName2";
		array[2][1]="Password2";
		array[2][2]= 123457;
		array[2][3]="Comment2";
		
		return array;
	}
	
	@Test(dataProvider = "ourDataProviderArry")
	public void produceResult(String UserName, String password, int num, String comment) {
		
	}
}
