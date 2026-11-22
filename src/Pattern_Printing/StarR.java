package Pattern_Printing;

import java.util.Scanner;

public class StarR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i=1;i<=row;i++){//ye decide krega kitni line hogi
            for(int j=1;j<=col;j++){//ye decide krega kitna stra print hoga
                System.out.print("* ");
            }
            System.out.println();//mtlb ek baar run krne ke baad enter
        }
    }
}
