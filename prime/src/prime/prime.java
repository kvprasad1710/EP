package prime;

public class prime {

	public boolean testing(int n) 
	{
		for(int i=2;i<n/2;i++)
		{
		if(n%i==0) return false;
		}		
		return true;
	}

}
