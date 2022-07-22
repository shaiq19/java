public class ForEach {

    public static int mano(int[] numbers){
       int maxno = numbers[0];

       for(int num : numbers)
       {
           if (num > maxno)
           {
               maxno=num;
           }
       }
       return maxno;
    }


    public static void main(String[] args) {

        {

            int[] marks = {123, 3323, 4343, 34324, 34343, 223232};
            int highetmarks = mano(marks);
            System.out.println("the highest score is  " + highetmarks);
        }

    }

}


