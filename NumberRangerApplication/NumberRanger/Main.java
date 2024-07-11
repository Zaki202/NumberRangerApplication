package NumberRanger;

import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberRangeSummarizer summarizer = new NumberRangeSummarizerImpl();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a comma-separated list of integers: ");
        String input = scanner.nextLine();

        Collection<Integer> collected = summarizer.collect(input);
        String summary = summarizer.summarizeCollection(collected);

        System.out.println("Input: " + input);
        System.out.println("Summarized: " + summary);
    }
}