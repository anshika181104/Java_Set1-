/* Given a number N, print sum of all
     even numbers from 1 to N. */
     
      public class Ques1{
public static void main(String[] args) {
    int N = 20;
    int sum = 0;
    int i;
    for(i = 1; i <= N; i++){
        if( i % 2 == 0){
            sum = sum + i;
        }
    }
    System.out.println("sum of even numbers are " + sum);
}
     }
    
