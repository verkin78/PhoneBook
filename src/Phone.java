import java.util.HashMap;

public class Phone {
    private String personName;
    private String personPhone;

    public Phone(String personName, String personPhone) {
        this.personName = personName;
        this.personPhone = personPhone;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
    }

    @Override
    public String toString() {
        return "Контакт" +
                " " + personName + '\'' +
                ", номер телефона " + personPhone + '\'' + "\n";
    }
}
