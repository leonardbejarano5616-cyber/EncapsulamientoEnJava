public class App {

    public static void main(String[] args) {

        DepositoAgua deposito1 = new DepositoAgua();
        deposito1.setCapacidad(100);

        DepositoAgua deposito2 = new DepositoAgua();
        deposito2.setCapacidad(50);

        deposito1.setDepositoDesborde(deposito2);

        deposito1.agregarAgua(130);

        System.out.println("\nEstado Deposito 1");
        deposito1.mostrarEstado();

        System.out.println("\nEstado Deposito 2");
        deposito2.mostrarEstado();

        deposito1.quitarAgua(40);

        System.out.println("\nEstado final Deposito 1");
        deposito1.mostrarEstado();
    }
}