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
        
        System.out.println ("El cliente " + cliente.nombre + " tiene " + cliente.edad + " años, su teléfono es " + cliente.telefono + " y tiene un crédito de " + cliente.credito + " €." );
        System.out.println ("El trabajador " + trabajador.nombre + " tiene " + trabajador.edad + " años, su teléfono es " + trabajador.telefono + " y tiene un salario de " + trabajador.salario + " €." );
    }
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
