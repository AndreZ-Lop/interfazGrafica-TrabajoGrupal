package sistemainterfaz;

import java.awt.*;
import java.awt.event.*;

public class RegistrarLibro extends Frame{
    public RegistrarLibro(){
        this.setTitle("Biblioteca");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                Principal prin = new Principal();
                dispose();
            }
        });
        //Grid Layout
        GridLayout esquema1 = new GridLayout(8,2);
        GridLayout esquema2 = new GridLayout(1,2);
        GridLayout esquema3 = new GridLayout(1,2);
        GridLayout esquema4 = new GridLayout(1,2);
        GridLayout esquema5 = new GridLayout(1,2);
        GridLayout esquema6 = new GridLayout(1,2);
        GridLayout esquema7 = new GridLayout(1,2);
        GridLayout esquema8 = new GridLayout(1,2);
                
        //Paneles
        //Principal
        Panel panelPrincipa = new Panel(new BorderLayout());
        //Panel Inferior
        Panel panelInfer = new Panel();
        //Panel Superior'
        Panel panelSuper = new Panel();
        //PanelGeneral
        Panel panelGnerl = new Panel(esquema1);
        //Panel interno 1 fecha Pub
        Panel panelInter = new Panel(new BorderLayout());
        Panel subInter1 = new Panel(esquema2);
        Panel subInter2 = new Panel(esquema3);
        Panel subInter3 = new Panel(esquema4);
        //Panel interno 2 CHECBOXES
        Panel panelChek = new Panel(new BorderLayout());
        Panel check1 = new Panel(esquema7);
        Panel check2 = new Panel(esquema8);
        
        //Panel interno 2 CHECBOXES
        Panel panelChek2 = new Panel(new BorderLayout());
        Panel check3 = new Panel(esquema6);
        Panel check4 = new Panel(esquema5);

        //Labels, TextFields y checkBoxes
        Label nombreCompleto = new Label("Nombre Del Libro: ", Label.CENTER);
        Label cedula = new Label("ISBN del libro: ", Label.CENTER);
        Label generoLibro = new Label("Ingrese el generlo del libro: ", Label.CENTER);
        Label fechaPub = new Label("Fecha la fecha de publicacion: ", Label.CENTER);
        Label dia = new Label("Dia",Label.CENTER);
        Label mes = new Label("Mes: ", Label.CENTER);
        Label anio = new Label("Año ", Label.CENTER);
        Label idiom = new Label("Ingrese el idioma del libro: ",Label.CENTER);
        Label restricciones = new Label("El libro tiene restricciones de edad? ", Label.CENTER);
        Label resS = new Label("Si",Label.CENTER);
        Label resN = new Label("No",Label.CENTER);
        Label datosAutor = new Label("Se conoce los datos del autor? ", Label.CENTER);
        Label resAS = new Label("Si",Label.CENTER);
        Label resAN = new Label("No",Label.CENTER);
        
        Label user = new Label("REGISTRO LIBRO",Label.CENTER);
        
        TextField text1 = new TextField(15);
        TextField text2 = new TextField(15);
        TextField text3 = new TextField(15);
        TextField text4 = new TextField(2);
        TextField text5 = new TextField(2);
        TextField text6 = new TextField(4);
        TextField text7 = new TextField(15);
        CheckboxGroup grupoMayor = new CheckboxGroup();
        Checkbox checkS = new Checkbox("",false,grupoMayor);
        Checkbox checkN = new Checkbox("",false,grupoMayor);
        
        CheckboxGroup grupoMayor2 = new CheckboxGroup();
        Checkbox checkAN = new Checkbox("",false,grupoMayor2);
        Checkbox checkAS = new Checkbox("",false,grupoMayor2);
        //Componentes que se muestras o ocultan
        Label mensajeAutor = new Label("Ingrese el nombre del autor:");
        TextField textAutor = new TextField(15);
        
        //setear visibilidad en false a menos que se marque si
        mensajeAutor.setVisible(false);
        textAutor.setVisible(false);
        
        checkAS.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
              if(e.getStateChange() == ItemEvent.SELECTED){
                  mensajeAutor.setVisible(true);
                  textAutor.setVisible(true);
              }
            }
        });
        checkAN.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent eve){
                if(eve.getStateChange() == ItemEvent.SELECTED){
                  mensajeAutor.setVisible(false);
                  textAutor.setVisible(false);
              }
              
            }
        });
        //Boton
        
        Button salir = new Button("Registrar");
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Principal prin = new Principal();
                dispose();
            }
        });
        
        //creacion ventana
        
        panelGnerl.add(nombreCompleto);
        panelGnerl.add(text1);
        
        panelGnerl.add(cedula);
        panelGnerl.add(text2);
        
        panelGnerl.add(generoLibro);
        panelGnerl.add(text3);
        
        panelGnerl.add(fechaPub);
        panelInter.add(subInter1,BorderLayout.NORTH);
        subInter1.add(dia);
        subInter1.add(text4);
        panelInter.add(subInter2,BorderLayout.CENTER);
        subInter2.add(mes);
        subInter2.add(text5);
        panelInter.add(subInter3,BorderLayout.SOUTH);
        subInter3.add(anio);
        subInter3.add(text6);
        panelGnerl.add(panelInter);
        
        panelGnerl.add(idiom);
        panelGnerl.add(text7);
        
        panelGnerl.add(restricciones);
        check1.add(resS);
        check1.add(checkS);
        panelChek.add(check1,BorderLayout.EAST);
        check2.add(resN);
        check2.add(checkN);
        panelChek.add(check2,BorderLayout.CENTER);
        panelGnerl.add(panelChek);
        
        panelGnerl.add(datosAutor);
        check3.add(resAS);
        check3.add(checkAS);
        panelChek2.add(check3,BorderLayout.EAST);
        check4.add(resAN);
        check4.add(checkAN);
        panelChek2.add(check4,BorderLayout.CENTER);
        panelGnerl.add(panelChek2);
        
        panelInfer.add(salir);
        panelPrincipa.add(panelInfer,BorderLayout.SOUTH);
        panelSuper.add(user);
        panelPrincipa.add(panelSuper,BorderLayout.NORTH);
        
        panelGnerl.add(mensajeAutor);
        panelGnerl.add(textAutor);
        
 
        panelPrincipa.add(panelGnerl,BorderLayout.CENTER);
        
        this.add(panelPrincipa);
        this.setVisible(true);
    }
}
