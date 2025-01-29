package Exercise;

public class ContactExe44 {
    private final String name;
    private final String phoneNumber;

    public ContactExe44(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static ContactExe44 createContact(String name, String phoneNumber) {
        return new ContactExe44(name, phoneNumber);
    }
}
