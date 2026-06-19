public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private int ocupacion;
    private int capacidadMaxima;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(int ocupacion) {
        if (ocupacion >= 0 && ocupacion <= capacidadMaxima) {
            this.ocupacion = ocupacion;
        } else {
            System.out.println("Ocupacion invalida.");
        }
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void mostrarInfo() {
        System.out.println("Numero: " + numero);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Ocupacion: " + ocupacion);
        System.out.println("Capacidad maxima: " + capacidadMaxima);
    }

    public void embarcar(int pasajeros) {
        if (ocupacion + pasajeros <= capacidadMaxima) {
            ocupacion += pasajeros;
            System.out.println(pasajeros + " pasajeros embarcaron.");
        } else {
            System.out.println("No hay espacio suficiente.");
        }
    }

    public void desembarcar(int pasajeros) {
        if (pasajeros <= ocupacion) {
            ocupacion -= pasajeros;
        } else {
            ocupacion = 0;
            System.out.println("No habia suficientes pasajeros. Ocupacion en 0.");
        }
    }
}