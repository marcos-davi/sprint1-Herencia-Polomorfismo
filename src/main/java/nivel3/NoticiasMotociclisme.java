package nivel3;

public class NoticiasMotociclisme extends Noticia {
    private String equip;


    public NoticiasMotociclisme(String titular, String equip) {
        super(titular);
        this.equip = equip;
    }

    @Override
    public double calcularPreu() {
        double preuTotal = 100;


        if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")) {
            preuTotal += 50;
        }

        return preuTotal;
    }

    @Override
    public double calcularPuntuacio() {
        double puntsTotal = 3;

        if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")) {
            puntsTotal += 3;
        }
         return puntsTotal;
    }
}


