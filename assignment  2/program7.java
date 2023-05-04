class p7{
	public static void main(String[] args){
		//int N=6;
		int N=7;
		if(N%2==0){
			while(N>0){
				System.out.println(N);
				N=N-1;
			}
		} else{
			N=N-2;
			while(N>0){
				System.out.println(N);
				N=N-1;	
			}
		}
	}
}
