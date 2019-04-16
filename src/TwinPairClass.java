import java.util.ArrayList;

public class TwinPairClass {

    private static ArrayList<Integer> returnOddPairs(int[] a) {

        ArrayList<Integer> oddPairs = new ArrayList<>();

        for (int x : a) {
            if(x % 2 == 1) {
                oddPairs.add(x);
            }
        }

        return oddPairs;
    }

    private static ArrayList<Integer> returnEvenPairs(int[] a) {

        ArrayList<Integer> evenPairs = new ArrayList<>();

        for (int x : a) {
            if(x % 2 == 0) {
                evenPairs.add(x);
            }
        }

        return evenPairs;
    }

    private static boolean checkIfEvenPairOrderIsAscending(ArrayList<Integer> evenPairs) {

        boolean firstNumber = false;
        int previousNumber = 0;

        for (int currentItem : evenPairs) {

            if(!firstNumber) {
                previousNumber = currentItem;
                firstNumber = true;

                // Uncomment to see code output
                // System.out.println("First Number: " + currentItem);
            } else {
                if(previousNumber > currentItem) {
                    // Uncomment to see code output
                    //System.out.println("FALSE: Current Item ( " + currentItem + " ) is lesser than " + previousNumber);
                    return false;
                }

                // Uncomment to see code output
                // System.out.println("VALID: Current Item ( " + currentItem + " ) is greater than " + previousNumber);
                previousNumber = currentItem;
            }
        }

        return true;
    }

    private static boolean checkIfOddPairOrderIsAscending(ArrayList<Integer> oddPairs) {

        boolean firstNumber = false;
        int previousNumber = 0;

        for (int currentItem : oddPairs) {

            if(!firstNumber) {
                previousNumber = currentItem;
                firstNumber = true;

                // Uncomment to see code output
                // System.out.println("First Number: " + currentItem);
            } else {
                if(previousNumber > currentItem) {
                    // Uncomment to see code output
                    //System.out.println("FALSE: Current Item ( " + currentItem + " ) is lesser than " + previousNumber);
                    return false;
                }

                // Uncomment to see code output
                // System.out.println("VALID: Current Item ( " + currentItem + " ) is greater than " + previousNumber);
                previousNumber = currentItem;
            }
        }

        return true;
    }

    private static int isTwinPaired(int[] a) {

        ArrayList<Integer> oddPairs = returnOddPairs(a);
        ArrayList<Integer> evenPairs = returnEvenPairs(a);

        if(checkIfEvenPairOrderIsAscending(evenPairs) && checkIfOddPairOrderIsAscending(oddPairs)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        int[] userSuppliedArray = {3, 2, 1};

        int isTwinPaired = isTwinPaired(userSuppliedArray);

        System.out.println("Output: " + isTwinPaired);
    }
}
