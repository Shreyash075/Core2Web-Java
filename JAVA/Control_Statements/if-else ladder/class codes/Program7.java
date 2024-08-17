//Given an integer value as input
//print "fizz" if it is divisible by 3
//print "buzz"if it is divisible by 5
//print"fizz-buzz"if it is divisible by both 3 and 5
//If not then print "not divisible by both"

class Ladder{
	public static void main(String[]args){
		int x=15;
		if(x%3==0 && x%5==0){
			System.out.println("fizz-buzz");
		}else if(x%3==0){
			System.out.println("fizz");
		}else if(x%5==0){
			System.out.println("buzz");
		}else{
			System.out.println("Not divisible by both");
		}
	}
}

 // if we use here && operator at 3rd else if block then our input x=15 satify if(x%==0)and further blcks are skiped
