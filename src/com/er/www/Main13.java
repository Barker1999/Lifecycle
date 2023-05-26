package com.er.www;

class Samp {
void col()
{
System.out.println("hi");	
}
}
class Hoho extends Samp
{
	void disp()
	{
		System.out.println("bye");
	}
	}
class Main13
{
	public static void main(String[] args) {
		Samp t1=new Hoho();
		t1.col();
		Hoho t2=(Hoho)t1;
		t2.disp();
	}
	}
