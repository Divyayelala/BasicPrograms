
public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 244;
		System.out.println("origianl number : "+n);
		int rem = 0 , temp = 0 , rev = 0;
		temp = n;
		while(n!=0)
		{
			rem = n%10;
			rev = (rev*10 )+rem;
			n = n/10;
		}
		System.out.println("After reversing : " +rev);
		if(temp == rev)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}

	}

}
