/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis_
 */
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MultipleRegressionAgent extends Agent {
    boolean seguir = true;
    private double x1 = 0;
    private double x2 = 0;
    protected void setup()
    {
        System.out.println("Agent "+getLocalName()+" started ");
        addBehaviour(new CramerBehaviour());
    }
    private class OptionPaneX {
        JFrame f;
        OptionPaneX() {
            f = new JFrame();
            x1 = Double.parseDouble(JOptionPane.showInputDialog(f, "Ingresa el valor de X1 para calcular Y"));
            x2 = Double.parseDouble(JOptionPane.showInputDialog(f, "Ingresa el valor de X2 para calcular Y"));
        }
    }
    
    private class CramerBehaviour extends Behaviour
    {
        public void action(){
            System.out.println("Agent's action method is executed");
            DataLoader data = new DataLoader("C:\\Users\\luis_\\Documents\\datos.txt");
            double[][] datos = data.leerDatos();
            MultipleLinearRegression n = new MultipleLinearRegression();
            n.cramer(datos);
            new OptionPaneX();
            n.calcularY(x1, x2);
            System.out.println("¿Desea calcular otro valor? 1 para si, cualquier otro numero para no");
            Scanner reader = new Scanner(System.in);
            int num = 1;
            if(reader.nextInt()!=1)
                seguir = false;
        }
        
        public boolean done()
        {
            if(seguir)
                return false;
            else
                return true;
        }
        
        public int onEnd()
        {
            myAgent.doDelete();
            return super.onEnd();
        }
    }
}
