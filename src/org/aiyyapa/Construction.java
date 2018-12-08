package org.aiyyapa;

public class Construction {
	
	public Construction(int id,String name, String dob) {
		System.out.println(name);
		System.out.println(id);
		System.out.println(dob);
			
		}

	public Construction(int id, String name) {
		System.out.println(name);
		System.out.println(id);
	}

	public static void main(String[] args) {
		
		Construction anu=new Construction(472906, "anu","12thdec");
		Construction deva=new Construction(449213, "deva");
		
		
	}
	}
	