/***************************************************************
 * A simple Java application to calculate User's Credits.*
 ***************************************************************/
package BookStoreCredit;
import java.util.Scanner;
/**
 *
 * @author skubjana
 */
public class BookStoreCredit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner gr = new Scanner(System.in);
        
        System.out.print("Enter your name > ");
        String name = gr.next();
        
        System.out.print("Enter Grade Point Average (GPA) > ");
        double gradep = gr.nextDouble();
        
        //Invoke the method "gradePoint"
        gradePoint(name, gradep);
    }
    
    //Method Definition, gradePoint
    public static void gradePoint(String fname, double grade){
        
        double CreditDiscount = grade * 10;
        
        System.out.println("Congratulations " + fname + " , you have earned $" 
                + Math.round(CreditDiscount*100.0)/100.0 + " Credits to your account.");
        
    }
    
 /**************************************************************************
  * Please note that this is not the only approach to the problem.         *
  * Author: Sam                                                            *
  **************************************************************************/
    
}
