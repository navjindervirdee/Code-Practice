public class BeerSong{
   public static void main(String[] args){
     int beernum = 99;
     String word = "bottles";
     
     while (beernum>0){
       
        if(beernum==1){
             word="bottle";//singular, as in one bottle.
        }
      
        System.out.println(beernum + " " + word + " of beer on the wall");
        System.out.println(beernum + " " + word + " of beer.");
        System.out.println("Take onedown.");
        System.out.println("Pass it around.");
        beernum=beernum - 1;
         
        if(beernum > 0){
              System.out.println(beernum + " " + word + "of beer on the wall");
         }else {
              System.out.println("No more bottles of beer on the wall");
         }
      }
   }
}
