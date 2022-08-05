public class SegundaParte {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.añadirPuerta();
        System.out.println(miCoche.puertas);
    }
}

class Coche {
    public int puertas = 3;
    public void añadirPuerta() {
        this.puertas++;
    }
}
