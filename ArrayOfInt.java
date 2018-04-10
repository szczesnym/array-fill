import java.util.*;

class ArrayOfInt {
    private int[][] numbers;
    private int sizeOfNumbers;

   ArrayOfInt(int size) {
        final int middleFactorBorder = 75;

        if(size >= 0) {
            this.sizeOfNumbers = size;
            Random generator = new Random();
            int middleFactor = 0;
            this.numbers = new int[size][size];
            for(int i=0; i < size; i++) {
                for(int j=0; j < size; j++){
                    if(i == j){
                        if(middleFactor < middleFactorBorder) {
                            numbers[i][j] = -1;
                            middleFactor += Math.ceil(100 / size);
                        } else {
                            numbers[i][j] = 1;
                        }
                    } else {
                        numbers[i][j] = generator.nextInt(300) - 200;
                    }
                }
            }
        }
    }
    public void printArray(){
        for(int i = 0; i < this.sizeOfNumbers; i++){
            for(int j = 0; j < this.sizeOfNumbers; j++ )
                System.out.format("%d,",this.numbers[i][j]);
        }
        System.out.println("");
    }
}