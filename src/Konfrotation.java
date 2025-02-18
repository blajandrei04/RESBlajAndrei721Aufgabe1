import java.time.LocalDate;

public class Konfrotation {
    private int id;
    private String held;
    private String antagonist;
    private String ort;
    private String date;
    private int globalerEinfluss;
    public Konfrotation(int id, String held, String antagonist, String ort,String date, int globalerEinfluss) {
        this.id = id;
        this.held = held;
        this.antagonist = antagonist;
        this.ort = ort;
        this.date = date;
        this.globalerEinfluss = globalerEinfluss;
    }
    public Konfrotation() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeld() {
        return held;
    }

    public void setHeld(String held) {
        this.held = held;
    }

    public String getAntagonist() {
        return antagonist;
    }

    public void setAntagonist(String antagonist) {
        this.antagonist = antagonist;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getGlobalerEinfluss() {
        return globalerEinfluss;
    }

    public void setGlobalerEinfluss(int globalerEinfluss) {
        this.globalerEinfluss = globalerEinfluss;
    }

    @Override
    public String toString() {
        return "Konfrotation{" +
                "id=" + id +
                ", held='" + held + '\'' +
                ", antagonist='" + antagonist + '\'' +
                ", ort='" + ort + '\'' +
                ", date='" + date + '\'' +
                ", globalerEinfluss=" + globalerEinfluss +
                '}';
    }
}
