package sistemainterfaz;

import java.awt.event.*;
import java.awt.*;


public class Principal extends Frame{
    
    public Principal(){
        this.setTitle("Biblioteca");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);

        
        Panel panelPrincipal = new Panel(new BorderLayout());
        //Label
        //Label Central
        Label menu = new Label(" MENU ",Label.CENTER);
        menu.setBackground(Color.WHITE);
        //Label Superior
        Label mensajeSuperior = new Label(" Biblioteca UT KNOX", Label.CENTER);
        mensajeSuperior.setBackground(Color.WHITE);
        //Grid
        
        //Grid Central
        GridLayout esquemaCentral = new GridLayout(2,2);
        GridLayout esquemaLateral = new GridLayout(7,1);
        
        //Paneles
        
        //Central
        Panel panelCentral = new Panel(new BorderLayout());
        Panel panelCentral1 = new Panel(esquemaCentral);
        Panel panelCentral2 = new Panel();
        //Panel superior
        Panel panelSuperiorG = new Panel(new BorderLayout());
        Panel panelSuperior1 = new Panel(esquemaCentral);
        Panel panelSuperior2 = new Panel();
        //Panel lateral
        Panel panelLateralP = new Panel(esquemaLateral);
        
        //botones
        //boton central
        Button prestamos = new Button("Prestamos Libros");
        prestamos.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Prestamo pres = new Prestamo();
                dispose();
            }
        });
        Button buscarLibro = new Button("Buscar Libro");
        buscarLibro.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Buscar bus = new Buscar();
                dispose();
            }
        });
        Button devolverLibros = new Button("Devolver Libro");
        devolverLibros.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Devolver dev = new Devolver();
                dispose();
            }
        });
        Button mostrarLibros = new Button("Mostrar lista de libros");
        Button [] botonesCentrales = {prestamos,buscarLibro,devolverLibros,mostrarLibros};
        for(int i = 0;i <botonesCentrales.length;i++){
            panelCentral1.add(botonesCentrales[i]);
            
        }
        //boton lateral
 
        Button menuUs = new Button("///");
        Button crearUs = new Button("Crear Usuarios");
        crearUs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                RegistroUsuario resisUs = new RegistroUsuario();
                dispose();
            }
        });
        Button regisLib = new Button("Registrar Libros");
        regisLib.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                RegistrarLibro regisLib = new RegistrarLibro();
                dispose();
            }
        });
        Button regiAutor = new Button("Registrar Autor");
        regiAutor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                RegistroAutor autor = new RegistroAutor();
                dispose();
            }
        });
        
        Button listaPrestamos = new Button("Listado Prestamos");
        listaPrestamos.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ListaDePrestamos hist = new ListaDePrestamos();
                dispose();
            } 
        });
        
        Button salir = new Button("Log Out");
        salir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        Button [] botonesLaterales = {menuUs,crearUs,regisLib,regiAutor,listaPrestamos,salir};
        for(int i = 0;i <botonesLaterales.length;i++){
            panelLateralP.add(botonesLaterales[i]);
        }
        //boton superior
        Button botonS = new Button("Login Usuario");
        botonS.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                InicioSesion nuevoInicio = new InicioSesion();
                dispose();
            }
        });
        
        
        //implementacion
        //centro
        panelCentral2.add(menu);
        panelCentral.add(panelCentral1,BorderLayout.CENTER);
        panelCentral.add(panelCentral2,BorderLayout.NORTH);
        //superior
        panelSuperior1.add(botonS);
        panelSuperior2.add(mensajeSuperior);
        panelSuperiorG.add(panelSuperior1,BorderLayout.WEST);
        panelSuperiorG.add(panelSuperior2,BorderLayout.CENTER);
        
        //implementacion a la pagina
        panelPrincipal.add(panelCentral,BorderLayout.CENTER);
        panelPrincipal.add(panelSuperiorG,BorderLayout.NORTH);
        panelPrincipal.add(panelLateralP,BorderLayout.WEST);
        this.setBackground(Color.LIGHT_GRAY);
        this.add(panelPrincipal);
        //Cerrar Sistema
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        this.setVisible(true);
        
        
    }

}
