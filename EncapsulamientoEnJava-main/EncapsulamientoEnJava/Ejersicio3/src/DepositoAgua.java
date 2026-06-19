public class DepositoAgua {

    private double capacidad;
    private double volumenActual;
    private DepositoAgua depositoDesborde;

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        if (capacidad > 0) {
            this.capacidad = capacidad;
        } else {
            System.out.println("La capacidad debe ser mayor que cero.");
        }
    }

    public double getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(double volumenActual) {
        this.volumenActual = volumenActual;
    }

    public DepositoAgua getDepositoDesborde() {
        return depositoDesborde;
    }

    public void setDepositoDesborde(DepositoAgua depositoDesborde) {
        this.depositoDesborde = depositoDesborde;
    }

    public void mostrarEstado() {
        System.out.println("Capacidad: " + capacidad + " L");
        System.out.println("Volumen actual: " + volumenActual + " L");
        System.out.println("Espacio libre: " + (capacidad - volumenActual) + " L");
    }

    public void agregarAgua(double cantidad) {

        volumenActual += cantidad;

        if (volumenActual > capacidad) {

            double sobrante = volumenActual - capacidad;
            volumenActual = capacidad;

            System.out.println("Deposito lleno. Sobrante: " + sobrante + " L");

            if (depositoDesborde != null) {
                depositoDesborde.agregarAgua(sobrante);
            } else {
                System.out.println("No existe deposito de desborde.");
            }
        }
    }

    public void quitarAgua(double cantidad) {

        if (cantidad <= volumenActual) {
            volumenActual -= cantidad;
        } else {
            volumenActual = 0;
            System.out.println("No habia suficiente agua. Deposito vaciado.");
        }
    }
}