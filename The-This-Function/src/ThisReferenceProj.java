//Working of the reference
class Example
{
    private int i;

    public void seData(int ii)
    {
        i = ii; //One way to set data
        this.i = ii; // another way to set data
    }

    public void showData()
    {
        System.out.println(i); //one way to display data
        System.out.println(this.i); //another way to display data
    }
}

public class ThisReferenceProj{
    public static void main(String[] args) {
        Example e1;
        e1 = new Example();
        e1.seData(10);
        e1.showData();
    }
}