
import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		//armstrong num 153 = 1^3 + 5^3 + 3^3 = 1+125+27 = 153
		
		 int num , rem ,actual , armStrong=0;
         System.out.println("Enter a number");
         Scanner sc = new Scanner(System.in);

         // 153 -> 1 + 125 + 27 = 153

         num = sc.nextInt();
         actual = num;

         
         while(num>0){
            rem=num%10;
            armStrong = (rem*rem*rem) + armStrong;
            num=num/10;
         }
         if (actual==armStrong)
            System.out.println("Armstrong");
         else
            System.out.println("Not Armstrong");       	
			
	}

}
