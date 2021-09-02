package loops.demo;

import functions.demo.Demo;

public class LoopsDemo {
    public static void main(String[] args) {
        LoopsDemo count = new LoopsDemo();
        System.out.println(count.countBlocks(3));

        count.evenNumbers();
    }

    public int keepRolling() {

        Demo yahtzee = new Demo();

        int dice1 = yahtzee.rollDice();
        int dice2 = yahtzee.rollDice();
        int dice3 = yahtzee.rollDice();
        int dice4 = yahtzee.rollDice();
        int dice5 = yahtzee.rollDice();
        int count = 1;

        while (!(dice1 == dice2 && dice2 == dice3 &&
                dice3 == dice4 && dice4 == dice5)) {
            //we need to re-roll
            dice1 = yahtzee.rollDice();
            dice2 = yahtzee.rollDice();
            dice3 = yahtzee.rollDice();
            dice4 = yahtzee.rollDice();
            dice5 = yahtzee.rollDice();
            count = count + 1;
        }
        return count;
    }
    public void raiseAlarm(int numOfWarnings) {
        /*int i = 1;

        while (i <= numOfWarnings) {
            System.out.println("Warning");
            i++;
        } */
        for (int i = 1; i <= numOfWarnings; i++) {
            System.out.println("Warning" + i );
        }
    }

    public int countBlocks(int levels){
        int total= 0;
        for (int i = 1; i <= levels; i++) {
            total = total + (i * i);
        }
        return total;
    }
    public void evenNumbers() {
        for (int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }
    }
    public int martingale() {
        int money = 1000;
        int target = 1200;
        int bet = 10;

        while (money > bet) {
            boolean win = play();
            if (win) {
                money += bet;
                bet = 10;
            }
            else {
                money -= bet;
                bet *= 2;
            }

            if(money >= target) {
                break;
            }
        }
        return money;
    }
    public boolean play() {
        return true;
    }
}
