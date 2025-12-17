package JavaAriketak;

import java.util.Scanner;

public class Ariketa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("sartu lehengo zenbakia");
		int zenb1 = sc.nextInt();
		System.out.println("Sartu bigarren zenbakia");
		int zenb2 = sc.nextInt();
		System.out.println("Sartu hirugarren zenbakia");
		int zenb3 = sc.nextInt();
		
		
			if ((zenb1 > zenb2) && (zenb1 > zenb3))
			{
				System.out.println("zenbaki handiena " + zenb1 + " da");
			}else if (zenb2 > zenb3) {
				System.out.println("zenbaki handiena " + zenb2 + " da");
			}else {
				System.out.println("zenbaki handiena "+ zenb3 + " da");
		
	}
	}
}
