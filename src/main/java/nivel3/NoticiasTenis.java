package nivel3;

public class NoticiasTenis extends Noticia {
    private String competicio;
    private String tenistes;

    public NoticiasTenis(String titular, String competicio, String tenistes) {
        super(titular);
        this.competicio = competicio;
        this.tenistes = tenistes;
    }

    @Override
    public double calcularPreu() {
        double preuTotal = 150;

        if (tenistes.equalsIgnoreCase("Nadal") || tenistes.equalsIgnoreCase("Federer") || tenistes.equalsIgnoreCase("Djokovic")) {
            preuTotal += 100;
        }

        return preuTotal;
    }

    @Override
    public double calcularPuntuacio() {
        double puntsTotal = 4;

        if (tenistes.equalsIgnoreCase("Nadal") || tenistes.equalsIgnoreCase("Federer") || tenistes.equalsIgnoreCase("Djokovic")) {
            puntsTotal += 3;
        }
         return puntsTotal;
    }
}
