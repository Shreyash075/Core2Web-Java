//Given an integer N
//print sum of its digits
//	Assume >=0
//	i/p=6531
//	o/p=15

class While{
	public static void main(String[]args){
		int N=6531;
		int sum=0;

		while(N!=0){
			int rem=N%10;
			sum=sum+rem;
			N=N/10;
		}
		System.out.println(sum);
	}
}


		//we want to create here sum varible to store values after addition
//created a function with logic sum= sum + rem


