import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static int flips = 0;

    public static void main(String[] args) {


// ----------- pluralize -------------

        Scanner myWord = new Scanner(System.in);
        Scanner myNumber = new Scanner(System.in);

        System.out.println("Please Enter a word");
        String word = myWord.nextLine();

        while (word == null || word.trim().isEmpty()) {
            System.out.println("should Enter a Text");
            word = myWord.next();
        }

        System.out.println("Please Enter a number");
        try {
            int number = myNumber.nextInt();
            System.out.println("I own " + number + " " + pluralize(word, number) + ".");
        } catch (Exception e) {
            System.out.println("Error: should enter a number");
        }

// -------------- Flipping ------------

        System.out.println("Please Enter a number");
        try {
            int number = myNumber.nextInt();
            Flipping(number);
        } catch (Exception e) {
            System.out.println("Error: should enter a number");
        }

// --------- Clock -----------


        time();

    }


    public static String pluralize(String word, int max) {
        String theWord = word;

        if (max != 1) {
            theWord = theWord + "s";
        }
        return theWord;
    }

    public static void Flipping(int n) {
        flips = 0;
        int heads = 0;

        while (heads != n) {

            heads = 0;

            for (int i = 1; i <= n; i++) {

                Double randomNum = Math.random();

                if (randomNum < 0.5) {
                    System.out.println("tails");

                } else {
                    System.out.println("heads");

                    heads += 1;
                    flips += 1;
                }

            }

        }
        System.out.println("It took " + flips + " flips to flip " + n + " head in a row.");

    }

    public static void time() {

        Thread t = new Thread(new Runnable() {

            @Override

            public void run() {
                while (true) {
                    LocalDateTime now = LocalDateTime.now();
                    String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    System.out.println(time);
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        
                    }
                }
            }
        });
        t.run();

    }

}