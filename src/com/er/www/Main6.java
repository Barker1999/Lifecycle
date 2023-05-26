package com.er.www;

class Hello {
	void cool()
	{
		System.out.println("hi");
	}

}
class Gulegu extends Hello
{
	void disp()
	{
		System.out.println("bye");
	}
	}
class Main6
{
	public static void main(String[] args) {
		Hello t1=new Gulegu();
		t1.cool();
		Gulegu t2=(Gulegu)t1;
		t2.cool();
		t2.disp();
	}
	}
