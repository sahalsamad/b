package addition;

interface In1{
	final int a = 10 ;
	void display();
	void displayVal();
}
class TestClass implements In1{
	public void displayVal(){
		System.out.println("Printing");
	}
	public static void main(String args[]) {
		TestClass t = new TestClass();
		t.display();
		System.out.println(a);
	}
	@Override
	public void display() {
		
		
	}
}
