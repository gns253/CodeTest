using namespace std;

int solution(int n) {
    int answer = 0;
    int result = 1;
    
    while(true) {
        result *= ++answer;
        if(result > n) {
             return answer-1;
        }
    }
}