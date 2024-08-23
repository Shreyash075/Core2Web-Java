//Take an integer N as input
//Print perfect sqaure till N
//perfect sqaure: An integer whose sqaure root is as integer
//	25->5    : yes
//	81->9    : yes
//	1->1     : yes
//	10->3.13 : no
 
// i/p=30
// o/p= 1 4 9 16 25



class While{
	public static void main(String[]args){
		int N=30;
		int i=1;
		while(i*i<=N){
			System.out.println(i*i);
			i++;
		}
	}
}
