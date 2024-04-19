package src.main.java;

public class Main {
    public static void main(String[] args) {
        Fichero fichero1 = new Fichero("fichero1.txt", 20);
        Fichero fichero2 = new Fichero("fichero2.txt", 10);

        Link link = new Link("link_to_file1", fichero1);

        Directorio directorio = new Directorio("directorio1");
        directorio.addComponent(fichero1);
        directorio.addComponent(fichero2);
        directorio.addComponent(link);

        int tamanioDirectorio = directorio.getSize();

        System.out.println("Tamaño del directorio: " + tamanioDirectorio);
    }
}
