import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    
    public static void main(String[] arge){

        //1. create object using empty stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e->{
            System.out.println(e);
        });

        //2. using array
        String names[] = {"ak","bk","dd"};
        Stream<Object> namesStream = Stream.of(names);
         namesStream.forEach(e->{
            System.out.println(e);
        });

        //3. using builder
        Stream<Object> usingBuilder = Stream.builder().build();

        //4. using Arrays
        IntStream intStr =  Arrays.stream(new int[]{2,6,5,9,7});
        intStr.forEach(e->{
            System.out.println(e);
        });


        //5. directly on list, set
        


    }
}
