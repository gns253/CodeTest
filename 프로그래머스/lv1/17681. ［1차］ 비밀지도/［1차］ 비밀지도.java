class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {                
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            System.out.println("answer : " + answer[i]);
            
            answer[i] = answer[i].replaceAll("0", " ");
            answer[i] = answer[i].replaceAll("1", "#");
            
            while (answer[i].length() < n) {
                answer[i] = ' ' + answer[i];
            }
        }
      
    
        
        return answer;
    }
}