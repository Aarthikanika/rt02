import java.util.Scanner;

class Alphabet{  
  public static void main(String[] args)  {  
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    StringBuffer sb=new StringBuffer(s);
    System.out.println(sb.reverse());
  }
    
}
