class Solution {
    public int solution(int n) {// 7
		int fact = 1;
		int i = 1;
		while (true) {
			fact = fact * i;
			System.out.println("maxFac :"+fact);
			i++;
			if (fact > n) {
				System.out.println("i : " + (i-1));
				return i-2;
			}
		}

	}
}