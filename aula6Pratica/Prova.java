public class Prova {
    private double notaParte1;
    private double notaParte2;

    public double calcularNotaTotal() {
        return notaParte1 + notaParte2;
    }

    public double getNotaParte1() {
        return notaParte1;
    }

    public void setNotaParte1(double notaParte1) {
        if (notaParte1 <= 5) {
            this.notaParte1 = notaParte1;
        }
    }

    public double getNotaParte2() {
        return notaParte2;
    }

    public void setNotaParte2(double notaParte2) {
        if (notaParte1 <= 5) {
            this.notaParte2 = notaParte2;
        }
    }
}
