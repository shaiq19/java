 class NewClass{

     public static class superclass{

          void print(){
             System.out.println("Super class is called");
         }

     }

     public static class subclass extends superclass{
         @Override void print(){
             System.out.println("sub class is called");
         }
     }

     public static void main(String [] args){

         superclass a= new superclass();
         superclass b= new subclass();

         a.print();
         b.print();

     }

 }