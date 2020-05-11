package model;

public class User {

    private String username;
    private String password;
    private String role;
    private String FullName;
    private String Adress;
    private String PhoneNumber;
    private String Mail;

    public User() {
    }

    public User(String username, String password, String role,String FullName,String Adress,String PhoneNumber,String Mail) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.Adress=Adress;
        this.FullName=FullName;
        this.PhoneNumber=PhoneNumber;
        this.Mail=Mail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!username.equals(user.username)) return false;
        if (!password.equals(user.password)) return false;
        return role.equals(user.role);
    }

    @Override
    public int hashCode() {
        int result = username.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + role.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", FullName='" + FullName + '\'' +
                ", Adress='" + Adress + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Mail='" + Mail + '\'' +
                '}';
    }
}
