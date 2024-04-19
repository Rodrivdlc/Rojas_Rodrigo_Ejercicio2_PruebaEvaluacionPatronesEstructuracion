package src.main.java;

public class Fichero implements FileSystemComponent{
    private String nombre;
    private int size;

    public Fichero(String nombre, int size) {
        this.nombre = nombre;
        this.size = size;
    }


    @Override
    public String getName() {
        return nombre;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
