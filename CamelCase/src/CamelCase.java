public class CamelCase {
    /**
     * This method print number of words, the first letter is uppercase and rest od the letters are lowercase
     *
     * @param word
     * @return Returns number of words
     */
    public static int camelCase(String word) {
        int lengthWord = word.length();
        if (lengthWord == 0) {
            return 0;
        }

        int counterOfTheWord = 1;
        for (int index = 0; index < lengthWord; index++) {
            char character = word.charAt(index);
            if ('A' <= character && character <= 'Z') {
                counterOfTheWord++;
            } else if (character == ' ') {
                break;
            }
        }
        return counterOfTheWord;

    }

}
