package lesson10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int input() throws AgeInputException {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age <= 0) {
                throw new AgeInputException("Tuoi k the la so am");
            }
        } catch (InputMismatchException x) {
            throw new AgeInputException("Tuoi phai la so nguyen duong");
        }
        return age;
    }

    public static void main(String[] args) throws AgeInputException {

        int age = input();

        try {
            age = input();
        } catch (AgeInputException y) {
            System.out.println("" + y.getMessage());
        }
        System.out.println("" + age);
    }
}
