/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kent;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class kentmaine extends javax.swing.JFrame {

    /**
     * Creates new form kentmaine
     */
    public kentmaine() {
        initComponents();
    }

    double ProcessorPrice,MemoryPrice,DiskPrice,WindowsPrice,OfficePrice,AccountingPrice,GraphicsPrice,TotalPrice;
    String name1,name2,name3,name4,name5,name6,name7;  
    public kentmaine(double ProcessorPrice, JTextField AccountingOP, JButton CalculateButton, JButton ClearButton, JComboBox<String> DiskCB, JLabel DiskLabel, JTextField DiskOP, JButton ExitButton, JTextField GraphicsOP, JLabel HardwareIntelLogo, JLabel HardwareLogo, JComboBox<String> MemoryCB, JLabel MemoryLabel, JTextField MemoryOP, JTextField OfficeOP, JTextField ProcessOP, JComboBox<String> ProcessorCB, JLabel ProcessorLabel, JTextField TotalOP, JTextField WindowsOP, JCheckBox jCheckBox1, JCheckBox jCheckBox2, JCheckBox jCheckBox3, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JPanel jPanel1, JPanel jPanel2, JPanel jPanel3, JPanel jPanel4, JRadioButton jRadioButton1, JRadioButton jRadioButton2) throws HeadlessException {
        this.ProcessorPrice = ProcessorPrice;
        this.AccountingOP = AccountingOP;
        this.CalculateButton = CalculateButton;
        this.ClearButton = ClearButton;
        this.DiskCB = DiskCB;
        this.DiskLabel = DiskLabel;
        this.DiskOP = DiskOP;
        this.ExitButton = ExitButton;
        this.GraphicsOP = GraphicsOP;
        this.HardwareIntelLogo = HardwareIntelLogo;
        this.HardwareLogo = HardwareLogo;
        this.MemoryCB = MemoryCB;
        this.MemoryLabel = MemoryLabel;
        this.MemoryOP = MemoryOP;
        this.OfficeOP = OfficeOP;
        this.ProcessOP = ProcessOP;
        this.ProcessorCB = ProcessorCB;
        this.ProcessorLabel = ProcessorLabel;
        this.TotalOP = TotalOP;
        this.WindowsOP = WindowsOP;
        this.OfficeBox = jCheckBox1;
        this.AccountingBox = jCheckBox2;
        this.GraphicsBox = jCheckBox3;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jPanel1 = jPanel1;
        this.jPanel2 = jPanel2;
        this.jPanel3 = jPanel3;
        this.jPanel4 = jPanel4;
        this.WindowButton = jRadioButton1;
        this.Window2Button = jRadioButton2;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        HardwareLogo = new javax.swing.JLabel();
        ProcessorLabel = new javax.swing.JLabel();
        MemoryLabel = new javax.swing.JLabel();
        DiskLabel = new javax.swing.JLabel();
        ProcessorCB = new javax.swing.JComboBox<String>();
        MemoryCB = new javax.swing.JComboBox<String>();
        DiskCB = new javax.swing.JComboBox<String>();
        ProcessOP = new javax.swing.JTextField();
        MemoryOP = new javax.swing.JTextField();
        DiskOP = new javax.swing.JTextField();
        HardwareIntelLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        WindowButton = new javax.swing.JRadioButton();
        Window2Button = new javax.swing.JRadioButton();
        WindowsOP = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        OfficeBox = new javax.swing.JCheckBox();
        AccountingBox = new javax.swing.JCheckBox();
        GraphicsBox = new javax.swing.JCheckBox();
        OfficeOP = new javax.swing.JTextField();
        AccountingOP = new javax.swing.JTextField();
        GraphicsOP = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        CalculateButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        TotalOP = new javax.swing.JTextField();
        ExitButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        RecieptHardware = new javax.swing.JTextField();
        RecieptSoftware = new javax.swing.JTextField();

        setTitle("KentronicxZ Computer Parts and Services");
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImages(null);
        setName("COMPUTER PARTS AND SERVICES"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        HardwareLogo.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        HardwareLogo.setForeground(new java.awt.Color(0, 153, 255));
        HardwareLogo.setText("Hardware Components");

        ProcessorLabel.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        ProcessorLabel.setForeground(new java.awt.Color(0, 153, 255));
        ProcessorLabel.setText("Processor");

        MemoryLabel.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        MemoryLabel.setForeground(new java.awt.Color(0, 153, 255));
        MemoryLabel.setText("Memory");

        DiskLabel.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        DiskLabel.setForeground(new java.awt.Color(0, 153, 255));
        DiskLabel.setText("Disk");

        ProcessorCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "DUO 3.2 Ghz", "P4 2.2 Ghz", "P4 2 Ghz" }));
        ProcessorCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessorCBActionPerformed(evt);
            }
        });

        MemoryCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "6 Gb", "4 Gb", "2 Gb" }));
        MemoryCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemoryCBActionPerformed(evt);
            }
        });

        DiskCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "1 Tb", "500 Gb", "320 Gb" }));
        DiskCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiskCBActionPerformed(evt);
            }
        });

        ProcessOP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MemoryOP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        DiskOP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        HardwareIntelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kent/Intel_Inside.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HardwareIntelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(HardwareLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MemoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProcessorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DiskLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ProcessorCB, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MemoryCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DiskCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ProcessOP)
                                    .addComponent(MemoryOP)
                                    .addComponent(DiskOP))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HardwareLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HardwareIntelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProcessorCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProcessorLabel))
                .addGap(26, 26, 26)
                .addComponent(ProcessOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(MemoryOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiskCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiskLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(DiskOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 11, -1, 586));

        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Software Packages");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/softwarewindows7.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/Windows-10-logo-e1450448690621.jpg"))); // NOI18N

        WindowButton.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        WindowButton.setForeground(new java.awt.Color(102, 0, 102));
        WindowButton.setText("Windows 7");
        WindowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WindowButtonActionPerformed(evt);
            }
        });

        Window2Button.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        Window2Button.setForeground(new java.awt.Color(102, 0, 102));
        Window2Button.setText("Windows 10");
        Window2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Window2ButtonActionPerformed(evt);
            }
        });

        WindowsOP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(WindowsOP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(Window2Button))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(WindowButton)
                        .addGap(63, 63, 63))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(WindowButton)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(Window2Button)
                .addGap(18, 18, 18)
                .addComponent(WindowsOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 11, -1, 586));

        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        OfficeBox.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        OfficeBox.setForeground(new java.awt.Color(102, 0, 102));
        OfficeBox.setText("Office Package");
        OfficeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OfficeBoxActionPerformed(evt);
            }
        });

        AccountingBox.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        AccountingBox.setForeground(new java.awt.Color(102, 0, 102));
        AccountingBox.setText("Accounting Package");
        AccountingBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountingBoxActionPerformed(evt);
            }
        });

        GraphicsBox.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        GraphicsBox.setForeground(new java.awt.Color(102, 0, 102));
        GraphicsBox.setText("Graphics Package");
        GraphicsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraphicsBoxActionPerformed(evt);
            }
        });

        OfficeOP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AccountingOP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        GraphicsOP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OfficeBox)
                                    .addComponent(GraphicsBox)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(OfficeOP, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(AccountingOP, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(GraphicsOP, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(AccountingBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(OfficeBox)
                .addGap(27, 27, 27)
                .addComponent(OfficeOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(AccountingBox)
                .addGap(18, 18, 18)
                .addComponent(AccountingOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(GraphicsBox)
                .addGap(26, 26, 26)
                .addComponent(GraphicsOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 11, 210, 360));

        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        CalculateButton.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        CalculateButton.setForeground(new java.awt.Color(51, 0, 153));
        CalculateButton.setText("Calculate");
        CalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateButtonActionPerformed(evt);
            }
        });

        ClearButton.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(51, 0, 153));
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        TotalOP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ExitButton.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(51, 0, 153));
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Total Price");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CalculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(ExitButton))))))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(TotalOP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TotalOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CalculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExitButton)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 377, 220, 220));

        RecieptHardware.setFont(new java.awt.Font("Cambria", 1, 10)); // NOI18N
        RecieptHardware.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        RecieptHardware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecieptHardwareActionPerformed(evt);
            }
        });
        getContentPane().add(RecieptHardware, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 310, 60));

        RecieptSoftware.setFont(new java.awt.Font("Cambria", 0, 10)); // NOI18N
        RecieptSoftware.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        RecieptSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecieptSoftwareActionPerformed(evt);
            }
        });
        getContentPane().add(RecieptSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, 560, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OfficeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OfficeBoxActionPerformed
        if(OfficeBox.isSelected())
        {
            name7 = " Office Package ";
            OfficePrice = 1000;
            OfficeOP.setText(Double.toString(OfficePrice));
        }
        else
        {
           OfficePrice = 0; 
           name7 = " ";
            OfficeOP.setText(" ");
        }
    }//GEN-LAST:event_OfficeBoxActionPerformed

    private void CalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateButtonActionPerformed
        TotalPrice = ProcessorPrice + MemoryPrice + DiskPrice + WindowsPrice + AccountingPrice + GraphicsPrice + OfficePrice;
        TotalOP.setText(Double.toString(TotalPrice));
        RecieptHardware.setText("**"+name1+" == "+ProcessorPrice+"**"+name2+" == "+MemoryPrice+"**"+name3+" == "+DiskPrice); 
        RecieptSoftware.setText("**"+name4+" == "+WindowsPrice+"**"+name7+" == "+OfficePrice+"**"+name5+" == "+AccountingPrice+"**"+name6+" == "+GraphicsPrice);    
        
        Reciept kent34 = new Reciept();
        kent34.kentjohn(TotalPrice);
        this.dispose();
        kent34.setVisible(true);

    }//GEN-LAST:event_CalculateButtonActionPerformed

    private void ProcessorCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessorCBActionPerformed
                             
            switch(ProcessorCB.getSelectedIndex()){    
                case 0:
                {
                   ProcessorPrice = 0;
                   name1 =" ";         
                   ProcessOP.setText(" ");                 
                }
                 break;  
                case 1:
                {
                
                 	ProcessorPrice = 10000;
                        name1 ="Duo 3.2 Ghz";
                        ProcessOP.setText(Double.toString(ProcessorPrice));
                 }
                break; 
                 case 2:
                 {
                        name1 ="P1 2.2 Ghz";
                        ProcessorPrice = 7000;
                        ProcessOP.setText(Double.toString(ProcessorPrice));
                 }
                 break;	
                 case 3:{
                        name1 ="P1 2 Ghz";                
                       	ProcessorPrice = 5000;
                        ProcessOP.setText(Double.toString(ProcessorPrice));
                 }
                 break;
    }//GEN-LAST:event_ProcessorCBActionPerformed

    }
    private void Window2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Window2ButtonActionPerformed
        if (Window2Button.isSelected()){
            WindowsPrice = 2500;
            name4 = " Windows 10 ";
            WindowsOP.setText(Double.toString(WindowsPrice));
            WindowButton.setSelected(false);
        }
        else
        {
            WindowsPrice = 0;
            WindowsOP.setText(" ");
            name4 = " ";
            WindowButton.setSelected(false);
        }
    }//GEN-LAST:event_Window2ButtonActionPerformed

    private void MemoryCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemoryCBActionPerformed

                             
            switch(MemoryCB.getSelectedIndex()){    
                case 0:
                {
                   name2 = " ";
                   MemoryOP.setText(" ");                 
                }
                 break;  
                case 1:
                {
                        name2 = " 6 Gb ";
                 	MemoryPrice = 5000;
                        MemoryOP.setText(Double.toString(MemoryPrice));
                 }
                break; 
                 case 2:
                 {
                        name2 = " 4 Gb ";
                        MemoryPrice = 3000;
                        MemoryOP.setText(Double.toString(MemoryPrice));
                 }
                 break;	
                 case 3:{
                        name2 = " 2 Gb ";                
                       	MemoryPrice = 2000;
                        MemoryOP.setText(Double.toString(MemoryPrice));
                 }
                 break;
    }                                           

    }//GEN-LAST:event_MemoryCBActionPerformed

    private void DiskCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiskCBActionPerformed
                             
            switch(DiskCB.getSelectedIndex()){    
                case 0:
                {
                   name3 = " ";
                   DiskOP.setText(" ");                 
                }
                 break;  
                case 1:
                {
                        name3 =" 1 Tb";
                 	DiskPrice = 6000;
                        DiskOP.setText(Double.toString(DiskPrice));
                 }
                break; 
                 case 2:
                 {          
                        name3 =" 5000 Gb ";
                        DiskPrice = 4000;
                        DiskOP.setText(Double.toString(DiskPrice));
                 }
                 break;	
                 case 3:{
                        name3 =" 320 Gb ";                
                       	DiskPrice = 3000;
                        DiskOP.setText(Double.toString(DiskPrice));
                 }
                 break;
    }                                           

    }//GEN-LAST:event_DiskCBActionPerformed

    private void WindowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WindowButtonActionPerformed
       if (WindowButton.isSelected()){
           WindowsPrice = 2000;
            name4 = " Windows 7 ";
            WindowsOP.setText(Double.toString(WindowsPrice));
            Window2Button.setSelected(false);
       }
       else{
           WindowsPrice = 0;
            name4 = " ";
            WindowsOP.setText(" ");
            Window2Button.setSelected(false);
            
       }
    }//GEN-LAST:event_WindowButtonActionPerformed

    private void AccountingBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountingBoxActionPerformed
        if(AccountingBox.isSelected())
        {
            name5 = " Accounting Package ";
            AccountingPrice = 3000;
            AccountingOP.setText(Double.toString(AccountingPrice));
        }
        else
        {
            AccountingPrice = 0;
            name5 = " ";
            AccountingOP.setText(" ");
            
        }
    }//GEN-LAST:event_AccountingBoxActionPerformed

    private void GraphicsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraphicsBoxActionPerformed
        if(GraphicsBox.isSelected())
        {
            name6 = " Graphics Package ";
            GraphicsPrice = 2000;
            GraphicsOP.setText(Double.toString(GraphicsPrice));
        }
        else
        {
            GraphicsPrice = 0;
            name6 = " ";
            GraphicsOP.setText(" ");
        }
    }//GEN-LAST:event_GraphicsBoxActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        ProcessorPrice = 0;
        MemoryPrice = 0;
        DiskPrice = 0;
        AccountingPrice = 0;
        OfficePrice = 0;
        GraphicsPrice = 0;
        TotalPrice = 0;
        ProcessorCB.setSelectedIndex(0);
        MemoryCB.setSelectedIndex(0);
        DiskCB.setSelectedIndex(0);
        WindowButton.setSelected(false);
        Window2Button.setSelected(false);
        OfficeBox.setSelected(false);
        GraphicsBox.setSelected(false);
        AccountingBox.setSelected(false);
        TotalOP.setText(" ");
        WindowsOP.setText(" ");
        GraphicsOP.setText(" ");
        AccountingOP.setText(" ");
        OfficeOP.setText(" ");
        RecieptHardware.setText(" ");
        RecieptSoftware.setText(" ");
        Reciept kent34 = new Reciept();
        kent34.setVisible(true);
        
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void RecieptHardwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecieptHardwareActionPerformed
        RecieptHardware.setText(" "+ProcessorCB.getSelectedIndex()+" "+MemoryCB.getSelectedIndex()+" "+DiskCB.getSelectedIndex());
    }//GEN-LAST:event_RecieptHardwareActionPerformed

    private void RecieptSoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecieptSoftwareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecieptSoftwareActionPerformed

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
            java.util.logging.Logger.getLogger(kentmaine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kentmaine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kentmaine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kentmaine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kentmaine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AccountingBox;
    private javax.swing.JTextField AccountingOP;
    private javax.swing.JButton CalculateButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JComboBox<String> DiskCB;
    private javax.swing.JLabel DiskLabel;
    private javax.swing.JTextField DiskOP;
    private javax.swing.JButton ExitButton;
    private javax.swing.JCheckBox GraphicsBox;
    private javax.swing.JTextField GraphicsOP;
    private javax.swing.JLabel HardwareIntelLogo;
    private javax.swing.JLabel HardwareLogo;
    private javax.swing.JComboBox<String> MemoryCB;
    private javax.swing.JLabel MemoryLabel;
    private javax.swing.JTextField MemoryOP;
    private javax.swing.JCheckBox OfficeBox;
    private javax.swing.JTextField OfficeOP;
    private javax.swing.JTextField ProcessOP;
    private javax.swing.JComboBox<String> ProcessorCB;
    private javax.swing.JLabel ProcessorLabel;
    private javax.swing.JTextField RecieptHardware;
    private javax.swing.JTextField RecieptSoftware;
    private javax.swing.JTextField TotalOP;
    private javax.swing.JRadioButton Window2Button;
    private javax.swing.JRadioButton WindowButton;
    private javax.swing.JTextField WindowsOP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
