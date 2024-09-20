package paqueteinicial;

import java.awt.event.ItemEvent;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class VentanaInicial extends javax.swing.JFrame
{
    private double total = 0;
    private ButtonGroup group = new ButtonGroup();
    private double precio;
    private boolean timerActivo = false;
    
    public VentanaInicial() 
    {
        initComponents();
        agruparBotones();
        
        setResizable(false);
        
        importe.setEditable(false);
        importe.setFocusable(false);
        cambio.setEditable(false);
        cambio.setFocusable(false);
        saldo.setEditable(false);
        saldo.setFocusable(false);
        productoVendido.setEditable(false);
        productoVendido.setFocusable(false);
    }
    
    private void agruparBotones()
    {
        group.add(cocaCola);
        group.add(pepsi);
        group.add(fanta);
        group.add(sabritas);
        group.add(cheetos);
        group.add(ruffles);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        precioSabritas = new javax.swing.JLabel();
        sabritas = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        precioCheetos = new javax.swing.JLabel();
        cheetos = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        precioRuffles = new javax.swing.JLabel();
        ruffles = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        precioRuffles1 = new javax.swing.JLabel();
        fanta = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        precioSabritas1 = new javax.swing.JLabel();
        cocaCola = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        precioCheetos1 = new javax.swing.JLabel();
        pepsi = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        etiquetaMonedas = new javax.swing.JLabel();
        monedas = new javax.swing.JComboBox<>();
        ingresarMoneda = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        etiquetaBilletes = new javax.swing.JLabel();
        billetes = new javax.swing.JComboBox<>();
        ingresarBillete = new javax.swing.JButton();
        mensajeImporte = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        pagar = new javax.swing.JButton();
        cambio = new javax.swing.JTextField();
        cancelar = new javax.swing.JLabel();
        importe = new javax.swing.JTextField();
        saldo = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        importesAceptados = new javax.swing.JLabel();
        importesAceptados1 = new javax.swing.JLabel();
        importesAceptados2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        productoVendido = new javax.swing.JTextField();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(28, 28, 28));
        jPanel1.setForeground(new java.awt.Color(28, 28, 28));

        jLabel1.setFont(new java.awt.Font("DM Serif Display", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(244, 107, 82));
        jLabel1.setText("Maquina");

        jLabel2.setFont(new java.awt.Font("DM Serif Display", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(244, 107, 82));
        jLabel2.setText("Expendedora");

        jPanel2.setBackground(new java.awt.Color(240, 238, 234));

        precioSabritas.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        precioSabritas.setForeground(new java.awt.Color(82, 81, 81));
        precioSabritas.setText("$15");

        sabritas.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        sabritas.setForeground(new java.awt.Color(82, 81, 81));
        sabritas.setText("Sabritas");
        sabritas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sabritasItemStateChanged(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/sabritas.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(precioSabritas))
                            .addComponent(sabritas)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(sabritas)
                .addGap(7, 7, 7)
                .addComponent(precioSabritas)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(240, 238, 234));

        precioCheetos.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        precioCheetos.setForeground(new java.awt.Color(82, 81, 81));
        precioCheetos.setText("$14");

        cheetos.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        cheetos.setForeground(new java.awt.Color(82, 81, 81));
        cheetos.setText("Cheetos");
        cheetos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cheetosItemStateChanged(evt);
            }
        });
        cheetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheetosActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cheetos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(precioCheetos))
                            .addComponent(cheetos)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(cheetos)
                .addGap(7, 7, 7)
                .addComponent(precioCheetos)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(240, 238, 234));

        precioRuffles.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        precioRuffles.setForeground(new java.awt.Color(82, 81, 81));
        precioRuffles.setText("$14");

        ruffles.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        ruffles.setForeground(new java.awt.Color(82, 81, 81));
        ruffles.setText("Ruffles");
        ruffles.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rufflesItemStateChanged(evt);
            }
        });
        ruffles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rufflesActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ruffles.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(precioRuffles))
                            .addComponent(ruffles)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ruffles)
                .addGap(7, 7, 7)
                .addComponent(precioRuffles)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(240, 238, 234));

        precioRuffles1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        precioRuffles1.setForeground(new java.awt.Color(82, 81, 81));
        precioRuffles1.setText("$14");

        fanta.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        fanta.setForeground(new java.awt.Color(82, 81, 81));
        fanta.setText("Fanta");
        fanta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fantaItemStateChanged(evt);
            }
        });
        fanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fantaActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fanta.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(precioRuffles1))
                            .addComponent(fanta)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(fanta)
                .addGap(7, 7, 7)
                .addComponent(precioRuffles1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(240, 238, 234));

        precioSabritas1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        precioSabritas1.setForeground(new java.awt.Color(82, 81, 81));
        precioSabritas1.setText("$20");

        cocaCola.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        cocaCola.setForeground(new java.awt.Color(82, 81, 81));
        cocaCola.setText("CocaCola");
        cocaCola.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cocaColaItemStateChanged(evt);
            }
        });
        cocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocaColaActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cocacola.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(precioSabritas1))
                            .addComponent(cocaCola)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(cocaCola)
                .addGap(7, 7, 7)
                .addComponent(precioSabritas1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(240, 238, 234));

        precioCheetos1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        precioCheetos1.setForeground(new java.awt.Color(82, 81, 81));
        precioCheetos1.setText("$16");

        pepsi.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pepsi.setForeground(new java.awt.Color(82, 81, 81));
        pepsi.setText("Pepsi");
        pepsi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pepsiItemStateChanged(evt);
            }
        });
        pepsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepsiActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pepsi.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(precioCheetos1))
                        .addComponent(pepsi)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(pepsi)
                .addGap(7, 7, 7)
                .addComponent(precioCheetos1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(82, 81, 81));

        jPanel9.setBackground(new java.awt.Color(240, 238, 234));

        etiquetaMonedas.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        etiquetaMonedas.setText("Monedas");

        monedas.setBackground(new java.awt.Color(240, 238, 234));
        monedas.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        monedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "$1", "$2", "$5", "$10" }));

        ingresarMoneda.setBackground(new java.awt.Color(244, 107, 82));
        ingresarMoneda.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        ingresarMoneda.setText("Ingresar");
        ingresarMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarMonedaActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(81, 82, 82));

        etiquetaBilletes.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        etiquetaBilletes.setText("Billetes");

        billetes.setBackground(new java.awt.Color(240, 238, 234));
        billetes.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        billetes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "$20", "$50", "$100" }));

        ingresarBillete.setBackground(new java.awt.Color(244, 107, 82));
        ingresarBillete.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        ingresarBillete.setText("Ingresar");
        ingresarBillete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBilleteActionPerformed(evt);
            }
        });

        mensajeImporte.setFont(new java.awt.Font("Montserrat", 2, 12)); // NOI18N
        mensajeImporte.setText("Ingrese el importe");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(ingresarBillete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(etiquetaMonedas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monedas, 0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(etiquetaBilletes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(billetes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ingresarMoneda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mensajeImporte, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensajeImporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaMonedas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresarMoneda)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaBilletes)
                    .addComponent(billetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresarBillete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(240, 238, 234));

        pagar.setBackground(new java.awt.Color(244, 107, 82));
        pagar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        pagar.setText("Pagar");
        pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarActionPerformed(evt);
            }
        });

        cambio.setBackground(new java.awt.Color(240, 238, 234));
        cambio.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        cambio.setText("Cambio:");

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancelar.png"))); // NOI18N
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cambio))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(cancelar)
                .addGap(70, 70, 70))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pagar)
                .addGap(18, 18, 18)
                .addComponent(cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        importe.setBackground(new java.awt.Color(240, 238, 234));
        importe.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        importe.setText("Importe a pagar: ");

        saldo.setBackground(new java.awt.Color(240, 238, 234));
        saldo.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        saldo.setText("Saldo Total: $0");

        jPanel8.setBackground(new java.awt.Color(240, 238, 234));

        importesAceptados.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        importesAceptados.setText("Importes Aceptados:");

        importesAceptados1.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        importesAceptados1.setText("Monedas: $1, $2, $5, $10");

        importesAceptados2.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        importesAceptados2.setText("Billetes: $20, $50, $100");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(importesAceptados1)
                            .addComponent(importesAceptados2)))
                    .addComponent(importesAceptados))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(importesAceptados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(importesAceptados1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(importesAceptados2)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saldo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(importe)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tome su Producto");

        productoVendido.setBackground(new java.awt.Color(240, 238, 234));
        productoVendido.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productoVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(102, 102, 102)))
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(productoVendido))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cheetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheetosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cheetosActionPerformed

    private void rufflesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rufflesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rufflesActionPerformed

    private void pepsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pepsiActionPerformed

    private void fantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fantaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fantaActionPerformed

    private void pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarActionPerformed
        if(!timerActivo)
        {
            realizarVenta();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Espere un segundo antes de volver a comprar.");
        }
    }//GEN-LAST:event_pagarActionPerformed

    private void ingresarMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarMonedaActionPerformed
        agregarAlTotal(monedas);
    }//GEN-LAST:event_ingresarMonedaActionPerformed

    private void ingresarBilleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBilleteActionPerformed
        agregarAlTotal(billetes);
    }//GEN-LAST:event_ingresarBilleteActionPerformed

    private void cocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocaColaActionPerformed
        
    }//GEN-LAST:event_cocaColaActionPerformed

    private void cocaColaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cocaColaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            actualizarImporte(20);
        }
    }//GEN-LAST:event_cocaColaItemStateChanged

    private void pepsiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pepsiItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            actualizarImporte(16);
        }
    }//GEN-LAST:event_pepsiItemStateChanged

    private void fantaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fantaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            actualizarImporte(14);
        }
    }//GEN-LAST:event_fantaItemStateChanged

    private void sabritasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sabritasItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            actualizarImporte(15);
        }
    }//GEN-LAST:event_sabritasItemStateChanged

    private void cheetosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cheetosItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            actualizarImporte(14);
        }
    }//GEN-LAST:event_cheetosItemStateChanged

    private void rufflesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rufflesItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            actualizarImporte(14);
        }
    }//GEN-LAST:event_rufflesItemStateChanged

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        resetearParametros();
    }//GEN-LAST:event_cancelarMouseClicked
    
    private void resetearParametros()
    {
        cambio(total);
        productoVendido.setText("");
        saldo.setText("Saldo Total: $0");
        total = 0;
    }
    
    private void agregarAlTotal(JComboBox<String> comboBox)
    {
        String valorSeleccionado = comboBox.getSelectedItem().toString().substring(1);
        double cantidad = Double.parseDouble(valorSeleccionado);
        total += cantidad;
        actualizarSaldo();
    }
    
    private void actualizarImporte(double precio)
    {
        importe.setText("Importe a pagar: $" + precio);
    }
    
    private void entregarProducto(String nombreProducto)
    {
        productoVendido.setText("Tome su(s) " + nombreProducto);
    }
    
    private void actualizarSaldo()
    {
        saldo.setText("Saldo total: $" + total);
    }
    
    private void realizarVenta()
    {
        if(cocaCola.isSelected())
        {
            precio = 20;
            verificarSaldo("Coca-Cola");
        }
        else if(pepsi.isSelected())
        {
            precio = 16;
            verificarSaldo("Pepsi");
        }
        else if(fanta.isSelected())
        {
            precio = 14;
            verificarSaldo("Fanta");
        }
        else if(sabritas.isSelected())
        {
            precio = 15;
            verificarSaldo("Sabritas Adobadas");
        }
        else if(cheetos.isSelected())
        {
            precio = 14;
            verificarSaldo("Cheetos Colmillitos");
        }
        else if(ruffles.isSelected())
        {
            precio = 20;
            verificarSaldo("Ruffles");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Seleccione un producto.");
        }
    }
    
    private void verificarSaldo(String nombreProd)
    {
        if(total >= precio)
        {
            double cambio = total - precio;
            reiniciarSeleccion();
            cambio(cambio);
            entregarProducto(nombreProd);
        }
        else if(total == 0)
        {
            JOptionPane.showMessageDialog(null, "Ingrese la cantidad necesaria");
        }
        else
        {
            cambio(total);
        }
    }
    
    private void reiniciarSeleccion()
    {
        total = 0;
        actualizarSaldo();
        agruparBotones();
    }
    
    private void cambio(double cantidad)
    {
        cambio.setText("Devuelto $" + cantidad);
    }
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> billetes;
    private javax.swing.JTextField cambio;
    private javax.swing.JLabel cancelar;
    private javax.swing.JRadioButton cheetos;
    private javax.swing.JRadioButton cocaCola;
    private javax.swing.JLabel etiquetaBilletes;
    private javax.swing.JLabel etiquetaMonedas;
    private javax.swing.JRadioButton fanta;
    private javax.swing.JTextField importe;
    private javax.swing.JLabel importesAceptados;
    private javax.swing.JLabel importesAceptados1;
    private javax.swing.JLabel importesAceptados2;
    private javax.swing.JButton ingresarBillete;
    private javax.swing.JButton ingresarMoneda;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel mensajeImporte;
    private javax.swing.JComboBox<String> monedas;
    private javax.swing.JButton pagar;
    private javax.swing.JRadioButton pepsi;
    private javax.swing.JLabel precioCheetos;
    private javax.swing.JLabel precioCheetos1;
    private javax.swing.JLabel precioRuffles;
    private javax.swing.JLabel precioRuffles1;
    private javax.swing.JLabel precioSabritas;
    private javax.swing.JLabel precioSabritas1;
    private javax.swing.JTextField productoVendido;
    private javax.swing.JRadioButton ruffles;
    private javax.swing.JRadioButton sabritas;
    private javax.swing.JTextField saldo;
    // End of variables declaration//GEN-END:variables
}
