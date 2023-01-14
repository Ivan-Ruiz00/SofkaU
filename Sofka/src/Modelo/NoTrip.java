package Modelo;
import java.util.Random;
/**
 *
 * @author ivan0
 */
public class NoTrip extends ConPeso implements Datos{
    /**
     * Este es el constructor con los atributos inicializados.
     * @param nombre Nos dice el nombre o modelo de la nave.
     * @param peso nos dice cuanto pesa la nave.
     * @param empuje nos dice la fuerza que puede generar la nave con el
     * combustible.
     * @param estado nos dice si la nave está activa.
     * @param fechaDeLanzamiento nos dice en que momento fue lanzada la nave.
     * @param destino nos dice hacia que parte del universo se dirige.
     * @param combustible nos dice que sustancia química usa para empujarse.
     * @param pais nos dice que país está usando lanzando esta tecnología.
     */
    public NoTrip(String peso, String empuje, boolean estado, String fechaDeLanzamiento, String destino, String combustible, String pais, String nombre) {    
        super(peso, empuje, estado, fechaDeLanzamiento, destino, combustible, pais, nombre);
    }
    /**
     * Este es el constructor vacío.
     */
    public NoTrip() {
    }
    /**
     * Este método nos indica si la nave está viajando y tenemos conexión con
     * ella.
     * @return nos devuelve un mensaje dependiendo del estado de la nave.
     */
    @Override
    public String viajar() {
        if (this.isEstado()){
            return "La nave se encuentra viajando correctamente hacia "+super.getDestino();
        }
        return "No se ha podido establecer conexión con la nave, reintentando";
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
                    + "sigue su camino hacia "+super.getDestino();
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
        if (this.isEstado()) {
            return "Se ajustó la orbita correctamente y se mantienen las coordenadas originales";
        }
        return this.corregirOrbita(super.getDestino());
    }
    /**
     * Este método usa el método de enviarPos() para obetener los datos, si se
     * registra una velocidad promedio se podrá establecer una conexión con la
     * nave, de otra manera esto no será posible.
     * @param destino nos indica si la nave nos ha mandado datos
     * ultimamente.
     * @return nos devuelve si fue exitosa la conexión y su corrección o no.
     */
    @Override
    public String corregirOrbita(String destino) {
        if (destino!=null){
            String pos[]=this.enviarPos();
            return "Se estableció conexión con la nave y se corrigió la trayectoría "
                    +pos[0]+" unidades en el eje X y "+pos[1]+" unidades en el eje Y";
        }
        return "No se pudo establecer conexión con la nave";
    }
}
