import java.util.Scanner;

public class hollowButterflyPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//upper part
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=2*n; j++) {
				
				if(j==1 || j==2*n || j==i || j==(2*n)-i+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//lower part
		for(int i=n; i>=1; i--) {
			
			for(int j=1; j<=2*n; j++) {
				
				if(j==1 || j==2*n || j==i || j==(2*n)-i+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
