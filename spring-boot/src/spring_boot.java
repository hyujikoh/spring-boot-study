import java.util.Scanner;

class Solution {
    public void solution(int w, int h) {
        long answer = 0;
        long gcd = 0;
        long width = Long.valueOf(w); // int 형 자료 long 전환
        long height =Long.valueOf(h); // int 형 자료 long 전환
        if(w>h){
	    // 멀쩡한 삼각형 구하는 공식 w와 h의 대소 관계에 따라 조건 실행
            answer = width*height-(width+height-gcd(width,height));
        }
        else{
            answer = width*height-(width+height-gcd(height,width));
        }
        System.out.println(answer);;
    }
    // 최소공약수 구하는 메소드
    static long gcd(long a, long b){

        if(a%b==0){
            return b;
        }
        return (long)gcd (b,a%b);
    }
}



public class spring_boot {

    public static void main(String[] args) {
	// write your code here
        int w,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("width 길이 입력");
        w = sc.nextInt();
        System.out.println("height 길이 입력");
        h = sc.nextInt();
        Solution s = new Solution();
        s.solution(w,h);
    }
}
