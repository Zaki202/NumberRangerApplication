package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import NumberRanger.NumberRangeSummarizer;
import NumberRanger.NumberRangeSummarizerImpl;

public class NumberRangeSummarizerImplTest {
    @Test
    public void testCollect() {
        NumberRangeSummarizer summarizer = new NumberRangeSummarizerImpl();
        Collection<Integer> result = summarizer.collect("1,2,3,4,5");
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), result);
    }

    @Test
    public void testSummarizeCollection() {
        NumberRangeSummarizer summarizer = new NumberRangeSummarizerImpl();
        Collection<Integer> input = Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31);
        String result = summarizer.summarizeCollection(input);
        assertEquals("1, 3, 6-8, 12-15, 21-24, 31", result);
    }
}
