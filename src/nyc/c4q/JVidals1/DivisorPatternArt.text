package nyc.c4q.JVidals1;

/**
 * Created by s3a on 3/20/15.
 * Janneisy Vidals
 * 2.1 Accesscode
 */
public class DivisorPatternArt {


    public static void main(String[] args) {
        addSymbol(6);

    }

    public static void addSymbol(int num) {
        int rows;
        int columns;

        for (rows = 1; rows <= num; rows++) {

            for (columns = 1; columns < num; columns++) {
                System.out.print(charSymbol(rows, columns));
            }
            Sytem.out.print(charSymbol(rows,columns));
        }
    }

    //Created a  return type of String with a mehod called charSymbol which contains two parameters int i and int j.
    public static String charSymbol(int i, int j) {
        //Added an if-statement to emphasize to compare two conditions
        if (i % j == 0 || j % i == 0) {
            //Here we want the method to return a string "#", I wanted to change it instead of using the @ symbols.
            return "@ ";
        } else
            return " ";
    }
}






