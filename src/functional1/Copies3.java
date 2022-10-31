package functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {

    //Given a list of strings,
    // return a list where each string is replaced by 3 copies of the string concatenated together.

    public static List<String> copies3(List<String> strings) {
        return strings.stream().map(s -> s += s+s).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("ccc");
        System.out.println(copies3(list));
    }
}
