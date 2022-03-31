public class Contact {
    private String name;
    private int telephoneNum;
    private String address;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(int telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String name, int telephoneNum) {
        this.name = name;
        this.telephoneNum = telephoneNum;
    }

    public Contact(String name, int telephoneNum, String address, String email) {
        this.name = name;
        this.telephoneNum = telephoneNum;
        this.address = address;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", telephoneNum=" + telephoneNum +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
