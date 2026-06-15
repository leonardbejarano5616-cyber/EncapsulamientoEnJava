public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Error: El titulo no puede estar vacio.");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + disponible);
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Libro prestado.");
        } else {
            System.out.println("El libro ya esta prestado.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("Libro devuelto.");
    }
}