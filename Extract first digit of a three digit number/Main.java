import java.util.Scanner;
class Main {
	public static void main (String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int res=n;
     while(res >= 10)
		{
			res= res / 10;
		}	
      System.out.println(res);
    }
}