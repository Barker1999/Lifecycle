package com.er.www;

class Vat {
	double z=0.01;

}
class Dumkata extends Vat
{
	int x=2;
	}
class Main5
{
public static void main(String[] args) {
	Vat t1=new Dumkata();
	System.out.println(t1.z);
	Dumkata t2=(Dumkata)t1;
	System.out.println(t2.z);
	System.out.println(t2.x);
	
	}	
}
