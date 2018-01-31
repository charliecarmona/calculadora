/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Controlador.Controlador;
import Model.Model;
import View.View;
/**
 *
 * @author carmona
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Model modelo = new Model();
       View vista = new View();
       Controlador controlador = new Controlador(vista, modelo);
       controlador.init_View();
       vista.setVisible(true);
    }
    
}
