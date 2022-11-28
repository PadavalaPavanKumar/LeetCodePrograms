package LeetCodeEasyPrograms;

public class Program2 {
	
	public  boolean isPalindrome(int x) {
		int  b = 0,t=x, c ;
		if(x<0 || (x%10==0 && x!=0)) {
			return false;
		}else {
		while (t != 0) {

			c = t % 10;// 1,2
			b = b * 10 + c;// 12
			t = t / 10;


	}
		if(x==b) {
			return true;
		}
		return false;
	}
	}

	public static void main(String[] args) {
		Program2 prob=new Program2();
	System.out.println(prob.isPalindrome(121));
		
	}
}
