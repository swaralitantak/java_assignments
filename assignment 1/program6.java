class p6{
	public static void main(String[] args){
		int num1=-1, num2=0, num3=-6;

		if(num1>num2 && num1>num3){
			System.out.println(num1+" is maximum between "+num1+", "+num2+" and "+num3);
		} else if(num2>num1 && num2>num3){
			System.out.println(num2+" is maximum between "+num1+", "+num2+" and "+num3);
		} else if(num3>num1 && num3>num2){
			System.out.println(num3+" is maximum between "+num1+", "+num2+" and "+num3);
		}
	}
}
