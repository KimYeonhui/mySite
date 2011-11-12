package chapter4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GoodDogTestDrive {
	@Test
	public void test() throws Exception{
		GoodDog one = new GoodDog();
		one.setSize(70);
		GoodDog two = new GoodDog();
		two.setSize(-8);
		System.out.println("Dog one : " + one.getSize());
		System.out.println("Dog two : " + two.getSize());
		one.bark();
		two.bark();
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GoodDog one = new GoodDog();
		one.setSize(70);
		GoodDog two = new GoodDog();
		two.setSize(8);
		System.out.println("Dog one : " + one.getSize());
		System.out.println("Dog two : " + two.getSize());
	}

}
