public class Mainn {


    public static void main(String args[]) {

        int array[] = new int[]{2, 5, 3, 7, 2};
        int array1[] = new int[]{1, 2, 3, 4, 5};
        int array2[] = new int[]{1, 8, 2, 6, 7, 4, 9, 6, 3, 5};
        int array3[] = new int[2];


        Arrays one = new Arrays();
        System.out.println(one.indexAndValue(1, array));
        System.out.print("\n");
        one.printAllValuesFromAnArray(array);
        System.out.print("\n");
        System.out.println(one.sumOfArrayElements(array));
        System.out.print("\n");
        one.printAllValuesFromAnArray(one.arrayWithElementsOnEvenPositions(array));
        System.out.print("\n");
        one.printAllValuesFromAnArray(one.valueBiggerThanTheAverageNumber(array));
        System.out.print("\n");
        one.printAllValuesFromAnArray(one.reversedArray(array1));
        System.out.print("\n");
        one.printAllValuesFromAnArray(one.swapEveryTwoElements(array1));
        System.out.print("\n");
        one.printAllValuesFromAnArray(one.sortArray(array2));
        System.out.print("\n");
        one.printAllValuesFromAnArray(one.twoLargestArrayElements());


    }
}
