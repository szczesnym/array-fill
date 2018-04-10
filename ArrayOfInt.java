import java.util.*;

class ArrayOfInt {
    private int[][] numbers;
    private int sizeOfNumbers;

   ArrayOfInt(int size) {
        final int middleFactorBorder = 75;

        if(size >= 0) {
            this.sizeOfNumbers = size;
            Random generator = new Random();
            int minusCount = 0;
            int plusCount = 1;
            this.numbers = new int[size][size];
            for(int i = 0; i < size; i++) {
                for(int j = 0; j < size; j++){
                    if((i + j) == (size - 1)) {
                        if((minusCount/plusCount)*100 < middleFactorBorder) {
                            numbers[i][j] = -1;
                            minusCount++;
                        } else {
                            numbers[i][j] = 1;
                            plusCount++;
                            minusCount = 0;
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
            for(int j = 0; j < this.sizeOfNumbers; j++) {
                System.out.format("%4d,",this.numbers[i][j]);
            }
            System.out.println("");
        }
    }
    public int findAndCount(int intToFind) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < this.sizeOfNumbers; i++) {
            for(int j = 0; j < this.sizeOfNumbers; j++){
                if (this.numbers[i][j] == intToFind) {
                    count++;
                    sum += this.numbers[i][j];
                }
            }
        }
        System.out.format("Found %d of %d", count, intToFind);
        return sum;
    }
    public int getSizeOfNumbers() {
        return this.sizeOfNumbers;
    }
    public int itemAtCord(int xCord, int yCord) {
        if((xCord <= this.sizeOfNumbers) && (yCord <= this.sizeOfNumbers)) {
            return this.numbers[xCord][yCord];
        } else {
            return Integer.MAX_VALUE;
        }
    }
}