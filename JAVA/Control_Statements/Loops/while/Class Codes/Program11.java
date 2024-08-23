//Given an integer N
//print multilplication of its digits
//	Assume N>=0
//	i/p=135
//	o/p=15

class While{
	public static void main(String[]args){
		int N=135;
		int mult=1;

		while(N!=0){
			int rem=N%10;
			mult=mult*rem;
			N=N/10;
		}
		System.out.println(mult);
	}
}


		//we want to create here sum varible to store values after multplication
//created a function with logic mult = mult * rem


