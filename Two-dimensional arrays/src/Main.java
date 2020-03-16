public class Main {

    public static void main(String args[]) {
        int twoDimensionalArray[][] = {{1, 2, 3,15},
                                       {4, 5, 15,1},
                                       {7, 15, 9,1},
                                       {15,11,12,1}};


        TwoDimensionalArrays matrix = new TwoDimensionalArrays();
        matrix.printTwoDimensionalArray(twoDimensionalArray);
        System.out.println("\n");
        System.out.println(matrix.averageValueInTheGivenRow(twoDimensionalArray, 0));
        System.out.println("\n");
        matrix.printArrray(matrix.numbersThatAreOnSecondaryDiagonal(twoDimensionalArray));
        System.out.println("\n");
        matrix.printArrray(matrix.elementsAboveSecondaryDiagonal(twoDimensionalArray));
        System.out.println("\n");
    }


}
