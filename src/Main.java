public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int AplusB = a + b;
        int CplusD = c + d;

        System.out.println (AplusB);
        System.out.println(CplusD);

        String isAplusBbiggerThanCplusD = AplusB >= CplusD ? "true" : "false";
        System.out.println(isAplusBbiggerThanCplusD);


        System.out.println (++AplusB);

        System.out.println(--CplusD);
        System.out.println(--CplusD);


        String isAplusBbiggerThanCplusDx2 = AplusB >= CplusD ? "true" : "false";
        System.out.println(isAplusBbiggerThanCplusDx2);



        int AplusBostatok = AplusB % 2;
        System.out.println(AplusBostatok);

        int CplusDostatok = CplusD % 2;
        System.out.println(CplusDostatok);


        String result = AplusBostatok == CplusDostatok ? "true" : "false";
        System.out.printf(result);








    }
}