package nivel3;

public class NoticiaFutbol extends Noticia {

    private String competicio;
    private String club;
    private String jugador;

    // Constructor

    public NoticiaFutbol(String titular, String competicio, String club, String jugador) {
        super(titular); //Super attribute
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }


    // Method calcular preu
    @Override
    public double calcularPreu() {
        double preuTotal = 300;
        if (competicio.equalsIgnoreCase("Lliga de Campions")) {
            preuTotal += 100;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            preuTotal += 100;
        }
        if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
            preuTotal += 50;
        }
        return preuTotal;
    }

    // Method calcular punts
    @Override
    public double calcularPuntuacio() {
        double puntsTotal = 5;
        if (competicio.equalsIgnoreCase("Lliga de Campions")) {
            puntsTotal += 3;
        } else if (competicio.equalsIgnoreCase("Lliga")) {
            puntsTotal += 2;
        }

        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            puntsTotal += 1;
        }
        if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
            puntsTotal += 1;
        }
        return puntsTotal;

    }
}

