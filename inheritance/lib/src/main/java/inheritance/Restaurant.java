package inheritance;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.LinkedList;

public class Restaurant extends Project {
    private ArrayList<String> priceCategory = new ArrayList<String>();




    Restaurant(String name){
        super(name);
//        setName(name);

    }

    private ArrayList<String> getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String nameOfFood, int priceInJod) {
        String priceCategory =nameOfFood+":" + " "+priceInJod+" JD";
        getPriceCategory().add(priceCategory);


    }


    @Override
    public String toString() {
        return
                super.toString()
+
                ", priceCategory: " + priceCategory+"\n" +
                ", Review{ \n" + getReviewsList().toString() +
                "\n}";
    }


}
