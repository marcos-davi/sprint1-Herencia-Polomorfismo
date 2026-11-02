package nivel3;

public class NoticiasF1 extends Noticia {
    private String escuderia;

    public NoticiasF1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;

    }

    @Override
    public double calcularPreu() {
        double preuTotal = 100;

        if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
            preuTotal += 50;
        }

        return preuTotal;
    }

    @Override
    public double calcularPuntuacio() {
        double puntsTotal = 4;

        if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
            puntsTotal += 2;
        }
         return puntsTotal;
    }
}
