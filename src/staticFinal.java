
class Test {

    static final int i;
    int w;
    static
    {
        i = 10;
    }

    {
        System.out.println( w=1010);
    }


    public static void main(String[] args) {
        System.out.println(i);
        Test t = new Test();

    }
}




