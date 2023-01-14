package Controlador;
import Modelo.*;
/**
 *
 * @author ivan0
 */
public class Sofka {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FRMNaves cont=new FRMNaves();
        cont.getLanz().add(new Lanzadera("2500","53000",false,"12/02/2019","Marte","H(liq)+O(liq)","EE.UU","Saturno V"));
        cont.getLanz().add(new Lanzadera("2700","73000",true,"12/02/2000","Venus","Sólido+Queroseno+N(liq)","EE.UU","Atlas V"));
        cont.getLanz().add(new Lanzadera("7500","103000",true,"12/02/2022","Mercurio","Sólido+N(liq)+O(liq)","Europa","Arianne V"));
        cont.getNoTrip().add(new NoTrip("1","15",true,"11/11/2000","Lagrange","NO4+MMH","EE.UU NASA","James Webb"));
        cont.getNoTrip().add(new NoTrip("1","20",false,"11/11/2011","Orbita","MMH+NO","Europa ESA/ASI","ATV"));
        cont.getNoTrip().add(new NoTrip("1","10",false,"11/11/2022","Marte","MMH+NO","Europa ESA/ASI","Soho"));
        cont.getNoTripSinPeso().add(new NoTripSinPeso("10","45",true,"26/06/2010","Plutón","N2H4+Amina","Rusia","Luna I"));
        cont.getNoTripSinPeso().add(new NoTripSinPeso("15","1500",true,"26/06/2015","Sol","N2H4+Amina","Rusia","Pogreso M"));
        cont.getNoTripSinPeso().add(new NoTripSinPeso("20","8000",false,"26/06/2020","Cinturón de Kuiper","N2O4+UDMH","Rusia","Venera IV"));
        cont.getTrip().add(new Tripulada("Arreglar el Hubble","500","400","7000",false,"04/10/1995","Orbita","H(liq)+O(liq)","EE.UU","Dragon V2"));
        cont.getTrip().add(new Tripulada("Hacer experimentos sin gravedad","570","400","17000",true,"04/10/2005","Orbita","Queroseno+O(liq)","Rusia/Ucrania","Vostok"));
        cont.getTrip().add(new Tripulada("Mantenimiento a la estación internacional","450","700","1000",false,"04/10/1985","Orbita","C2H8N2+NO","Rusia/Ucrania","Soyuz"));
        do{
            
        }while(cont.menu()!=3);
    }
    
}
