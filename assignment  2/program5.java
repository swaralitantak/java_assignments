class p5{
	public static void main(String[] args){

		int N= 942111423;

		while(N!=0){
			int rem= N%10;
			N=N/10;

			if(rem%2==0){
				System.out.println(rem*rem);
			}
		}
	}
}
