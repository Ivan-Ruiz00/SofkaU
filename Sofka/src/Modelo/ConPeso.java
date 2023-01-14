package Modelo;
/**
 *
 * @author ivan0
 */
public abstract class ConPeso extends Nave{
    /**
    * Acá encontramos los atributos de la clase, lo que nos dice que 
    * características tiene una nave con peso
    */
    private String peso;
    private String empuje;
    /**
     * Constructor con todos sus atributos instanciados.
     * @param nombre nos dice el nombre de la nave.
     * @param peso nos dice cuanto pesa la nave.
     * @param empuje nos dice la fuerza que puede generar la nave con el
     * combustible.
     * @param estado nos dice si la nave está activa.
     * @param fechaDeLanzamiento nos dice en que momento fue lanzada la nave.
     * @param destino nos dice hacia que parte del universo se dirige.
     * @param combustible nos dice que sustancia química usa para empujarse.
     * @param pais nos dice que país está usando lanzando esta tecnología.
     */
    public ConPeso(String peso, String empuje, boolean estado, String fechaDeLanzamiento, String destino, String combustible, String pais, String nombre) {    
        super(estado, fechaDeLanzamiento, destino, combustible, pais, nombre);
        this.peso=peso;
        this.empuje = empuje;
    }
    /**
     * Constructor vacío
     */
    public ConPeso() {
        peso=null;
        empuje=null;
    }
    /**
     * Este método nos permite obetner el peso de la nave.
     * @return Nos devuelve una cadena de texto con el peso de la nave.
     */
    public String getPeso() {
        return peso;
    }
    /**
     * Este método nos permite modificar el peso de la nave.
     * @param peso nos idica el peso nuevo de la nave.
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }
    /**
     * Este método nos permite obtener el empuje de la nave.
     * @return nos devuelve una cadena de texto con el empuje de la nave.
     */
    public String getEmpuje() {
        return empuje;
    }
    /**
     * Este método nos permite modificar el empuje de la nave.
     * @param empuje nos indica el empuje nuevo que se le asignará a la nave.
     */
    public void setEmpuje(String empuje) {
        this.empuje = empuje;
    }
    
}
