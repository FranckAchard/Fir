import java.util.Scanner;

public class Fir2 {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int height;
        String[] fir;
        
        System.out.println("Input height :");
        height= input.nextInt();
        if (height < 5 || height > 25) {
            System.out.println("Height must be between 5 and 25, try again!");
        } else {
        	fir= new String[height+height/2];
            fir= makeFir2(height);
            // display fir
            for (int i=0; i<height+height/2; i++) {
            	System.out.println(fir[i]);
            }
        }
             
    }
    
    private static int length(int pNum) {
    	// length of fir lines
    	return (2 * pNum - 1);
    }
    
    private static String[] makeFir2(int pHeight) {
        int ct;
        String[] rFir= new String[pHeight+pHeight/2];
        
        
        for (ct = 0 ; ct < pHeight ; ct++) {
            rFir[ct]= makeLine2(length(pHeight), ct+1);
        }
        
        for (ct = pHeight ; ct < pHeight+pHeight/2 ; ct++) {
        	rFir[ct]= makeLine2(length(pHeight), 2);
        }
        
        return rFir;
    }
    
    private static String makeLine2(int pLength, int pNumLine) {
        // pLength = 
    	// pNumLine = 
    	
    	int ct, nbSpace, nbStar;
        String outputString, stringSpace, stringStar;
        
        nbStar= length(pNumLine);
        nbSpace= (pLength - nbStar) / 2;
        stringStar= "";
        stringSpace= "";
        for (ct= 1 ; ct <= nbSpace ; ct++) {
            stringSpace= stringSpace + " ";
        }
        for (ct= 1 ; ct <= nbStar ; ct++) {
            stringStar = stringStar + "*";
        }
        outputString = stringSpace + stringStar;
        return outputString;
    }
}
