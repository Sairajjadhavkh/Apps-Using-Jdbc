

public class Practice {
	
	public static void main(String[] args) {
		int num=9;
		int temp=num;
		int temp1=num;
		int count=0;
		while(num!=0) {
			num/=10;
			count++;
		}
		int rem;
		int sum=0;
		while(temp!=0) {
			rem=temp%10;
			sum=sum+(int)Math.pow(rem, count);
			temp/=10;
		}
		if(temp1==sum) {
			System.out.println("Amstrong number");
		}else
			System.out.println("not a amstrong number");
		
	}
}



