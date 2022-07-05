public class ThisKeywordDemo {
    int x;

    ThisKeywordDemo() {
        System.out.println(this); // this keyword will points to it's 
                                  // currently executing class object in memory
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        ThisKeywordDemo thisKeywordDemo = new ThisKeywordDemo();
        ThisKeywordDemo thisKeywordDemo2 = new ThisKeywordDemo();
    }
}
