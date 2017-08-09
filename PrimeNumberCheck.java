
public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7,count=0;
		for(int i =2 ; i<n ; i++)
		{
			if(n%i == 0)
			{
				System.out.println(n+ " is not prime");
				count++;
				break;
			}
		}
		if(count == 0 )
		{
			System.out.println(n+ " is prime ");
		}
	}

}
