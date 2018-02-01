/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import View.View;
import Model.Model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author carmona
 */
public class Controlador implements ActionListener{
    
 private View vista;
 private Model modelo;  
 
 public Controlador(View vista,Model modelo){
 this.vista = vista;
 this.modelo = modelo;
 this.vista.multiplicar.addActionListener(this);
 
}
 
 public void init_View() {
        vista.setTitle("mvc");
        vista.setLocationRelativeTo(null);
        
    }
 
 public void actionPerformed(ActionEvent e){
 
 modelo.setNumerouno(Integer.parseInt(vista.numuno.getText()));
 modelo.setNumerodos(Integer.parseInt(vista.numdos.getText()));
 modelo.multiplicar();
 vista.multiplicar.setText(String.valueOf(modelo.getResultado()));      
         
 System.out.print("MUY BIEN");
 
 }
    
}
