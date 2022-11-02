public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad=30;
        cliente.telefono=612345678;
        cliente.nombre="Antonio";
        cliente.credito=1000;
        Trabajador trabajador = new Trabajador();
        trabajador.edad=35;
        trabajador.telefono=687654321;
        trabajador.nombre="Juan";
        trabajador.salario=2300;
        System.out.println (cliente.nombre);


    }
    class Persona {
        int edad;
        String nombre;
        int telefono;
    }
    class Cliente extends Persona {
        int credito;
    }
    class Trabajador extends Persona {
        int salario;
    }
}
