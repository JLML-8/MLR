/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*double[][] ejemplo = new double[17][3];
        ejemplo[0][0] = 1;
        ejemplo[1][0] = 1;
        ejemplo[2][0] = 1;
        ejemplo[3][0] = 1;
        ejemplo[4][0] = 1;
        ejemplo[5][0] = 1;
        ejemplo[6][0] = 1;
        ejemplo[7][0] = 1;
        ejemplo[8][0] = 1;
        ejemplo[9][0] = 1;
        ejemplo[10][0] = 1;
        ejemplo[11][0] = 1;
        ejemplo[12][0] = 1;
        ejemplo[13][0] = 1;
        ejemplo[14][0] = 1;
        ejemplo[15][0] = 1;
        ejemplo[16][0] = 1;
        
        ejemplo[0][1] = 41.9;
        ejemplo[1][1] = 43.4;
        ejemplo[2][1] = 43.9;
        ejemplo[3][1] = 44.5;
        ejemplo[4][1] = 47.3;
        ejemplo[5][1] = 47.5;
        ejemplo[6][1] = 47.9;
        ejemplo[7][1] = 50.2;
        ejemplo[8][1] = 52.8;
        ejemplo[9][1] = 53.2;
        ejemplo[10][1] = 56.7;
        ejemplo[11][1] = 57.0;
        ejemplo[12][1] = 63.5;
        ejemplo[13][1] = 65.3;
        ejemplo[14][1] = 71.1;
        ejemplo[15][1] = 77.0;
        ejemplo[16][1] = 77.8;
        
        ejemplo[0][2] = 29.1;
        ejemplo[1][2] = 29.3;
        ejemplo[2][2] = 29.5;
        ejemplo[3][2] = 29.7;
        ejemplo[4][2] = 29.9;
        ejemplo[5][2] = 30.3;
        ejemplo[6][2] = 30.5;
        ejemplo[7][2] = 30.7;
        ejemplo[8][2] = 30.8;
        ejemplo[9][2] = 30.9;
        ejemplo[10][2] = 31.5;
        ejemplo[11][2] = 31.7;
        ejemplo[12][2] = 31.9;
        ejemplo[13][2] = 32.0;
        ejemplo[14][2] = 32.1;
        ejemplo[15][2] = 32.5;
        ejemplo[16][2] = 32.9;
       
        double[][] matrizY = new double[17][1];
        matrizY[0][0] = 251.3;
        matrizY[1][0] = 251.3;
        matrizY[2][0] = 248.3;
        matrizY[3][0] = 267.5;
        matrizY[4][0] = 273.0;
        matrizY[5][0] = 276.5;
        matrizY[6][0] = 270.3;
        matrizY[7][0] = 274.9;
        matrizY[8][0] = 285.0;
        matrizY[9][0] = 290.0;
        matrizY[10][0] = 297.0;
        matrizY[11][0] = 302.5;
        matrizY[12][0] = 304.5;
        matrizY[13][0] = 309.3;
        matrizY[14][0] = 321.7;
        matrizY[15][0] = 330.7;
        matrizY[16][0] = 349.0;*/
        
        DataLoader dataloader = new DataLoader("C:\\Users\\luis_\\Documents\\datos.txt");
        double[][] ejemplo = dataloader.leerDatos();
        Matriz ej = new Matriz(ejemplo, 17, 3);
        double[][] matrizY = ej.getDatosY();
        double[][] transp = ej.transpuesta();
        System.out.println("Imprimiendo producto de transpuesta por la matriz principal");
        double[][] prodTransp = ej.multiplicarMatrices(transp, ejemplo);
        double determ = ej.determinante3x3(prodTransp);
        double[][] adjunta = ej.adjunta3x3(prodTransp);
        //hasta aquí todo bien
        System.out.println("esta es la inversa");
        double[][] inversa = ej.matrizXEscalar(adjunta, 1/determ);
        double[][] productoXtY = ej.multiplicarMatrices(transp, matrizY);
        System.out.println("Resultado final");
        double[][] resultado = ej.multiplicarMatrices(inversa, productoXtY);
        //de aquí en adelante es el de cramer
        /*DataLoader data = new DataLoader("C:\\Users\\luis_\\Documents\\datos.txt");
        double[][] datos = data.leerDatos();
        MultipleLinearRegression n = new MultipleLinearRegression();
        n.cramer(datos);
        n.calcularY(9, 1.5);*/
    }
    
}

