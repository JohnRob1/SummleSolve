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

    public ArrayList<Integer> FindFactors(int number){

        ArrayList<int[]> factors = new ArrayList<>();
        Queue<Integer> Q = new LinkedList<>();

        for (int i = 1; i <= number; i++) {
            if (i == Q.peek())
            if (number % i == 0) {
                int factor = number / i;
                int[] factorPair = {factor, i};

            }
        }

        return factors;
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
            // Start with the final answer and add the numbers starting from smallest to largest
            // For each sum (including the answer itself), find the pairs of factors
            // see if one of the pairs matches a number in the numbers list
            // repeat this until there is not a factor that is a number from the numbers list
            // brute force solve the other factor
            // make sure to save the processes and numbers used through, then show answer



        }
    }
}
