package com.polymorphism;

public class InvokingMain {

	public static void main(String[] args) {
      A avar = new B();
      B bvar = (B) new A();
     avar.sample();
     bvar.sample();
	}

}
