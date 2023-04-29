class p10{
	public static void main(String[] args){
		int target=231; //Team A
		int score=188;// Team B

		if(score>target){
			System.out.println("Team B wins by "+(score-target)+" runs.");
		} else if(target==score){
			System.out.println("Its a draw at "+score+" runs.");
		} else{
			System.out.println("Team A wins by "+(target-score)+" runs.");
		}
	}
}
