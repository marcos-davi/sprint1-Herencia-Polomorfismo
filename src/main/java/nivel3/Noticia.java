package nivel3;

public abstract class Noticia {
    private String titular;
    private String texto;
    private double preu;
    private double point;

    //methods
    public abstract double calcularPreu();

    public abstract double calcularPuntuacio();

    //constructor
    public Noticia(String titular) {
        this.titular = titular;
        this.texto = "";
        this.preu = 0;
        this.point = 0;
    }

    // Getters and Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
