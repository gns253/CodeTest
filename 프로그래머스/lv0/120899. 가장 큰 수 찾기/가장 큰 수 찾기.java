class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int [2];
        
        int maxN = 0;
		int indexN = 0;
		for(int i =0; i<array.length; i++) {
			if( maxN < array[i]) {
				maxN = array[i];
				indexN = i;
			}
		}
        answer[0] = maxN;
        answer[1] = indexN;
      
        
        return answer;
    }
}