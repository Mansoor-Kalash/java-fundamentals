package inheritance;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.LinkedList;

public class Restaurant {
   private String name;
   private int starsNumnber;
    private ArrayList<String> priceCategory = new ArrayList<String>();
    private ArrayList<Review> reviewsList=new ArrayList<Review>();


    Restaurant(String name){
        this.name=name;

    }

    public ArrayList<String> getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String nameOfFood, int priceInJod) {
        String priceCategory =nameOfFood+":" + " "+priceInJod+" JD";
        getPriceCategory().add(priceCategory);


    }



    public void addReview(String name, String textReview, int ratting){
        Review review= new Review(name,textReview,ratting);
        reviewsList.add(review);

    }
    private int updateStars(){
        int total=0;
        for (Review item : reviewsList ){
          total+= item.getRate();
        }
      return  starsNumnber = total/reviewsList.size();
    }



    @Override
    public String toString() {

        return "Restaurant{\n" +
                "name: '" + name + "\'\n" +
                ", starsNumnber: " + updateStars()+"\n" +
                ", priceCategory: " + priceCategory+"\n" +
                ", Review{ \n" + reviewsList.toString() +
                "\n}";
    }


}
