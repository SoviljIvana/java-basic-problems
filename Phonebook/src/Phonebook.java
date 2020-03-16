public class Phonebook {

    public Section head;

    /**
     * this method adds a section to the appropriate position
     *
     * @param letter is the first letter of the surname
     */
    public Section addSection(char letter) {

        Section section = new Section(letter);

        if (head == null) {
            head = section;

        } else if (section.getLetter() <= head.getLetter()) {
            section.setNextSection(head);
            head = section;
        } else {
            Section tempSection = head;
            while (tempSection.getNextSection() != null && tempSection.getNextSection().getLetter() < section.getLetter()) {
                tempSection = tempSection.getNextSection();
            }
            section.setNextSection(tempSection.getNextSection());
            tempSection.setNextSection(section);
        }
        return section;
    }

    /**
     * This method returns false if surnames begin with the same letter
     *
     * @param letter
     * @return
     */
    public boolean checkTheEqualityOfSurnames(char letter) {

        Section tempSection = head;
        while (tempSection != null) {
            if (tempSection.getLetter() == letter) {
                return false;
            } else {
                tempSection = tempSection.getNextSection();
            }
        }
        return true;
    }

    /**
     * this method add entries in section and sort them
     *
     * @param entry
     */
    public void addEntryInTheSection(Entry entry, Section section) {
        Entry temp = section.getNextEntry();
        if (section.getLetter() == entry.getLastName().charAt(0)) {

            while (temp.getNext() != null && (compareStringsIgnoreCase(temp.getNext().getLastName(), entry.getLastName()) == 1 || (compareStringsIgnoreCase(entry.getLastName(), temp.getNext().getLastName()) == 0))) {
                temp = temp.getNext();
            }

            if (compareStringsIgnoreCase(entry.getLastName(), temp.getLastName()) == 1) {
                if (temp.getLastName() == section.getNextEntry().getLastName()) {


                    entry.setNext(temp);
                    section.setNextEntry(entry);
                }
            }
            if (compareStringsIgnoreCase(entry.getLastName(), temp.getLastName()) == 2) {
                entry.setNext(temp.getNext());
                temp.setNext(entry);
            }
            if (compareStringsIgnoreCase(entry.getLastName(), temp.getLastName()) == 0) {
                entry.setNext(temp.getNext());
                temp.setNext(entry);
            }
        }
    }

    /**
     * @param word1
     * @param word2
     * @return
     */
    public int compareStringsIgnoreCase(String word1, String word2) {
word1 = word1.toUpperCase();
word2 = word2.toUpperCase();
        int r = 0;
        int length;
        if (word1.length() >= word2.length()) {
            length = word1.length();
        } else {
            length = word2.length();
        }
        for (int i = 0; i < length; i++) {
            if (word1.charAt(r) == word2.charAt(r)) {
                r++;
            } else if (word1.charAt(r) < word2.charAt(r)) {
                return 1;
            } else {
                return 2;
            }
        }
        return 0;
    }

    /**
     * This method add first character (entry-lastName) and add in section
     *
     * @param name
     * @param lastName
     * @param telephoneNumber
     */
    public void add(String lastName, String name, String telephoneNumber) {
        Section tempSection = head;
        Entry entry = new Entry(lastName, name, telephoneNumber);
        if (checkTheEqualityOfSurnames(entry.getLastName().charAt(0))) {
            addNextEntry(addSection(entry.getLastName().charAt(0)), entry);
        } else {
            while (tempSection != null) {

                addEntryInTheSection(entry, tempSection);

                tempSection = tempSection.getNextSection();
            }
        }
    }

    /**
     * This method print sections and entries
     */
    public void printAll() {
        Section tempSection = head;
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        while (tempSection != null) {
            System.out.println("|" + tempSection.getLetter() + "|: ");
            Entry headEntry = tempSection.getNextEntry();
            Entry temp = headEntry;

            while (temp.getNext() != null) {
                System.out.println("\t- " + temp.getLastName() + " " + temp.getName() + " " + temp.getTelephoneNumber());
                temp = temp.getNext();
            }
            System.out.println("\t- " + temp.getLastName() + " " + temp.getName() + " " + temp.getTelephoneNumber());
            tempSection = tempSection.getNextSection();
        }
    }

    /**
     * this method connects the section with entry
     *
     * @param section
     * @param entry
     */
    public void addNextEntry(Section section, Entry entry) {
        if (section.getNextEntry() == null) {
            section.setNextEntry(entry);
        }
    }
}
