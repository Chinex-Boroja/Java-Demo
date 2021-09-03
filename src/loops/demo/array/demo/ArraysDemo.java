package loops.demo.array.demo;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        String [] newsOutlet = {"abc", "bbc", "CNN", "CBS", "AP", "NBC", "FOX","npr", "sky", "Aljazeera"};
        double lucky = Math.random() * 10;
        int luckyIndex = (int) lucky;
        System.out.println(newsOutlet[luckyIndex]);

        ArraysDemo test = new ArraysDemo();
        System.out.println(test.calculateAverage(new double[]{10, 20, 90, 70,100}));
        System.out.println(test.search(new double[]{8, 9, 6, 4, 0.1}));

        System.out.println(test.findLongestName(
                new String[]{"Chinedu", "Manuel", "Micheal", "Emmanuel", "Halima Abubakar"}));
    }

    public double calculateAverage(double[] temperatures) {
        int size = temperatures.length;
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += temperatures[i];
        }

        System.out.println("total is :: " + total +
                "\nand the elements of the array are:: " + Arrays.toString(temperatures));
        double average = total / size;
        return average;
    }

    public double search(double[] speed) {
        int size = speed.length;
        double min = speed[0];

        for (int i = 1; i < size; i++) {
            if (speed[i] < min) {
                min = speed[i];
            }
        }
        System.out.println("The size of the array is:: " + size);
        return min;
    }

    String findLongestName(String[] name) {
        int length = name.length;
        String longestName = name[0];
        for (int i = 1; i < length; i++) {
            if (name[i].length() > longestName.length()) {
                longestName = name[i];
            }
        }
        return longestName;
    }

    public static double englishAverage(int[][] grades) {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += grades [1][i];
        }
        double average = total / 5.0;
        return average;
    }


    public static double sandraAverage(int[][] grades) {
        int subjects = grades.length;
        int total = 0;
        for (int i = 0; i < subjects; i++) {
            total += grades [i][2];
        }
        double average = total / (double)subjects;
        return average;
    }

    public static double studentAverage(int[][] grades, int student) {
        int subjects = grades.length;
        int total = 0;
        for (int i = 0; i < subjects; i++) {
            total += grades [i][student];
        }
        double average = total / (double)subjects;
        return average;
    }
}
