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
        
        /*double[][] ejemplo = new double[8][3];
        ejemplo[0][0] = 1;
        ejemplo[1][0] = 1;
        ejemplo[2][0] = 1;
        ejemplo[3][0] = 1;
        ejemplo[4][0] = 1;
        ejemplo[5][0] = 1;
        ejemplo[6][0] = 1;
        ejemplo[7][0] = 1;
        
        ejemplo[0][1] = 3;
        ejemplo[1][1] = 2;
        ejemplo[2][1] = 4;
        ejemplo[3][1] = 2;
        ejemplo[4][1] = 3;
        ejemplo[5][1] = 2;
        ejemplo[6][1] = 5;
        ejemplo[7][1] = 4;
        
        ejemplo[0][2] = 2;
        ejemplo[1][2] = 1;
        ejemplo[2][2] = 3;
        ejemplo[3][2] = 1;
        ejemplo[4][2] = 2;
        ejemplo[5][2] = 2;
        ejemplo[6][2] = 3;
        ejemplo[7][2] = 2;
        
        double[][] matrizY = new double[8][1];
        matrizY[0][0] = 78800;
        matrizY[1][0] = 74300;
        matrizY[2][0] = 83800;
        matrizY[3][0] = 74200;
        matrizY[4][0] = 79700;
        matrizY[5][0] = 74900;
        matrizY[6][0] = 88400;
        matrizY[7][0] = 82900;
        Matriz ej = new Matriz(ejemplo, 8, 3);
        double[][] transp = ej.transpuesta();
        double[][] prodTransp = ej.multiplicarMatrices(transp, ejemplo);
        double determ = ej.determinante3x3(prodTransp);
        double[][] adjunta = ej.adjunta3x3(prodTransp);
        //hasta aquí todo bien
        System.out.println("esta es la inversa");
        double[][] inversa = ej.matrizXEscalar(adjunta, 1/determ);
        double[][] productoXtY = ej.multiplicarMatrices(transp, matrizY);
        double[][] resultado = ej.multiplicarMatrices(inversa, productoXtY);
        */
        DataLoader data = new DataLoader("C:\\Users\\luis_\\Documents\\datos.txt");
        double[][] datos = data.leerDatos();
        MultipleLinearRegression n = new MultipleLinearRegression();
        n.cramer(datos);
        n.calcularY(9, 1.5);
    }
    
}

