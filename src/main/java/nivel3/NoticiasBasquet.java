package nivel3;

public class NoticiasBasquet extends Noticia {
    private String competicio;
    private String club;

    public NoticiasBasquet(String titular, String competicio, String club) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
    }

    @Override
    public double calcularPreu() {
        double preuTotal = 250;
        if (competicio.equalsIgnoreCase("Eurolliga")) {
            preuTotal += 75;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            preuTotal += 75;
        }

        return preuTotal;
    }

    @Override
    public double calcularPuntuacio() {
        double puntsTotal = 4;
        if (competicio.equalsIgnoreCase("Eurolliga")) {
            puntsTotal += 3;
        } else if (competicio.equalsIgnoreCase("ACB")) {
            puntsTotal += 2;
        }

        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            puntsTotal += 1;
        }
         return puntsTotal;
    }
}
