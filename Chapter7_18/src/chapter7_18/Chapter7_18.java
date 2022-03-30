/*
Chapter 7 Programming excercise 18
Riky Hernandez
9/15/21
Description: A program that reads in 10 double numbers, inokes the bubble-sort algorithm, and displays the sorted numbers
`;-.          ___,
  `.`\_...._/`.-"`
    \        /      ,
    /()   () \    .' `-._
   |)  .    ()\  /   _.'
   \  -'-     ,; '. <
    ;.__     ,;|   > \
   / ,    / ,  |.-'.-'
  (_/    (_/ ,;|.<`
    \    ,     ;-`
     >   \    /
    (_,-'`> .'
          (_,'
 */
package chapter7_18;


public class Chapter7_18 {

  public static void bubbleSort(double[] list){
      for(int i = 0; i<list.length; i++){
      double currentMin = list[i];                      //method: will sort the numbers from smallest to bigest
      int currentMinIndex = i;
      
      for (int j = i + 1; j <list.length;j++){
          if (currentMin > list[j]){
              currentMin = list[j];
              currentMinIndex = j;
          }
      }
      if(currentMinIndex !=i) {
          list[currentMinIndex] = list[i];
          list[i] = currentMin;
      }
  }
  }
    
    public static void main(String[] args) {
        
        double[] numbers = new double[10];
        for (int i=0; i < numbers.length; i++){             //the program wll only choose 10 random numbers
            numbers[i] = Math.random() * 100;
        
        System.out.print(numbers[i] + " ");             //the numbers are displayed
        }
        System.out.println();
        
        bubbleSort(numbers);
       for (int i=0; i < numbers.length; i++){
                
        
        System.out.print(numbers[i] + " ");             //the numbers are displayed in order using the method from above
        }
    }
    
}
