import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FinalAnswer {

    private int[] numbers;
    private int finalAnswer;

    public FinalAnswer(int finalAnswer, int[] numbers) {
        this.finalAnswer = finalAnswer;
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getFinalAnswer() {
        return finalAnswer;
    }

    public void setFinalAnswer(int finalAnswer) {
        this.finalAnswer = finalAnswer;
    }

    public int[] BruteForce(int[] numbers, char[] operators, int finalAnswer) {
        ArrayList<Integer> answers;
        ArrayList<Integer> finalAnswers;
        for (int i = 0; i < numbers.length; i++) {

        }
    }

    public static void main(String[] args) {

        while (true) {

            // Scan the number to find and the numbers used to find it from CLI
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to Summle Solver!");
            System.out.println("Input the number to find:");
            int finalAnswer = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Input the 6 numbers needed to solve the number with commas in between them");
            String numbersString = scanner.nextLine();
            numbersString = numbersString.replaceAll("\\s", "");
            String[] numbersStringArray = numbersString.split(",");
            int[] numbers = new int[6];
            for (int i = 0; i < 6; i++) {
                numbers[i] = Integer.parseInt(numbersStringArray[i]);
            }
            FinalAnswer answer = new FinalAnswer(finalAnswer, numbers);

            // Implement SummleSolver Algorithm:
            // Start with the final answer and then add and subtract the numbers going from smallest to largest
            // For each sum and difference, see if the numbers are divisible by the rest of the numbers
            // if there is a number that is divisible, divide it and get the quotient and repeat the process.
            // if the process cannot go on anymore, use brute force



        }
    }
}
