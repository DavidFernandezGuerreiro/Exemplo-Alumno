
package datos_persoais;

/**
 *
 * @author dfernandezguerreiro
 */
public class DatosAlumnos {
    String nome;
    public String telefono;

    public DatosAlumnos(String nome, String telefono) {
        this.nome=nome;
        this.telefono=telefono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono=telefono;
    }

    @Override
    public String toString() {
        return "Nome = "+nome+", telefono = "+telefono;
    }
    
    
}
