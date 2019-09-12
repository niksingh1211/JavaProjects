
public interface ExceptionDemo {
	public static void main(String[] args) {
		int a, b, c;
		a=10;
		b=0;
		try {
			c=a/b;
			System.out.println(c);
			int arr[]= {1,2,3};
			System.out.println(arr[1]);
		}catch (ArithmeticException | IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Apun hi bhagvan hai");
		}
		
	}

}
