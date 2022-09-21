public class App {
    public static void main(String[] args) throws Exception {
      Persona persona = new Persona();  
      persona.setEdad("20");

      String edad = persona.getEdad();
      System.out.println(edad);

      persona.setNombre("Antonio");

      String nombre = persona.getNombre();
      System.out.println(nombre);

      persona.setTelefono("612345678");

      String telefono = persona.getTelefono();
      System.out.println(telefono);
    }
}

class Persona{
    private String edad;
   
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public String getEdad() {
        return this.edad;
    }

    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    private String telefono;

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return this.telefono;
    }



}