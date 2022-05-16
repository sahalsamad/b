package addition;


public class AddingNumbers {


	public static void main(String args[]) {
		int a = Add(2,3);
		System.out.println(a);
		substract(9,6);
		multiply(4,5);
	}

	private static void multiply(int i, int j) {
		int k = i+j;
		System.out.println(i+"+"+j+"="+k);
	}

	private static void substract(int i, int j) {
		int k = i-j;
		System.out.println(i+"-"+j+"="+k);
	}

	private static int Add(int i, int j) {
		int k=i+j;
		return k;
	}
}
