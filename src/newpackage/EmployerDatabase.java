
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.sql.PreparedStatement;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmployerDatabase extends javax.swing.JFrame {
  Connection conn= null;
  PreparedStatement pst =null;
  ResultSet rs= null;
  DefaultTableModel model= new DefaultTableModel();
  
    public EmployerDatabase() {
      initComponents();
      conn= EmployerDatabase.connectDb();
      Object col[]={"EmployeeID","INNumber","FirstName","Surname","Gender","DoB","Age","Salary"};
    model.setColumnIdentifiers(col);
    jTable1.setModel(model);
    currentDate();
    updateTable();
    
    }

    public void currentDate(){
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
         int year = cal.get(Calendar.YEAR);
          int day = cal.get(Calendar.DAY_OF_MONTH);
          jtxtDate.setText("DATE  " +day+"/"+(month+1)+"/"+year);
          
              int second = cal.get(Calendar.SECOND);
         int minute = cal.get(Calendar.MINUTE);
          int hour = cal.get(Calendar.HOUR);
          jtxtTime.setText("TIME  " +hour+":"+(minute)+":"+second);
          
    }
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuBar7 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenuBar8 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenuBar9 = new javax.swing.JMenuBar();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenuBar10 = new javax.swing.JMenuBar();
        jMenu17 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenuBar11 = new javax.swing.JMenuBar();
        jMenu19 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();
        jMenuBar12 = new javax.swing.JMenuBar();
        jMenu21 = new javax.swing.JMenu();
        jMenu22 = new javax.swing.JMenu();
        jMenuBar13 = new javax.swing.JMenuBar();
        jMenu23 = new javax.swing.JMenu();
        jMenu24 = new javax.swing.JMenu();
        jMenuBar14 = new javax.swing.JMenuBar();
        jMenu25 = new javax.swing.JMenu();
        jMenu26 = new javax.swing.JMenu();
        jMenuBar15 = new javax.swing.JMenuBar();
        jMenu27 = new javax.swing.JMenu();
        jMenu28 = new javax.swing.JMenu();
        jMenuBar16 = new javax.swing.JMenuBar();
        jMenu29 = new javax.swing.JMenu();
        jMenu30 = new javax.swing.JMenu();
        jMenuBar17 = new javax.swing.JMenuBar();
        jMenu31 = new javax.swing.JMenu();
        jMenu32 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar18 = new javax.swing.JMenuBar();
        jMenu33 = new javax.swing.JMenu();
        jMenu34 = new javax.swing.JMenu();
        jMenuBar19 = new javax.swing.JMenuBar();
        jMenu35 = new javax.swing.JMenu();
        jMenu36 = new javax.swing.JMenu();
        jMenuBar20 = new javax.swing.JMenuBar();
        jMenu37 = new javax.swing.JMenu();
        jMenu38 = new javax.swing.JMenu();
        jlabel1 = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        jlabel3 = new javax.swing.JLabel();
        jlabel4 = new javax.swing.JLabel();
        jlabel5 = new javax.swing.JLabel();
        jlabel6 = new javax.swing.JLabel();
        jlabel7 = new javax.swing.JLabel();
        jlabel8 = new javax.swing.JLabel();
        jtxtEmployeeID = new javax.swing.JTextField();
        jtxtINNumber = new javax.swing.JTextField();
        jtxtFirstName = new javax.swing.JTextField();
        jtxtSurname = new javax.swing.JTextField();
        jtxtGender = new javax.swing.JTextField();
        jtxtDoB = new javax.swing.JTextField();
        jtxtAge = new javax.swing.JTextField();
        jtxtSalary = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnAddData = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnClearData = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtxtDate = new javax.swing.JLabel();
        jtxtTime = new javax.swing.JLabel();
        jtxtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu2.setText("File");
        jMenuBar3.add(jMenu2);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar4.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar4.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar5.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar5.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar6.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar6.add(jMenu10);

        jMenu11.setText("File");
        jMenuBar7.add(jMenu11);

        jMenu12.setText("Edit");
        jMenuBar7.add(jMenu12);

        jMenu13.setText("File");
        jMenuBar8.add(jMenu13);

        jMenu14.setText("Edit");
        jMenuBar8.add(jMenu14);

        jMenu15.setText("File");
        jMenuBar9.add(jMenu15);

        jMenu16.setText("Edit");
        jMenuBar9.add(jMenu16);

        jMenu17.setText("File");
        jMenuBar10.add(jMenu17);

        jMenu18.setText("Edit");
        jMenuBar10.add(jMenu18);

        jMenu19.setText("File");
        jMenuBar11.add(jMenu19);

        jMenu20.setText("Edit");
        jMenuBar11.add(jMenu20);

        jMenu21.setText("File");
        jMenuBar12.add(jMenu21);

        jMenu22.setText("Edit");
        jMenuBar12.add(jMenu22);

        jMenu23.setText("File");
        jMenuBar13.add(jMenu23);

        jMenu24.setText("Edit");
        jMenuBar13.add(jMenu24);

        jMenu25.setText("File");
        jMenuBar14.add(jMenu25);

        jMenu26.setText("Edit");
        jMenuBar14.add(jMenu26);

        jMenu27.setText("File");
        jMenuBar15.add(jMenu27);

        jMenu28.setText("Edit");
        jMenuBar15.add(jMenu28);

        jMenu29.setText("File");
        jMenuBar16.add(jMenu29);

        jMenu30.setText("Edit");
        jMenuBar16.add(jMenu30);

        jMenu31.setText("File");
        jMenuBar17.add(jMenu31);

        jMenu32.setText("Edit");
        jMenuBar17.add(jMenu32);

        jMenuItem1.setText("jMenuItem1");

        jMenu33.setText("File");
        jMenuBar18.add(jMenu33);

        jMenu34.setText("Edit");
        jMenuBar18.add(jMenu34);

        jMenu35.setText("File");
        jMenuBar19.add(jMenu35);

        jMenu36.setText("Edit");
        jMenuBar19.add(jMenu36);

        jMenu37.setText("File");
        jMenuBar20.add(jMenu37);

        jMenu38.setText("Edit");
        jMenuBar20.add(jMenu38);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlabel1.setText("EmployeeID");

        jlabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlabel2.setText("INNumber");

        jlabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlabel3.setText("FirstName");

        jlabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlabel4.setText("Surname");

        jlabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlabel5.setText("Gender");

        jlabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlabel6.setText(" DoB");

        jlabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlabel7.setText("Age");

        jlabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlabel8.setText("Salary");

        jtxtSurname.setText(" ");
        jtxtSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSurnameActionPerformed(evt);
            }
        });

        jtxtGender.setText(" ");

        jtxtDoB.setText(" ");

        jtxtAge.setText(" ");

        jtxtSalary.setText(" ");

        jTable1.setBackground(new java.awt.Color(51, 51, 0));
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployeeID", "IN Number", "FirstName", "Surname", "Gender", "DoB", "Age", "Salary"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jbtnAddData.setBackground(new java.awt.Color(204, 0, 204));
        jbtnAddData.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnAddData.setText("Add Data");
        jbtnAddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddDataActionPerformed(evt);
            }
        });

        jbtnPrint.setBackground(new java.awt.Color(204, 0, 204));
        jbtnPrint.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnPrint.setText("Print");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });

        jbtnClearData.setBackground(new java.awt.Color(204, 0, 204));
        jbtnClearData.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnClearData.setText("Clear Data");
        jbtnClearData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearDataActionPerformed(evt);
            }
        });

        jbtnExit.setBackground(new java.awt.Color(255, 0, 255));
        jbtnExit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/Capture32.PNG"))); // NOI18N
        jLabel3.setText("jLabel3");

        jtxtDate.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jtxtDate.setText("Date");

        jtxtTime.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jtxtTime.setText("Time");

        jtxtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtSearchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("EMPLOYEE MANAGEMENT SYSTEM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 102));
        jLabel2.setText("Search");

        jMenuBar1.setForeground(new java.awt.Color(0, 204, 102));
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jtxtDate)
                .addGap(106, 106, 106)
                .addComponent(jtxtTime)
                .addGap(503, 503, 503))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel4)
                            .addComponent(jlabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel8)
                            .addComponent(jlabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel1)
                .addContainerGap(570, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlabel2)
                                .addComponent(jlabel1))
                            .addComponent(jLabel2))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtINNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnAddData)
                        .addGap(43, 43, 43)
                        .addComponent(jbtnPrint)
                        .addGap(46, 46, 46)
                        .addComponent(jbtnClearData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(69, 69, 69)
                .addComponent(jbtnExit)
                .addGap(723, 723, 723))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jlabel1)
                                            .addComponent(jtxtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jtxtINNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlabel2))
                                        .addGap(41, 41, 41)
                                        .addComponent(jlabel3))
                                    .addComponent(jtxtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlabel4))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlabel5)
                                    .addComponent(jtxtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlabel6)
                            .addComponent(jtxtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel7)
                            .addComponent(jtxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlabel8)
                            .addComponent(jtxtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnAddData)
                            .addComponent(jbtnPrint)
                            .addComponent(jbtnClearData)
                            .addComponent(jbtnExit))))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static Connection connectDb(){
      try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeDB?zeroDateTimeBehavior=convertToNull","root","");
          return conn;
      } 
      catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
          return null;
      }
    }
    

    private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Employee Management System",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
            
        };
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnClearDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearDataActionPerformed
       
if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to clear Data","Employee Management System",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
              jtxtEmployeeID.setText(null);
       jtxtINNumber.setText(null);
       jtxtFirstName.setText(null);
       jtxtSurname.setText(null);
       jtxtGender.setText(null);
       jtxtDoB.setText(null);
       jtxtAge.setText(null);
       jtxtSalary.setText(null);
       jtxtSearch.setText(null);     
    }//GEN-LAST:event_jbtnClearDataActionPerformed
    }
    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
       MessageFormat header= new MessageFormat("Printing in progress");
        MessageFormat footer= new MessageFormat("Page {0,number ,integer}");
        try{
            jTable1.print(JTable.PrintMode.NORMAL, header, footer);
        }
        catch(java.awt.print .PrinterException e){
            System.err.format("No printer found", e.getMessage());
        }
    }//GEN-LAST:event_jbtnPrintActionPerformed
    
         
     
    private void jbtnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddDataActionPerformed
       String EmployeeID="23";
       String INNumber= "3243";
       String FirstName ="kamau";
       String Surname = "mwangi";
       String  Gender = "male";
       String   DoB = "12/2/2003";
       String Age = "20";
       String  Salary= "2000";
       String sql = "INSERT INTO employee(EmployeeID,INNumber,FirstName,Surname,Gender,DoB,Age, Salary)VALUES(?,?,?,?,?,?,?,?)";
       try{
                Class.forName("com.mysql.jdbc.Driver");
              
           pst = conn.prepareStatement(sql);
           conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeDB?zeroDateTimeBehavior=convertToNull","root","");
           pst.setString(1,jtxtEmployeeID.getText());
            pst.setString(2,jtxtINNumber.getText());
           pst.setString(3,jtxtFirstName.getText()) ;       
           pst.setString(4,jtxtSurname.getText());
            pst.setString(5,jtxtGender.getText());       
            pst.setString(6,jtxtDoB.getText());       
             pst.setString(7,jtxtAge.getText());
             pst.setString(8,jtxtSalary.getText());
             
             pst.execute();
             JOptionPane.showMessageDialog(null, "System Update completed");
             rs.close();
             pst.close();
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           
           
       }
       updateTable();
    }//GEN-LAST:event_jbtnAddDataActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       try{
         int row = jTable1.getSelectedRow();
         String Table_click = (jTable1.getModel().getValueAt(row, 0).toString());
         String sql = "select * from employee where EmployeeID ='"+Table_click+"'";
         pst= conn.prepareStatement(sql);
         rs=pst.executeQuery();
         
         if(rs.next()){
             String add1=rs.getString("EmployeeID");
             jtxtEmployeeID.setText(add1);
             String add2=rs.getString("INNumber");
             jtxtINNumber.setText(add2);
             String add3=rs.getString("FirstName");
             jtxtFirstName.setText(add3);
             String add4=rs.getString("Surname");
             jtxtSurname.setText(add4);
             String add5=rs.getString("Gender");
             jtxtGender.setText(add5);
             String add6=rs.getString("DoB");
             jtxtDoB.setText(add6);
             String add7=rs.getString("Age");
             jtxtAge.setText(add7);
             String add8=rs.getString("Salary");
             jtxtSalary.setText(add8);
         }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jtxtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSearchKeyReleased
    try{
        String sql = "select * from employee where FirstName=?";
         pst= conn.prepareStatement(sql);
         pst.setString(1,jtxtSearch.getText());
           rs=pst.executeQuery();
              
         if(rs.next()){
             String add1=rs.getString("EmployeeID");
             jtxtEmployeeID.setText(add1);
             String add2=rs.getString("INNumber");
             jtxtINNumber.setText(add2);
             String add3=rs.getString("FirstName");
             jtxtFirstName.setText(add3);
             String add4=rs.getString("Surname");
             jtxtSurname.setText(add4);
             String add5=rs.getString("Gender");
             jtxtGender.setText(add5);
             String add6=rs.getString("DoB");
             jtxtDoB.setText(add6);
             String add7=rs.getString("Age");
             jtxtAge.setText(add7);
             String add8=rs.getString("Salary");
             jtxtSalary.setText(add8);
         }
    }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
    }
      try{
        String sql = "select * from employee where Age=?";
         pst= conn.prepareStatement(sql);
         pst.setString(1,jtxtSearch.getText());
           rs=pst.executeQuery();
              
         if(rs.next()){
             String add1=rs.getString("EmployeeID");
             jtxtEmployeeID.setText(add1);
             String add2=rs.getString("INNumber");
             jtxtINNumber.setText(add2);
             String add3=rs.getString("FirstName");
             jtxtFirstName.setText(add3);
             String add4=rs.getString("Surname");
             jtxtSurname.setText(add4);
             String add5=rs.getString("Gender");
             jtxtGender.setText(add5);
             String add6=rs.getString("DoB");
             jtxtDoB.setText(add6);
             String add7=rs.getString("Age");
             jtxtAge.setText(add7);
             String add8=rs.getString("Salary");
             jtxtSalary.setText(add8);
         }
    }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
    }
      try{
        String sql = "select * from employee where INNumber=?";
         pst= conn.prepareStatement(sql);
         pst.setString(1,jtxtSearch.getText());
           rs=pst.executeQuery();
              
         if(rs.next()){
             String add1=rs.getString("EmployeeID");
             jtxtEmployeeID.setText(add1);
             String add2=rs.getString("INNumber");
             jtxtINNumber.setText(add2);
             String add3=rs.getString("FirstName");
             jtxtFirstName.setText(add3);
             String add4=rs.getString("Surname");
             jtxtSurname.setText(add4);
             String add5=rs.getString("Gender");
             jtxtGender.setText(add5);
             String add6=rs.getString("DoB");
             jtxtDoB.setText(add6);
             String add7=rs.getString("Age");
             jtxtAge.setText(add7);
             String add8=rs.getString("Salary");
             jtxtSalary.setText(add8);
         }
    }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_jtxtSearchKeyReleased

    private void jtxtSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSurnameActionPerformed

    public void updateTable(){
        conn= EmployerDatabase.connectDb();
        if(conn !=null){
           String sql = "Select EmployeeID ,INNumber, FirstName, Surname, Gender, DoB, Age, Salary from employee";
           
           try{
               pst = conn.prepareStatement(sql);
               rs= pst.executeQuery();
               Object[]columnData = new Object[8];
               
               while (rs.next()){
                   columnData[0]=rs.getString("EmployeeID");
                    columnData[1]=rs.getString("INNumber");
                    columnData[2]=rs.getString("FirstName");
                     columnData[3]=rs.getString("Surname");
                     columnData[4]=rs.getString("Gender");
                     columnData[5]=rs.getString("DoB");
                      columnData[6]=rs.getString("Age");
                      columnData[7]=rs.getString("Salary");
                      
                      model.addRow(columnData);
               }
           }
           catch (Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
        }
           
        
    }
     //// @param args the command line arguments
     
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
            java.util.logging.Logger.getLogger(EmployerDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployerDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployerDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployerDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployerDatabase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu29;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu30;
    private javax.swing.JMenu jMenu31;
    private javax.swing.JMenu jMenu32;
    private javax.swing.JMenu jMenu33;
    private javax.swing.JMenu jMenu34;
    private javax.swing.JMenu jMenu35;
    private javax.swing.JMenu jMenu36;
    private javax.swing.JMenu jMenu37;
    private javax.swing.JMenu jMenu38;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar10;
    private javax.swing.JMenuBar jMenuBar11;
    private javax.swing.JMenuBar jMenuBar12;
    private javax.swing.JMenuBar jMenuBar13;
    private javax.swing.JMenuBar jMenuBar14;
    private javax.swing.JMenuBar jMenuBar15;
    private javax.swing.JMenuBar jMenuBar16;
    private javax.swing.JMenuBar jMenuBar17;
    private javax.swing.JMenuBar jMenuBar18;
    private javax.swing.JMenuBar jMenuBar19;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar20;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuBar jMenuBar7;
    private javax.swing.JMenuBar jMenuBar8;
    private javax.swing.JMenuBar jMenuBar9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAddData;
    private javax.swing.JButton jbtnClearData;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel jlabel4;
    private javax.swing.JLabel jlabel5;
    private javax.swing.JLabel jlabel6;
    private javax.swing.JLabel jlabel7;
    private javax.swing.JLabel jlabel8;
    private javax.swing.JTextField jtxtAge;
    private javax.swing.JLabel jtxtDate;
    private javax.swing.JTextField jtxtDoB;
    private javax.swing.JTextField jtxtEmployeeID;
    private javax.swing.JTextField jtxtFirstName;
    private javax.swing.JTextField jtxtGender;
    private javax.swing.JTextField jtxtINNumber;
    private javax.swing.JTextField jtxtSalary;
    private javax.swing.JTextField jtxtSearch;
    private javax.swing.JTextField jtxtSurname;
    private javax.swing.JLabel jtxtTime;
    // End of variables declaration//GEN-END:variables
}
