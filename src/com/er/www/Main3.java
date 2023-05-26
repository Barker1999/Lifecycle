package com.er.www;

class Tester {
int r=1;
}
class Tista extends Tester
{
	void uliga()
	{
		System.out.println("Hi");
	}
	}
class Main3
{
	public static void main(String[] args) {
		Tester t1=new Tista();
		System.out.println(t1.r);
		Tista t2=(Tista)t1;
		System.out.println(t2.r);
		t2.uliga();
		
		
	}
	}
