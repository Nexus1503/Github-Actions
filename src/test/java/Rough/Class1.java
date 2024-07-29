package Rough;

import org.testng.annotations.Test;

public class Class1 {
	
	@Test(priority=0, groups={"Class1"})
	public void method1() {
		System.out.println("Method 1");
	}
	
	@Test(priority=2, groups={"Class1"})
	public void method2() {
		System.out.println("Method 2");
	}
	
	@Test(priority=3, groups={"Class1"})
	public void method3() {
		System.out.println("Method 3");
	}


}
