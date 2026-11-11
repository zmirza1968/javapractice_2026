package Day19Interface;

interface A {
	void a(); // by default public and abstract

	void b(); // by default public and abstract

	void c(); // by default public and abstract

	void d(); // by default public and abstract
}

abstract class B implements A {

	public void c() {
		System.out.println("I am c ");
	}
}

class m extends B {

	public void a() {
		System.out.println("I am a");
	}

	public void b() {
		System.out.println("I am b");
	}

	public void d() {
		System.out.println("I am d");
	}

}

public class AbstractClassVsInterface {

	public static void main(String[] args) {
		A obj = new m();
		obj.a();
		obj.b();
		obj.c();
		obj.d();

	}

}
