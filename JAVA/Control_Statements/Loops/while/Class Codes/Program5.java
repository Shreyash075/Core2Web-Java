//take an integer N as input
//print odd integer from 1 to N using loop
//i/p=10 o/p= 1 3 5 7 9

class While{
	public static void main(String []args){
		int i=1;
		int N=10;

		while(i<N){
			if(i%2!=0){
			System.out.println(i);
			i=i+2;
			}
		}
	}
}

		// 1
		//here we use ! = operator
