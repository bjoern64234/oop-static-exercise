public class Main {

    static void main() {

        System.out.println("oop-static-exercise");
        System.out.println();

        Count c1 = new Count();
        c1.incrementInstanceCount();
        c1.incrementTotalCount();
        System.out.println(c1);
        System.out.println();

        Count c2 = new Count();
        c2.incrementInstanceCount();
        c2.incrementTotalCount();
        System.out.println(c2);
        System.out.println();

        Count c3 = new Count();
        c3.incrementInstanceCount();
        c3.incrementTotalCount();
        System.out.println(c3);
        System.out.println();

        System.out.println("Run calculator");
        System.out.println(Calculator.addition(3,7));
        System.out.println(Calculator.subtraction(10,7));
        System.out.println(Calculator.multiplication(3,2));
        System.out.println(Calculator.division(20,6));
        System.out.println(Calculator.division(0,6));
        System.out.println(Calculator.division(2,0));
    }
}
