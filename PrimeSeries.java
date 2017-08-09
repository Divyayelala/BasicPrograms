
public class PrimeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n = 20 ,count;
		for(int i=2;i<n;i++)
		{
			count = 0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count == 0 )
			{
				System.out.print(i + " ");
			}
		}
		

	}

}
