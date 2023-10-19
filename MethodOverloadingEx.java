package TestDemo;
 interface ParentClas{
	public String getMsg();
}
class childClass implements ParentClas{

	@Override
	public String getMsg() {
		return "Jai sree ram...";
	}
	
}
public class MethodOverloadingEx  {
public static void main(String[] args) {
	childClass c=new childClass();
	String msg = c.getMsg();
	System.out.println(msg);
}
	

}
