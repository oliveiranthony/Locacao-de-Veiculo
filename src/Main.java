import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

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
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter the rental details.");
        System.out.print("Car model: ");
        String model = sc.nextLine();
        System.out.print("Withdrawal moment (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.print("Return moment (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);
        CarRental carRental = new CarRental(new Vehicle(model), start, finish);

        System.out.print("Enter the hourly rate: $");
        double hourlyRate = sc.nextDouble();
        System.out.print("Enter the price per day: $");
        double pricePerDay = sc.nextDouble();
        RentalService rentalService = new RentalService(hourlyRate, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(carRental);

        System.out.println();
        System.out.println("Invoice: ");
        System.out.println("Basic Payment: $" + df.format(carRental.getInvoice().getBasicPayment()));
        System.out.println("Tax: $" + df.format(carRental.getInvoice().getTax()));
        System.out.println("Total Payment: $" + df.format(carRental.getInvoice().getTotalPayment()));


        sc.close();
    }
}