/********************************************************************
 * Programmer:	C. Seeley
 * Class:  CS30S
 *
 * Assignment: Array Exercise Question 6
 * Program Name:  arrayExercise6
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


public class arrayExercise6 {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
        
        final int MAX = 20;
        
    // ********** declaration of variables **********
    
        int list[]= new int[MAX]; //create new array of 20 variables	
        
    // create instances of objects for i/o and formatting
        
        ProgramInfo programInfo = new ProgramInfo(
                "Array Exercise", "Question 6");
    	//ConsoleReader console = new ConsoleReader(System.in);
    	//DecimalFormat df1 = new DecimalFormat("$##.00");
    	
    	//BufferedReader fin = new BufferedReader(new FileReader("name of file"));
    	//PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
    	
    // ********** Print output Banner **********
 	
        System.out.println(programInfo.toString());
        
    // ************************ get input **********************
        
    
    // ************************ processing ***************************
        
        list[0] = 0;
        list[1] = 1;
        
        for(int n = 2; n<MAX; n++) {
            list[n] = list[n-1] + list[n-2];
        }
        
        for(int n = 0; n<5; n++) {
            System.out.println(list[n]);
        }
        for(int n = 15; n<20; n++) {
            System.out.println(list[n]);
        }
    
    // ************************ print output ****************************
            
        
        
    
        // ******** closing message *********
        
        System.out.println("\n\n" + programInfo.eoFile());
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        //fout.close();			// close output buffer
    }  // end main
}  // end class

