import java.util.ArrayList;
import java.util.List;

public class JoinList {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        
        List<String> list2 = new ArrayList<String>();
        list2.add("1");
        list2.add("2");
        list2.add("3");

        List<String> joined = new ArrayList<String>();

        joined.addAll(list1);
        joined.addAll(list2);
        

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("joined: " + joined);

    }
}


*************************************************************************************

list1: [a, b, c]
list2: [1, 2, 3]
joined: [a, b, c, 1, 2, 3]
