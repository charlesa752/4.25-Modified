import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num;
        boolean firstInput = true;
        int smallestNum = 0;

        while (scnr.hasNextInt()) {
            num = scnr.nextInt();

            if (firstInput) {
                smallestNum = num;
                firstInput = false;
            } else if (num < smallestNum) {
                smallestNum = num;
            }
        }

        System.out.println(smallestNum);
    }
}
//This is a heavily moddified version of Lab 4.25 which choses the smallest number.
// In the orginial you can only provide 3 numbers this one can provide as much as required.