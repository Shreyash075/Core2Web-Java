//Print values between 1 to 50 which will be divisible by 3

class While{
	public static void main(String[]args){
		int N=50;
		int i=1;
		while(i<=N){
			if(i%3==0){
				System.out.println(i);
			}
			i++;
		}
	}
}

