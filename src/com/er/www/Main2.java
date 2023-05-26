package com.er.www;

public class Main2 {
	public static void main(String[] args) {
		Sample s1=new Ampules();
		s1.disp();
		Ampules s2=(Ampules)s1;
		s2.disp();
		s2.tata();
	}
}
class Sample
{
	void disp()
	{
		System.out.println("Hi");
	}
	}
class Ampules extends Sample
{
void tata()
{
	System.out.println("bye");
	}
}
