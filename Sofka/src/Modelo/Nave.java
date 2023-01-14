package Modelo;
/**
 *
 * @author ivan0
 */
public abstract class Nave {
    /**
    * Acá encontramos los atributos de la clase, lo que nos dice que 
    * características tiene una nave.
    */
    private boolean estado;
    private String fechaDeLanzamiento, destino, combustible, pais,nombre;
    /**
     * Acá tenemos un constructor con todos sus atributos instanciados.
     * @param nombre nos dice el modelo o nombre de la nave.
     * @param estado nos dice si la nave está activa.
     * @param fechaDeLanzamiento nos dice en que momento fue lanzada la nave.
     * @param destino nos dice hacia que parte del universo se dirige.
     * @param combustible nos dice que sustancia química usa para empujarse.
     * @param pais nos dice que país está usando lanzando esta tecnología.
     */
    public Nave(boolean estado, String fechaDeLanzamiento, String destino, String combustible, String pais, String nombre){    
        this.estado=estado;
        this.fechaDeLanzamiento=fechaDeLanzamiento;
        this.destino=destino;
        this.combustible=combustible;
        this.pais=pais;
        this.nombre = nombre;
    }
    /**
     * Acá tenemos el constructor vacío
     */
    public Nave() {
        nombre=null;
        estado=false;
        fechaDeLanzamiento=null;
        destino=null;
        combustible=null;
        pais=null;
    }
    /**
    * Este es un método abstracto el cual no recibe parámetros.
    * @return retorna en una cadena de texto la forma en la que cada nave viaja 
    * a través del espacio.
    */
    public abstract String viajar();
    /**
     * Este es un método abstracto el recibe un parámetro.
     * @return retorna una cadena de texto la cual nos indica si está activo y 
     * en ciertos caso más información.
     */
    public abstract String mostrarEstado();
    /**
     * Acá tenemos el getter de estado.
     * @return nos devuelve false o true dependiendo su valor lógico
     */
    public boolean isEstado() {
        return estado;
    }
    /**
     * Acá tenemos el setter de estado.
     * @param estado nos recibe el parametro de estado, así sabemos si está
     * activa la nave, o no.
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    /**
     * Acá tenemos el getter de fecha de lanzamiento, nos dice en que fecha
     * fue lanzada la nave al espacio.
     * @return nos devuelve la fecha de lanzamiento de la nave.
     */
    public String getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }
    /**
     * Aca tenemos el setter de la fecha de lanzamiento.
     * @param fechaDeLanzamiento nos indica en que fecha se lanzó la nave.
     */
    public void setFechaDeLanzamiento(String fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
    /**
     * Acá tenemos el getter del destino.
     * @return nos devuelve el destino al que la nave se dirige.
     */
    public String getDestino() {
        return destino;
    }
    /**
     * Acá tenemos el setter del destino.
     * @param destino nos indica el destino de la nave.
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }
    /**
     * Acá tenemos el getter del combustible.
     * @return nos devuelve la sustancia química que empuja la nave
     */
    public String getCombustible() {
        return combustible;
    }
    /**
     * Acá tenemos el setter del combustible.
     * @param combustible nos indica que sustancia química usa la nave para su
     * empuje.
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    /**
     * Acá tenemos el getter del país.
     * @return nos devuelve el país dueño de la nave lanzada.
     */
    public String getPais() {
        return pais;
    }
    /**
     * Acá tenemos el setter del país.
     * @param pais nos indica el país dueño de la nave.
     */
    public void setPais(String pais) {
        this.pais = pais;
    }
    /**
     * Este método nos permite obtener el nombre de la nave.
     * @return Devuleve el nombre o módelo de la nave.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Este método nos permite modificar el nombre de la nave.
     * @param nombre Nos indica el nombre de la nave.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
