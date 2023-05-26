package com.er.www;

class Tester3 {
	void disp()
	{
		System.out.println("hi");
	}

}
class Tista1 extends Tester3
{
	void uliya()
	{
		System.out.println("bye");
	}
}
class Main10
{
	public static void main(String[] args) {
		Tester3 t1=new Tista1();
		t1.disp();
		Tista1 t2=(Tista1)t1;
		t2.uliya();
	}
	}
