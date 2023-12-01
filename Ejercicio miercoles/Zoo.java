
package ejercicioenclase;

/**
 *
 * @author chris
 */
public class Zoo {
    private String nombrePublico;
    private final int numeroRegistro;

    public Zoo(String nombrePublico, int numeroRegistro) {
        this.nombrePublico = nombrePublico;
        this.numeroRegistro = numeroRegistro;
    }

    public String getNombrePublico() {
        return nombrePublico;
    }

    public void setNombrePublico(String nombrePublico) {
        this.nombrePublico = nombrePublico;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void vacuna() {
        System.out.println("El animal en el zoo ha sido vacunado.");
    }

    public void comer() {
        System.out.println("El animal en el zoo esta comiendo.");
    }

    public void dormir() {
        System.out.println("El animal en el zoo esta durmiendo.");
    }
}

