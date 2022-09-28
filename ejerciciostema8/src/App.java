public class App {
    public static void main(String[] args) throws Exception {
      Persona persona = new Persona();  
      persona.setEdad(20);

      int edad = persona.getEdad();
      System.out.println("Tengo " + edad + " años");

      persona.setNombre("Antonio");

      String nombre = persona.getNombre();
      System.out.println("Me llamo " + nombre);

      persona.setTelefono(612345678);

      int telefono = persona.getTelefono();
      System.out.println("Mi teléfono es " + telefono);
    }
}

class Persona{
    private int edad;
   
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    private int telefono;

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }
}