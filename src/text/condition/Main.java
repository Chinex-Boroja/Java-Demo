package text.condition;

public class Main {
    public static void main(String[] args) {

        boolean isLightGreen = false;
        boolean isLightYellow = true;

        if (isLightGreen) {
            //executes ONly if isCold is true
            System.out.println("Drive");
        }else if (isLightYellow) {
            System.out.println("Slow down");
        } else {
            System.out.println("Stop");
        }

        //Library Card program
        boolean passport = false;
        boolean birthCertificate = true;
        boolean driversLicence = true;

        if (passport) {
            System.out.println("A passport is valid ID");
        } else if (birthCertificate) {
            System.out.println("a birth certificate is a valid ID");
        } else if (driversLicence) {
            System.out.println("A driver's license is a valid ID");
        } else {
            System.out.println("Invalid ID. Your application is denied");
        }

        //ticket to museum
        int ticketPrice = 10;
        int age = 25;
        boolean isStudent = true;

        if (age <= 15 || age > 60 || isStudent) {
            ticketPrice = 5;
        }
        System.out.println(ticketPrice);

        //restaurant rating
        int passcode = 555;
        String coffeeType;

        switch (passcode) {
            case 555 : coffeeType =  "Espresso";
            break;
            case 312 : coffeeType = "Vanilla latte";
            break;
            case 629 : coffeeType = "Drip coffee";
            break;
            default : coffeeType = "Unknown";
            break;
        }

        System.out.println(coffeeType);

        //print Month
        int monthNumber = 2;
        String monthName;
        switch (monthNumber) {
            case 1: monthName = "January";
                break;
            case 2: monthName = "February";
                break;
            case 3: monthName = "March";
                break;
            case 4: monthName = "April";
                break;
            case 5: monthName =  "May";
                break;
            case 6: monthName = "June";
                break;
            case 7: monthName = "July";
                break;
            case 8: monthName = "August";
                break;
            case 9: monthName = "September";
                break;
            case 10: monthName = "October";
                break;
            case 11: monthName = "November";
                break;
            case 12: monthName = "December";
                break;
            default: monthName = "Invalid month";
                break;
        }
        System.out.println(monthName);

    }
}
