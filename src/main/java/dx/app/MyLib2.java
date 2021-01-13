package dx.app;

public class MyLib2 {
    /**
     * MAIN ENTRY POINT
     * @param args Command line arguments
     */
    public static void main(String args[])
    {
        MyLib2 obj = new MyLib2();
        int rem = obj.remainder(5,2);
        System.out.println("remainder = " + rem);
    }

    public int remainder(int a, int b)
    {
        return a % b;
    }

    public int subtract(int a, int b)
    {
        return a - b;
    }
}
