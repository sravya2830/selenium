package testng;

import org.testng.annotations.Test;

public class Prioritisingtests {

	@Test
	
	public void demo1() {
		System.out.println("demo1");
		

	}
	@Test
	public void demo2() {
		System.out.println("demo2");
	}

	@Test
	public void demo3() {
		System.out.println("demo3");
	}
	@Test
	public void demo4() {
		System.out.println("demo4");
	}
	@Test(priority = -2)
	public void demo5() {
		System.out.println("demo5");
	}
	@Test(priority = -1)
		public void demo6() {
		System.out.println("demo6");
	}
	
}
