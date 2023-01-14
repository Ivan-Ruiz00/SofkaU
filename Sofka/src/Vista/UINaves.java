package Vista;
import Modelo.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author ivan0
 */
public class UINaves {
    /**
     * Este método muestra al usuario las opciones básicas que puede escoger
     * para poder interaccionar con el programa.
     * @return Nos devuelve un entero con la opción que el usuario ha escogido.
     */
    public int menu(){
        String[] opciones={"Crear Nave","Consultar Naves","Eliminar Nave","Salir"};
        return JOptionPane.showOptionDialog(null,"Selecciona una opción","Menú de Naves",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opciones,opciones[0]);
    }
    /**
     * Este método muestra al usuario las opciones básicas que puede escoger
     * para poder buscar naves en el programa.
     * @return Nos devuelve un entero con la opción que el usuario ha escogido.
     */
    public int tipoBusqueda(){
       String[] tiposDeBusqueda={"Tipo de nave","Nombre","País","Destino"};
       return JOptionPane.showOptionDialog(null,"Selecciona una opción","Menú de Busqueda",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,tiposDeBusqueda,tiposDeBusqueda[0]);
    }    
    /**
     * Este método muestra al usuario los tipos de naves que hay para que decida
     * cual desea crear.
     * @return Nos devuelve un entero con la opción que el usuario escogió.
     */
    public int tipoNave(){
        String[] opciones = {"Nave Lanzadera", "Nave espacial no tripulada sin peso", "Nave espacial no tripulada", "Nave espacial tripulada"};
        return JOptionPane.showOptionDialog(null, "Selecciona un tipo de nave", "Menú de Naves", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
    }
    /**
     * Este método manda un meensaje al usuario de que la nave que está buscando
     * no se encontró.
     */
    public void noEncontrada(){
        JOptionPane.showMessageDialog(null, "No se han encontrado naves con esta especificación");
    }
    /**
     * Este método nos ayuda a preguntarle el nombre que busca al usuario.
     * @return nos devuelve una ventana preguntandole al usuario el nombre que
     * desea buscar.
     */
    public String preguntaNombre(){
        return JOptionPane.showInputDialog("Ingresa el nombre que deseas buscar: ");
    }
    /**
     * Este método nos ayuda a preguntarle el pais que busca al usuario.
     * @return nos devuelve una ventana preguntandole al usuario el pais que
     * desea buscar.
     */
    public String preguntaPais(){
        return JOptionPane.showInputDialog("Ingresa el pais del que deseas buscar sus naves: ");
    }
    /**
     * Este método nos ayuda a preguntarle el destino que busca al usuario.
     * @return nos devuelve una ventana preguntandole al usuario el destino que
     * desea buscar.
     */
    public String preguntaDestino(){
        return JOptionPane.showInputDialog("Ingresa el destino del que deseas buscar sus naves: ");
    }
    public void eliminado(){
        JOptionPane.showMessageDialog(null,"Se eliminó exitosamente la nave");
    }
    /**
     * Este método muestra una lista de naves al usuario.
     * @param naves contiene la lista de las naves encontradas.
     */
    public void imprimirNaves(String naves){
        JOptionPane.showMessageDialog(null, naves);
    }
    /**
     * Este método nos permite mostrar en pantalla las naves ya creadas.
     * @param nav Contiene la nave a ser mostrada hacia el usuario.
     */
    public void mostrarNaveLanz(Lanzadera nav){
        JOptionPane.showMessageDialog(null, "Nombre: "+nav.getNombre()+"\n"
                + "Peso: "+nav.getPeso()+" Toneladas\n"
                + "Empuje: "+nav.getEmpuje()+" Toneladas\n"
                + "Estado: "+nav.mostrarEstado()+"\n"
                + "Fecha de Lanzamiento: "+nav.getFechaDeLanzamiento()+"\n"
                + "Destino: "+nav.getDestino()+"\n"
                + "Combustible: "+nav.getCombustible()+"\n"
                + "País: "+nav.getPais());
    }
    /**
     * Este método nos permite mostrar en pantalla las naves ya creadas.
     * @param nav Contiene la nave a ser mostrada hacia el usuario.
     */
    public void mostrarNaveTrip(Tripulada nav){
        JOptionPane.showMessageDialog(null, "Nombre: "+nav.getNombre()+"\n"
                + "Tarea: "+nav.getTarea()+" la cual se está realizando\n"
                + "Altura: "+nav.getAltura()+" km"
                + "Peso: "+nav.getPeso()+" Toneladas\n"
                + "Empuje: "+nav.getEmpuje()+" Toneladas\n"
                + "Estado: "+nav.mostrarEstado()+"\n"
                + "Fecha de Lanzamiento: "+nav.getFechaDeLanzamiento()+"\n"
                + "Destino: "+nav.getDestino()+"\n"
                + "Combustible: "+nav.getCombustible()+"\n"
                + "País: "+nav.getPais());
    }
    /**
     * Este método nos permite mostrar en pantalla las naves ya creadas.
     * @param nav Contiene la nave a ser mostrada hacia el usuario.
     */
    public void mostrarNaveNoTripSinPeso(NoTripSinPeso nav){
        JOptionPane.showMessageDialog(null, "Nombre: "+nav.getNombre()+"\n"
                + "Velocidad promedio: "+nav.getVelocidadProm()+" Km/h\n"
                + "Empuje: "+nav.getEmpuje()+" Toneladas\n"
                + "Estado: "+nav.mostrarEstado()+"\n"
                + "Fecha de Lanzamiento: "+nav.getFechaDeLanzamiento()+"\n"
                + "Destino: "+nav.getDestino()+"\n"
                + "Combustible: "+nav.getCombustible()+"\n"
                + "País: "+nav.getPais());
    }
    /**
     * Este método nos permite mostrar en pantalla las naves ya creadas.
     * @param nav Contiene la nave a ser mostrada hacia el usuario.
     */
    public void mostrarNaveNoTrip(NoTrip nav){
        JOptionPane.showMessageDialog(null, "Nombre: "+nav.getNombre()+"\n"
                + "Peso: "+nav.getPeso()+" Toneladas\n"
                + "Empuje: "+nav.getEmpuje()+" Toneladas\n"
                + "Estado: "+nav.mostrarEstado()+"\n"
                + "Fecha de Lanzamiento: "+nav.getFechaDeLanzamiento()+"\n"
                + "Destino: "+nav.getDestino()+"\n"
                + "Combustible: "+nav.getCombustible()+"\n"
                + "País: "+nav.getPais());
    }
    /**
     * Este método nos permite crear el empuje y la velocidad promedio de las
     * naves.
     * @param pregunta Es una cadena de texto la que nos indica si es empuje o
     * velocidad promedio.
     * @param nave Es una cadena de texto que nos indica que tipo de nave es.
     * @return Nos devuleve una cadena de texto con la información del empuje o
     * velocidad promedio.
     */
    public String creacionEmpuje(String pregunta,String nave){
        boolean bandera=true;
        String x=new String();
        while(bandera){
            x=JOptionPane.showInputDialog(null,"Ingrese "+pregunta+" de la nave "+nave+":");
            if(x.isEmpty()){
                JOptionPane.showMessageDialog(null,pregunta+" no puede estar vacío.","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                try{
                    // Validar que el valor ingresado sea un número entero y mayor a 0.
                    if(Integer.parseInt(x)<=0){
                        JOptionPane.showMessageDialog(null,"El empuje no puede ser menor a 0.","Error",JOptionPane.ERROR_MESSAGE);
                    }else{
                        bandera=false;
                    }
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"El empuje debe ser un número entero.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        return x;
    }
    /**
     * Este método nos permite crear una cadena de texto la cual usarémos para 
     * el estado de la nave.
     * @param nave Nos indica de que nave preguntarémos el estado.
     * @return Nos devuelve una cadena de texto con el estado de la nave.
     */
    public String creacionEstado(String nave){
        boolean bandera=true;
        String x=new String();
        while(bandera){
            x=JOptionPane.showInputDialog(null,"Ingrese el estado de la nave "+nave+" (Activa o Inactiva):");
            if (x.isEmpty()){
                JOptionPane.showMessageDialog(null,"El estado no puede estar vacío.","Error",JOptionPane.ERROR_MESSAGE);
            } else if (!x.equalsIgnoreCase("Activa")&&!x.equalsIgnoreCase("Inactiva")){
                JOptionPane.showMessageDialog(null,"El estado solo puede ser Activa o Inactiva.","Error",JOptionPane.ERROR_MESSAGE);
            } else {
                bandera = false;
            }
        }
        return x;
    }
    /**
     * Este método nos permite crear la fecha de cualquier nave.
     * @return Nos devuelve una cadena de texto con la fecha del lanzamiento de
     * la nave.
     */
    public String creacionFecha(){
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/yyyy");
        boolean bandera=true;
        String x=new String();
        while(bandera){
            x=JOptionPane.showInputDialog(null,"Ingrese la fecha de lanzamiento (dd/MM/yyyy):");
            if(x.isEmpty()){
                JOptionPane.showMessageDialog(null,"Fecha de lanzamiento no puede estar vacío.","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                try{
                    // Validar que el valor ingresado sea una fecha
                    formatoFecha.parse(x);
                    bandera=false;
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Fecha de lanzamiento tiene un formato incorrecto, utilice (dd/MM/yyyy)","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        return x;
    }
    /**
     * Este método nos permite crear el destino para cualquier nave.
     * @return nos devuelve una cadena de texto con el destino de la nave.
     */
    public String creacionDestino(){
        boolean bandera=true;
        String x=new String();
        while(bandera){
            x=JOptionPane.showInputDialog(null,"Ingrese el destino:");
            if (x.isEmpty()){
                JOptionPane.showMessageDialog(null,"El destino no puede estar vacío.","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                bandera=false;
            }
        }
        return x;
    }
    /**
     * Este método nos permite saber cual es el país dueño de la nave por medio
     * de una lista.
     * @param paises Nos indica los paises disponibles para que el usuario elija
     * .
     * @return Nos devuelve una cadena de texto con el país que el usuario
     * escogió.
     */
    public String creacionPais(String[] paises){
        return (String)JOptionPane.showInputDialog(null,"Seleccione el país:","País",JOptionPane.QUESTION_MESSAGE,null,paises,paises[0]);
    }
    /**
     * Este método nos permite saber cual es el combustible que usa la nave por
     * medio de una lista.
     * @param combustibles Nos indican los combustibles disponibles basado en el
     * país.
     * @return Nos devuelve una cadena de texto con el combustible elegido por
     * el usuario.
     */
    public String creacionCombustible(String[] combustibles){
        return (String)JOptionPane.showInputDialog(null,"Seleccione el combustible:","Combustible",JOptionPane.QUESTION_MESSAGE,null,combustibles,combustibles[0]);
    }
    /**
     * Este método nos permite saber cual es el nombre de la nave que se está
     * creando.
     * @return devuelve una cadena de texto con el nombre de la nave,
     * proporcionada por el usuario.
     */
    public String cracionNombre(){
        boolean bandera=true;
        String x=new String();
        while(bandera){
            x=JOptionPane.showInputDialog(null,"Ingrese el nombre de la nave:");
            if (x.isEmpty()){
                JOptionPane.showMessageDialog(null,"Nombre no puede estar vacío.","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                bandera=false;
            }
        }
        return x;
    }
    /**
     * Este método nos permite saber cual es la tarea de la nave que se está
     * creando.
     * @return devuelve una cadena de texto con la tarea que la nave realizará,
     * proporcionada por el usuario.
     */
    public String creacionTarea(){
        boolean bandera=true;
        String x=new String();
        while(bandera){
            x=JOptionPane.showInputDialog(null,"Ingrese la tarea que la nave va a realizar:");
            if (x.isEmpty()){
                JOptionPane.showMessageDialog(null,"La tarea no puede estar vacío.","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                bandera=false;
            }
        }
        return x;
    }
    /**
     * Este método ayuda al usuario a crear una nave tipo No tripulada,
     * preguntando todos sus atributos al usuario, sin dejar ninguno vacío y
     * haciendo control de excepciones.
     * @return Nos devuelve un array de 7 posiciones para poder crear la nave
     * correctamente.
     */
    public String[] creacionNoTrip(){
        String[] paises={"EE.UU NASA","Rusia","Europa ESA/ASI"};
        String[] creacion=new String[8];
        String[] combustibles=new String[0];
        creacion[0]=this.creacionEmpuje("El peso","no tripulada");
        creacion[1]=this.creacionEmpuje("El empuje","no tripulada");
        creacion[2]=this.creacionEstado("no tripulada");
        creacion[3]=this.creacionFecha();
        creacion[4]=this.creacionDestino();
        creacion[6]=this.creacionPais(paises);
        combustibles=combustibleNoTrip(creacion[6]);
        creacion[5]=this.creacionCombustible(combustibles);
        creacion[7]=this.cracionNombre();
        return creacion;
    }
    /**
     * Este método nos permite obtener una lista de combustibles para crear las
     * naves.
     * @param pais Nos idica el país para ser usado como filtro para los
     * combustibles.
     * @return Devuelve un array de cadenas de texto con los combustibles
     * disponibles por país.
     */
    public String[] combustibleNoTrip(String pais){
        switch(pais){
            case "EE.UU NASA": return new String[]{"Sólido+Líquido","NO4+MMH","N2H4","NO4+N2H4+He","N(Comp)+N2H4","PuO2"};
            case "Rusia": return new String[]{"N2O4+UDMH","N2H4+Amina"};
            case "Europa ESA/ASI": return new String[]{"MMH+NO"};
        }
        return new String[0];
    }
    /**
     * Este método ayuda al usuario a crear una nave tipo No tripulada sin peso,
     * preguntando todos sus atributos al usuario, sin dejar ninguno vacío y
     * haciendo control de excepciones.
     * @return Nos devuelve un array de 8 posiciones para poder crear la nave
     * correctamente.
     */
    public String[] creacionNoTripSinPeso(){
        String[] paises={"EE.UU NASA","Rusia","Europa ESA/ASI"};
        String[] creacion=new String[8];
        String[] combustibles=new String[0];
        creacion[0]=this.creacionEmpuje("El empuje","no tripulada sin peso");
        creacion[1]=this.creacionEmpuje("La velocidad promedio","no tripulada sin peso");
        creacion[2]=this.creacionEstado("no tripulada sin peso");
        creacion[3]=this.creacionFecha();
        creacion[4]=this.creacionDestino();
        creacion[6]=this.creacionPais(paises);
        combustibles=this.combustibleNoTrip(creacion[6]);
        creacion[5]=this.creacionCombustible(combustibles);
        creacion[7]=this.cracionNombre();
        return creacion;
    }
    /**
     * Este método ayuda al usuario a crear una nave tipo Lanzadera, preguntando
     * todos sus atributos al usuario, sin dejar ninguno vacío y haciendo
     * control de excepciones.
     * @return Nos devuelve un array de 8 posiciones para poder crear la nave
     * correctamente.
     */
    public String[] creacionLanzadera(){
        String[] paises={"EE.UU","Rusia/Ucrania","Europa","Japón","China"};
        String[] creacion=new String[8];
        String[] combustibles=new String[0];
        creacion[0]=this.creacionEmpuje("El peso","lanzadera");
        creacion[1]=this.creacionEmpuje("El empuje","lanzadera");
        creacion[2]=this.creacionEstado("lanzadera");
        creacion[3]=this.creacionFecha();
        creacion[4]=this.creacionDestino();
        creacion[6]=this.creacionPais(paises);
        switch(creacion[6]){
            case "EE.UU": combustibles=new String[]{"H(liq)+O(liq)","Sólido+Queroseno+N(liq)","Queroseno+O(liq)"};
                          break;
            case "Rusia/Ucrania": combustibles=new String[]{"Queroseno+O(liq)","C2H8N2+NO"};
                                  break;
            case "Europa": combustibles=new String[]{"Sólido+N(liq)+O(liq)"};
                           break;
            case "Japón": combustibles=new String[]{"Sólido+N(liq)+O(liq)"};
                          break;
            case "China": combustibles=new String[]{"UDMH+N2O4"};
                          break;
        }
        creacion[5]=this.creacionCombustible(combustibles);
        creacion[7]=this.cracionNombre();
        return creacion;
    }
    /**
     * Este método ayuda al usuario a crear una nave tipo Lanzadera, preguntando
     * todos sus atributos al usuario, sin dejar ninguno vacío y haciendo
     * control de excepciones.
     * @return Nos devuelve un array de 10 posiciones para poder crear la nave
     * correctamente.
     */
    public String [] creacionTrip(){
        String[] paises={"EE.UU","Rusia/Ucrania","Europa","Japón","China"};
        String[] creacion=new String[10];
        String[] combustibles=new String[0];
        creacion[0]=this.creacionTarea();
        creacion[1]=this.creacionEmpuje("La altura","tripulada");
        creacion[2]=this.creacionEmpuje("El peso","tripulada");
        creacion[3]=this.creacionEmpuje("El empuje","tripulada");
        creacion[4]=this.creacionEstado("tripulada");
        creacion[5]=this.creacionFecha();
        creacion[6]=this.creacionDestino();
        creacion[8]=this.creacionPais(paises);
        switch(creacion[8]){
            case "EE.UU": combustibles=new String[]{"H(liq)+O(liq)","Sólido+Queroseno+N(liq)","Queroseno+O(liq)"};
                          break;
            case "Rusia/Ucrania": combustibles=new String[]{"Queroseno+O(liq)","C2H8N2+NO"};
                                  break;
            case "Europa": combustibles=new String[]{"Sólido+N(liq)+O(liq)"};
                           break;
            case "Japón": combustibles=new String[]{"Sólido+N(liq)+O(liq)"};
                          break;
            case "China": combustibles=new String[]{"UDMH+N2O4"};
                          break;
        }
        creacion[7]=this.creacionCombustible(combustibles);
        creacion[9]=this.cracionNombre();
        return creacion;
    }
}
