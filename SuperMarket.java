class SuperMarket
{
 static String biscuits[]= {"parleG","tiger","marivita","oreo","Darkfantaci","hideandseek","googlye"};
 static String vegetables[]={"carrot","beetroor","beans","tomato","potato","onion","brinjal","drumstick"};
 static String sportsProducts[]={"skippingrope","football","runningshoe","gymbag","proteinshaker","bat","cricketBall"};
 static String groceries[]={"sunfloweroil","slat","honey","peanuts","moongdal","wheatatta","jeera"};
 static String soaps[]={"dove","himalaya","pears","savlon","rexona","fiama","lux"};
 static String detergents[]={"surfexcel","Mrwhite","rin","tide","ariel","ghadi"};
 static String coolDrinks[]={"thumsup","cocacola","fanta","sprite","maaza","pepsi","redbull"};
 static String deos[]={"nivea","setwet","yardley","parkavenue","axe","engage","dove"};
 static String homeApplieances[]={"AC","Television","Washingmachine","refrigerators","Projectors","Microwaves","Dishwasher"};
 static String snacks[]={"cookies","kurkure","Lays","popcorn","chipes","bread","Waffers"};
 static String fruits[]={"apple","banana","grapes","orange","straberry","papaya","watermelon"}; 
 static String giftItems[]={"mobile","sunglass","chocolates","shirts","pants","pen","mug"};
 static String chocolates[]={"kitkat","lindt","snickers","cadbury","milkybar","aero","munch"};
   public static void main(String a[])
{
	String value = getbiscuit("oreo");
    String value1 = getvegetable("carrot");
	String value2 = getsportsProduct("football");
	String value3= getgrocerie("honey");
	String value4 = getsoap("rexona");
	String value5= getdetergent("rin");
	String value6 = getcoolDrink("fanta");
	String value7 = getdeo("setwet");
	String value8 = gethomeApplieance("AC");
    String value9 = getsnack("Lays");
    String value10 = getfruit("orange");
    String value11 = getgiftItem("mug");
	String value12 = getchocolate("milkybar");
	
	System.out.println("Come will eat "+value);
	System.out.println("Come will eat "+value1);
	System.out.println("Come will play "+value2);
	System.out.println("Come will eat "+value3);
	System.out.println("Come will use "+value4);
	System.out.println("Come will use "+value5);
	System.out.println("Come will drink "+value6);
	System.out.println("Come will use "+value7);
	System.out.println("Come will use "+value8);
	System.out.println("Come will eat "+value9);
	System.out.println("Come will eat "+value10);
	System.out.println("Come will use "+value11);
	System.out.println("Come will eat "+value12);
}
   public static String getbiscuit(String biscuit)
   {
      String biscuitName = null ;
      for(int i=0; i< biscuits.length; i++)
      {
        if(biscuits[i] == biscuit)
		{
           biscuitName =biscuits[i] ;
		}
	  }
     return biscuitName;
   }
 
 
   public static String getvegetable(String vegetable)
   {
      String vegetableName = null ;
      for(int i=0; i<vegetables.length;i++)
      {
        if(vegetables[i] == vegetable)
		{
           vegetableName =vegetables[i] ;
		}
	  }
     return vegetableName;
   }

   public static String getsportsProduct(String sportsProduct)
   {
      String sportsProductName = null ;
      for(int i=0; i<sportsProducts.length;i++)
      {
        if(sportsProducts[i] == sportsProduct)
		{
           sportsProductName = sportsProducts[i] ;
		}
	  }
     return sportsProductName;
   }
 
 
   public static String getgrocerie(String grocerie)
   {
      String grocerieName = null ;
      for(int i=0; i<groceries.length;i++)
      {
        if(groceries[i] == grocerie)
		{
           grocerieName =groceries[i] ;
		}
	  }
     return grocerieName;
   }
 
 
   public static String getsoap(String soap)
   {
      String soapName = null ;
      for(int i=0; i<soaps.length;i++)
      {
        if(soaps[i] == soap)
		{
           soapName =soaps[i] ;
		}
	  }
     return soapName;
   }


 
   public static String getdetergent(String detergent)
   {
      String detergentName = null ;
      for(int i=0; i<detergents.length;i++)
      {
        if(detergents[i] == detergent)
		{
           detergentName =detergents[i] ;
		}
	  }
     return detergentName;
   }
 
 
   public static String getcoolDrink(String coolDrink)
   {
      String coolDrinkName = null ;
      for(int i=0; i<coolDrinks.length;i++)
      {
        if(coolDrinks[i] == coolDrink)
		{
           coolDrinkName =coolDrinks[i] ;
		}
	  }
     return coolDrinkName;
   }
 
 
   public static String getdeo(String deo)
   {
      String deoName = null ;
      for(int i=0; i<deos.length;i++)
      {
        if(deos[i] == deo)
		{
           deoName =deos[i] ;
		}
	  }
     return deoName;
   }


   public static String gethomeApplieance(String homeApplieance)
   {
      String homeApplieanceName = null ;
      for(int i=0; i<homeApplieances.length;i++)
      {
        if(homeApplieances[i] == homeApplieance)
		{
           homeApplieanceName =homeApplieances[i] ;
		}
	  }
     return homeApplieanceName;
   }
 
 
 
   public static String getsnack(String snack)
   {
      String snackName = null ;
      for(int i=0; i<snacks.length;i++)
      {
        if(snacks[i] == snack)
		{
           snackName = snacks[i] ;
		}
	  }
     return snackName;
   }
 
	 
   public static String getfruit(String fruit)
   {
      String fruitName = null ;
      for(int i=0; i<fruits.length;i++)
      {
        if(fruits[i] == fruit)
		{
           fruitName =fruits[i] ;
		}
	  }
     return fruitName;
   }
 
 
   public static String getgiftItem(String giftItem)
   {
      String giftItemName = null ;
      for(int i=0; i<giftItems.length;i++)
      {
        if(giftItems[i] == giftItem)
		{
           giftItemName =giftItems[i] ;
		}
	  }
     return giftItemName;
   }
 
 
   public static String getchocolate(String chocolate)
   {
      String chocolateName = null ;
      for(int i=0; i<chocolates.length;i++)
      {
        if(chocolates[i] == chocolate)
		{
           chocolateName =chocolates[i] ;
		}
	  }
     return chocolateName;
   }
   
//System.out.println("biscuits are: "+biscuits[0]+","+biscuits[1]+","+biscuits[2]+","+biscuits[3]+","+biscuits[4]+","+biscuits[5]+","+biscuits[6]);
//System.out.println("vegetables are: "+vegetables[0]+","+vegetables[1]+","+vegetables[2]+","+vegetables[3]+","+vegetables[4]+","+vegetables[5]+","+vegetables[6]);
//System.out.println("sportsProducts are:"+sportsProducts[0]+","+sportsProducts[1]+","+sportsProducts[2]+","+sportsProducts[3]+","+sportsProducts[4]+","+sportsProducts[5]+","+sportsProducts[6]);
//System.out.println("groceries are: "+groceries[0]+","+groceries[1]+","+groceries[2]+","+groceries[3]+","+groceries[4]+","+groceries[5]+","+groceries[6]);
//System.out.println("soaps are:"+soaps[0]+","+soaps[1]+","+soaps[2]+","+soaps[3]+","+soaps[4]+","+soaps[5]+","+soaps[6]);
//System.out.println("detergents are: "+detergents[0]+","+detergents[1]+","+detergents[2]+","+detergents[3]+","+detergents[4]+" "+detergents[5]);
//System.out.println("coolDrinks are: "+coolDrinks[0]+","+coolDrinks[1]+","+coolDrinks[2]+","+coolDrinks[3]+","+coolDrinks[4]+","+coolDrinks[5]+","+coolDrinks[6]);
//System.out.println("deos are: "+deos[0]+","+deos[1]+","+deos[2]+","+deos[3]+","+deos[4]+","+deos[5]+","+deos[6]);
//System.out.println("homeApplieances are: "+homeApplieances[0]+","+homeApplieances[1]+","+homeApplieances[2]+","+homeApplieances[3]+","+homeApplieances[4]+","+homeApplieances[5]+","+homeApplieances[6]);
//System.out.println("snacks are: "+snacks[0]+","+snacks[1]+","+snacks[2]+","+snacks[3]+","+snacks[4]+","+snacks[5]+","+snacks[6]);
//System.out.println("fruits are: "+fruits[0]+","+fruits[1]+","+fruits[2]+","+fruits[3]+","+fruits[4]+","+fruits[5]+","+fruits[6]);
//System.out.println("giftItems are: "+giftItems[0]+","+giftItems[1]+","+giftItems[2]+","+giftItems[3]+","+giftItems[4]+","+giftItems[5]+","+giftItems[6]);
//System.out.println("chocolates are: "+chocolates[0]+","+chocolates[1]+","+chocolates[2]+","+chocolates[3]+","+chocolates[4]+","+chocolates[5]+","+chocolates[6]);

}