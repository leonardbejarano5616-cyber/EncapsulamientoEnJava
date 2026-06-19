public class App {
    public static void main(String[] args) {

        Vuelo vuelo1 = new Vuelo();
        vuelo1.setNumero("AV9401");
        vuelo1.setOrigen("Bogota");
        vuelo1.setDestino("Medellin");
        vuelo1.setCapacidadMaxima(180);
        vuelo1.setOcupacion(100);

        Vuelo vuelo2 = new Vuelo();
        vuelo2.setNumero("LA450");
        vuelo2.setOrigen("Cali");
        vuelo2.setDestino("Cartagena");
        vuelo2.setCapacidadMaxima(150);
        vuelo2.setOcupacion(80);

        vuelo1.mostrarInfo();
        vuelo1.embarcar(50);
        vuelo1.embarcar(40);
        vuelo1.desembarcar(30);

        System.out.println();

        vuelo2.mostrarInfo();
        vuelo2.embarcar(60);
        vuelo2.desembarcar(100);
    }
}