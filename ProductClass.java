package TestDemo;

public class ProductClass {
	public Integer addition(int a,int b) {
		return a+b;
	}
	public Integer addition(int a,int b,int c) {
		return a*b+c;
	}
	public static void main(String[] args) {
		ProductClass p=new ProductClass();
		Integer addition = p.addition(3, 3);
		System.out.println("addition of a + b:" +addition);
		Integer addition2 = p.addition(2, 3, 6);
		System.out.println(addition2);
	}

}
