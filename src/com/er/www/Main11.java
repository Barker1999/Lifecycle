package com.er.www;

 class Cool3 {
	 void add()
	 {
		 System.out.println("hi");
	 }

}
 class Goola extends Cool3
 {
	 void disp()
	 {
		 System.out.println("bye");
	 }
 }
 class Main11
 {
	 public static void main(String[] args) {
		 Cool3 t1=new Goola();
		 t1.add();
		 Goola t2=(Goola)t1;
		 t2.disp();
	}
 }
