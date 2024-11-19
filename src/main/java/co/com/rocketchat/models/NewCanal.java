package co.com.rocketchat.models;

public class NewCanal {

    String nombre;
    String tema;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }


    public NewCanal(String nombre, String tema) {
        this.nombre = nombre;
        this.tema = tema;
    }
}
