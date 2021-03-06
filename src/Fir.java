import java.util.Scanner;

public class Fir {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int height;
        String fir= "";
        
        System.out.println("Input height :");
        height= input.nextInt();
        if (height < 5 || height > 25) {
            System.out.println("Height must be between 5 and 25, try again!");
        } else {
            fir= makeFir(height);
        }
             
    }
    
    private static int length(int pNb) {
        int rLength;
        
        rLength= 2 * pNb - 1;
        
        return rLength;
    }
    
    private static String makeFir(int pHeight) {
        int ct;
        String rFir= null;
        
        
        for (ct = 1 ; ct <= pHeight ; ct += 1) {
            makeLine(length(pHeight), ct);
        }
        
        for (ct = 1 ; ct <= pHeight/2 ; ct += 1) {
            makeLine(length(pHeight), 2);
        }
        
        return rFir;
    }
    
    private static void makeLine(int pLength, int pNbLine) {
        int ct, nbSpace, nbStar;
        String outputString, stringSpace, stringStar;
        
        nbStar= length(pNbLine);
        nbSpace= pLength - nbStar;
        stringStar= "";
        stringSpace= "";
        for (ct= 1 ; ct <= nbSpace / 2 ; ct+= 1) {
            stringSpace= stringSpace + " ";
        }
        for (ct= 1 ; ct <= nbStar ; ct+= 1) {
            stringStar = stringStar + "*";
        }
        outputString = stringSpace + stringStar;
        System.out.println(outputString);
    }
}
