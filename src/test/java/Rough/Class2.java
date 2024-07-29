package Rough;

import org.testng.annotations.Test;

public class Class2 {
	
	@Test(priority=4, groups={"Class2"})
	public void method4() {
		System.out.println("Method 4");
	}
	
	@Test(priority=5, groups={"Class2"})
	public void method5() {
		System.out.println("Method 5");
	}
	
	@Test(priority=6, groups={"Class2"})
	public void method6() {
		System.out.println("Method 6");
	}


}
