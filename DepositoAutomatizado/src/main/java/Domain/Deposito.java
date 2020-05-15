package Domain;

import Domain.Robots.Robot;

import java.util.ArrayList;

public class Deposito{
    private ArrayList<Compartimiento> compartimientos;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Robot> robots;

    public void mandarRobot(Pedido pedido,Ruta ruta){
        for(Robot robot:robots){
            if(robot.getEstado() == Estado.LIBRE){
                robot.buscarPaquete(ruta);
                pedido.notificar();
                break;
            }
        }
    }
}
