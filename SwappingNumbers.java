
public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10  , b = 5;
		int temp = 0;
		System.out.println("Using temporary variable" );
		System.out.println();
		System.out.println("Before swapping : "+ "a" + " = " + a +" and " + "b"+ " = " + b);
		temp  = a ;
		a = b; 
		b = temp;
		System.out.println("After swapping  : "+ "a" + " = " + a +"  and " + "b"+ " = " + b);
		System.out.println();

		int x = 20 , y = 30;
		System.out.println("WithOut Using temporary variable" );
		System.out.println();

		System.out.println("Before swapping : "+ "x" + " = " + x +" and " + "y"+ " = " + y);

		x = x+y ;
		y = x-y;
		x = x-y;
		
		System.out.println("After swapping  : "+ "x" + " = " + x +" and " + "y"+ " = " + y);

	}
	

}
