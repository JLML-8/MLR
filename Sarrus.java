/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis_
 */
public class Sarrus {
    
    public double determinante3x3(double[][] matrix)
    {
        double[][] matrizAux = new double[3][5];
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            matrizAux[i][j] = matrix[i][j];  
        }
        matrizAux[0][3]=matrix[0][0];
        matrizAux[0][4]=matrix[0][1];
        matrizAux[1][3]=matrix[1][0];
        matrizAux[1][4]=matrix[1][1];
        matrizAux[2][3]=matrix[2][0];
        matrizAux[2][4]=matrix[2][1];
        
        double determ=0;
        double positivo=0;
        double negativo=0;
        
        positivo = ((matrizAux[0][0]*matrizAux[1][1]*matrizAux[2][2])+(matrizAux[0][1]*matrizAux[1][2]*matrizAux[2][3])+(matrizAux[0][2]*matrizAux[1][3]*matrizAux[2][4]));
        negativo = ((matrizAux[0][4]*matrizAux[1][3]*matrizAux[2][2])+(matrizAux[0][3]*matrizAux[1][2]*matrizAux[2][1])+(matrizAux[0][2]*matrizAux[1][1]*matrizAux[2][0]));
        determ=positivo-negativo;
        return determ;
    }
    
}
