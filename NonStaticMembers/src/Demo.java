public class Demo {
    static Demo obj = new Demo();
    static {
        System.out.println(Demo.obj); // memory for obj object is not created
        // Demo.obj = new Demo(); // memory for obj object is created
        Demo.obj = Demo.init();
    }

    static Demo init() {
        return new Demo();
    }
    public static void main(String[] args) {
        System.out.println(Demo.obj);
    }
}
