/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar;

import javax.swing.JOptionPane;

/**
 *
 * @author Cielo
 */
public class VENTANA extends javax.swing.JFrame {

    Consultas ConGuardar = new Consultas();

    public VENTANA() {
        initComponents();
        Cliente.setBounds(0, 0, 0, 0);
        Empleado.setBounds(0, 0, 0, 0);
        Proyecto.setBounds(0, 0, 0, 0);
        ModificarUsuario.setBounds(0, 0, 0, 0);
        PanelEliminarProyecto.setBounds(0, 0, 0, 0);
        PanelEliminarCliente.setBounds(0, 0, 0, 0);
        PanelEliminarEmpleado.setBounds(0, 0, 0, 0);
        PanelModificar.setBounds(0, 0, 0, 0);
        PanelModificar1.setBounds(0, 0, 0, 0);
        PanelModificar3.setBounds(0, 0, 0, 0);
    }

    /@SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CerrarSesion = new javax.swing.JButton();
        botonProyecto = new javax.swing.JButton();
        botonEmpleado = new javax.swing.JButton();
        botonModificarUsuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PintarNombreUsuario = new javax.swing.JLabel();
        botonModificar = new javax.swing.JButton();
        Proyecto = new javax.swing.JPanel();
        NombreProyecto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Presupuesto = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        GuardarProyecto = new javax.swing.JButton();
        MostrarProyecto = new javax.swing.JButton();
        NuevoProyecto = new javax.swing.JButton();
        EliminarProyecto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        ResidenciaProyecto = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        IDCliente = new javax.swing.JTextField();
        TipoProyecto = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        Modificar = new javax.swing.JButton();
        IDjefe = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        IDe = new javax.swing.JTextField();
        Empleado = new javax.swing.JPanel();
        Nomina = new javax.swing.JTextField();
        TelefonoEmpleado = new javax.swing.JTextField();
        CorreoEmpleado = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        NombreEmpleado = new javax.swing.JTextField();
        ProyectosRealizadosEmpleados = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        ProyectosRealizadossCheck = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        GuardarEmpleado = new javax.swing.JButton();
        MostrarEmpleado = new javax.swing.JButton();
        NuevoEmpleado = new javax.swing.JButton();
        EliminarEmpleado = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Jefe = new javax.swing.JCheckBox();
        PanelEliminarEmpleado = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        EliminarPorIDEmpleado = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        MostrarEmpleadoEncontrado = new javax.swing.JLabel();
        EliminarDefinitivoEmpleado = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        ModificarEmpleado = new javax.swing.JButton();
        PanelModificar1 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        ModificarPorIDEmpleado = new javax.swing.JTextField();
        ModificarYGuardar1 = new javax.swing.JButton();
        BuscarParaModificarEmpleado = new javax.swing.JButton();
        IDEmpleado = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Cliente = new javax.swing.JPanel();
        Nombre = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AporteFinanciero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        AporteFinCheck = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        GuardarCliente = new javax.swing.JButton();
        MostarCliente = new javax.swing.JButton();
        NuevoCliente = new javax.swing.JButton();
        EliminarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        PanelEliminarCliente = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PonerID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        EliminarClienteDefinitivo = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        idCliente = new javax.swing.JLabel();
        ModificarCliente = new javax.swing.JButton();
        PanelModificar3 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        ModificarPorIDEmpleado2 = new javax.swing.JTextField();
        ModificarYGuardar3 = new javax.swing.JButton();
        BuscarParaModificarEmpleado2 = new javax.swing.JButton();
        TipoCliente = new javax.swing.JComboBox<>();
        ModificarUsuario = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        IDUsuario = new javax.swing.JLabel();
        NombreNuevoUsuario = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        NombreEmpleado2 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        GuardarModificarUsuario = new javax.swing.JButton();
        DescartarRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arquitectos Movimientos");
        setMinimumSize(new java.awt.Dimension(1021, 540));
        setPreferredSize(new java.awt.Dimension(1001, 501));
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);

        CerrarSesion.setBackground(new java.awt.Color(0, 0, 0));
        CerrarSesion.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        CerrarSesion.setText("Cerrar sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });

        botonProyecto.setBackground(new java.awt.Color(0, 0, 0));
        botonProyecto.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        botonProyecto.setForeground(new java.awt.Color(255, 255, 255));
        botonProyecto.setText("Proyecto");
        botonProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProyectoActionPerformed(evt);
            }
        });

        botonEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        botonEmpleado.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        botonEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        botonEmpleado.setText("Empleado");
        botonEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleadoActionPerformed(evt);
            }
        });

        botonModificarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        botonModificarUsuario.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        botonModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        botonModificarUsuario.setText("Cliente");
        botonModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario Nombre Ejemplo");

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MENU");

        PintarNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        PintarNombreUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        botonModificar.setBackground(new java.awt.Color(0, 0, 0));
        botonModificar.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        botonModificar.setForeground(new java.awt.Color(255, 255, 255));
        botonModificar.setText("ModificarUsuario");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonModificarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2)))
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addComponent(PintarNombreUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PintarNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonModificar)
                .addGap(83, 83, 83)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(botonModificarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonProyecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(CerrarSesion)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 20, 230, 460);

        Proyecto.setBackground(new java.awt.Color(153, 153, 153));
        Proyecto.setMinimumSize(new java.awt.Dimension(629, 400));
        Proyecto.setPreferredSize(new java.awt.Dimension(700, 411));

        NombreProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreProyectoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel13.setText("NOMBRE: ");

        jLabel14.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel14.setText("ID:");

        jLabel15.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel15.setText("TIPO:");

        Presupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresupuestoActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jCheckBox2.setText("PRESUPUESTO");
        jCheckBox2.setOpaque(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel17.setText("Registro de todos los proyectos");

        GuardarProyecto.setBackground(new java.awt.Color(0, 0, 0));
        GuardarProyecto.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        GuardarProyecto.setForeground(new java.awt.Color(255, 255, 255));
        GuardarProyecto.setText("Guardar");
        GuardarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarProyectoActionPerformed(evt);
            }
        });

        MostrarProyecto.setBackground(new java.awt.Color(0, 0, 0));
        MostrarProyecto.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        MostrarProyecto.setForeground(new java.awt.Color(255, 255, 255));
        MostrarProyecto.setText("Mostrar");
        MostrarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarProyectoActionPerformed(evt);
            }
        });

        NuevoProyecto.setBackground(new java.awt.Color(0, 0, 0));
        NuevoProyecto.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        NuevoProyecto.setForeground(new java.awt.Color(255, 255, 255));
        NuevoProyecto.setText("Nuevo");
        NuevoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoProyectoActionPerformed(evt);
            }
        });

        EliminarProyecto.setBackground(new java.awt.Color(0, 0, 0));
        EliminarProyecto.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        EliminarProyecto.setForeground(new java.awt.Color(255, 255, 255));
        EliminarProyecto.setText("Eliminar");
        EliminarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarProyectoActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel30.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel30.setText("RESIDENCIA: ");

        ResidenciaProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResidenciaProyectoActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel32.setText("ID DEL CLIENTE:");

        IDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDClienteActionPerformed(evt);
            }
        });

        TipoProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Tipo", "Residencial", "Comercial", "Institucional", "Publica", "Industrial" }));
        TipoProyecto.setToolTipText("");

        jLabel33.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel33.setText("REGISTAR UN NUEVO PROYECTO ");

        Modificar.setBackground(new java.awt.Color(0, 0, 0));
        Modificar.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        IDjefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDjefeActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel45.setText("ID jefe:");

        IDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProyectoLayout = new javax.swing.GroupLayout(Proyecto);
        Proyecto.setLayout(ProyectoLayout);
        ProyectoLayout.setHorizontalGroup(
            ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProyectoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProyectoLayout.createSequentialGroup()
                        .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel45)
                            .addComponent(jCheckBox2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IDjefe, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(Presupuesto))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ProyectoLayout.createSequentialGroup()
                        .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProyectoLayout.createSequentialGroup()
                                .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addComponent(TipoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProyectoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProyectoLayout.createSequentialGroup()
                                .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResidenciaProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ProyectoLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel14)
                        .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProyectoLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ProyectoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IDe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProyectoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17))
                .addGap(26, 26, 26))
            .addGroup(ProyectoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(NuevoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GuardarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EliminarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MostrarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ProyectoLayout.setVerticalGroup(
            ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProyectoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ProyectoLayout.createSequentialGroup()
                        .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(IDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ResidenciaProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TipoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(IDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox2)
                            .addComponent(Presupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDjefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45))
                        .addGap(100, 100, 100)
                        .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NuevoProyecto)
                            .addComponent(GuardarProyecto)
                            .addComponent(EliminarProyecto)
                            .addComponent(Modificar)
                            .addComponent(MostrarProyecto))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );

        getContentPane().add(Proyecto);
        Proyecto.setBounds(410, 80, 80, 400);

        Empleado.setBackground(new java.awt.Color(153, 153, 153));
        Empleado.setMinimumSize(new java.awt.Dimension(629, 400));
        Empleado.setPreferredSize(new java.awt.Dimension(700, 411));

        Nomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NominaActionPerformed(evt);
            }
        });

        TelefonoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoEmpleadoActionPerformed(evt);
            }
        });

        CorreoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoEmpleadoActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel19.setText("ID: ");

        jLabel20.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel20.setText("REGISTRAR NUEVO EMPLEADO");

        jLabel21.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel21.setText("TELEFONO:");

        jLabel22.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel22.setText("NOMBRE:");

        NombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreEmpleadoActionPerformed(evt);
            }
        });

        ProyectosRealizadosEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProyectosRealizadosEmpleadosActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel23.setText("CORREO:");

        ProyectosRealizadossCheck.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        ProyectosRealizadossCheck.setText("PROYECTOS REALIZADOS");
        ProyectosRealizadossCheck.setOpaque(false);
        ProyectosRealizadossCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProyectosRealizadossCheckActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel24.setText("Registro de todos los empleados");

        GuardarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        GuardarEmpleado.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        GuardarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        GuardarEmpleado.setText("Guardar");
        GuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEmpleadoActionPerformed(evt);
            }
        });

        MostrarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        MostrarEmpleado.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        MostrarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        MostrarEmpleado.setText("Mostrar");
        MostrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarEmpleadoActionPerformed(evt);
            }
        });

        NuevoEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        NuevoEmpleado.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        NuevoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        NuevoEmpleado.setText("Nuevo");
        NuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoEmpleadoActionPerformed(evt);
            }
        });

        EliminarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        EliminarEmpleado.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        EliminarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        EliminarEmpleado.setText("Eliminar");
        EliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarEmpleadoActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Registro", "Nomina", "Telefono", "Nombre", "Correo"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        Jefe.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Jefe.setText("JEFE");
        Jefe.setOpaque(false);
        Jefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JefeActionPerformed(evt);
            }
        });

        PanelEliminarEmpleado.setOpaque(false);

        jLabel18.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel18.setText("Empleado encontrado:");

        EliminarPorIDEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPorIDEmpleadoActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel25.setText("Eliminar por ID de Empleado:");

        MostrarEmpleadoEncontrado.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        MostrarEmpleadoEncontrado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        EliminarDefinitivoEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        EliminarDefinitivoEmpleado.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        EliminarDefinitivoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        EliminarDefinitivoEmpleado.setText("Eliminar Empleado");
        EliminarDefinitivoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarDefinitivoEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEliminarEmpleadoLayout = new javax.swing.GroupLayout(PanelEliminarEmpleado);
        PanelEliminarEmpleado.setLayout(PanelEliminarEmpleadoLayout);
        PanelEliminarEmpleadoLayout.setHorizontalGroup(
            PanelEliminarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEliminarEmpleadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(27, 27, 27))
            .addGroup(PanelEliminarEmpleadoLayout.createSequentialGroup()
                .addGroup(PanelEliminarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEliminarEmpleadoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(MostrarEmpleadoEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelEliminarEmpleadoLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(PanelEliminarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(EliminarPorIDEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelEliminarEmpleadoLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(EliminarDefinitivoEmpleado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelEliminarEmpleadoLayout.setVerticalGroup(
            PanelEliminarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEliminarEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EliminarPorIDEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MostrarEmpleadoEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EliminarDefinitivoEmpleado)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel34.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel34.setText("NOMINA: ");

        ModificarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        ModificarEmpleado.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ModificarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        ModificarEmpleado.setText("Modificar");
        ModificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarEmpleadoActionPerformed(evt);
            }
        });

        PanelModificar1.setOpaque(false);

        jLabel38.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel38.setText("ID:");

        jLabel39.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel39.setText("Modificar por ID: ");

        ModificarPorIDEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarPorIDEmpleadoActionPerformed(evt);
            }
        });

        ModificarYGuardar1.setBackground(new java.awt.Color(0, 0, 0));
        ModificarYGuardar1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        ModificarYGuardar1.setForeground(new java.awt.Color(255, 255, 255));
        ModificarYGuardar1.setText("MODIFICAR Y GUARDAR");
        ModificarYGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarYGuardar1ActionPerformed(evt);
            }
        });

        BuscarParaModificarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        BuscarParaModificarEmpleado.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BuscarParaModificarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        BuscarParaModificarEmpleado.setText("BUSCAR");

        javax.swing.GroupLayout PanelModificar1Layout = new javax.swing.GroupLayout(PanelModificar1);
        PanelModificar1.setLayout(PanelModificar1Layout);
        PanelModificar1Layout.setHorizontalGroup(
            PanelModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelModificar1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ModificarYGuardar1))
            .addGroup(PanelModificar1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelModificar1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BuscarParaModificarEmpleado)
                    .addComponent(ModificarPorIDEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelModificar1Layout.setVerticalGroup(
            PanelModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModificar1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(ModificarPorIDEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarParaModificarEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ModificarYGuardar1))
        );

        IDEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel26.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel26.setText("ID PROYECTO:");

        javax.swing.GroupLayout EmpleadoLayout = new javax.swing.GroupLayout(Empleado);
        Empleado.setLayout(EmpleadoLayout);
        EmpleadoLayout.setHorizontalGroup(
            EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpleadoLayout.createSequentialGroup()
                .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmpleadoLayout.createSequentialGroup()
                        .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmpleadoLayout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(1, 1, 1))
                            .addGroup(EmpleadoLayout.createSequentialGroup()
                                .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(EmpleadoLayout.createSequentialGroup()
                                            .addGap(59, 59, 59)
                                            .addComponent(jLabel19))
                                        .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(EmpleadoLayout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel23))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmpleadoLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel26)
                                                    .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))))))
                                    .addGroup(EmpleadoLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(Jefe)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nomina, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(EmpleadoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ProyectosRealizadossCheck))
                            .addComponent(IDEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(EmpleadoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel20))
                    .addGroup(EmpleadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GuardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmpleadoLayout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmpleadoLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(119, 119, 119))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmpleadoLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))))
                    .addGroup(EmpleadoLayout.createSequentialGroup()
                        .addComponent(EliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ModificarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MostrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EmpleadoLayout.createSequentialGroup()
                        .addComponent(PanelEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(EmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProyectosRealizadosEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EmpleadoLayout.setVerticalGroup(
            EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmpleadoLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EmpleadoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PanelEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185))
                            .addGroup(EmpleadoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(PanelModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(EmpleadoLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IDEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addGap(9, 9, 9)
                        .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(TelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(NombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProyectosRealizadossCheck)
                            .addComponent(Jefe))
                        .addGap(9, 9, 9)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProyectosRealizadosEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NuevoEmpleado)
                            .addComponent(GuardarEmpleado)
                            .addComponent(EliminarEmpleado)
                            .addComponent(ModificarEmpleado)
                            .addComponent(MostrarEmpleado))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(Empleado);
        Empleado.setBounds(510, 80, 100, 400);

        Cliente.setBackground(new java.awt.Color(153, 153, 153));
        Cliente.setMinimumSize(new java.awt.Dimension(629, 400));

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoActionPerformed(evt);
            }
        });

        Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setText("ID: ");

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setText("NOMBRE: ");

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel7.setText("TELEFONO:");

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel8.setText("TIPO:");

        AporteFinanciero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AporteFinancieroActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel9.setText("CORREO:");

        AporteFinCheck.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        AporteFinCheck.setText("APORTE FINANCIERO");
        AporteFinCheck.setOpaque(false);
        AporteFinCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AporteFinCheckActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel10.setText("Registro de todos los clientes");

        GuardarCliente.setBackground(new java.awt.Color(0, 0, 0));
        GuardarCliente.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        GuardarCliente.setForeground(new java.awt.Color(255, 255, 255));
        GuardarCliente.setText("Guardar");
        GuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarClienteActionPerformed(evt);
            }
        });

        MostarCliente.setBackground(new java.awt.Color(0, 0, 0));
        MostarCliente.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        MostarCliente.setForeground(new java.awt.Color(255, 255, 255));
        MostarCliente.setText("Mostrar");
        MostarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostarClienteActionPerformed(evt);
            }
        });

        NuevoCliente.setBackground(new java.awt.Color(0, 0, 0));
        NuevoCliente.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        NuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        NuevoCliente.setText("Nuevo");
        NuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoClienteActionPerformed(evt);
            }
        });

        EliminarCliente.setBackground(new java.awt.Color(0, 0, 0));
        EliminarCliente.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        EliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        EliminarCliente.setText("Eliminar");
        EliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarClienteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Registro", "ID", "Nombre", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Nombre");
        }

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel11.setText("EL CLIENTE ES: ");

        PanelEliminarCliente.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setText("Cliente encontrado:");

        PonerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PonerIDActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel12.setText("Eliminar por ID de Cliente:");

        jLabel16.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        EliminarClienteDefinitivo.setBackground(new java.awt.Color(0, 0, 0));
        EliminarClienteDefinitivo.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        EliminarClienteDefinitivo.setForeground(new java.awt.Color(255, 255, 255));
        EliminarClienteDefinitivo.setText("Eliminar Cliente");
        EliminarClienteDefinitivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarClienteDefinitivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEliminarClienteLayout = new javax.swing.GroupLayout(PanelEliminarCliente);
        PanelEliminarCliente.setLayout(PanelEliminarClienteLayout);
        PanelEliminarClienteLayout.setHorizontalGroup(
            PanelEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEliminarClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EliminarClienteDefinitivo)
                .addGap(41, 41, 41))
            .addGroup(PanelEliminarClienteLayout.createSequentialGroup()
                .addGroup(PanelEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEliminarClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelEliminarClienteLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(PanelEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PonerID, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(PanelEliminarClienteLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelEliminarClienteLayout.setVerticalGroup(
            PanelEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEliminarClienteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PonerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EliminarClienteDefinitivo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel35.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel35.setText("REGISTRAR NUEVO CLIENTE");

        idCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ModificarCliente.setBackground(new java.awt.Color(0, 0, 0));
        ModificarCliente.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ModificarCliente.setForeground(new java.awt.Color(255, 255, 255));
        ModificarCliente.setText("Modificar");
        ModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarClienteActionPerformed(evt);
            }
        });

        PanelModificar3.setOpaque(false);

        jLabel42.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel42.setText("ID:");

        jLabel43.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel43.setText("Modificar por ID: ");

        ModificarPorIDEmpleado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarPorIDEmpleado2ActionPerformed(evt);
            }
        });

        ModificarYGuardar3.setBackground(new java.awt.Color(0, 0, 0));
        ModificarYGuardar3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        ModificarYGuardar3.setForeground(new java.awt.Color(255, 255, 255));
        ModificarYGuardar3.setText("MODIFICAR Y GUARDAR");
        ModificarYGuardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarYGuardar3ActionPerformed(evt);
            }
        });

        BuscarParaModificarEmpleado2.setBackground(new java.awt.Color(0, 0, 0));
        BuscarParaModificarEmpleado2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BuscarParaModificarEmpleado2.setForeground(new java.awt.Color(255, 255, 255));
        BuscarParaModificarEmpleado2.setText("BUSCAR");

        javax.swing.GroupLayout PanelModificar3Layout = new javax.swing.GroupLayout(PanelModificar3);
        PanelModificar3.setLayout(PanelModificar3Layout);
        PanelModificar3Layout.setHorizontalGroup(
            PanelModificar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelModificar3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ModificarYGuardar3))
            .addGroup(PanelModificar3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelModificar3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelModificar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BuscarParaModificarEmpleado2)
                    .addComponent(ModificarPorIDEmpleado2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelModificar3Layout.setVerticalGroup(
            PanelModificar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModificar3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelModificar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(ModificarPorIDEmpleado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarParaModificarEmpleado2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ModificarYGuardar3))
        );

        TipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar tipo", "Persona", "Empresa" }));

        javax.swing.GroupLayout ClienteLayout = new javax.swing.GroupLayout(Cliente);
        Cliente.setLayout(ClienteLayout);
        ClienteLayout.setHorizontalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createSequentialGroup()
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClienteLayout.createSequentialGroup()
                        .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ClienteLayout.createSequentialGroup()
                                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ClienteLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(Correo, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(Telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(TipoCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(ClienteLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AporteFinanciero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(PanelEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelModificar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ClienteLayout.createSequentialGroup()
                        .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ClienteLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(AporteFinCheck))
                            .addGroup(ClienteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(GuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ClienteLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ClienteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MostarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ClienteLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(131, 131, 131))
            .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ClienteLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel11)
                    .addContainerGap(581, Short.MAX_VALUE)))
        );
        ClienteLayout.setVerticalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ClienteLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(66, 66, 66))
                    .addGroup(ClienteLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ClienteLayout.createSequentialGroup()
                        .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ClienteLayout.createSequentialGroup()
                                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(TipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(PanelModificar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(AporteFinCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AporteFinanciero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarCliente)
                    .addComponent(NuevoCliente)
                    .addComponent(EliminarCliente)
                    .addComponent(ModificarCliente)
                    .addComponent(MostarCliente))
                .addGap(26, 26, 26))
            .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ClienteLayout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jLabel11)
                    .addContainerGap(332, Short.MAX_VALUE)))
        );

        PanelEliminarCliente.getAccessibleContext().setAccessibleName("");

        getContentPane().add(Cliente);
        Cliente.setBounds(270, 80, 120, 400);

        ModificarUsuario.setBackground(new java.awt.Color(153, 153, 153));

        jLabel29.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel29.setText("MODIFICAR USUARIO");

        jLabel31.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel31.setText("ID: ");

        jLabel40.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel40.setText("CONTRASEÑA:");

        IDUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NombreNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreNuevoUsuarioActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        NombreEmpleado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreEmpleado2ActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel44.setText("NOMBRE:");

        GuardarModificarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        GuardarModificarUsuario.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        GuardarModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        GuardarModificarUsuario.setText("Guardar");
        GuardarModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarModificarUsuarioActionPerformed(evt);
            }
        });

        DescartarRegresar.setBackground(new java.awt.Color(0, 0, 0));
        DescartarRegresar.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        DescartarRegresar.setForeground(new java.awt.Color(255, 255, 255));
        DescartarRegresar.setText("Descartar");
        DescartarRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescartarRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ModificarUsuarioLayout = new javax.swing.GroupLayout(ModificarUsuario);
        ModificarUsuario.setLayout(ModificarUsuarioLayout);
        ModificarUsuarioLayout.setHorizontalGroup(
            ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(57, 57, 57))
            .addGroup(ModificarUsuarioLayout.createSequentialGroup()
                .addGroup(ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModificarUsuarioLayout.createSequentialGroup()
                        .addGroup(ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ModificarUsuarioLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel41)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarUsuarioLayout.createSequentialGroup()
                                .addGroup(ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ModificarUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ModificarUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NombreEmpleado2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ModificarUsuarioLayout.createSequentialGroup()
                                .addComponent(GuardarModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DescartarRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ModificarUsuarioLayout.setVerticalGroup(
            ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addGroup(ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(IDUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addComponent(NombreNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(NombreEmpleado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addGroup(ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarModificarUsuario)
                    .addComponent(DescartarRegresar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(ModificarUsuario);
        ModificarUsuario.setBounds(650, 150, 280, 227);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1001, 501);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProyectoActionPerformed
        Cliente.setVisible(false);
        Empleado.setVisible(false);
        Proyecto.setBounds(270, 80, 700, 411);
        PanelEliminarProyecto.setVisible(false);
        PanelModificar.setVisible(false);
        ModificarUsuario.setVisible(false);
        Proyecto.setVisible(true);
    }//GEN-LAST:event_botonProyectoActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        PANTALLAuser pan = new PANTALLAuser();
        pan.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void botonEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleadoActionPerformed
        ModificarUsuario.setVisible(false);
        Cliente.setVisible(false);
        Empleado.setBounds(270, 80, 700, 411);
        PanelEliminarEmpleado.setVisible(false);
        IDEmpleado.setText(String.valueOf(ConGuardar.RegresarID()));
        PanelModificar1.setVisible(false);
        Proyecto.setVisible(false);
        Empleado.setVisible(true);
    }//GEN-LAST:event_botonEmpleadoActionPerformed

    private void botonModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarUsuarioActionPerformed
        Cliente.setBounds(270, 80, 700, 411);
        ModificarUsuario.setVisible(false);
        PanelEliminarCliente.setVisible(false);
        Empleado.setVisible(false);
        PanelModificar3.setVisible(false);
        Proyecto.setVisible(false);

        idCliente.setText(String.valueOf(ConGuardar.RegresarID()));

        Cliente.setVisible(true);
    }//GEN-LAST:event_botonModificarUsuarioActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoActionPerformed

    private void CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoActionPerformed

    private void AporteFinancieroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AporteFinancieroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AporteFinancieroActionPerformed

    private void AporteFinCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AporteFinCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AporteFinCheckActionPerformed

    private void GuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarClienteActionPerformed
//       //aquiii
        String NombreCliente = Nombre.getText();
        String Tel = Telefono.getText();
        String Co = Correo.getText();
        String tipoClie = String.valueOf(TipoCliente.getSelectedItem());
        Boolean aporte = AporteFinCheck.isSelected();
        Double AporteFin;

        try {
            AporteFin = Double.parseDouble(AporteFinanciero.getText());
        } catch (Exception e) {
            AporteFin = 0.0;
        }
        int[] Guardado = ConGuardar.GuardarCliente(NombreCliente, Tel, Co, aporte, AporteFin, tipoClie);
        if (Guardado[0] == 0) {
            JOptionPane.showMessageDialog(this, "Se hizo la mazhaka", "Guardado", JOptionPane.INFORMATION_MESSAGE);
            Nombre.setText("");
            Telefono.setText("");
            Correo.setText("");
            TipoCliente.setSelectedItem("Seleccionar Tipo");
            AporteFinCheck.setSelected(false);
            idCliente.setText(String.valueOf(ConGuardar.RegresarID()));
            AporteFin = 0.0;//////
        } else {
            JOptionPane.showMessageDialog(this, "No se hizo la mazhaka", "No guardado", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_GuardarClienteActionPerformed

    private void MostarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MostarClienteActionPerformed

    private void NuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoClienteActionPerformed

    private void EliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarClienteActionPerformed
        PanelEliminarCliente.setBounds(290, 150, 211, 165);
        PanelEliminarCliente.setVisible(true);
    }//GEN-LAST:event_EliminarClienteActionPerformed

    private void NombreProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreProyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreProyectoActionPerformed

    private void PresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresupuestoActionPerformed

    }//GEN-LAST:event_PresupuestoActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void GuardarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarProyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarProyectoActionPerformed

    private void MostrarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarProyectoActionPerformed

    }//GEN-LAST:event_MostrarProyectoActionPerformed

    private void NuevoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoProyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoProyectoActionPerformed

    private void EliminarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarProyectoActionPerformed
        PanelEliminarProyecto.setBounds(290, 150, 211, 165);
        PanelEliminarProyecto.setVisible(true);
    }//GEN-LAST:event_EliminarProyectoActionPerformed

    private void NominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NominaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NominaActionPerformed

    private void TelefonoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoEmpleadoActionPerformed

    private void CorreoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoEmpleadoActionPerformed

    private void NombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreEmpleadoActionPerformed

    private void ProyectosRealizadosEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProyectosRealizadosEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProyectosRealizadosEmpleadosActionPerformed

    private void ProyectosRealizadossCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProyectosRealizadossCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProyectosRealizadossCheckActionPerformed

    private void GuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarEmpleadoActionPerformed
        //AQUI
        String nomina = Nomina.getText();
        String Telefono = TelefonoEmpleado.getText();
        String Nombre = NombreEmpleado.getText();
        String Correo = CorreoEmpleado.getText();
        Boolean jefe = Jefe.isSelected();
        Boolean proyectosRe = ProyectosRealizadossCheck.isSelected();
        int ListaProyectos;
       
        
        try {
            ListaProyectos= Integer.parseInt(ProyectosRealizadosEmpleados.getText());
        } catch (Exception e) {
            ListaProyectos=0;
            System.out.println("Entro aqui");
        }
        int Guardado;
        if (jefe) {
            Guardado=ConGuardar.GuardarEmpleadoConPro(nomina, Telefono, Nombre, Correo, jefe,ListaProyectos);
        }else{
            Guardado= ConGuardar.GuardarEmpleadoSinPro(nomina, Telefono, Nombre, Correo, jefe);
        }
        
        if (Guardado == 0) {
            JOptionPane.showMessageDialog(this, "Se hizo la mazhaka", "Guardado", JOptionPane.INFORMATION_MESSAGE);
            Nomina.setText("");
            TelefonoEmpleado.setText("");
            NombreEmpleado.setText("");
            CorreoEmpleado.setText("");
            Jefe.setSelected(false);
            ProyectosRealizadossCheck.setSelected(false);
            ProyectosRealizadosEmpleados.setText("");
            IDEmpleado.setText(String.valueOf(ConGuardar.RegresarID()));
        } else {
            JOptionPane.showMessageDialog(this, "No se hizo la mazhaka", "No guardado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_GuardarEmpleadoActionPerformed

    private void MostrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MostrarEmpleadoActionPerformed

    private void NuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoEmpleadoActionPerformed

    private void EliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarEmpleadoActionPerformed
        PanelEliminarEmpleado.setBounds(290, 150, 211, 165);
        PanelEliminarEmpleado.setVisible(true);
    }//GEN-LAST:event_EliminarEmpleadoActionPerformed

    private void JefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JefeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JefeActionPerformed

    private void PonerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PonerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PonerIDActionPerformed

    private void EliminarPorIDEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPorIDEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarPorIDEmpleadoActionPerformed

    private void ResidenciaProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResidenciaProyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResidenciaProyectoActionPerformed

    private void IDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDClienteActionPerformed

    private void EliminarDefinitivoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarDefinitivoEmpleadoActionPerformed
        PanelEliminarEmpleado.setBounds(0, 0, 0, 0);
    }//GEN-LAST:event_EliminarDefinitivoEmpleadoActionPerformed

    private void EliminarClienteDefinitivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarClienteDefinitivoActionPerformed
        PanelEliminarCliente.setBounds(0, 0, 0, 0);
    }//GEN-LAST:event_EliminarClienteDefinitivoActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        PanelModificar.setBounds(500, 140, 171, 140);
        PanelModificar.setVisible(true);
    }//GEN-LAST:event_ModificarActionPerformed

    private void ModificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarEmpleadoActionPerformed
        PanelModificar1.setBounds(500, 140, 171, 140);
        PanelModificar1.setVisible(true);
    }//GEN-LAST:event_ModificarEmpleadoActionPerformed

    private void ModificarPorIDEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarPorIDEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarPorIDEmpleadoActionPerformed

    private void ModificarYGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarYGuardar1ActionPerformed
        PanelModificar1.setBounds(0, 0, 0, 0);
    }//GEN-LAST:event_ModificarYGuardar1ActionPerformed

    private void ModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarClienteActionPerformed
        PanelModificar3.setBounds(500, 140, 171, 140);
        PanelModificar3.setVisible(true);
    }//GEN-LAST:event_ModificarClienteActionPerformed

    private void ModificarPorIDEmpleado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarPorIDEmpleado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarPorIDEmpleado2ActionPerformed

    private void ModificarYGuardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarYGuardar3ActionPerformed
        PanelModificar3.setBounds(0, 0, 0, 0);
    }//GEN-LAST:event_ModificarYGuardar3ActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        ModificarUsuario.setBounds(500, 180, 284, 227);

        PanelEliminarCliente.setVisible(false);
        Empleado.setVisible(false);
        PanelModificar3.setVisible(false);
        Proyecto.setVisible(false);
        Cliente.setVisible(false);
        ModificarUsuario.setVisible(true);
    }//GEN-LAST:event_botonModificarActionPerformed

    private void NombreNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreNuevoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreNuevoUsuarioActionPerformed

    private void NombreEmpleado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreEmpleado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreEmpleado2ActionPerformed

    private void GuardarModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarModificarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarModificarUsuarioActionPerformed

    private void DescartarRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescartarRegresarActionPerformed
        ModificarUsuario.setBounds(0, 0, 0, 0);
    }//GEN-LAST:event_DescartarRegresarActionPerformed

    private void IDjefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDjefeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDjefeActionPerformed

    private void IDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VENTANA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VENTANA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VENTANA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VENTANA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VENTANA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AporteFinCheck;
    private javax.swing.JTextField AporteFinanciero;
    private javax.swing.JButton BuscarParaModificarEmpleado;
    private javax.swing.JButton BuscarParaModificarEmpleado2;
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JPanel Cliente;
    private javax.swing.JTextField Correo;
    private javax.swing.JTextField CorreoEmpleado;
    private javax.swing.JButton DescartarRegresar;
    private javax.swing.JButton EliminarCliente;
    private javax.swing.JButton EliminarClienteDefinitivo;
    private javax.swing.JButton EliminarDefinitivoEmpleado;
    private javax.swing.JButton EliminarEmpleado;
    private javax.swing.JTextField EliminarPorIDEmpleado;
    private javax.swing.JButton EliminarProyecto;
    private javax.swing.JPanel Empleado;
    private javax.swing.JButton GuardarCliente;
    private javax.swing.JButton GuardarEmpleado;
    private javax.swing.JButton GuardarModificarUsuario;
    private javax.swing.JButton GuardarProyecto;
    private javax.swing.JTextField IDCliente;
    private javax.swing.JLabel IDEmpleado;
    private javax.swing.JLabel IDUsuario;
    private javax.swing.JTextField IDe;
    private javax.swing.JTextField IDjefe;
    private javax.swing.JCheckBox Jefe;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton ModificarCliente;
    private javax.swing.JButton ModificarEmpleado;
    private javax.swing.JTextField ModificarPorIDEmpleado;
    private javax.swing.JTextField ModificarPorIDEmpleado2;
    private javax.swing.JPanel ModificarUsuario;
    private javax.swing.JButton ModificarYGuardar1;
    private javax.swing.JButton ModificarYGuardar3;
    private javax.swing.JButton MostarCliente;
    private javax.swing.JButton MostrarEmpleado;
    private javax.swing.JLabel MostrarEmpleadoEncontrado;
    private javax.swing.JButton MostrarProyecto;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NombreEmpleado;
    private javax.swing.JTextField NombreEmpleado2;
    private javax.swing.JTextField NombreNuevoUsuario;
    private javax.swing.JTextField NombreProyecto;
    private javax.swing.JTextField Nomina;
    private javax.swing.JButton NuevoCliente;
    private javax.swing.JButton NuevoEmpleado;
    private javax.swing.JButton NuevoProyecto;
    private javax.swing.JPanel PanelEliminarCliente;
    private javax.swing.JPanel PanelEliminarEmpleado;
    private javax.swing.JPanel PanelModificar1;
    private javax.swing.JPanel PanelModificar3;
    private javax.swing.JLabel PintarNombreUsuario;
    private javax.swing.JTextField PonerID;
    private javax.swing.JTextField Presupuesto;
    private javax.swing.JPanel Proyecto;
    private javax.swing.JTextField ProyectosRealizadosEmpleados;
    private javax.swing.JCheckBox ProyectosRealizadossCheck;
    private javax.swing.JTextField ResidenciaProyecto;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField TelefonoEmpleado;
    private javax.swing.JComboBox<String> TipoCliente;
    private javax.swing.JComboBox<String> TipoProyecto;
    private javax.swing.JButton botonEmpleado;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonModificarUsuario;
    private javax.swing.JButton botonProyecto;
    private javax.swing.JLabel idCliente;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
