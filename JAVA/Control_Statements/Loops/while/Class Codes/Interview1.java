//Write a program to check wheather the number is a Palindrome number or not (2332)
//o/p= 2332 is Palindrome number


class While{
	public static void main(String[]args){

		int N=2332;
		int rev=0;
		int temp=N;

		while(N!=0){
			int rem=N%10;
			rev=rev*10+rem;
			N=N/10;
		}if(temp==rev){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not");
		}
	}
}                                                                                                                                                                                                            


