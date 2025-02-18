
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den TSV-Dateipfad ein: ");
        String filename = scanner.nextLine();

        KonfrontationAnalysis analysis = new KonfrontationAnalysis(CsvParser.parseCSV(filename));

        System.out.print("Geben Sie einen Zahl für die minimumEinfluss ein: ");
        char initial = scanner.nextLine().charAt(0);
        analysis.filterByCapacity(initial);
//        System.out.println("\nGalaktische Konfrontationen':");
//        analysis.displayFeverCases();

        System.out.println("Analyse abgeschlossen.");
    }
}
