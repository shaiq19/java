 class Calculation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers:"+z);
    }

    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers:"+z);
    }
}

 class My_Calculation extends Calculation {
     public void multiplication(int x, int y) {
         z = x * y;
         System.out.println("The product of the given numbers:" + z);
     }
     static class My_Division extends My_Calculation {
         public void division(int x, int y) {
             z = x / y;
             System.out.println("The division of the given numbers:" + z);
         }

     }

     public static void main(String args[]) {
         int a = 20, b = 10;
         My_Division demo = new My_Division();
         demo.addition(a, b);
         demo.Subtraction(a, b);
         demo.multiplication(a, b);
         demo.division(a, b);
     }
 }