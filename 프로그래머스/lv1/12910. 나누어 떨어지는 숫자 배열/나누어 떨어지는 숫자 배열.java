import java.util.*;
class Solution {


	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int result = 0;
		
		//나누어 떨어지는 수
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				arrayList.add(arr[i]);
			}
        }
        //나누어 떨어지지 않는 수
        if (arrayList.isEmpty()) {
            arrayList.add(-1);
        }
		
		answer = new int[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			answer[i] = arrayList.get(i);
		}

		Arrays.sort(answer);
		return answer;
	}
}
