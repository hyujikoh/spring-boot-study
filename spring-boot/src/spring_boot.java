import java.util.Scanner;

class Solution {
    public void solution(int w, int h) {
        long answer = 0;
        long gcd = 0;
        long width = Long.valueOf(w);
        long height =Long.valueOf(h);
        if(w>h){
            answer = width*height-(width+height-gcd(width,height));
        }
        else{
            answer = width*height-(width+height-gcd(height,width));
        }
        System.out.println(answer);;
    }
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
