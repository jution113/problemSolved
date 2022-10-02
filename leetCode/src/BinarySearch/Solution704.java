package BinarySearch;

public class Solution704 {
    public int search(int[] nums, int target) {
        // input (int[], int) -> return int
        // 1. 주어진 배열의 중앙값을 기준으로 범위를 반으로 줄여나가며 값이 target과 같은지 검사
        // 2. 반복문을 통해 현재 배열의 중앙값이 target과 일치하는 검사
        // 2.1. 만약 중앙값이 target과 일치한다면 현재 중앙값의 index를 반환
        // 2.2. 만약 중앙값이 target과 일치하지 않는다면 3번으로 이동
        // 3. 중앙값과 target의 크기를 비교
        // 3.1. 만약 target이 중앙값보다 크다면 범위를 중앙값+1 ~ 배열의 끝으로 설정하여 재탐색
        // 3.2. 만약 target이 중앙값보다 작다면 범위를 0~중앙값-1로 설정하여 재탐색
        // 3.3. 이때 탐색 범위가 0미만이면 반복문을 탈출
        // 4. 반복문이 종료된 시점에서도 반환이 안 되었다면 -1을 반환

        // 범위의 시작 index인 startIdx 설정
        int startIdx = 0;
        // 범위의 끝 index인 endIdx 설정
        int endIdx = nums.length-1;

        // 범위를 조절해가며 target 값을 탐색
        while(startIdx <= endIdx) {
            // 범위의 중앙 index인 centerIdx 설정
            int centerIdx = (startIdx + endIdx) / 2;

            // 만약 target 값과 중앙 값이 같다면 해당 index 반환
            if(target == nums[centerIdx]) return centerIdx;

            // target의 값과 중앙 값을 비교 후 범위를 조정하여 재탐색
            if(target > nums[centerIdx]) {
                startIdx = centerIdx + 1;
            } else {
                endIdx = centerIdx - 1;
            }

        }


        // 만약 target을 찾지 못했다면 -1 반환
        return -1;

    }
}
