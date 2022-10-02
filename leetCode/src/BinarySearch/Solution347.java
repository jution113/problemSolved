package BinarySearch;
/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution347 extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;

        while(start<=end) {
            // 새로운 중앙 값 = 이전 중앙값 + 새로운 탐색범위/2 지점
            int mid = start+(end-start)/2;

            int numCheck = guess(mid);

            if(numCheck == 0) {
                // mid == pick
                return mid;
            } else if(numCheck == -1) {
                // mid > pick
                end = mid-1;
            } else {
                // mid < pick
                start = mid+1;
            }
        }

        // 추측한 값이 1~n의 범위 밖임
        return -1;

    }
}