package Rough;

import org.testng.annotations.Test;

public class Class3 {
	
	@Test(priority=7, groups={"Class3"})
	public void method7() {
		System.out.println("Method 7");
	}
	
	@Test(priority=8, groups={"Class3"})
	public void method8() {
		System.out.println("Method 8");
	}
	
	@Test(priority=9, groups={"Class3"})
	public void method9() {
		System.out.println("Method 9");
	}
	
	@Test(priority=10, groups={"Class3"})
	public void method10() {
		System.out.println("Method 10");
	}

}
