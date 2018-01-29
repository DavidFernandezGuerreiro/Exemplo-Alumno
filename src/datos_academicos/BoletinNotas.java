
package datos_academicos;

/**
 *
 * @author dfernandezguerreiro
 */
public class BoletinNotas {
    //Amosar notas metodo
    
    public void amosarNotas(){
        NotasAlumnos aux=new NotasAlumnos();
        System.out.println("Nome "+aux.getNome());
        System.out.println(" Notas "+aux.getNota());
    }
}
