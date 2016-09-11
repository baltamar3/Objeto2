
package clases;

/**
 *
 * @author baltamar3
 */
public class DenominadorCeroException extends Exception{

    public DenominadorCeroException() {
        super("No se permite denominadores en cero");
        
    }
    
}
