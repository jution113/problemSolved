package IOandOperation;

import java.util.Scanner;

// 3003
public class KingQueenRooksBishopsKnightsPawns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // king queen rooks bishops knights pawns의 순서로 된 문자열을 입력 받음
        String input = sc.nextLine();

        // 입력받은 문자열을 공백(" ")을 기준으로 나누어 배열에 담는다
        String[] currentSet = input.split(" ");
        // 원래 있어야 하는 피스의 개수를 표시한 배열 생성
        int[] correctSet = new int[] {1, 1, 2, 2, 2, 8};

        String result = "";

        // 원래 있어야 하는 세트와 비교하며 부족한 피스만큼 result에 표시
        for(int i=0; i<currentSet.length; i++) {
            int piceGap = correctSet[i] - Integer.parseInt(currentSet[i]);
            result += String.valueOf(piceGap) + " ";
        }

        System.out.println(result);
    }
}