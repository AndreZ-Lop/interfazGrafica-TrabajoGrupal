/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemainterfaz;

import java.awt.*;
import java.awt.event.*;

public class ListaLibro extends Frame{
    public ListaLibro(){
        this.setSize(600,600);
        this.setTitle("Biblioteca");
        this.setLocationRelativeTo(null);
        //Grids
       
        GridLayout esquema1 = new GridLayout(1,3);
     
        
        //Paneles 
        //Principal  
        Panel principal = new Panel(new BorderLayout());
        //superior
         Panel superior = new Panel(new BorderLayout());
        Panel textBus = new Panel(new BorderLayout());
    
        //Interior
        Panel  interior = new Panel(esquema1);
        Panel  interior1 = new Panel(new BorderLayout());
        Panel  interior2 = new Panel(new BorderLayout());
        Panel  interior3 = new Panel(new BorderLayout());
        
        //label
       
        Label titulo = new Label("Libros",Label.CENTER);
        
        Label libro = new Label("Don quijote",Label.CENTER);
        Label libro1 = new Label("El principito",Label.CENTER);
        Label libro2 = new Label("Orgullo y Prejuicio",Label.CENTER);
        
        
        //implementar Superior
        superior.add(titulo,BorderLayout.CENTER);
       
        superior.add(textBus,BorderLayout.SOUTH);
        
        principal.add(superior,BorderLayout.NORTH);
        
           
        
        //botones
        Button salir = new Button("salir");
        salir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Principal orig = new Principal();
                dispose();
            }
        });
        Button seleccionar1 = new Button("seleccionar");
        Button seleccionar2 = new Button("seleccionar");
        Button seleccionar3 = new Button("seleccionar");
        
        //implementacion interior
        
        interior1.add(libro,BorderLayout.CENTER);
        interior1.add(seleccionar1,BorderLayout.SOUTH);
      
        interior.add(interior1);
        
        interior2.add(libro1,BorderLayout.CENTER);
        interior2.add(seleccionar2,BorderLayout.SOUTH);
        interior.add(interior2);
        
        interior3.add(libro2,BorderLayout.CENTER);
        interior3.add(seleccionar3,BorderLayout.SOUTH);
        interior.add(interior3);
        
        
        principal.add(interior,BorderLayout.CENTER);
        
        principal.add(salir,BorderLayout.SOUTH);
        
       
        
        this.add(principal);
        
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                Principal princ = new Principal();
                dispose();
            }
        });
        
        this.setVisible(true);
    }
}
