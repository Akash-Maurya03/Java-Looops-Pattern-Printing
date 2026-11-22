package If_Else;

import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2 == 0)
            System.out.println("EvenNumber");
        else System.out.println("OddNumber");

    }
}

