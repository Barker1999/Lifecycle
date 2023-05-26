package com.er.www;

class Cola {
int f=1;
}
class Chung extends Cola
{
	int d=4;
	}
class Main7
{
	public static void main(String[] args) {
		Cola t1=new Chung();
		System.out.println(t1.f);
		Chung t2=(Chung)t1;
		System.out.println(t2.d);
	}
	}