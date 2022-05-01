package pe.joedayz.nio;

import java.io.Serializable;

public class Gorilla implements Serializable {

    String name;
    String specie;

    public Gorilla(String name, String specie) {
        this.name = name;
        this.specie = specie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }
}
