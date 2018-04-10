import java.lang.*;
import java.util.*;



class ArrayFill {
    public static void main(String[] args) {
        ArrayOfInt intArray = new ArrayOfInt(10);
        intArray.printArray();
        ArrayOfBool boolArray = new ArrayOfBool(10);
        boolArray.printArray();
        Random generator = new Random();
        System.out.format("Seerch for number and sum:%d\n",intArray.findAndCount(generator.nextInt(100)));
        int sumOfTrue = boolArray.findTrueAndCount(intArray);
        if(sumOfTrue != Integer.MAX_VALUE) {
            System.out.format("Sum of fieds coresponding with TRUE:%d", sumOfTrue);
        } else {
            System.out.println("ERROR -> No value counted");
        }
    }
}