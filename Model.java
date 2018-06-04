package com.java;

public class Model {
	public static void main(String[] args) {
	Travel t1 = new Dog();
	Travel t2 = new Rat();
	Travel t3 = new Lion();
	Travel t4 = new Women();
	Travel t5 = new Men();
	Travel t6 = new Child();
    System.out.println(t1 instanceof Dog);
    System.out.println(t2 instanceof Rat);
    System.out.println(t3 instanceof Lion);
    System.out.println(t1 instanceof Women);
    System.out.println(t2 instanceof Men);
    System.out.println(t3 instanceof Child);

}
}
