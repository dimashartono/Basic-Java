public class SampleLambda {

    public static void main(String[] args) {

        var grade = "A";

        switch (grade){

            case "A" -> System.out.println("Great");
            case "B", "C" -> System.out.println("Good");
            default -> {
                System.out.println("Bad");
            }

        }


    }

}
