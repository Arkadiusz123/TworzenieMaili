package mailApp;

import java.util.Scanner;

public class Email {
   private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int passLength = 7;
    private String email;
    private int boxCapacity = 500;
    private String alternateMail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Utworzono adres e-mail: " + this.firstName + " "+ this.lastName);
        this.department = setDepartment();
        this.password = randomPassword(passLength);
        System.out.println("Twoje hasło: " + this.password);
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+".ABCompany.com";


    }
    private String setDepartment(){
        System.out.println("Wybierz dział\n1 dla sprzedaży\n2 dla rozwoju\n3 dla rachunkowości\n0 jeżeli brak");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if (choice==1){return "sprzedaż"; }
        else if (choice==2){return "rozwój"; }
        else if (choice==3){return "rachunkowość"; }
        else {return ""; }
    }
    private String randomPassword(int length){
        String set = "1234567890ABCDEFGHIJKL";
        char[] password = new char[length];
        for (int i = 0; i < length ; i++) {
        int rand = (int) (Math.random() * set.length());
        password[i] = set.charAt(rand);
        }
        return new String(password);
    }
    public void setCapacity(int capacity){
        this.boxCapacity = capacity;
    }
    public void setAlternateMail(String alterMail){
        this.alternateMail = alterMail;
    }
    public void changePassword(String pass){
        this.password = pass;
    }

    public String getPassword() {
        return password;
    }

    public int getBoxCapacity() {
        return boxCapacity;
    }

    public String getAlternateMail() {
        return alternateMail;
    }

    public String showInfo() {
        return "Imię i nazwisko: "  + firstName + " " + lastName +
                "   email: " + email +
                "   Pojemność skrzynki:  " + boxCapacity + " mb.";
    }
}


//https://www.youtube.com/watch?v=U3Ibvu0htNs 27:00