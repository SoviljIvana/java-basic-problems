public class Entry {

    private String lastName;
    private String name;
    private String telephoneNumber;
    private Entry next;


    public Entry(String lastName, String name,String telephoneNumber) {
        this.lastName = lastName;
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }

    public Entry getNext() {
        return next;
    }

    public void setNext(Entry next) {
        this.next = next;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }


}
