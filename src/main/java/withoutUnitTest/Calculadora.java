package withoutUnitTest;

public class Calculadora {
    public static int suma(int a, int b){
        return  a+b;
    }

    public static void main(String []args){
        int expectedResult=13;
        int actualResult=suma(5,6);

        if (actualResult == expectedResult){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
    }
}
