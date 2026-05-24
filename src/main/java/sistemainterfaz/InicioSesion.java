package sistemainterfaz;

import java.awt.*;
import java.awt.event.*;

public class InicioSesion extends Frame {
   public InicioSesion(){
        this.setTitle("Biblioteca");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);

        Panel panelPrincipal = new Panel(new BorderLayout(0, 30));
     
        Label superior = new Label("Inicio Sesion", Label.CENTER);
        panelPrincipal.add(superior, BorderLayout.NORTH);
        
        GridLayout esquema1 = new GridLayout(2, 1, 0, 15);
        Panel panelCentral = new Panel(esquema1);
        
        Panel subCentral = new Panel(new FlowLayout(FlowLayout.CENTER));
        Label correo = new Label("Correo:   ");
        TextField text1 = new TextField(25); 
        subCentral.add(correo);
        subCentral.add(text1);
        
   
        Panel subCentral1 = new Panel(new FlowLayout(FlowLayout.CENTER));
        Label contrasenia = new Label("Contraseña: ");
        TextField text2 = new TextField(25); 
        
        //Opcion visual para contraseña descomentar si desea ver
        //text2.setEchoChar('*');
        
        subCentral1.add(contrasenia);
        subCentral1.add(text2);

        panelCentral.add(subCentral);
        panelCentral.add(subCentral1);
        
  
        panelPrincipal.add(panelCentral, BorderLayout.CENTER);
        
   
        Button inicio = new Button("Iniciar Sesion");
        
     
        Panel panelBoton = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelBoton.add(inicio);
        
        panelPrincipal.add(panelBoton, BorderLayout.SOUTH);
        

        inicio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Principal regresar = new Principal();
                dispose();
            }
        });
        

        this.add(panelPrincipal);
        
        // Implementación de X para cerrar
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                Principal p = new Principal();
                dispose();
            }
        });
        
        this.setVisible(true);
    }
}
    
