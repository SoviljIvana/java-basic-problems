public class Section {

    private char letter;
    private Section nextSection;
    private Entry nextEntry;


    public Section(char letter) {
        this.letter = letter;
    }

    public Entry getNextEntry() {
        return nextEntry;
    }

    public void setNextEntry(Entry nextEntry) {
        this.nextEntry = nextEntry;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Section getNextSection() {
        return nextSection;
    }

    public void setNextSection(Section nextSection) {
        this.nextSection = nextSection;
    }

}