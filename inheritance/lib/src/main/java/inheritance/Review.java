package inheritance;

import java.util.LinkedList;

public class Review {
   private String name;
   private String commint;
   private int rate ;

   Review(String name,String commint,int num){
       this.name=name;
       this.commint=commint;
       this.rate=num;
   }


    public int getRate() {
        return rate;
    }



    @Override
    public String toString() {
        return
                "\nname: " + name + '\'' +
                ", commint: '" + commint + '\'' +
                ", rate: " + rate+"\n"
                ;
    }
}
