package ejercicioenclase;

/**
 *
 * @author chris
 */
public class Personas {

    public String nombre;
    public int edad;
    private final String cedula;

    public Personas(String nombre, int edad, String cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public void comer() {
        System.out.println("La persona esta comiendo.");
    }

    public void dormir() {
        System.out.println("La persona esta durmiendo.");
    }

    public String getCedula() {
        return cedula;
    }
}
