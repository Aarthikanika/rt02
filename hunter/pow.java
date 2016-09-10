
public class Pow
{
	public static int output1;
	public static void sumOfPowerOfDigits(int input1)
	{
		output1=0;
		String s=String.valueOf(input1);
		int a[]=new int[s.length()];
		int i=s.length()-1;
		while(input1>0)
		{
			a[i]=input1%10;
			input1=input1/10;
			i=i-1;
		}
		for(int j=0;j<a.length-1;j++)
			output1=(int) (output1+Math.pow(a[j+1], a[j]));
		output1=output1+1;
		System.out.println(output1);
	}
	public static void main(String args[])
	{
		sumOfPowerOfDigits(123);
	}

}
