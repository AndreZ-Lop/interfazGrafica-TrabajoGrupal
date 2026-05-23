/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemainterfaz;

import java.awt.event.*;
import java.awt.*;

public class RegistroUsuario extends Frame {
    public RegistroUsuario(){
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
        //Panel interno 1 fecha NAC
        Panel panelInter = new Panel(new BorderLayout());
        Panel subInter1 = new Panel(esquema2);
        Panel subInter2 = new Panel(esquema3);
        Panel subInter3 = new Panel(esquema4);
        //Panel interno 2 CHECBOXES
        Panel panelChek = new Panel(new BorderLayout());
        Panel check1 = new Panel(esquema6);
        Panel check2 = new Panel(esquema5);
        //Panek interno 3 CHECHBOXES RESTRICIONES
        Panel panelChek2 = new Panel(new BorderLayout());
        Panel check3 = new Panel(esquema7);
        Panel check4 = new Panel(esquema8);

        //Labels, TextFields y checkBoxes
        Label nombreCompleto = new Label("Nombre Completo: ", Label.CENTER);
        Label cedula = new Label("Cedula: ", Label.CENTER);
        Label fechaNac = new Label("Fecha de nacimiento: ", Label.CENTER);
        Label dia = new Label("Dia",Label.CENTER);
        Label mes = new Label("Mes: ", Label.CENTER);
        Label anio = new Label("Año ", Label.CENTER);
        Label mayorDeEdad = new Label("Usted es mayor de edad? ", Label.CENTER);
        Label resS = new Label("Si",Label.CENTER);
        Label resN = new Label("No",Label.CENTER);
        Label resAS = new Label("Si",Label.CENTER);
        Label resAN = new Label("No",Label.CENTER);
        Label restriccionAd = new Label("Su cuenta estara restringida desea continuar?: ",Label.CENTER);
        Label correo = new Label("Ingrese un correo: ",Label.CENTER);
        Label contrasenia = new Label("Cree una contraseña: ",Label.CENTER);
        
        Label user = new Label("CREACION USUARIO",Label.CENTER);
        
        TextField text1 = new TextField(15);
        TextField text2 = new TextField(15);
        TextField text3 = new TextField(5);
        TextField text4 = new TextField(5);
        TextField text5 = new TextField(5);
        TextField text6 = new TextField(15);
        TextField text7 = new TextField(15);
        
        //grupo 1 de checks preguntar restriccion
        
        CheckboxGroup grupo = new CheckboxGroup();
        Checkbox checkS = new Checkbox("",false,grupo);
        Checkbox checkN = new Checkbox("",false,grupo);
        
        //grupo 2 de checks continuar
        CheckboxGroup grupo2 = new CheckboxGroup();
        Checkbox checkAS =new Checkbox("",false,grupo2);
        Checkbox checkAN =new Checkbox("",false,grupo2);
        
        //apariciones 1
        
        panelChek2.setVisible(false);
        restriccionAd.setVisible(false);
        correo.setVisible(false);
        contrasenia.setVisible(false);
        text6.setVisible(false);
        text7.setVisible(false);
 
        checkS.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                     panelChek2.setVisible(false);
                     restriccionAd.setVisible(false);
                     correo.setVisible(true);
                     contrasenia.setVisible(true);
                     text6.setVisible(true);
                     text7.setVisible(true);
                }
            }
        });
        checkN.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                     panelChek2.setVisible(true);
                     restriccionAd.setVisible(true);
                     correo.setVisible(false);
                     contrasenia.setVisible(false);
                     text6.setVisible(false);
                     text7.setVisible(false);
                }
            }
        });
        
        //apariciones 2
        
        checkAS.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                    correo.setVisible(true);
                    contrasenia.setVisible(true);
                    text6.setVisible(true);
                    text7.setVisible(true);
                }
            }
        });
        
        checkAN.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                    correo.setVisible(false);
                    contrasenia.setVisible(false);
                    text6.setVisible(false);
                    text7.setVisible(false);
                    Principal prin = new Principal();
                    dispose();
                }
            }
        });
        
        //Boton
        
        Button salir = new Button("FINALIZAR");
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
        
        panelGnerl.add(fechaNac);
        panelInter.add(subInter1,BorderLayout.EAST);
        subInter1.add(dia);
        subInter1.add(text3);
        panelInter.add(subInter2,BorderLayout.CENTER);
        subInter1.add(mes);
        subInter1.add(text4);
        panelInter.add(subInter3,BorderLayout.WEST);
        subInter1.add(anio);
        subInter1.add(text5);
        panelGnerl.add(panelInter);
        
        panelGnerl.add(mayorDeEdad);
        check1.add(resS);
        check1.add(checkS);
        panelChek.add(check1,BorderLayout.EAST);
        check2.add(resN);
        check2.add(checkN);
        panelChek.add(check2,BorderLayout.CENTER);
        panelGnerl.add(panelChek);
        
        panelGnerl.add(restriccionAd);
        check3.add(resAS);
        check3.add(checkAS);
        panelChek2.add(check3,BorderLayout.EAST);
        check4.add(resAN);
        check4.add(checkAN);
        panelChek2.add(check4,BorderLayout.CENTER);
        panelGnerl.add(panelChek2);
        
        panelGnerl.add(correo);
        panelGnerl.add(text6);
        panelGnerl.add(contrasenia);
        panelGnerl.add(text7);
        
        panelInfer.add(salir);
        panelPrincipa.add(panelInfer,BorderLayout.SOUTH);
        panelSuper.add(user);
        panelPrincipa.add(panelSuper,BorderLayout.NORTH);
        
        
     
        panelPrincipa.add(panelGnerl,BorderLayout.CENTER);
        
        this.add(panelPrincipa);
        this.setVisible(true);
    }
}
