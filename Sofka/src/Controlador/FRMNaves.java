package Controlador;
import Vista.*;
import Modelo.*;
import java.util.ArrayList;
/**
 *
 * @author ivan0
 */
public class FRMNaves {
    private final UINaves ven=new UINaves();
    private final ArrayList<Lanzadera> lanz=new ArrayList<>();
    private final ArrayList<NoTripSinPeso> noTripSinPeso=new ArrayList<>();
    private final ArrayList<NoTrip> noTrip=new ArrayList<>();
    private final ArrayList<Tripulada> trip=new ArrayList<>();
    /**
     * Este método nos permite mostrar un menú al usuario para que pueda usar el
     * programa y así mismo cree, elimine, consulte naves y pueda salir del
     * programa.
     */
    public int menu(){
        switch (this.getVen().menu()){
            case 0: this.creacionNaves();
                    return 0;
            case 1: this.consultarNaves();
                    return 1;
            case 2: this.eliminarNave();
                    return 2;
            case 3: return 3;
            default:
                return 10;
        }
    }
    public void eliminarNave(){
        String nombre=this.getVen().preguntaNombre();
        boolean encontrado = false;
        for(Lanzadera l : lanz){
            if(l.getNombre().equalsIgnoreCase(nombre)){
                lanz.remove(l);
                this.getVen().eliminado();
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            for(NoTrip nt : noTrip){
            if(nt.getNombre().equalsIgnoreCase(nombre)){
                noTrip.remove(nt);
                this.getVen().eliminado();
                encontrado = true;
                break;
                }
            }
        }
        if(!encontrado){
            for(NoTripSinPeso ntsp : noTripSinPeso){
            if(ntsp.getNombre().equalsIgnoreCase(nombre)){
                noTripSinPeso.remove(ntsp);
                this.getVen().eliminado();
                encontrado = true;
                break;
                }
            }
        }
        if(!encontrado){
            for(Tripulada t : trip){
            if(t.getNombre().equalsIgnoreCase(nombre)){
                trip.remove(t);
                this.getVen().eliminado();
                encontrado = true;
                break;
                }
            }
        }
        if(!encontrado){
            this.getVen().noEncontrada();
        }
    }
    /**
     * Este método nos permite usar el objeto UINaves.
     * @return nos devuelve el objeto para poder usar sus métodos.
     */
    public UINaves getVen() {
        return ven;
    }
    /**
     * Este método nos permite acceder a las naves lanzaderas.
     * @return nos devuelve un arraylist de las naves lanzaderas.
     */
    public ArrayList<Lanzadera> getLanz() {
        return lanz;
    }
    /**
     * Este método nos permite acceder a las naves no tripuladas sin peso.
     * @return nos devuelve un arraylist de las naves no tripuladas sin peso.
     */
    public ArrayList<NoTripSinPeso> getNoTripSinPeso() {
        return noTripSinPeso;
    }
    /**
     * Este método nos permite acceder a las naves no tripuladas.
     * @return nos devuelve un arraylist de las naves no tripuladas.
     */
    public ArrayList<NoTrip> getNoTrip() {
        return noTrip;
    }
    /**
     * Este método nos permite acceder a las naves tripuladas.
     * @return nos devuelve un arraylist de las naves tripuladas.
     */
    public ArrayList<Tripulada> getTrip(){
        return trip;
    }
    /**
     * Este método nos permite mostrarle al usuario las naves que tenemos por 
     * cada tipo de estas
     */
    public void tipoNave(){
        String naves="";
        switch (this.getVen().tipoNave()) {
            case 0: for(int i=0;i<lanz.size();i++){
                            naves+=(i+1)+". "+lanz.get(i).getNombre()+"\n";
                    }
                    break;
            case 1: for(int i=0;i<noTripSinPeso.size();i++){
                            naves+=(i+1)+". "+noTripSinPeso.get(i).getNombre()+"\n";
                    }
                    break;
            case 2: for(int i=0;i<noTrip.size();i++){
                            naves+=(i+1)+". "+noTrip.get(i).getNombre()+"\n";
                    }
                    break;
            case 3: for(int i=0;i<trip.size();i++){
                            naves+=(i+1)+". "+trip.get(i).getNombre()+"\n";
                    }
                    break;
            default:
                throw new AssertionError();
        }
        this.getVen().imprimirNaves(naves);
    }
    /**
     * Este método nos permite buscar por pais y mostrarlo al usuario.
     * @param pais nos dice el pais de la nave que el usuario desea buscar.
     */
    public void porPais(String pais){
        ArrayList<String> resultados = new ArrayList<>();
        for (Lanzadera l : lanz) {
            if (l.getPais().equalsIgnoreCase(pais)) {
                //Aquí se puede guardar la nave encontrada en un ArrayList de resultados
                resultados.add("Lanzadera: " + l.getNombre());
            }
        }
        for (NoTrip nt : noTrip) {
            if (nt.getPais().equalsIgnoreCase(pais)) {
                //Aquí se puede guardar la nave encontrada en un ArrayList de resultados
                resultados.add("No tripulada: " + nt.getNombre());
            }
        }
        for (NoTripSinPeso ntsp : noTripSinPeso) {
            if (ntsp.getPais().equalsIgnoreCase(pais)) {
                //Aquí se puede guardar la nave encontrada en un ArrayList de resultados
                resultados.add("No tripulada sin peso: " + ntsp.getNombre());
            }
        }
        for (Tripulada t : trip) {
            if (t.getPais().equalsIgnoreCase(pais)) {
                //Aquí se puede guardar la nave encontrada en un ArrayList de resultados
                resultados.add("Tripulada: " + t.getNombre());
            }
        }
        if(resultados.isEmpty()) {
            this.getVen().noEncontrada();
        }else {
            String resultado = "";
            int i = 1;
            for (String nave : resultados) {
                resultado+=i+". "+nave+"\n";
                i++;
            }
            this.getVen().imprimirNaves(resultado);
        }
    }
    /**
     * Este método nos permite buscar por destino y mostrarlo al usuario.
     * @param destino nos dice el pais de la nave que el usuario desea buscar.
     */
    public void porDestino(String destino){
        ArrayList<String> resultados = new ArrayList<>();
        for (Lanzadera l : lanz) {
            if (l.getDestino().equalsIgnoreCase(destino)) {
                //Aquí se puede guardar la nave encontrada en un ArrayList de resultados
                resultados.add("Lanzadera: "+l.getNombre());
            }
        }
        for (NoTrip nt : noTrip) {
            if (nt.getDestino().equalsIgnoreCase(destino)) {
                //Aquí se puede guardar la nave encontrada en un ArrayList de resultados
                resultados.add("No tripulada: "+nt.getNombre());
            }
        }
        for (NoTripSinPeso ntsp : noTripSinPeso) {
            if (ntsp.getDestino().equalsIgnoreCase(destino)) {
                //Aquí se puede guardar la nave encontrada en un ArrayList de resultados
                resultados.add("No tripulada sin peso: "+ntsp.getNombre());
            }
        }
        for (Tripulada t : trip) {
            if (t.getDestino().equalsIgnoreCase(destino)) {
                //Aquí se puede guardar la nave encontrada en un ArrayList de resultados
                resultados.add("Tripulada: "+t.getNombre());
            }
        }
        if(resultados.isEmpty()) {
            this.getVen().noEncontrada();
        }else {
            String resultado = "";
            int i = 1;
            for (String nave : resultados) {
                resultado+=i+". "+nave+"\n";
                i++;
            }
            this.getVen().imprimirNaves(resultado);
        }
    }
    /**
     * Este método nos permite buscar por nombre y mostrarlo al usuario.
     * @param nombre nos dice el nombre de la nave que el usuario desea buscar.
     */
    public void porNombre(String nombre){
        boolean encontrado = false;
        for(Lanzadera l : lanz){
            if(l.getNombre().equalsIgnoreCase(nombre)){
                this.getVen().mostrarNaveLanz(l);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            for(NoTrip nt : noTrip){
            if(nt.getNombre().equalsIgnoreCase(nombre)){
                encontrado = true;
                break;
                }
            }
        }
        if(!encontrado){
            for(NoTripSinPeso ntsp : noTripSinPeso){
            if(ntsp.getNombre().equalsIgnoreCase(nombre)){
                encontrado = true;
                break;
                }
            }
        }
        if(!encontrado){
            for(Tripulada t : trip){
            if(t.getNombre().equalsIgnoreCase(nombre)){
                encontrado = true;
                break;
                }
            }
        }
        if(!encontrado){
            this.getVen().noEncontrada();
        }
    }
    
    /**
     * Este método controla los tipos de busquedas que tiene el usuario.
     */
    public void consultarNaves(){
        switch(this.getVen().tipoBusqueda()){
            case 0: this.tipoNave();
                    break;
            case 1: this.porNombre(this.getVen().preguntaNombre());
                    break;
            case 2: this.porPais(this.getVen().preguntaPais());
                    break;
            case 3: this.porDestino(this.getVen().preguntaDestino());
                    break;
            default:
                break;
        }
    }
    /**
     * Este método nos permite crear las naves con la primera opción del menú.
     */
    public void creacionNaves(){
        String[] nuevaNave=new String[8];
        switch (this.getVen().tipoNave()) {
                    case 0: nuevaNave=this.getVen().creacionLanzadera();
                            if(nuevaNave[2].equalsIgnoreCase("Activa")){
                                this.getLanz().add(new Lanzadera(nuevaNave[0],nuevaNave[1],true,nuevaNave[3],nuevaNave[4],nuevaNave[5],nuevaNave[6],nuevaNave[7]));
                            }else{
                                this.getLanz().add(new Lanzadera(nuevaNave[0],nuevaNave[1],false,nuevaNave[3],nuevaNave[4],nuevaNave[5],nuevaNave[6],nuevaNave[7]));
                            }
                            this.getVen().mostrarNaveLanz(this.getLanz().get(this.getLanz().size()-1));
                            this.menu();
                            break;
                    case 1: nuevaNave=this.getVen().creacionNoTripSinPeso();
                            if(nuevaNave[2].equalsIgnoreCase("Activa")){
                                this.getNoTripSinPeso().add(new NoTripSinPeso(nuevaNave[0],nuevaNave[1],true,nuevaNave[3],nuevaNave[4],nuevaNave[5],nuevaNave[6],nuevaNave[7]));
                            }else{
                                this.getNoTripSinPeso().add(new NoTripSinPeso(nuevaNave[0],nuevaNave[1],false,nuevaNave[3],nuevaNave[4],nuevaNave[5],nuevaNave[6],nuevaNave[7]));
                            }
                            this.getVen().mostrarNaveNoTripSinPeso(this.getNoTripSinPeso().get(this.getNoTripSinPeso().size()-1));
                            break;
                    case 2: nuevaNave=this.getVen().creacionNoTrip();
                            if(nuevaNave[2].equalsIgnoreCase("Activa")){
                                this.getNoTrip().add(new NoTrip(nuevaNave[0],nuevaNave[1],true,nuevaNave[3],nuevaNave[4],nuevaNave[5],nuevaNave[6],nuevaNave[7]));
                            }else{
                                this.getNoTrip().add(new NoTrip(nuevaNave[0],nuevaNave[1],false,nuevaNave[3],nuevaNave[4],nuevaNave[5],nuevaNave[6],nuevaNave[7]));
                            }
                            this.getVen().mostrarNaveNoTrip(this.getNoTrip().get(this.getNoTrip().size()-1));
                            break;
                    case 3: nuevaNave=this.getVen().creacionTrip();
                            if(nuevaNave[4].equalsIgnoreCase("Activa")){
                                this.getTrip().add(new Tripulada(nuevaNave[0],nuevaNave[1],nuevaNave[2],nuevaNave[3],true,nuevaNave[5],nuevaNave[6],nuevaNave[7],nuevaNave[8],nuevaNave[9]));
                            }else{
                                this.getTrip().add(new Tripulada(nuevaNave[0],nuevaNave[1],nuevaNave[2],nuevaNave[3],false,nuevaNave[5],nuevaNave[6],nuevaNave[7],nuevaNave[8],nuevaNave[9]));
                            }
                            this.getVen().mostrarNaveTrip(this.getTrip().get(this.getTrip().size()-1));
                            break;
                    }
    }
}
