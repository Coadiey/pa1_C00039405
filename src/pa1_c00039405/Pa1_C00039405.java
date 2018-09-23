// Your Name: Coadiey Bryan
// Your ID: C00039405
// CMPS 260
// Programming Assignment : #1
// Due Date : 2/6/18 
// Program Description: Tells you if a number is positive or negative, gives the total amount of numbers, and the average of all the numbers.
// Certificate of Authenticity:
// I certify that the code in the method function main of this project is entirely my own
// work.
package pa1_c00039405;

/**
 *
 * @author Coadiey Bryan
 */
public class Pa1_C00039405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int total = 0;
        int avg;
        int avgHolder = 0;
        int numb;
        System.out.println("Enter a integer and enter 0 to stop: ");
        numb = keyboard.nextInt();
        if (numb != 0) {
            do {
                total++;
                if (numb > 0) {
                    positive++;
                } else {
                    negative++;
                }
                avgHolder += numb;
                numb = keyboard.nextInt();
            } while (numb != 0);
            avg = avgHolder / total;
            System.out.println("Positives: " + positive);
            System.out.println("Negatives: " + negative);
            System.out.println("Total: " + total);
            System.out.println("Average: " + avg);

        } else {
            System.out.println("No numbers other then 0 entered");

        }

    }

}
