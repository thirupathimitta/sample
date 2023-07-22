package com.encapsulation;

public class Practice2 {

	private int age;
	public void setAge(int a) {
		if(a<18) age=18;
		else if(a>60) age=60;
		else  age=a;
	
	}
	public int getAge() {
		return age;
	}

}
 class Practice3 {
	 public static void main(String[] args) {
		 Practice2 p=new Practice2();
		 
	p.setAge(200);
	System.out.println(p.getAge());
		
	}

	
	

}