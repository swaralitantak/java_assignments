class p6{
	public static void main(String[] args){
		int i=1;
		int N=10;
		int sum=0;
		int mult=1;

		while(i<=N){
			if(i%2==0){
				sum= sum+i;	
			} else if(i%2==1){
				mult= mult*i;
			} 
			i++;
		}

		System.out.println("sum of even numberr is : "+sum);
		System.out.println("multiplication of odd numbers is: "+mult);
	}
}
