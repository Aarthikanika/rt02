import java.util.Scanner;


public class Index 
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 int i=0;
	 for(i=0;i<a.length;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 
	 for (int j = 0; j < a.length; j++)
	 {
		 if(a[j]==j)
		 {
			
			System.out.println("equal");
		 }
		 else
		 {
			 System.out.println("Not equal");
		 }
		
	}
		
		 
	 }
	 
 }
