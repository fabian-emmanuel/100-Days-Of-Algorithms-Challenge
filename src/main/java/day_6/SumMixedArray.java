package day_6;

import java.util.List;

/*
Given an array of integers as strings and numbers,
return the sum of the array values as if all were numbers.
Return your answer as a number.
 */
public class SumMixedArray {
    public int sum(List<?> mixed) {
        return mixed.stream()
                .mapToInt(x -> Integer.parseInt("" + x))
                .sum();
    }
}
