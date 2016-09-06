import java.util.Scanner;


class Palindrome
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	StringBuffer sb=new StringBuffer(s);
String s1=	sb.reverse().toString();
	if(s.equals(s1))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
	}
}
