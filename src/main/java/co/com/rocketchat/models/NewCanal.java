package co.com.rocketchat.models;

public class NewCanal {

    String nombre;
    String tema;
    String accesibilidad;

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

    public String getAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(String accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public NewCanal(String nombre, String tema, String accesibilidad) {
        this.nombre = nombre;
        this.tema = tema;
        this.accesibilidad = accesibilidad;
    }
}
