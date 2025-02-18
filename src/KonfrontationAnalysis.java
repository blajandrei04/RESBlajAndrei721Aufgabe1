
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
}
