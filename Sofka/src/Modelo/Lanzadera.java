package Modelo;
/**
 *
 * @author ivan0
 */
public class Lanzadera extends ConPeso{
    /**
     * Constructor con todos sus atributos instanciados.
     * @param nombre nos indica el nombre de la nave.
     * @param peso nos dice cuanto pesa la nave.
     * @param empuje nos dice la fuerza que puede generar la nave con el
     * combustible.
     * @param estado nos dice si la nave está activa.
     * @param fechaDeLanzamiento nos dice en que momento fue lanzada la nave.
     * @param destino nos dice hacia que parte del universo se dirige.
     * @param combustible nos dice que sustancia química usa para empujarse.
     * @param pais nos dice que país está usando lanzando esta tecnología.
     */
    public Lanzadera(String peso, String empuje, boolean estado, String fechaDeLanzamiento, String destino, String combustible, String pais, String nombre) {
        super(peso, empuje, estado, fechaDeLanzamiento, destino, combustible, pais, nombre);
    }
    /**
     * Constructor vacío
     */
    public Lanzadera() {
    }
    /**
     * Acá tenemos el método de viajar en donde se concatena el mensaje con el
     * empuje promedio de la nace.
     * @return nos devuelve una cadena de texto que nos indica si está viajando
     * o no dependiendo de su estado.
     */
    @Override
    public String viajar() {
        if (super.isEstado()){
            return "La nave se encuentra volando con un empuje de "+super.getEmpuje();
        }
        return "No se pudo establecer contacto con la nave, reintentando...";
    }
    /**
     * Este método nos muestra el estado de la nave con base en su valor
     * boolean.
     * @return nos devuelve una cadena de texto diciendo si está activa o no la
     * nave.
     */
    @Override
    public String mostrarEstado() {
        if (this.isEstado()){
            return "La nave se encuentra en conexión, sus coordenadas son las adecuadas y "
                    + "sigue su ascenso con un empuje de "+super.getEmpuje()+" Toneladas";
        }
        return "La nave se encuentra inactiva";
    }
    
}
