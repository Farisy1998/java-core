public class StaticMethods {
    public static void method1() {
        System.out.println("Inside method1()");
    }

    static {
        System.out.println("Inside static block");
        StaticMethods.method1();
    }
    public static void main(String[] args) {
        System.out.println("Inside main()");
        StaticMethods.method1();
    }

}
