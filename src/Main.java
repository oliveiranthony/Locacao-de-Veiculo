import model.entities.CarRental;
import model.entities.Vehicle;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter the rental details.");
        System.out.print("Car model: ");
        String model = sc.nextLine();
        System.out.print("Withdrawal moment (dd/MM/yyyy HH:mm:ss): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.print("Return moment (dd/MM/yyyy HH:mm:ss):");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);
        Vehicle vehicle = new Vehicle(model);
        CarRental carRental = new CarRental(vehicle, start, finish);

        sc.close();
    }
}