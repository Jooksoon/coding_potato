
public class P10870_피보나치 {
	public static int res;
	public static int num1;
	public static int num2;
	public static void main(String[] args) {
		System.out.println(fibo(10));
	}
	
	static int fibo(int num) {
		if(num==0)  return 0;
		else if(num==1) return 1;
		
		return  fibo(num-1)+ fibo(num-2);
		
	}
}
