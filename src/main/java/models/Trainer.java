package models;

public class Trainer {

    private String firstName;
    private String lastName;
    private String subject;

    public Trainer() {

    }

    public Trainer(String fN, String lN, String sub) {
        this.firstName = fN;
        this.lastName = lN;
        this.subject = sub;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String course) {
        this.subject = course;
    }

    @Override
    public String toString() {
        return "Trainer{" + "firstName= " + firstName + ", lastName= " + lastName + ", subject= " + subject + '}';
    }

}
