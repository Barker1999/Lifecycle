package com.er.www;

class Demo {
 int x=1;
}
class Pemcho extends Demo
{
	void ho()
	{
		System.out.println("HI");
	}
}
class Main1
{
	public static void main(String[] args) {
		Demo t1=new Pemcho();
		System.out.println(t1.x);
		Pemcho t2=(Pemcho)t1;
		System.out.println(t2.x);
		t2.ho();
	}
	}