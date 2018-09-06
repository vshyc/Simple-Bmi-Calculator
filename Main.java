package darek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exit = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        double height =0;
        double weight = 0;
        for(;;){
        while (i < 1) {
            System.out.println("Enter your height in cm :");
            boolean hasNextInt = scanner.hasNextDouble();
            if (hasNextInt) {
                height = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Your height is :" + height);
                i++;
                height/=100;
            } else {
                System.out.println("Invalid value");
                scanner.nextLine();
            }
        }


        while (j < 1) {
            System.out.println("Enter you weight in kg :");
            boolean hasNextInt2 = scanner.hasNextDouble();
            if (hasNextInt2) {
                weight = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Your weight is :" + weight);
                j++;
            } else {
                System.out.println("Invalid value");
                scanner.nextLine();
            }
        }

        double bmiValue = weight / (height*height);
        System.out.println("Your BMI is :" + bmiValue);
        if (bmiValue<16){
            System.out.println("Very severely underweight ");
        }else if (bmiValue<18.50){
            System.out.println("Underweight");
        }else if(bmiValue<25){
            System.out.println("Normal weight");
        }else if(bmiValue<30){
            System.out.println("Overweight");
        }else if(bmiValue<35){
            System.out.println("Obese Class I (Moderately obese) ");
        }else if (bmiValue<40){
            System.out.println("Obese Class II (Severely obese) ");
        }else{
            System.out.println("Obese Class III (Very severely obese)");
        }
            while (k<1) {
                System.out.println("Do you want to exit");
                System.out.println("1: yes");
                System.out.println("2: no");
                boolean hasNextInt = scanner.hasNextInt();

                if (hasNextInt){
                    exit = scanner.nextInt();
                    scanner.nextLine();
                    k++;
                }

                if (k!=1){
                    k=0;
                }

            }
            if (exit==1){
                break;
            }else {
                exit = 0;
                i = 0;
                j = 0;
                k = 0;
                height =0;
                weight = 0;

            }


    }
        scanner.close();
    }
}



