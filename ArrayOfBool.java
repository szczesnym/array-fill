import java.util.Random;

class ArrayOfBool {
    private boolean[][] bools;
    private int sizeOfNumbers;

    ArrayOfBool(int size) {
        if(size >= 0) {
            this.sizeOfNumbers = size;
            Random generator = new Random();
            this.bools = new boolean[size][size];
            for(int i=0; i < size; i++) {
                for(int j=0; j < size; j++) { 
                    bools[i][j] = generator.nextBoolean();
                }  
            }
        }
    }
    public void printArray(){
        for(int i = 0; i < this.sizeOfNumbers; i++){
            for(int j = 0; j < this.sizeOfNumbers; j++ ) {
                System.out.format("%5b,", this.bools[i][j]);
            }
            System.out.println("");
        }
    }
    public int findTrueAndCount(ArrayOfInt arrayOfNumbers) {
        int sum = 0;
        if(arrayOfNumbers.getSizeOfNumbers() == this.sizeOfNumbers) {
            for(int i = 0; i < this.sizeOfNumbers; i++) {
                for(int j = 0; j < this.sizeOfNumbers; j++ ) {
                    if(bools[i][j]) {
                        sum += arrayOfNumbers.itemAtCord(i,j);
                        System.out.format("Cords x:%d,y:%d, value:%d\n",i ,j ,arrayOfNumbers.itemAtCord(i,j));
                    }
                }
            }
            return sum;
        } else {
            System.out.println("Sizes of arrays does not match !!!");
            return Integer.MAX_VALUE;
        }
    }

}