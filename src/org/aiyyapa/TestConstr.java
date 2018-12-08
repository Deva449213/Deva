package org.aiyyapa;

public class TestConstr {
	
	// Exception using constructor
	
	public TestConstr() {
		System.out.println("10/1 :" + 10/1);
		System.out.println("10/2 :" + 10/2);
		System.out.println("10/3 :" + 10/3);
		try {
		System.out.println("10/0 :" + 10/0);
		}
		catch(Exception npe) {
			System.out.println("10 doesnt divided by 0");
		}
		System.out.println("10/5 :" + 10/5);
		
		x   		
	}

	public static void main(String[] args) {
		TestConstr npe=new TestConstr();
		
	}
	}
	