package co.com.rocketchat.utils.constants;

public enum Constants {

    WELCOME_MESSAGE("Te damos la bienvenida a Universidad de Medellin");

    private final String description;

    Constants(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
