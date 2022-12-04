package group_on_testng;

import org.testng.annotations.Test;

public class LearningOfHowHandldGroupInTestNG {
	
	@Test(groups = "smoke" )
	public void methodOne() {
		System.out.println("This is from method One");
	}
	
	@Test(groups = "sanity" )
	public void methodTwo() {
		System.out.println("This is from method Two");
	}
	
	@Test(groups = "regression" )
	public void methodThree() {
		System.out.println("This is from method Three");
	}
	
	@Test(groups = {"smoke" ,"sanity"})
	public void methodFour() {
		System.out.println("This is from method Four");
	}
	
	@Test(groups = {"smoke" ,"sanity","regression"})
	public void methodFive() {
		System.out.println("This is from method Five");
	}
	
	@Test(groups = {"regression" ,"sanity"})
	public void methodSix() {
		System.out.println("This is from method Six");
	}

}
