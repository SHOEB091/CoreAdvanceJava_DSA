package ObjectDemo;

class Calc
// class is a blue print 
{
	int num1;
	int num2;
	int result;
	
	public void perform() // public is access modifier  so that we can access it from any where
	{
		result = num1 + num2;
	}
	
}
// object does something with the help of method 
// in order to use variables and method we have to use objects 

public class object_new {

	public static void main(String[] args) {
		Calc obj;   // ref    object is a instance
		
		// new keyword is responsible to allocate the memory
		
		// or we can say that Calc obj = new Calc();
		obj = new Calc();
		      // new Calc(); is the object ;
		      // object Knows something and object does something 
		obj.num1 = 3;
		obj.num2 = 5;
		
		obj.perform();
		
		System.out.println(obj.result);

	}

}
