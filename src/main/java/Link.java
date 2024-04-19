package src.main.java;

public class Link implements FileSystemComponent{
    private String nombre;
    private FileSystemComponent linkedComponent;

    public Link(String nombre, FileSystemComponent linkedComponent) {
        this.nombre = nombre;
        this.linkedComponent = linkedComponent;
    }


    @Override
    public String getName() {
        return nombre;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
