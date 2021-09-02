package functions.demo;

public class Demo {

    boolean playButton = true;

    public void playMusic(){
        if (playButton) {
            System.out.println("The music is playing");
        }else {
            System.out.println("Music is paused");
        }
    }

    public void greeting(String location) {
        System.out.println("Hello, " + location);
    }
    public void printPhoto(int width, int height, boolean inColor) {
        System.out.println("Width = " + width + " cm");
        System.out.println("Height = " + height + " cm");
        if (inColor) {
            System.out.println("Print is full color.");
        }else {
            System.out.println("Print is black and white");
        }
    }

    public double makeChange(double itemCost, double dollarsProvided) {
        double change;
        change = dollarsProvided - itemCost;

        return change;
    }

    public int rollDice() {

        //random num between 0 and almost 1
        double randomNumber = Math.random() * 6; //change range to 0 to (almost) 6
        randomNumber = randomNumber + 1; //shift range up one
        int randomInt = (int) randomNumber; //cast to integer

        return randomInt;
    }


    public int rollDices(int sides){
        // random num between 0 and (almost) 1
        double randomNumber = Math.random();

        // change range to 0 to (almost) 6
        randomNumber = randomNumber * sides;

        // shift range up one
        randomNumber = randomNumber + 1;

        // cast to integer (ignore decimal part)
        // ex. 6.998 becomes 6
        int randomInt=(int)randomNumber;

        // return statement
        return randomInt;
    }


    public static void main(String[] args) {

        Demo text = new Demo();
        text.greeting("New York");

        text.playMusic();
        text.printPhoto(8,10, true);
        System.out.println(text.makeChange(787, 983.9));

        double randomNumber =  Math.random() + 1;

        int roll1 = text.rollDice();
        int roll2 = text.rollDice();

        System.out.println(roll1);
        System.out.println(roll2);

        int rollFirst = text.rollDices(8);
        System.out.println(rollFirst);

        randomNumber = randomNumber * 10;
        System.out.println((int)randomNumber);

    }
}
