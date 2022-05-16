public class SampleRecursiveMethod {

    public static void main(String[] args) {

        System.out.println(factorialFunc(5));

    }

    static int factorialFunc(int value){

        if(value == 1) {
            System.out.println("Check" + value);
            return 1;
        } else {
            System.out.println("Check" + value);
            return value * factorialFunc(value - 1);
        }

    }

}
