/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis_
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataLoader {
    
    private String direccion;
    public DataLoader(String direccion)
    {
            this.direccion=direccion;
    }
    
    public double[][] leerDatos()
    {
        double[][] datos =new double[17][3];
        File file = new File(direccion);
        try (Scanner entrada = new Scanner(file)){
            for(int i=0; i<3;i++){
                for(int j=0; j<17; j++){
                    if(entrada.hasNextDouble())
                        datos[j][i] = entrada.nextDouble();
                }  
            }    
        } catch (Exception e) {
            System.out.println("No se ha encontrado el archivo solicitado");
        }
        return datos;
    }
}
