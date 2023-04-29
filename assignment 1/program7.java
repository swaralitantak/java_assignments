class p7{
	public static void main(String[] args){
		int costPrice=1000, sellingPrice=1000;

		if(costPrice<sellingPrice){
			int profit= sellingPrice-costPrice;
			System.out.println("Profit of "+profit);
		} else if(costPrice>sellingPrice){
			int loss= costPrice-sellingPrice;
			System.out.println("Loss of "+loss);
		} else{
			System.out.println("Neither profit nor loss");
		}
	}
}
