import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class ExampleCode {

   //  Reverse this list of Integer using Stream Api
   // input =(1,2,3,2,4,5,1,9,6,7,8,5)
  //  output should be = (5,8,7,6,9,1,5,4,2,3,2,1)
    public static void main (String [] args){
        List<Integer> list = Arrays.asList(1,2,3,2,4,5,1,9,6,7,8,5);

        List<Integer> reversed = list.stream()
                .collect(Collectors.toList());

        Collections.reverse(reversed);

        System.out.println(reversed);
    }

}
