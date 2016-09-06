import java.util.Scanner;


class prime
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	boolean isPrime = true;
	for(int i=2;i<n/2;i++)
	{
		int temp=n%i;
		if(temp==0)
		{
		 isPrime = false;
		 break;
		}	
	}
	if(isPrime)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	}
	
	}
	}
