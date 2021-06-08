/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis_
 */
import java.util.ArrayList;

public class Sumatoria {
    
    private ArrayList<Double> sum;
    
    public Sumatoria(ArrayList<Double> sum)
            {
                this.sum = sum;
            }
    public double obtenerSum()
            {
                double total=0;
                for(int i=0; i<sum.size(); i++)
                {
                    total+= sum.get(i);
                }
                return total;
            }
    public double sumarProductos(ArrayList<Double> x)
    {
        double total=0;
        for(int i=0; i<sum.size();i++)
        {
            total += this.sum.get(i)* x.get(i);
        }
        return total;
        
    }
}
