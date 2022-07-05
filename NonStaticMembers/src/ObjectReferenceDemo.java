public class ObjectReferenceDemo {
    int x;

    ObjectReferenceDemo() {
        System.out.println("Inside constructor");
    }

    public static void main(String[] args) {
        ObjectReferenceDemo obj = new ObjectReferenceDemo();
        System.out.println(obj.x);
    }
}
