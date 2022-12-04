package group_on_testng;

import org.testng.annotations.Test;

@Test(groups = "All_Methods")
public class LearningMetagroupOfTestNG {
	

	@Test(priority= 1,groups = {"smoke", "night"})
	public void methodOne() {
		System.out.println("This is from method One");
	}
	
	@Test(priority= 2,groups = {"sanity","day"} )
	public void methodTwo() {
		System.out.println("This is from method Two");
	}
	
	@Test(priority= 3,groups = {"regression","night"} )
	public void methodThree() {
		System.out.println("This is from method Three");
	}
	
	@Test(priority= 4,groups = {"smoke" ,"sanity", "day"})
	public void methodFour() {
		System.out.println("This is from method Four");
	}
	
	@Test(priority= 5,groups = {"smoke" ,"sanity","regression", "night"})
	public void methodFive() {
		System.out.println("This is from method Five");
	}
	
	@Test(priority= 6,groups = {"regression" ,"sanity", "night"})
	public void methodSix() {
		System.out.println("This is from method Six");
	}

}
