class p3{
	public static void main(String[] args){
		int N= 942111423;
		int i=0;

		while(N!=0){
			N= N/10;
			i++;
		}
		System.out.println("count of digits = "+i);
	}
}
