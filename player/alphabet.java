import java.util.Scanner;


public class Alphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c='a';
		for(int i=0;i<s.length();i++)
		{
			 c=s.charAt(i);
		}
			if(Character.isAlphabetic(c))
					{
				System.out.println("Alphabet");
					}
			else
			{
				System.out.println("not Alphabet");
			}
		}

	}
	


