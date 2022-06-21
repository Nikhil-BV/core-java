class Movies
{
    static String movies[] = {"Charlie 777","Vikram","Bhool Bhulaiya 2","Prithviraj","Major"};
	
	public static void main(String a[])
	{
	String value = getMovie("vikram");
	  System.out.println("Come we will watch "+value);
}
   public static String getMovie(String movie)
{
	String movieName =null;
for(int i=0;i< movies.length ; i++ )
{
	if(movies[i] == movie)
	{
		movieName = movies[i];
		
	}
	else{
		System.out.println(movie+"  is not present in the list");
		 
	}
}	
  return movieName;
}
} 