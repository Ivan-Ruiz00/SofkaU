package Modelo;
import java.util.Random;
/**
 *
 * @author ivan0
 */
public class Tripulada extends ConPeso{
    private String tarea,altura;
    /**
     * Constructor con sus atributos inicializados.
     * @param nombre Nos dice el nombre o módelo de la nave.
     * @param tarea nos dice el propósito de la nave.
     * @param altura nos dice a que altura se encuantra en la orbita.
     * @param peso nos dice cuanto pesa la nave.
     * @param empuje nos dice la fuerza que puede generar la nave con el
     * combustible.
     * @param estado nos dice si la nave está activa.
     * @param fechaDeLanzamiento nos dice en que momento fue lanzada la nave.
     * @param destino nos dice hacia que parte del universo se dirige.
     * @param combustible nos dice que sustancia química usa para empujarse.
     * @param pais nos dice que país está usando lanzando esta tecnología.
     */
    public Tripulada(String tarea, String altura, String peso, String empuje, boolean estado, String fechaDeLanzamiento, String destino, String combustible, String pais, String nombre) {    
        super(peso, empuje, estado, fechaDeLanzamiento, destino, combustible, pais, nombre);
        this.tarea=tarea;
        this.altura = altura;
    }
    /**
     * Constructor vacío
     */
    public Tripulada() {
        tarea=null;
        altura=null;
    }
    /**
     * Este método nos permite saber la tarea que va a realizar la nave.
     * @return nos devuelve la tarea que la nave va a hacer en el espacio.
     */
    public String getTarea() {
        return tarea;
    }
    /**
     * Este método nos permite módificar la tarea que va a realizar la nave.
     * @param tarea nos indica la tarea que la nave realizará.
     */
    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
    /**
     * Este método nos permite obtener la altura de la nave con respecto a la
     * tierra.
     * @return nos devuelve la altura de la nave en la orbita.
     */
    public String getAltura() {
        return altura;
    }
    /**
     * Este método nos permite modificar la altura de la nave con respecto a la
     * tierra.
     * @param altura nos indica la altura de la nave en la orbita. 
     */
    public void setAltura(String altura) {
        this.altura = altura;
    }
    /**
     * Este método nos concatena un mensaje con la tarea que se va a realizar
     * @return nos devuelve una cadena de texto que nos dice que la nave está
     * viajando a realizar su tarea
     */
    @Override
    public String viajar() {
        if (super.isEstado()){
            return "La nave se encuentra en viaje a realizar "+this.getTarea();
        }
        return "La nave se encuentra inactiva";
    }
    /**
     * Este método nos muestra el estado de la nave con respecto a un valor
     * booleano
     * @return nos devuelve si está activa o no con respecto al valor logico del
     * estado
     */
    @Override
    public String mostrarEstado() {
        if (super.isEstado()){
            return "La nave se encuentra activa a una altura de "+this.getAltura()+
                    " realizando "+this.getTarea()+" correctamente";
        }
        return "No es posible hacer conexión con la nave, intentando reconectar...";
    }
    /**
     * Este método usa su sobrecarga para generar una cadena de texto en donde
     * ajusta la trayectoria de la nave, con números aleatorios.
     * @return Devuelve una cadena de texto con coordenadas aleatorias y
     * diciendo que se corrigió.
     */
    public String corregirOrbita(){
        Random rand= new Random();
        return this.corregirOrbita(""+rand.nextInt(10)+1,""+rand.nextInt(10)+1);
    }
    /**
     * Este método recibe dos parámetros tipo String
     * @param posX nos indica las unidades a corregir en el eje X
     * @param posY nos indica las unidades a corregir en el eje Y
     * @return nos devuelve una cadena de texto indicando que se corrigió la
     * trayectoria de la nave con base en los parámetros ingresados
     */
    private String corregirOrbita(String posX,String posY){
        return "la orbita de la nave se corrigió desplazandola "+posX+" unidades"
                + " en X y "+posY+" en Y";
    }
}
