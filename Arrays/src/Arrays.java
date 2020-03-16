public class Arrays {

    /**
     * (Pass index) and this method returns value of element with that index and print it
     *
     * @param index
     * @param array
     * @return Returns value of element
     */
    public int indexAndValue(int index, int[] array) {

        return array[index];

    }

    /**
     * This method print all values from an array
     *
     * @param array
     */
    public void printAllValuesFromAnArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + "   ");
        }

    }

    /**
     * This function returns the sum of elements array
     *
     * @param array
     * @return Returns int which represents the sum of array elements
     */

    public int sumOfArrayElements(int[] array) {
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        return sum;

    }

    /**
     * This method return array with all elements on even positions
     *
     * @param array
     * @return Returns which represent all elements on even positions
     */
    int[] arrayWithElementsOnEvenPositions(int[] array) {
        int[] newArrayWitnElementOnEvenPosition;
        if (array.length % 2 == 0) {
            newArrayWitnElementOnEvenPosition = new int[array.length / 2];
        } else {
            newArrayWitnElementOnEvenPosition = new int[array.length / 2 + 1];
        }

        int counterElementsOnEvenPositions = 0;
        for (int index = 0; index < array.length; index++) {
            if (index % 2 == 0) {
                newArrayWitnElementOnEvenPosition[counterElementsOnEvenPositions] = array[index];
                counterElementsOnEvenPositions += 1;
            }
        }
        return newArrayWitnElementOnEvenPosition;

    }

    /**
     * This method returns an array with all elements that have their value bigger than the average number in list
     *
     * @param array
     * @return Returns int which represents all elements that have their value bigger than the average number in list
     */
    public int[] valueBiggerThanTheAverageNumber(int[] array) {
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum += array[index];
        }

        float average = sum / array.length;
        int lengthNewArray = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > average)
                lengthNewArray++;
        }


        int array1[] = new int[lengthNewArray];
        int counter = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > average) {
                array1[counter] = array[index];
                counter += 1;
            }
        }
        return array1;

    }

    /**
     * This method returns reversed array
     *
     * @param array1
     * @return Returns int which represent reversed array
     */
    public int[] reversedArray(int[] array1) {
        for (int index = 0; index < array1.length / 2; index++) {
            int temp = array1[index];
            array1[index] = array1[array1.length - index - 1];
            array1[array1.length - index - 1] = temp;

        }
        return array1;
    }

    /**
     * This method swap every 2 elements of array
     *
     * @param array1
     * @return Returns int which represent swap every 2 elements of array
     */
    public int[] swapEveryTwoElements(int[] array1) {
        for (int index = 0; index < array1.length - 1; index += 2) {
            int temp = array1[index];
            array1[index] = array1[index + 1];
            array1[index + 1] = temp;
        }

        return array1;
    }

    /**
     * This method sort array (input: 1,8,2,6,7,4,9,6,3,5 output: 1,2,3,4,5,6,6,7,8,9)
     *
     * @param array2
     * @return Returns int which represent sort array
     */
    public int[] sortArray(int[] array2) {

        for (int index1 = 0; index1 < array2.length - 1; index1++)
            for (int index2 = index1 + 1; index2 < array2.length; index2++) {
                if (array2[index1] > array2[index2]) {
                    int temp = array2[index1];
                    array2[index1] = array2[index2];
                    array2[index2] = temp;
                }
            }
        return array2;
    }


    public int[] twoLargestArrayElements() {
        int array3[] = new int[2];
        int newAarray[] = new int[]{1, 7, 3, 5, 11, 9};
        int firstLargest = newAarray[0];
        int secondLargest = newAarray[0];
        for (int index = 0; index < newAarray.length; index++) {

            if (firstLargest < newAarray[index]) {
                secondLargest = firstLargest;
                firstLargest = newAarray[index];
            } else if (newAarray[index] > secondLargest)
                secondLargest = newAarray[index];
            array3[0] = firstLargest;
            array3[1] = secondLargest;

        }


        return array3;
    }


}
















