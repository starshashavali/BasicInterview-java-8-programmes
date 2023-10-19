package TestDemo;
class Test{
public void artmeticEx() {
	try {
		int a=10/0;
		System.out.println("Exception ...");
	}
	finally {
		System.out.println("Arithem ...");
	}
}
	

}
class TestChild  extends Test{
	     @Override
	    public void artmeticEx() {
	    	       try {
	    	    	   super.artmeticEx();   
	    	       }catch(Exception e) {
	    	    	   System.out.println(" Exception ...");
	    	       }
	    		    	
	    		    	
	    		    	
	    }
	
}


public class ArithematicExceptionEx {
	public static void main(String[] args) {
		System.out.println("Excution is started...");
		TestChild t=new TestChild();
		t.artmeticEx();
	

	}
}

