package IOandOperation;

import java.util.Scanner;

// 2588
public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input2Copy = input2;

        // input의 1의 자리 숫자 구하기
        int units = input2 % 10;
        input2 /= 10;

        // input의 10의 자리 숫자 구하기
        int tnes = input2 % 10;
        input2 /= 10;

        // input의 100의 자리 숫자 구하기
        int hundres = input2;

        System.out.println(input1 * units);
        System.out.println(input1 * tnes);
        System.out.println(input1 * hundres);
        System.out.println(input1 * input2Copy);

    }
}