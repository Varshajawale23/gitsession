public class ArmstrongNo {

	public static void main(String[] args) {
		System.out.println("Welcome");
		int no = 153;
		int armNo = 0;
		int m=no;
		while (no> 0)
		{
			int rem = no% 10;
			no= no / 10;
			armNo = rem * rem * rem+ armNo;
		}
		if(m==armNo) {
			System.out.println("Number is armstrong");
		}
		else {
			System.out.println("Number is not armstrong");
		}
	}
}
