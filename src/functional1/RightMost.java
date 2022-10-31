package functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RightMost {

    //Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

    public static List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(n -> n = n % 10).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(93);
        System.out.println(rightDigit(list));
    }

}
