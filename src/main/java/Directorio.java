package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class Directorio implements FileSystemComponent{
    private String nombre;
    private List<FileSystemComponent> componentes;

    public Directorio(String nombre) {
        this.nombre = nombre;
        componentes = new ArrayList<>();
    }
    @Override
    public String getName() {
        return nombre;
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent componente : componentes) {
            totalSize += componente.getSize();
        }
        return totalSize;
    }

    public void addComponent(FileSystemComponent componente) {
        componentes.add(componente);
    }

    public void removeComponent(FileSystemComponent componente) {
        componentes.remove(componente);
    }
}
