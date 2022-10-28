package functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, return a list where each integer is multiplied by 2.
public class Doubling {

    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(n -> n * 2).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(doubling(nums));
    }
}
