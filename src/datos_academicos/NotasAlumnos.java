
package datos_academicos;

/**
 *
 * @author dfernandezguerreiro
 */
public class NotasAlumnos {
    String nome;
    private float nota;

    public NotasAlumnos() {
    }

    public NotasAlumnos(String nome, float nota) {
        this.nome=nome;
        this.nota=nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota=nota;
    }

    @Override
    public String toString() {
        return "Nome = "+nome+", nota = "+nota;
    }
    
    
    
    
}
