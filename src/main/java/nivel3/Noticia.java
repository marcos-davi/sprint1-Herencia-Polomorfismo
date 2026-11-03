package nivel3;

/**
 * Clase abstracta que sirve como plantilla base para todas las noticias deportivas.
 * Define la estructura común (titular, texto, precio y puntuación) y los métodos
 * abstractos de cálculo que cada deporte debe implementar.
 */
public abstract class Noticia {
    private String titular;
    private String text;
    private double preu;
    private double puntuacio;

    /**
     * Constructor para inicializar los datos base de cualquier noticia.
     *
     * @param titular El título principal de la noticia.
     */
    public Noticia(String titular) {
        this.titular = titular;
        this.text = "";        // El texto se inicializa vacío
        this.preu = 0.0;       // Se calculará  con calcularPreu()
        this.puntuacio = 0.0;  // Se calculará  con calcularPuntuacio()
    }

    // --- Métodos Abstractos ---

    /**
     * Calcula el precio final de la noticia según las reglas de cada deporte.
     * @return El precio calculado en euros.
     */
    public abstract double calcularPreu();

    /**
     * Calcula la puntuación final de la noticia según las reglas de cada deporte.
     * @return La puntuación total calculada.
     */
    public abstract double calcularPuntuacio();

    // --- Getters y Setters ---

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public double getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(double puntuacio) {
        this.puntuacio = puntuacio;
    }
}