package inheritance;

public class Shop extends Project {
    private String description;
    private int numberOfDollar;

Shop(String name,String description,int price){
    super(name);
    this.description=description;
    this.numberOfDollar=price;

}

    @Override
    public String toString() {

        return
                super.toString() +
                "description='" + description + '\'' +
                ", numberOfDollar=" + numberOfDollar + " $" +
                ", Review{ \n" + getReviewsList().toString() +

                        '}';
    }
}
