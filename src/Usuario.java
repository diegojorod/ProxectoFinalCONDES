import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



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

    // Método para guardar un usuario en un archivo de texto
    public void saveUser() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuario.txt"))) {
            writer.write(name + "," + surname + "," + email + "," + password + "," + phoneNumber + "," + address);
        } catch (IOException e) {
            System.err.println("Error al guardar el usuario en el archivo.");
            e.printStackTrace();
            // Manejo de errores, por ejemplo, lanzar una excepción personalizada
        }
    }

    // Método para cargar un usuario desde un archivo de texto
    public void loadUser() {
        try (BufferedReader reader = new BufferedReader(new FileReader("usuario.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                String[] userData = line.split(",");
                name = userData[0];
                surname = userData[1];
                email = userData[2];
                password = userData[3];
                phoneNumber = userData[4];
                address = userData[5];
            }
        } catch (IOException e) {
            System.err.println("Error al cargar el usuario desde el archivo.");
            e.printStackTrace();
            // Manejo de errores, por ejemplo, lanzar una excepción personalizada
        }
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
