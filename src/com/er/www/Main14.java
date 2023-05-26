package com.er.www;

class Colu {
int f=6;
}
class Chunga extends Colu
{
	int d=4;
		}
class Main14
{
public static void main(String[] args) {
	Colu t1=new Chunga();
	System.out.println(t1.f);
	Chunga t2=(Chunga)t1;
	System.out.println(t2.d);
}	
}