package com.er.www;

class Teste1 {
void disp()
{
	System.out.println("bye");
	}
}
class Holliyacho extends Teste1
{
	void ho()
	{
		System.out.println("hi");
	}
	}
class Main8
{
	public static void main(String[] args) {
		Teste1 t1=new Holliyacho();
		t1.disp();
		Holliyacho t2=(Holliyacho)t1;
		t2.disp();
		t2.ho();
	}
	}