import java.util.Scanner;
class cal{
	int num ;
	int cnt=0;
	Scanner sc1 = new Scanner(System.in);
	public void setop(int num){
		this.num = num;
	}
	public void result(){
		for(int i=0; i<this.num;i++) {
			int k = sc1.nextInt();
			if(k==1) {
				continue;
			}
			for(int j=2;j<=k;j++) {
				
				if(k%j==0&&j!=k) {
					break;
				}
				else if(j==k){
					cnt++;
				}
				
			}
			
		}
		sc1.close();
		System.out.println(cnt);
	}
}
public class back_joon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if(num>=1&&num<=100) {
			cal c = new cal();
			c.setop(num);
			c.result();
		}
		sc.close();
	}
}
