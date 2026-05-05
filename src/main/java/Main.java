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
    }
}
