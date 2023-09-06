//Working of this reference
public class Sample {
    public static void main(String[] args) {
        Ex e1 = new Ex(10);
        Ex.showCount();
        Ex e2 = new Ex(20);
        Ex.showCount();
        Ex e3 = new Ex(30);
        Ex.showCount();
    }
}

class Ex{
    private int i;
    private static int count = 0;

    public Ex(int val){
        i = val;
        count += 1;
    }
    public static void showCount(){
        System.out.println(count);
    }
}