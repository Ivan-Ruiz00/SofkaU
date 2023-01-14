package Modelo;
/**
 *
 * @author ivan0
 */
public interface Datos {
    /**
     * Este método nos sirve para enviar imágenes de la nave hacia la tierra.
     * @param planeta nos indica de que planeta es la imágen enviada.
     * @return nos devuelve una cadena de texto indicando si el envío fue
     * exitoso.
     */
    public String enviarFotos(String planeta);
    /**
     * Este método nos permite enviar informacion hacia la tierra.
     * @param datosAEnviar nos indica los datos a enviar hacia la tierra.
     * @return nos devuelve una cadena de texto indicando si el envío de la 
     * información fue exitso.
     */
    public String enviarDatos(String datosAEnviar);
    /**
     * Este método nos permite enviar hacia la tierra la posicion de la nave
     * actualmente.
     * @return nos devuelve un array de texto con dos coordenadas X, Y.
     */
    public String[] enviarPos();
    /**
     * Este método nos permite corregir la orbita de la nave usando su
     * sobrecarga.
     * @return nos devuelve una cadena de texto diciendo si el proceso fue
     * exitoso.
     */
    public String corregirOrbita();
    /**
     * Este método nos permite corregir la orbita de la nave usando el metodo
     * de posición para saber que tan desviada se encuentra.
     * @param velocidadProm nos indica si la nave ha registrado datos hace poco.
     * @return nos devuelve una cadena de texto diciendo los ajustes que hizo y
     * si se pudo establecer conexión con la nave.
     */
    public String corregirOrbita(String velocidadProm);
}
