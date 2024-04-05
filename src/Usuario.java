import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Usuario {

    //atributos
    private String name;
    private String surname;
    private String email;
    private String password;

    private String phoneNumber;

    private String address;

    //constructor

    public Usuario(String name, String surname, String email, String password, String phoneNumber, String address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Usuario(String name, String surname, String email, String password, String address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.address = address;
    }



    //getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Método para actualizar la información del usuario
    public void updateUserInfo(String newName, String newSurname, String newEmail, String newPassword, String newPhoneNumber, String newAddress) {
        if (!newName.isEmpty()) {
            name = newName;
        }
        if (!newSurname.isEmpty()) {
            surname = newSurname;
        }
        if (!newEmail.isEmpty()) {
            email = newEmail;
        }


        if (!newPhoneNumber.isEmpty()) {
            phoneNumber = newPhoneNumber;
        }
        if (!newAddress.isEmpty()) {
            address = newAddress;
        }
    }

    public boolean isValidEmail() {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
