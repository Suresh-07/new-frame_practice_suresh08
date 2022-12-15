package NEW_FRAMES;

import org.testng.annotations.Test;

public class groups {
	@Test(priority = 1,groups = "smoke")
	public void tc1() {
		System.out.println("This is my first smoke testing");
	}
	@Test(priority = 2,groups = "Regression")
	public void tc2() {
		System.out.println("This is my first Regression testing");
	}
	@Test(priority = 1,groups = "smoke")
	public void tc3() {
		System.out.println("This is my second smoke testing");
	}
	@Test(priority = 2,groups = "Regression")
	public void tc4() {
		System.out.println("This is my second Regression testing");
	}
}
