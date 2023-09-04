//Object destruction using finalize()
package obj_dest;

@SuppressWarnings("ALL")
class Example{
    private int data;

    public Example() // Constructor (Same name as class)
    {
        System.out.println("Inside the constructor");
    }
    protected void finalize() throws Throwable
    {
        super.finalize();
    }

}

public class Obj_dest {
    public static void main(String[] args) {
        Example e = new Example();
    }
}