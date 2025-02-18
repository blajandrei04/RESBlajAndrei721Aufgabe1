
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {
    public static List<Konfrotation> parseCSV(String filename) {
        List<Konfrotation> cases = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t");

                if (parts.length < 7) continue;

                cases.add(new Konfrotation(
                        Integer.parseInt(parts[0]),
                        parts[1],
                        parts[2],
                        parts[4],
                        parts[5],
                        Integer.parseInt(parts[6])
                ));
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading CSV file", e);
        }
        return cases;
    }
}
