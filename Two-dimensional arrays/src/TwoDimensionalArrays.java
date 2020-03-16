

public class TwoDimensionalArrays {
    /**
     * This method prints the two dimensional array
     *
     * @param matrix
     */
    public void printTwoDimensionalArray(int matrix[][]) {
        for (int row = 0; row < matrix.length; row++)
            for (int column = 0; column < matrix[row].length; column++) {

                System.out.println(matrix[row][column] + " ");
            }
    }

    /**
     * This method find the average value in the given row of the two dimensional array
     *
     * @param matrix
     * @param row
     */
    public float averageValueInTheGivenRow(int[][] matrix, int row) {
        int sum = 0;
        for (int column = 0; column < matrix.length; column++) {
            sum += matrix[row][column];
        }
        float average =(float) sum / matrix.length;
        return average;

    }

    /**
     * This method prints the array
     *
     * @param array
     */
    public void printArrray(int array[]) {
        for (int index = 0; index < array.length; index++) {

            System.out.println(array[index] + " ");
        }
    }

    /**
     * This method print all the numbers that are on the diagonal of the array
     *
     * @param matrix
     * @return Returns array
     */
    public int[] numbersThatAreOnSecondaryDiagonal(int[][] matrix) {
        int counterOfTheDiagonalElements = 0;

        int[] array;
        for (int row = 0; row < matrix.length; row++)
            for (int column = 0; column < matrix.length; column++) {
                if (row + column == matrix[row].length - 1) {
                    counterOfTheDiagonalElements++;
                }
            }
        array = new int[counterOfTheDiagonalElements];
        int counterArrayElements = 0;
        for (int row = 0; row < matrix.length; row++)
            for (int column = 0; column < matrix.length; column++) {
                if (row + column == matrix[row].length - 1) {
                    array[counterArrayElements] = matrix[row][column];
                    counterArrayElements++;
                }
            }
        return array;


    }

    /**
     * This method print the numbers that are above the secondary diagonal
     *
     * @param matrix
     * @return Returns array
     */
    public int[] elementsAboveSecondaryDiagonal(int[][] matrix) {
        int counterOfTheElementAboveTheSecondaryDiagonal = 0;

        int[] array;
        for (int row = 0; row < matrix.length; row++)
            for (int column = 0; column < matrix.length; column++) {
                if (row + column < matrix.length - 1) {
                    counterOfTheElementAboveTheSecondaryDiagonal++;
                }
            }
        array = new int[counterOfTheElementAboveTheSecondaryDiagonal];
        int counter1 = 0;
        for (int row = 0; row < matrix.length; row++)
            for (int column = 0; column < matrix.length; column++) {
                if (row + column < matrix.length - 1) {
                    array[counter1] = matrix[row][column];
                    counter1++;
                }
            }
        return array;


    }


}




