package addition;
class A {
	public void print_A() { System.out.println("Class A"); }
}

class B extends A {
	public void print_B() { System.out.println("Class B"); }
}

public class Test {
	public static void main(String[] args)
	{ 
		B obj_B = new B();
		obj_B.print_A();
		obj_B.print_B();

	}
}
