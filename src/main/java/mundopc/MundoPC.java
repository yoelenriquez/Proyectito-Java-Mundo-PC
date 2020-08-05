package mundopc;
import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("MonitorHP", 34);
        Teclado tecladoHP = new Teclado("Bluethot", "HP");
        Raton ratonHP = new Raton("Cable", "HP");
        
        Computadora computadoraHP = new Computadora("ComputadoraHP", monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorGamer = new Monitor("MonitorGamer", 34);
        Teclado tecladoGamer = new Teclado("Bluethot", "Gamer");
        Raton ratonGamer = new Raton("Cable", "Gamer");
        
        Computadora computadoraGamer = new Computadora("ComputadoraGamer", monitorHP, tecladoGamer, ratonGamer);
        
        Orden orden = new Orden();
        
        orden.agregarComputadora(computadoraHP);
        orden.agregarComputadora(computadoraGamer);
        
        orden.mostrarOrden();
    }
}
