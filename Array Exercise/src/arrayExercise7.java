/********************************************************************
 * Programmer:	C. Seeley
 * Class:  CS30S
 *
 * Assignment: Array Exercise Question 7
 * Program Name:  arrayExercise7
 *
 * Description: 
 *
 * Input: 
 *
 * Output: 
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries



public class arrayExercise7 {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
        
        final int MAX = 100;
        
        
        
    // ********** declaration of variables **********
    
        int list[]= new int[MAX]; //create new array of 100 variables	
        int n = 0;
        double sum = 0;
        double avg = 0;
        int count = 0;
        int Sentinel = 0;
        
    // create instances of objects for i/o and formatting
        
        ProgramInfo programInfo = new ProgramInfo(
                "Array Exercise", "Question 7");
        
        
    	
    // ********** Print output Banner **********
 	
        System.out.println(programInfo.toString());
        
    // ************************ get input **********************
        
        Sentinel = Integer.parseInt(JOptionPane.showInputDialog(
                "Enter the sentinel value between 0-100"));
    
    // ************************ processing ***************************
        
        for (n = 0; n < 100; n++) {
            
            list[n] = (int) (Math.random() * 100);
            
            if (list[n] != Sentinel) {
                System.out.println(list[n]);
                count = n;
            }
            else {
                System.out.println(n);
                count = n;
                break;
            }
        }
        
        
        for (n = 0; n<MAX; n++) {
            sum += list[n];
        }
        
        System.out.println("Count= " + count);
        avg = sum / count;
        
        
        int maxValue = list[0]; 
        for(n = 1; n < count; n++){ 
            if(list[n] > maxValue){ 
            maxValue = list[n]; 
        }
        }
        int minValue = list[0]; 
        for(n = 1; n < count; n++){ 
            if(list[n] < minValue){ 
            minValue = list[n]; 
        } 
        }
      
        
        
        
    // ************************ print output ****************************
            
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Minimum Value = " + minValue);
        System.out.println("Maximum Value = " + maxValue);
        
        // ******** closing message *********
        
        System.out.println("\n\n" + programInfo.eoFile());
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        //fout.close();			// close output buffer
    }  // end main
}  // end class
