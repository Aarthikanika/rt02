import java.util.Scanner;


class power
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int n1=0;
    if(n>0){
    	n1=(int) Math.pow(n,n);
    	
    }
    System.out.println(n1);
	}
}
