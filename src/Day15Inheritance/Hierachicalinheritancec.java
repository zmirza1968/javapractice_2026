package Day15Inheritance;

// parent 
class Animal
{
	void eat() {
		System.out.println("Animal is eating ");
	}
}

// child 1
class Dog extends Animal
{
	
	void bark() {
		System.out.println("Dog is barking....");
	}
}


//child 2 
class Cat extends Animal
{
	void meow() {
		System.out.println("Cat is meoing...");
	}
}




public class Hierachicalinheritancec {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.bark();
		d.eat();
		
		 Cat c = new Cat();
		 c.eat();
		 c.meow();
		 
		 Animal a= new Dog();
		 a.eat();
		 
		 
	}

}
