package NumberRanger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumberRangeSummarizerImpl implements NumberRangeSummarizer {

    @Override
    public Collection<Integer> collect(String input) {
        if (input == null) {
            return null;
        }

        if (input.isEmpty()) {
            return null;
        }

        String[] numArray = input.split(",");
        List<Integer> numbers = new ArrayList<>();

        for (String number : numArray) {
            numbers.add((Integer.parseInt(number.trim())));
        }

        return numbers;
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        if (input == null) {
            return "";
        }
        
        List<Integer> numberList = (List<Integer>) input;

        StringBuilder result = new StringBuilder();

        int startRange = numberList.get(0);
        int endRange = startRange;

        for (int i = 1; i < numberList.size(); i++) {
            int current = numberList.get(i);
            if (current != endRange + 1) {
                appendRangeOutput(result, startRange, endRange);
                startRange = current;
            }
            endRange = current;
        }

        appendRangeOutput(result, startRange, endRange);

        return result.toString();
    }

    private void appendRangeOutput(StringBuilder result, int startRange, int endRange) {
        if (result.length() > 0) {
            result.append(", ");
        }

        if (startRange == endRange) {
            result.append(startRange);
        } else {
            result.append(startRange).append("-").append(endRange);
        }
    }
}
