class p5{
	public static void main(String[] args){
		int x=0;

		if(x>12){
			System.out.println("There are only 12 months in a year!");
		}else if(x==1){
			System.out.println("January has "+31+" days");
		} else if(x==2){
			System.out.println("February has "+28+"/"+29+" days"); // leap year
		} else if(x==3){
			System.out.println("March has "+31+" days");
		} else if(x==4){
			System.out.println("April has "+30+" days");
		} else if(x==5){
			System.out.println("May has "+31+" days");
		} else if(x==6){
			System.out.println("June has "+30+" days");
		} else if(x==7){
			System.out.println("July has "+31+" days");
		} else if(x==8){
			System.out.println("August has "+31+" days");
		} else if(x==9){
			System.out.println("September has "+30+" days");
		} else if(x==10){
			System.out.println("October has "+31+" days");
		} else if(x==11){
			System.out.println("November has "+30+" days");		
		} else if(x==12){
			System.out.println("December has "+31+" days");
		} else{
			System.out.println("Please enter a valid number");
		}

	}
}
