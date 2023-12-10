import java.util.*;
public class month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(; ; ) {
//			System.out.println("Apna college");
//		}
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int m= sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=m; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
