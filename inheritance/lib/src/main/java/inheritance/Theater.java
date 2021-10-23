package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Theater extends Project{

    private ArrayList<String> movies = new ArrayList<>();

    Theater(String name){
        super(name);
    }
    public ArrayList<String> getMovies() {
        return movies;
    }


    public void addMovie(String movieName){
        this.movies.add(movieName);

    }
public void removeMovie (String movieName){
        this.movies.remove(movieName);
}

 public void addReview (String name, String movieName,String textReview, int ratting){
     Review review= new Review(name,movieName,textReview,ratting);

     getReviewsList().add(review);
     updateStars();
 }
    @Override
    public String toString() {
        return
        super.toString()+
                ", movies=" + movies +
                ", Review{ \n" + getReviewsList().toString() +

                '}';
    }



}
