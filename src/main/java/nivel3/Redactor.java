package nivel3;

public class Redactor {
   private String name;
   private final String dni;
   private static int salary = 1500;

   // constructors
   public Redactor(String name, String dni, int salary) {
       this.name = name;
       this.dni = dni;
       Redactor.salary = salary;
   }
   // getters and setters

   public String getName() {
       return name;
   }
   public String getDni() {
       return dni;
   }
   public int getSalary() {
       return salary;
   }
   public void setName(String name) {
       this.name = name;
   }

    public void setSalary(int salary) {
        Redactor.salary = salary;
    }

}
