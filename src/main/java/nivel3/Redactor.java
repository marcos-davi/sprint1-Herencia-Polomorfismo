package nivel3;

import java.util.ArrayList;
import java.util.List;

public class Redactor {
   private String nom;
   private final String dni;
   private static double souComu = 1500;
   private List<Noticia> noticies;

   // constructor
   public Redactor(String name, String dni) {
       this.nom = name;
       this.dni = dni;
       this.noticies = new ArrayList<>();

   }
   // Getters and Setters

   public String getNom() {
       return nom;
   }

   public void setNom(String nom) {
       this.nom = nom;
    }

   public String getDni() {
       return dni;
   }

   public double getSouComu() {

       return souComu;
   }

    public void setSouComu(double sou) {

       Redactor.souComu = sou;
    }

    public List<Noticia> getNoticies() {
       return noticies;
    }

    public void afegirNoticia(Noticia noticia) {
        this.noticies.add(noticia);
    }
}
