import java.time.Duration;
import java.time.Instant;

//Find the sum of all the multiples of 3 or 5 below 1000.
//in this case streams are slower than for loop.
public class Problem1 {

    public static void main(String []arg){
        Instant start = Instant.now();

        Integer sum = 0;
        for(int i=0;i<1000000;i++){
            if (isDivisibleBy3(i) || isDivisibleBy5(i)) {
                sum = addition(i,sum);
            }
        }


//        sum = IntStream.range(1,1000000)
//                .filter(num -> num % 3 ==0 || num % 5 ==0)
//                .sum();

        System.out.println(sum);
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis());


    }

    private static Boolean isDivisibleBy3(Integer num){
        return num % 3 == 0;
    }

    private static Boolean isDivisibleBy5(Integer num){
        return num % 5 == 0;
    }

    private static Integer addition(Integer num1,Integer num2){
        return num1 + num2;
    }


}
