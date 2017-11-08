/********************************************************************
 * Programmer:	C. Seeley
 * Class:  CS30S
 *
 * Assignment: Array Exercise Question 1-5
 * Program Name:  arrayExercise1
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


public class arrayExercise1 {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
        
        final int MAXLIST = 20;
        
        final int stopValue = -1;
        final int offset = 1;
        
    // ********** declaration of variables **********
        int LIST = 0;
        int list[]= new int[MAXLIST]; //create new array of maximum 20 variables
        int n = 0;
        int count = 0;
        int number = 0;
        int seeNum = 0;
        
        boolean change = false;
        String chanString = "";
    	
    // create instances of objects for i/o and formatting
        
        ProgramInfo programInfo = new ProgramInfo("Array Exercise", "Questions 1-5");
    	//ConsoleReader console = new ConsoleReader(System.in);
    	//DecimalFormat df1 = new DecimalFormat("$##.00");
    	
    	//BufferedReader fin = new BufferedReader(new FileReader("name of file"));
    	//PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
    	
    // ********** Print output Banner **********
 	
        System.out.println(programInfo.toString());
        
    // ************************ get input **********************
        
        count = Integer.parseInt(JOptionPane.showInputDialog(
                "Enter the number of integers you will enter (Maximum 20)"));
        
        for(n = 0; n < count; n++) {
            //System.out.println(list[n]);
            list[n] = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));
        }//end for loop
    
    // ************************ processing ***************************
        
        System.out.println("\nNumbers in original order: ");
        
        for(n = 0; n < count; n++){
            System.out.print(list[n] + ", ");
        }        
        
        System.out.println("\nNumbers in reverse order: ");
        
        for(n = count - 1; n>=0; n--){
            System.out.print(list[n] + ", ");
        }       
        
        number = Integer.parseInt(JOptionPane.showInputDialog(
                "Which number would you like to see \nType -1 to stop"));
        
        
        while(number != stopValue) {
            seeNum = number - offset;
            System.out.println("\nNumber: " + number);
            System.out.println("Value: " + list[seeNum]);
            
            chanString = JOptionPane.showInputDialog(
                "Do you want to change the number? \nEnter: 'true' or 'false'");
            
            if (chanString.equals("true")) {
                
                list[seeNum] = Integer.parseInt(JOptionPane.showInputDialog(
                            "Enter the number you want to change to"));
                
                System.out.println("\nThe number you changed is: " + number);
                System.out.println("You changed it to: " + list[seeNum]);
            }
                
            number = Integer.parseInt(JOptionPane.showInputDialog(
                "Which Number would you like to see? \nType -1 to stop"));
        }
        
        int minValue = list[0]; 
        for(n = 1; n < count; n++){ 
            if(list[n] < minValue){ 
            minValue = list[n]; 
        } 
        }
        
        int maxValue = list[0]; 
        for(n =1; n < count; n++){ 
            if(list[n] > maxValue){ 
            maxValue = list[n]; 
        } 
        }
        
        
        
    // ************************ print output ****************************
        
        System.out.println("\n\nMinimum Value = " + minValue);
        System.out.println("Maximum Value = " + maxValue);
    
        // ******** closing message *********
        
        System.out.println("\n\n" + programInfo.eoFile());
        //fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        //fout.close();			// close output buffer
    }  // end main
}  // end class
