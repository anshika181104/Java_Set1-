/* Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E)
 and Step Size (W), you need to convert all Fahrenheit values
  from Start to End at the gap of W, into their corresponding Celsius
   values and print the table.  (c=(5*(S-32))/9;)  */

   public class Ques2{
    public static void main(String[] args) {
        double E = 85.5;
        double W = 2.0;
        for (double S = 78.8; S <= E; S = S+W){
            System.out.println(S);
            double celsiusvalue = ((5*(S-32)/9));
            System.out.println("celsius value: " + celsiusvalue);
        }
    }
   }