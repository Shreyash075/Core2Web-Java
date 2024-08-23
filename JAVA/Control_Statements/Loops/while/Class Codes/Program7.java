// Take an integer N as input
// Print multiplies of 4 till N
// I/P =4
// O/P=22

class While{
	public static void main(String[]args){
		int i=4;
		int N=22;

		while(i<=22){
			if(N%i!=0){
			System.out.println(i);
			i=i+4;
			}
		}
	}
}


	// To achieve multiplies of 4 we can add 4 
// i.e., i=i+4
// here we add if(N%i)!=0) which will satified by inputs
// then add i=i+4

