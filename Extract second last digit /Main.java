import java.util.Scanner;
class Main {
	public static void main (String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		int i=0,val,r=0;
		val=number;
		while(i<2)
		{
			r=number%10;
			number=number/10;
			i++;
		}
		System.out.println(r);
	}
}