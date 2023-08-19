import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain{

    public static void main(String[] arge){

        List<Integer> numbersList = Arrays.asList(12,35,14,8,7,36,25,87,92,53,4);

        System.out.println(numbersList);

        //stream api
        List<Integer> newList = numbersList.stream().filter(number -> number%2 ==0).collect(Collectors.toList());
        System.out.println(newList);  
        


    }
}