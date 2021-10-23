package inheritance;

import java.util.ArrayList;

public abstract class Project {
    private String name;
    private int starsNumnber;


    private ArrayList<Review> reviewsList=new ArrayList<Review>();

    Project(String name){
        this.name=name;

    }
    public int getStarsNumnber() {
        return starsNumnber;
    }

//    public void setReviewsList(ArrayList<Review> reviewsList) {
//        this.reviewsList = reviewsList;
//    }

    public ArrayList<Review> getReviewsList() {
        return reviewsList;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addReview(String name, String textReview, int ratting){
        Review review= new Review(name,textReview,ratting);
        reviewsList.add(review);
        updateStars();

    }
//    public abstract void addReview(String name, String movieName,String textReview, int ratting);
    public void updateStars(){
        int total=0;
        for (Review item : reviewsList ){
            total+= item.getRate();
        }
        starsNumnber = total/reviewsList.size();
    }

    @Override
    public  String toString() {

        return "{" +
                "name='" + name + '\'' +
                ", starsNumnber=" + starsNumnber
                ;
    }


}
