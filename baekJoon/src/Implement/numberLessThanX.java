package Implement;

import java.util.Scanner;

public class numberLessThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 수열 a의 개수 n
        int n = sc.nextInt();
        // 기준이 되는 값 x
        int x = sc.nextInt();

        String result = "";

        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            if(num < x) {
                result += String.valueOf(num);
                if(i<n-1) result += " ";
            }
        }

        System.out.print(result);

    }
}
