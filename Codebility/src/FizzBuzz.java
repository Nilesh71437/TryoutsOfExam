import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String result = Output.getFizzBuzz(num);
        System.out.println(result);
    }

    static class Output{

        public static String getFizzBuzz(int num) {
            String result ="";
            for(int i =1;i<=num;i++){
                result += (i%15==0)? "FizzBuzz" :(i%3==0)?"Fizz " :(i%5==0)?"Buzz " : i +" ";


            }
            return  result;
        }
    }
}
