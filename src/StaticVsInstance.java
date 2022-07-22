class A {
   static int  a = 10;
   void fun()
   {
       int b=11;
       System.out.println(a+" "+b);
       ++a;
       ++b;
   }
 public static void main(System []args){
       A ref= new A();
       ref.fun();
       ref.fun();
 }

}