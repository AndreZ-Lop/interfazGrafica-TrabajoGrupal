/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemainterfaz;

/**
 *
 * @author USER
 */
import java.awt.*;
import java.awt.event.*;

public class ListaDePrestamos extends Frame{
    public ListaDePrestamos(){
        this.setTitle("Biblioteca");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        
        
        //Grid
        GridLayout esquema = new GridLayout(1,4,2,2);
        GridLayout esquema1 = new GridLayout(1,4,2,2);
        
        //Panel
        Panel principal = new Panel(new BorderLayout());
        //superior
        Panel superior = new Panel(new BorderLayout());
        Panel subsuperior = new Panel(esquema);
        //inferior
        Panel interior = new Panel(esquema1);
        Panel interior1 = new Panel(new BorderLayout());
        Panel interior2 = new Panel(new BorderLayout());
        Panel interior3 = new Panel(new BorderLayout());
        Panel interior4 = new Panel(new BorderLayout());
        
        //
        Label hp = new Label("Lista de Prestamos", Label.CENTER);
        Label inicio = new Label("Inicio",Label.CENTER);
        Label fin = new Label("Fin",Label.CENTER);
        Label prestado = new Label("Prestado",Label.CENTER);
        Label librot = new Label("Libro",Label.CENTER);
        
        Label fechain = new Label("20/05/26",Label.CENTER);
        Label fechafin = new Label("27/05/26",Label.CENTER);
        Label nom = new Label("Pedro Carreras",Label.CENTER);
        Label libro = new Label("Orgullo y Prejuicio",Label.CENTER);
        
        //TextField
        TextField texto = new TextField(15);
        //Implementacion Superior
        superior.add(hp,BorderLayout.NORTH);
        subsuperior.add(inicio);
        subsuperior.add(fin);
        subsuperior.add(prestado);
        subsuperior.add(librot);
        superior.add(subsuperior,BorderLayout.SOUTH);
               
        principal.add(superior,BorderLayout.NORTH);
        
        
        //Button
        Button salir = new Button("Seleccionar");
        salir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ){
                Principal orig = new Principal();
                dispose();
            }
        });
        
        //Interior
        interior1.add(fechain,BorderLayout.CENTER);
        interior.add(interior1);
        interior2.add(fechafin,BorderLayout.CENTER);
        interior.add(interior2);
        interior3.add(nom,BorderLayout.CENTER);
        interior.add(interior3);
        interior4.add(libro,BorderLayout.CENTER);
        interior.add(interior4);
        
        principal.add(interior,BorderLayout.CENTER);
        principal.add(salir,BorderLayout.EAST);
        
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
