package TestDemo;

public class UnReachableExample {
	public static void main(String[] args) {
		try {
		int num=Integer.parseInt("abc");
		}catch(Exception e) {
			System.out.println("Exce...");
		}catch(NumberFormatException e) {
			System.out.println("child ...");
		}
		finally {
			System.out.println("Finally block...");
		}
	}

}
