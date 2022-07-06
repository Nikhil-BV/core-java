class WeaponTester{

	public static void main(String a[]){
		
		Weapon wp = new Weapon();
		wp.setName("Ak47");
		wp.setType("Machine Gun");
		wp.setRange(80);
		wp.setOrigin("Germany");
		
		
		System.out.println(wp.getName()+"\n"+wp.getType()+"\n"+wp.getRange()+"\n"+wp.getOrigin());
		
	}
	
	
}