package chapter5;

import org.junit.Test;

public class SimpleDotComTestDrive {

	@Test
	public void test() throws Exception{
		SimpleDotCom dot = new SimpleDotCom();
		
		int[] locations = {2, 3, 4};
		dot.setLocationCells(locations);
		
		String userGuess = "2";
		
		String result = dot.checkYourself(userGuess);
		
		String testResult = "failed_test";
		
		if(result.equals("hit")){
			
			testResult = "passed_test";
			 
		}
		
		System.out.println(testResult);
	}
	
	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		
		int[] locations = {2, 3, 4};
		dot.setLocationCells(locations);
		
		String userGuess = "2";
		
		String result = dot.checkYourself(userGuess);
		
		String testResult = "failed";
		
		if(result.equals("hit")){
			
			testResult = "passed";
			 
		}
		
		System.out.println(testResult);
	}

}
