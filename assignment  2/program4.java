class p4{
	public static void main(String[] args){
		int i=0;
		int N= 942111423;
		
		while(N !=0){
			int rem= N%10;
			N= N/10;
			
			if(rem%2==1){
				i++;
			}
		}
		System.out.println("count of odd digits = "+ i);
	}
}
