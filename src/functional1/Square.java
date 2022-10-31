package functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Square {

    //Given a list of integers, return a list where each integer is multiplied with itself.


    public static List<Integer> square(List<Integer> nums) {
        return nums.stream().map(n -> n * n).collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(square(list));
    }
}
