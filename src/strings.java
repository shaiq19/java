class Str{

    public static void main(String args[]){
        byte ascii[]={71,56,71};

        String s1= new String(ascii);
        System.out.println(s1);

        String s2= new String(ascii,0,2);
        System.out.println(s2);
    }
}
