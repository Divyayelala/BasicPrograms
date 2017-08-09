
public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		System.out.println("origianl number : "+n);
		int rem = 0 , temp = 0 , ams = 0;
		temp = n;
		while(n!=0)
		{
			rem = n%10;
			ams = ams + (rem*rem*rem);
			n = n/10;
		}
		System.out.println("After logic     : " +ams);
		if(temp == ams)
		{
			System.out.println("Number is Amstrong");
		}
		else
		{
			System.out.println("Number is not Amstrong");
		}


	}

}
