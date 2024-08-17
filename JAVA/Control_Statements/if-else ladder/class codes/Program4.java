//Given the temperature of a person in farenheit
//Print wheather the person has high,normal,low temp
//  >98.6
//  98.6<= and <=98.6
//  <98.0




class Ladder{
	public static void main(String[]args){
		float temp=96.6f;	//if 92.6 'f' is not declared then jvm take it as double
			if(temp>98.6f){
				System.out.println("High");
			}else if(96f<=temp && temp<=98.6f){
				System.out.println("Normal");
			}else{
				System.out.println("Low");
			}
	}
}
		

		//Here we can use "else if(98.6f<=temp && temp<=98.6f)"
//but here we && operator where all conditions wants to be true

