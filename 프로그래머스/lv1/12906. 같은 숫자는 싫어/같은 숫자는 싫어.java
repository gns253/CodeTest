import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
       
		List<Integer> answer = new ArrayList<Integer>();
		int num = 10;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != num) {
				answer.add(arr[i]);
				num = arr[i];
			}
		}


		return answer;
    }
}