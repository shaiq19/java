 class OuterClass{
int number =6;

public void hellothere(){
    System.out.println("hello from outer class");
}

    public static class InnerClass{

    int innernumber = 10;
    public void innerhellothere(){
        System.out.println("hello from inner class");
    }

}

public static void main(String[] args){
    OuterClass o= new OuterClass();
    o.hellothere();
    OuterClass.InnerClass i = new  OuterClass.InnerClass();
    i.innerhellothere();

}


}