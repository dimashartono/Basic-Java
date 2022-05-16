public class SampleMethodVarArgument {

    public static void main(String[] args) {

        yourResult("Dimas", 90,90,80,80,90);
        yourResult("Sapari", 90,90,80,80,90);

    }

    static void yourResult(String name, int... results){

        System.out.print("Congratulations "+ name + " your results : ");

        for (var res : results){

            System.out.printf("%d ", res);

        }

        System.out.println("Completed");

    }

}
