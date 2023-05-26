package com.er.www;

class Cool2 {
void disp()
{
	System.out.println("hi");
	}
}
class Dinga extends Cool2
{
	void data()
	{
		System.out.println("bye");
	}
	}
class Main9
{
	public static void main(String[] args) {
		Cool2 t1=new Dinga();
		t1.disp();
		Dinga t2=(Dinga)t1;
		t2.data();
	}
	}
