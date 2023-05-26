package com.er.www;

class Cool {
void add()
{
System.out.println("hI");	
}
}
class Goolata extends Cool
{
void disp()
{
System.out.println("Bye");	
}
}
class Main4
{
	public static void main(String[] args) {
		Cool t1=new Goolata();
		t1.add();
		Goolata t2=(Goolata)t1;
		t2.disp();
		t2.add();
	}
	}