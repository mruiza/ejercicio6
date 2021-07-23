package model;

public class GoogleTraductorModel {
    private String origen;
    private String destino;
    private String palabra;
    private String palabra_esp;

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra_esp() {
        return palabra_esp;
    }

    public void setPalabra_esp(String palabra_esp) {
        this.palabra_esp = palabra_esp;
    }
}
