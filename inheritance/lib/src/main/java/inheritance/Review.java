package inheritance;

import java.util.LinkedList;

public class Review {
   private String name;
   private String commint;
   private int rate ;
    private String movie;

   Review(String name,String commint,int num){
       this.name=name;
       this.commint=commint;
       this.rate=num;
   }
    Review(String name,String movieName,String commint,int num){
        this.name=name;
        this.movie=movieName;
        this.commint=commint;
        this.rate=num;
    }


    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
    public int getRate() {
        return rate;
    }



    @Override
    public String toString() {
        return
                "\n name: " + name +" "+
                ",  commint: '" + commint + " " +
                ",  rate: " + rate+"\n"
                ;
    }
}
