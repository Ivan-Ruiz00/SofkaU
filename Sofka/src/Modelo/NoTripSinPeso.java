package Modelo;
import java.util.Random;
/**
 *
 * @author ivan0
 */
public class NoTripSinPeso extends Nave implements Datos{
    /**
    * Acá encontramos los atributos de la clase, lo que nos dice que 
    * características tiene una nave
    */
    private String empuje, velocidadProm;
    /**
     * Acá tenemos un constructor con todos sus atributos instanciados.
     * @param nombre nos dice el nombre de la nave.
     * @param empuje nos dice con que fuerza se puede mover la nave
     * @param velocidadProm nos dice la vel promedio a la que viaja la nave.
     * @param estado nos dice si la nave está activa.
     * @param fechaDeLanzamiento nos dice en que momento fue lanzada la nave.
     * @param destino nos dice hacia que parte del universo se dirige.
     * @param combustible nos dice que sustancia química usa para empujarse.
     * @param pais nos dice que país está usando lanzando esta tecnología.
     */
    public NoTripSinPeso(String empuje, String velocidadProm, boolean estado, String fechaDeLanzamiento, String destino, String combustible, String pais, String nombre) {    
        super(estado, fechaDeLanzamiento, destino, combustible, pais, nombre);
        this.empuje=empuje;
        this.velocidadProm = velocidadProm;
    }
    /**
     * Acá tenemos el constructor vacío
     */
    public NoTripSinPeso() {
        empuje=null;
        velocidadProm=null;
    }
    /**
     * Acá tenemos el getter de empuje.
     * @return nos devuelve la fuerza con la que se propulsa la nave.
     */
    public String getEmpuje() {
        return empuje;
    }
    /**
     * Acá tenemos el setter de empuje.
     * @param empuje nos indica la fuerza con la que se propulsa la nave.
     */
    public void setEmpuje(String empuje) {
        this.empuje = empuje;
    }
    /**
     * Acá tenemos el getter de la velocidad promedio.
     * @return nos devuleve la velocidad promedio con la que se mueve la nave
     * en el espacio.
     */
    public String getVelocidadProm() {
        return velocidadProm;
    }
    /**
     * Acá tenemos el setter de la velocidad promedio.
     * @param velocidadProm nos indica que velocidad promedio con la que se
     * mueve la nave en el espacio.
     */
    public void setVelocidadProm(String velocidadProm) {
        this.velocidadProm = velocidadProm;
    }
    /**
     * Acá tenemos el método de viajar en donde se concatena el mensaje con la 
     * velocidad promedio de la nave.
     * @return nos devuelve una cadena de texto que nos indica si está viajando
     * o no dependiendo de su estado.
     */
    @Override
    public String viajar() {
        if (this.isEstado()){
            return "La nave se encuentra viajando con una velocidad promedio de "+
                    this.getVelocidadProm();
        }
        return "La nave se encuentra inactiva";
    }
    /**
     * Acá tenemos el método que nos mostrará el estado de la nave basado en
     * su estado.
     * @return nos devuelve una cadena de texto indicando su estado.
     */
    @Override
    public String mostrarEstado() {
        if (this.isEstado()){
            return "La nave se encuentra activa con una velocidad promedio de "+
                    this.getVelocidadProm()+" su posición es correcta y constantemente "
                    + "monitoreada";
        }
        return "La nave se encuentra inactiva, no conocemos su posición actual, intentando reconectar";
    }
    /**
     * Con este método concatenamos el mensaje se envió una foto con el 
     * parámentro planeta.
     * @param planeta nos indica de qué planeta es la foto
     * @return nos devuelve la cadena de caracteres concatenada
     */
    @Override
    public String enviarFotos(String planeta) {
        return "Se envió una foto del planeta: "+planeta+" exitosamente hacia la tierra";
    }
    /**
     * Con este método concatenamos los datos a enviar con el mensaje de exito.
     * @param datosAEnviar nos indica los datos que la persona quiere enviar.
     * @return nos devuelve una cadena de caraceteres con la información
     * concatenada.
     */
    @Override
    public String enviarDatos(String datosAEnviar) {
        return "se enviaron los datos \""+datosAEnviar+"\" con exito hacia la tierra";
    }
    /**
     * Con este método enviamos la posición en X y en Y de la nave actualmente,
     * dependiendo del estado de la nave, cuando está inactiva se generan
     * coordenadas aleatorias para la posición X y Y.
     * @return nos devuelve un array de dos posiciones con valores para saber su
     * ubicación actual.
     */
    @Override
    public String[] enviarPos() {
        Random rand= new Random();
        String [] pos= new String[2];
        if (super.isEstado()){
            pos[0]="0";
            pos[1]="0";
            return pos;
        }
        pos[0]=""+rand.nextInt(50)+1;
        pos[1]=""+rand.nextInt(50)+1;
        return pos;
    }
    /**
     * Este método usa su sobre carga para ajustar la orbita con base en lo
     * arrojado por la posición.
     * @return una cadena de texto que nos dice si bue exitosa la corrección
     * del trayecto de la nave.
     */
    @Override
    public String corregirOrbita() {
        if (super.isEstado()) {
            return "Se ajustó la orbita correctamente y se mantienen las coordenadas originales";
        }
        return this.corregirOrbita(this.getVelocidadProm());
    }
    /**
     * Este método usa el método de enviarPos() para obetener los datos, si se
     * registra una velocidad promedio se podrá establecer una conexión con la
     * nave, de otra manera esto no será posible.
     * @param velocidadProm nos indica si la nave nos ha mandado datos
     * ultimamente.
     * @return nos devuelve si fue exitosa la conexión y su corrección o no.
     */
    @Override
    public String corregirOrbita(String velocidadProm) {
        if (velocidadProm!=null){
            String pos[]=this.enviarPos();
            return "Se estableció conexión con la nave y se corrigió la trayectoría "
                    +pos[0]+" unidades en el eje X y "+pos[1]+" unidades en el eje Y";
        }
        return "No se pudo establecer conexión con la nave";
    }   
}