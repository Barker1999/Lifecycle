package com.er.www;

class Dumk {
	int r=4;

}
class Dem extends Dumk
{
	int x=7;
	}
class Main12
{
	public static void main(String[] args) {
		Dumk t1= new Dem();
		System.out.println(t1.r);
		Dem t2=(Dem)t1;
		System.out.println(t2.x);
	}
	}