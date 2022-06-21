class AmazonPrimeA
{
static String series[]={"harry potter","The wheel of time","guilty mind","Manifest","mumbai diaries","upload","bestseller","hanna","the family man","Legacies","mirzapur","Gharwapsi","Runawaya","Reacher","The ekpanse"};
static String kannadaMovies[]={"KGF 2","KGF 1","Roberrt","LoveMocktail","LoveMocktail2","Dia","Kotigobba 3","Yajamana","Odeya","Geetha","Madhagaja","Yuvarathnaa","Jaguar","Bharaate","Pailwaan"};
static String hindiMovies[]={"Raazi","hera Pheri","Udaan","3 idiots","Blackmail","Bajrangi Bhaijaan","Panchayat","Sultan","Lakshya","Hum Tum","Heropanti2","pushpa","Raazi","Stree","GullyBoy"};
static String tamilMovies[]={"Master","Maara","Pushpa","Oh my dog","Radhe shyam","FIR","Mahaan","Jai Bhim","Marakkar","Tenet","Mirugaa","The Priest","Calls","Thalaivii","Friendship","Kuberan"};
public static void main(String a[])
{
System.out.println("List of series");
System.out.println("==============");
for(int i=0 ; i < series.length;i++)
{
System.out.println(series[i]);
}
System.out.println("List of kannadaMovies");
System.out.println("=====================");
for(int i=0 ; i< kannadaMovies.length;i++)
{
System.out.println(kannadaMovies[i]);
}
System.out.println("List of hindiMovies");
System.out.println("===================");
for(int i=0; i< hindiMovies.length;i++)
{
System.out.println(hindiMovies[i]);
}
System.out.println("List of tamilMovies");
System.out.println("===================");
for(int i=0; i< tamilMovies.length;i++)
{
System.out.println(tamilMovies[i]);
}
}
}