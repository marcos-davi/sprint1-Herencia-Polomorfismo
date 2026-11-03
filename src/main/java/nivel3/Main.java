package nivel3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase principal que gestiona la aplicación interactiva de la redacción de noticias.
 * Presenta un menú por consola para realizar operaciones sobre los redactores y sus noticias.
 */
public class Main {

    private static List<Redactor> redactors = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        int opcio = 0;

        do {

            System.out.print("Selecciona una opció: ");

            if (scanner.hasNextInt()) {
                opcio = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Si us plau, introdueix un número vàlid.");
                scanner.nextLine();
                continue;
            }

            switch (opcio) {
                case 1:
                    introduirRedactor();
                    break;
                case 2:
                    eliminarRedactor();
                    break;
                case 3:
                    introduirNoticiaRedactor();
                    break;
                case 4:
                    eliminarNoticia();
                    break;
                case 5:
                    mostrarNoticiesRedactor();
                    break;
                case 6:
                    calcularPuntuacioNoticia();
                    break;
                case 7:
                    calcularPreuNoticia();
                    break;
                case 0:
                    salir = true;
                    System.out.println("Gràcies per utilitzar l'aplicació. Fins aviat!");
                    break;
                default:
                    System.out.println("Opció no vàlida. Revisa el menú.");
            }
            System.out.println();

        } while (!salir);
    }

    private static void mostrarMenu() {
        System.out.println("--- GESTIÓ DE REDACCIÓ DE NOTÍCIES ---");
        System.out.println("1. Introduir redactor");
        System.out.println("2. Eliminar redactor");
        System.out.println("3. Introduir notícia a un redactor");
        System.out.println("4. Eliminar notícia");
        System.out.println("5. Mostrar totes les notícies d’un redactor");
        System.out.println("6. Calcular puntuació d’una notícia");
        System.out.println("7. Calcular preu d’una notícia");
        System.out.println("0. Sortir");
    }

    private static void introduirRedactor() {
        System.out.print("Introdueix el nom del redactor: ");
        String nom = scanner.nextLine();
        System.out.print("Introdueix el DNI del redactor: ");
        String dni = scanner.nextLine();

        Redactor redactor = new Redactor(nom, dni);
        redactors.add(redactor);
        System.out.println("Redactor creat amb èxit!");
    }

    private static void eliminarRedactor() {
        System.out.print("Introdueix el DNI del redactor a eliminar: ");
        String dni = scanner.nextLine();

        Redactor redactor = cercarRedactor(dni);
        if (redactor != null) {
            redactors.remove(redactor);
            System.out.println("Redactor eliminat correctament.");
        } else {
            System.out.println("No s'ha trobat cap redactor amb aquest DNI.");
        }
    }

    private static void introduirNoticiaRedactor() {
        System.out.print("Introdueix el DNI del redactor al qual vols afegir la notícia: ");
        String dni = scanner.nextLine();

        Redactor redactor = cercarRedactor(dni);
        if (redactor == null) {
            System.out.println("No s'ha trobat cap redactor amb aquest DNI.");
            return;
        }

        System.out.println("\nSelecciona el tipus de notícia:");
        System.out.println("1. Futbol");
        System.out.println("2. Bàsquet");
        System.out.println("3. Tenis");
        System.out.println("4. Fórmula 1");
        System.out.println("5. Motociclisme");
        System.out.print("Opció d'esport: ");

        int tipusEsport = 0;
        if (scanner.hasNextInt()) {
            tipusEsport = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Opció invàlida.");
            scanner.nextLine();
            return;
        }

        System.out.print("Introdueix el titular de la notícia: ");
        String titular = scanner.nextLine();

        Noticia novaNoticia = null;

        switch (tipusEsport) {
            case 1:
                System.out.print("Introdueix la competició (ex: Lliga de Campions, Lliga): ");
                String compFutbol = scanner.nextLine();
                System.out.print("Introdueix el club (ex: Barça, Madrid): ");
                String clubFutbol = scanner.nextLine();
                System.out.print("Introdueix el jugador (ex: Ferran Torres, Benzema): ");
                String jugFutbol = scanner.nextLine();
                novaNoticia = new NoticiaFutbol(titular, compFutbol, clubFutbol, jugFutbol);
                break;

            case 2:
                System.out.print("Introdueix la competició (ex: Eurolliga, ACB): ");
                String compBasquet = scanner.nextLine();
                System.out.print("Introdueix el club (ex: Barça, Madrid): ");
                String clubBasquet = scanner.nextLine();
                novaNoticia = new NoticiasBasquet(titular, compBasquet, clubBasquet);
                break;

            case 3:
                System.out.print("Introdueix la competició: ");
                String compTenis = scanner.nextLine();
                System.out.print("Introdueix el tenista principal (ex: Nadal, Federer, Djokovic): ");
                String tenista = scanner.nextLine();
                novaNoticia = new NoticiasTenis(titular, compTenis, tenista);
                break;

            case 4:
                System.out.print("Introdueix l'escuderia (ex: Ferrari, Mercedes): ");
                String escuderia = scanner.nextLine();
                novaNoticia = new NoticiasF1(titular, escuderia);
                break;

            case 5:
                System.out.print("Introdueix l'equip (ex: Honda, Yamaha): ");
                String equip = scanner.nextLine();
                novaNoticia = new NoticiasMotociclisme(titular, equip);
                break;

            default:
                System.out.println("Tipus d'esport no reconegut.");
                return;
        }

        redactor.afegirNoticia(novaNoticia);
        System.out.println("Notícia creada i assignada al redactor correctament!");
    }

    private static void eliminarNoticia() {
        System.out.print("Introdueix el DNI del redactor propietari de la notícia: ");
        String dni = scanner.nextLine();

        Redactor redactor = cercarRedactor(dni);
        if (redactor == null) {
            System.out.println("No s'ha trobat cap redactor amb aquest DNI.");
            return;
        }

        System.out.print("Introdueix el titular de la notícia a eliminar: ");
        String titular = scanner.nextLine();

        List<Noticia> noticies = redactor.getNoticies();
        Noticia noticiaAEliminar = null;

        for (Noticia n : noticies) {
            if (n.getTitular().equalsIgnoreCase(titular)) {
                noticiaAEliminar = n;
                break;
            }
        }

        if (noticiaAEliminar != null) {
            noticies.remove(noticiaAEliminar);
            System.out.println("Notícia eliminada correctament de la llista del redactor.");
        } else {
            System.out.println("No s'ha trobat cap notícia amb aquest titular per a aquest redactor.");
        }
    }

    private static void mostrarNoticiesRedactor() {
        System.out.print("Introdueix el DNI del redactor del qual vols veure les notícies: ");
        String dni = scanner.nextLine();

        Redactor redactor = cercarRedactor(dni);
        if (redactor == null) {
            System.out.println("No s'ha trobat cap redactor amb aquest DNI.");
            return;
        }

        List<Noticia> noticies = redactor.getNoticies();
        if (noticies.isEmpty()) {
            System.out.println("El redactor " + redactor.getNom() + " no té cap notícia registrada.");
        } else {
            System.out.println("\n--- NOTÍCIES DE L'ESCRITOR: " + redactor.getNom() + " ---");
            for (int i = 0; i < noticies.size(); i++) {
                Noticia n = noticies.get(i);
                System.out.println((i + 1) + ". Titular: " + n.getTitular());
                System.out.println("   - Preu: " + n.calcularPreu() + " €");
                System.out.println("   - Puntuació: " + n.calcularPuntuacio() + " punts");
                System.out.println("   - Tipus: " + n.getClass().getSimpleName());
                System.out.println("--------------------------------------------------");
            }
        }
    }

    /**
     * Calcula i mostra la puntuació d'una notícia específica cercant pel redactor i el titular.
     */
    private static void calcularPuntuacioNoticia() {
        System.out.print("Introdueix el DNI del redactor de la notícia: ");
        String dni = scanner.nextLine();

        Redactor redactor = cercarRedactor(dni);
        if (redactor == null) {
            System.out.println("No s'ha trobat cap redactor amb aquest DNI.");
            return;
        }

        System.out.print("Introdueix el titular de la notícia per calcular la puntuació: ");
        String titular = scanner.nextLine();

        Noticia noticia = cercarNoticiaEnRedactor(redactor, titular);
        if (noticia != null) {
            double puntuacio = noticia.calcularPuntuacio();
            System.out.println("La puntuació de la notícia \"" + noticia.getTitular() + "\" és: " + puntuacio + " punts.");
        } else {
            System.out.println("No s'ha trobat cap notícia amb aquest titular per a aquest redactor.");
        }
    }

    /**
     * Calcula i mostra el preu d'una notícia específica cercant pel redactor i el titular.
     */
    private static void calcularPreuNoticia() {
        System.out.print("Introdueix el DNI del redactor de la notícia: ");
        String dni = scanner.nextLine();

        Redactor redactor = cercarRedactor(dni);
        if (redactor == null) {
            System.out.println("No s'ha trobat cap redactor amb aquest DNI.");
            return;
        }

        System.out.print("Introdueix el titular de la notícia per calcular el preu: ");
        String titular = scanner.nextLine();

        Noticia noticia = cercarNoticiaEnRedactor(redactor, titular);
        if (noticia != null) {
            double preu = noticia.calcularPreu();
            System.out.println("El preu de la notícia \"" + noticia.getTitular() + "\" és: " + preu + " €.");
        } else {
            System.out.println("No s'ha trobat cap notícia amb aquest titular per a aquest redactor.");
        }
    }

    /**
     * Método auxiliar para buscar un redactor por su DNI dentro de la lista global.
     */
    private static Redactor cercarRedactor(String dni) {
        for (Redactor r : redactors) {
            if (r.getDni().equalsIgnoreCase(dni)) {
                return r;
            }
        }
        return null;
    }

    /**
     * Método auxiliar para buscar una noticia por su titular dentro de la lista de un redactor.
     */
    private static Noticia cercarNoticiaEnRedactor(Redactor redactor, String titular) {
        for (Noticia n : redactor.getNoticies()) {
            if (n.getTitular().equalsIgnoreCase(titular)) {
                return n;
            }
        }
        return null;
    }
}