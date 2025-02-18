
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class KonfrontationAnalysis {
    private List<Konfrotation> cases;

    public KonfrontationAnalysis(List<Konfrotation> cases) {
        this.cases = cases;
    }
    public void filterByCapacity(int minCapacity) {
        cases.stream()
                .filter(spiel -> spiel.getGlobalerEinfluss() >= minCapacity)
                .forEach(System.out::println);
    }
    public void displayFeverCases() {
        cases.stream()
                .filter(c -> c.getKonfrontationsTyp().equalsIgnoreCase("Galaktisch"))
                .sorted(Comparator.comparing(Konfrotation::getDate).reversed())
                .forEach(System.out::println);
    }
}
