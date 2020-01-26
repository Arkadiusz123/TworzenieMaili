package mailApp;

public class MailApp {
    public static void main(String[] args) {
        Email mail1 = new Email("Jan", "Kowalski");
        System.out.println(mail1.showInfo());
    }
}
