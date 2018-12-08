package org.aiyyapa;

public class ExceptionTest {
	// Exception using constructor
	
		public ExceptionTest() {
			System.out.println("10/1 :" + 10/1);
			System.out.println("10/2 :" + 10/2);
			System.out.println("10/3 :" + 10/3);
			
	// To use try block for which line will start getting error		
			try {
			System.out.println("10/0 :" + 10/0);
			}
			
	//use keyword Exception in catch block
			
			catch(Exception npe) {
				System.out.println("10 doesnt divided by 0");
			}
			System.out.println("10/5 :" + 10/5);
					
			}
		
			public static void main(String[] args) {
			ExceptionTest npe=new ExceptionTest();	
			}
			}
		