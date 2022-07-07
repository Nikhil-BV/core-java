class GameTester{
	public static void main(String a[]){
		
		GamesDTO gm = new GamesDTO();
		gm.setName("PUBG");
		gm.setType("online");
		gm.setTotalPlayers(100);
		gm.setOrigin("South Korea");
		
		
		System.out.println(gm.getName()+":"+gm.getType()+":"+gm.getTotalPlayers()+":"+gm.getOrigin());
	}
	
	
}