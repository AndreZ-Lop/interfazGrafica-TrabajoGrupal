/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemainterfaz;

import funcion.WindowSystem;
import java.awt.*;
import java.awt.event.*;

public class InicioSesion extends Frame {
    public InicioSesion(){
        this.setTitle("Biblioteca");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.addWindowListener(new WindowSystem());
 
        //GridLayout
        GridLayout esquema1 = new GridLayout(2,2);
        
        //paneles
        Panel panelPrincipal = new Panel(new BorderLayout());
        Panel panelCentral = new Panel(esquema1);
        
        //Label y textField
        Label superior = new Label("Log In",Label.CENTER);
        Label correo = new Label("Correo: ",Label.CENTER);
        Label contrasenia = new Label("Contraseña: ",Label.CENTER);
        TextField text1 = new TextField();
        TextField text2 = new TextField();
   
        //Boton
        Button inicio = new Button("Iniciar Sesion");
        inicio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Principal regresar =  new Principal();
                dispose();
            }
        });
        //creacion ventana
        panelCentral.add(correo);
        panelCentral.add(text1);
        panelCentral.add(contrasenia);
        panelCentral.add(text2);
        panelPrincipal.add(panelCentral, BorderLayout.CENTER);
        
        panelPrincipal.add(superior, BorderLayout.NORTH);
        panelPrincipal.add(inicio, BorderLayout.SOUTH);
        
        this.add(panelPrincipal);
        
        this.addWindowListener(new WindowSystem());
        
        //Implementacion de X
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                Principal p = new Principal();
                dispose();
            }
        });
        this.setVisible(true);
        
    }
}
