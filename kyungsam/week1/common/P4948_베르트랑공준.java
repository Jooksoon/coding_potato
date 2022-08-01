
public class P4948_베르트랑공준 {
	public static int res;
	public static int num1;
	public static int num2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(10));
	}
	
	static int fibo(int num) {
		if(num==0)  return 0;
		else if(num==1) return 1;
		
		return  fibo(num-1)+ fibo(num-2);
		
	}
}
