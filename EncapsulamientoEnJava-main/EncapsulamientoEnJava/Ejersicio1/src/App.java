public class App {
    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.setTitulo("Don Quijote");
        libro1.setAutor("Miguel de Cervantes");
        libro1.setDisponible(true);

        Libro libro2 = new Libro();
        libro2.setTitulo("Cien Años de Soledad");
        libro2.setAutor("Gabriel Garcia Marquez");
        libro2.setDisponible(true);

        libro1.mostrarInfo();
        libro1.prestar();
        libro1.prestar();
        libro1.devolver();

        System.out.println();

        libro2.mostrarInfo();
        libro2.prestar();
        libro2.devolver();
    }
}