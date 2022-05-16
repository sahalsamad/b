package addition;

interface a{
	void showA();
	final int a1 = 10;
}
interface b{
	void showB();
	final int a1 =20;
}

public class Interface2 implements a{
	public static void main(String[] args) {
		Interface2 a = new Interface2();
		a.showA();
		//a.showB();
		//System.out.println(a1);
	}
	public void showA() {
		System.out.println(a1);	
	}
	
	public void showB() {
		System.out.println(a1);
	}
	
	
}