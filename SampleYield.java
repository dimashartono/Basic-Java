public class SampleYield {

    public static void main(String[] args) {

        var grade = "A";
        String say;

        say = switch (grade) {
            case "A": yield "Wow Great";
            case "B","C": yield "Good";
            default: yield "Bad";
        };

        System.out.println(say);

    }

}
