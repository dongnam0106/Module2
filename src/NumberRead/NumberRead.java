package NumberRead;

import java.util.Scanner;

public class NumberRead {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number you want to read: ");
        int num = scanner.nextInt();

        String don_vi= "";
        String chuc = "";
        String tram = "";

            switch (num%10){
                case 0:
                    don_vi = "zero";
                    break;
                case 1:
                    don_vi = "One";
                    break;
                case 2:
                    don_vi = "two";
                    break;
                case 3:
                    don_vi = "three";
                    break;
                case 4:
                    don_vi = "four";
                    break;
                case 5:
                    don_vi = "five";
                    break;
                case 6:
                    don_vi = "six";
                    break;
                case 7:
                    don_vi = "seven";
                    break;
                case 8:
                    don_vi = "eight";
                    break;
                case 9:
                    don_vi = "nine";
                    break;
            }

            switch ((num%100)/10){
                case 1:
                    chuc = "teen";
                    break;
                case 2:
                    chuc = "twenty";
                    break;
                case 3:
                    chuc = "thirty";
                    break;
                case 4:
                    chuc = "forty";
                    break;
                case 5:
                    chuc = "fifty";
                    break;
                case 6:
                    chuc = "sixty";
                    break;
                case 7:
                    chuc = "seventy";
                    break;
                case 8:
                    chuc = "eighty";
                    break;
                case 9:
                    chuc = "ninety";
                    break;
            }
        switch (num/100){
            case 1:
                tram = "one hundred";
                break;
            case 2:
                tram = "two hundred";
                break;
            case 3:
                tram = "three hundred";
                break;
            case 4:
                tram = "for hundred";
                break;
            case 5:
                tram = "five hundred";
                break;
            case 6:
                tram = "six hundred";
                break;
            case 7:
                tram = "seven hundred";
                break;
            case 8:
                tram = "eight hundred";
                break;
            case 9:
                tram = "nine hundred";
                break;
        }
        System.out.println(tram + " " + chuc + "-" + don_vi);
    }
}
