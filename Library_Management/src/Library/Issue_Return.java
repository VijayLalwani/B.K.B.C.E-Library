/*************************************************************************
** changes to be made -                                                 **
** 5.table selection                                                    **
** 6.add price column                                                   **
**************************************************************************/
package Library;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.sun.glass.events.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*******************
 * @author Lalwani *
 ******************/

public class Issue_Return extends javax.swing.JFrame {
    public Issue_Return() {
        initComponents();
        StudentRB.setSelected(true);
    }
    @SuppressWarnings("unchecked")
                
    void StudentID(String id) {
        if(id.isEmpty() == true){
            JOptionPane.showMessageDialog(null,"please enter a Adimssion No.");
        }
        else{
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = (Connection)DriverManager.getConnection(db_url,user,pwd);
                Statement stmt = (Statement)conn.createStatement();
                String sql;
                if(id.contains("D") || id.contains("d")){
                    sql = "select * from students where adm_no = '" + id + "';";
                }
                else{
                    sql = "select * from students where adm_no = " + id + ";";
                }
                ResultSet rs = stmt.executeQuery(sql);
                rs.next();
                Info1.setText(rs.getString("adm_no"));
                Info2.setText(rs.getString("name"));
                Info3.setText(rs.getString("std"));
                rs.close();
                stmt.close();
                conn.close();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            }
        }
    }
    
    void TeacherID(String id) {
        if(id.isEmpty() == true){
            JOptionPane.showMessageDialog(null,"please enter a Adimssion No.");
        }
        else{
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "mysqlip");
                Statement stmt = (Statement)conn.createStatement();
                String sql = "select * from teachers where sl_no = " + id + ";";
                ResultSet rs = stmt.executeQuery(sql);
                rs.next();
                Info1.setText(rs.getString("Name"));
                Info2.setText(rs.getString("Initial"));
                Info3.setText(rs.getString("Subject"));
                rs.close();
                stmt.close();
                conn.close();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            }
        }
    }
    
    void issue() {
            admno = Info1.getText();
            UserNo = ID.getText();
            if (admno.isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "please enter a adm_no");
            } else if (StudentRB.isSelected()) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "mysqlip");
                    Statement stmt = (Statement)conn.createStatement();
                    String Sql = "select book_title,issued,adm_no from books where ACCESSION_NO = '" + acess + "';";
                    String sql = "select name from students where adm_no = '" + admno + "';";
                    ResultSet rs = stmt.executeQuery(Sql);
                    rs.next();
                    booktitle = rs.getString("Book_title");
                    status = rs.getBoolean("issued");
                    adm_no = rs.getString("adm_no");
                    ResultSet rs1 = stmt.executeQuery(sql);
                    rs1.next();
                    name = rs1.getString("NAME");
                    rs.close();
                    if (status) {
                        JOptionPane.showMessageDialog(null, "the book is already issued by admmission number " + adm_no);
                    }
                    else{
                    String Sql1 = "update books set issued = true,adm_no='" + admno + "' where accession_no='" + acess + "';";
                    String Sql2 = "insert into records(ISSUE_DATE,ADM_NO,NAME,BOOK_TITLE,ACCESSION_NO) values (curdate(),'" + admno + "','" + name + "','" + booktitle + "','" + acess + "');";
                    stmt.executeUpdate(Sql1);
                    stmt.executeUpdate(Sql2);
                    stmt.close();
                    conn.close();
                    JOptionPane.showMessageDialog(null, "Issued Sucessfully");
                    }
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
                }
            } else if (TeacherRB.isSelected()) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "mysqlip");
                    Statement stmt = (Statement)conn.createStatement();
                    String Sql = "select book_title,issued,adm_no from books where ACCESSION_NO = '" + acess + "';";
                    String sql = "select name from teachers where sl_no = " + UserNo + ";";
                    ResultSet rs = stmt.executeQuery(Sql);
                    rs.next();
                    booktitle = rs.getString("Book_title");
                    status = rs.getBoolean("issued");
                    adm_no = rs.getString("adm_no");
                    rs.close();
                    ResultSet rs1 = stmt.executeQuery(sql);
                    rs1.next();
                    name = rs1.getString("NAME");
                    rs1.close();
                    if (status == true) {
                        JOptionPane.showMessageDialog(null, "the book is already issued by USER " + adm_no);
                    }
                    else{
                    String Sql1 = "update books set issued = true,adm_no = '" + UserNo + "' where accession_no = '" + acess + "';";
                    String Sql2 = "insert into records(ISSUE_DATE,NAME,BOOK_TITLE,ACCESSION_NO,USER_NO) values (curdate(),"
                            + "'" + name + "','" + booktitle + "','" + acess + "','" + UserNo + "');";
                    stmt.executeUpdate(Sql1);
                    stmt.executeUpdate(Sql2);
                    stmt.close();
                    conn.close();
                    JOptionPane.showMessageDialog(null, "Issued Sucessfully");
                    }
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select a User");
            }
    }
    
    void BooksIssued(String ADM_NO, DefaultTableModel model) {
        while (model.getRowCount() > 0) {
            model.setRowCount(0);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "mysqlip");
            Statement stmt = (Statement)conn.createStatement();
            String sql;
                if(ADM_NO.contains("D") || ADM_NO.contains("d")){
                    sql = "select * from books where adm_no = '" + ADM_NO + "';";
                }
                else{
                    sql = "select * from books where adm_no = " + ADM_NO + ";";
                }
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String BOOK_GROUP = rs.getString("BOOK_GROUP");
                String BOOK_TITLE = rs.getString("BOOK_TITLE");
                String ACCESSION_NO = rs.getString("ACCESSION_NO");
                String AUTHOR_NAME = rs.getString("AUTHOR_NAME");
                String EDITOR_NAME = rs.getString("EDITOR_NAME");
                Boolean ISSUED = rs.getBoolean("ISSUED");
                String admission = rs.getString("ADM_NO");
                String BOOK_LOCATION = rs.getString("BOOK_LOCATION");
                String ISSUE = ISSUED == true ? "Issued" : "Available";
                model.addRow(new Object[]{BOOK_GROUP, BOOK_TITLE, ACCESSION_NO, AUTHOR_NAME, EDITOR_NAME, ISSUE, admission, BOOK_LOCATION});
            }
            rs.close();
            conn.close();
            stmt.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }
    
    void RETURN() {
        
            admno = Info1.getText();
            UserNo = ID.getText();
            if (admno.length() == 0) {
                JOptionPane.showMessageDialog(null, "please enter an adm. no");
            } else if (StudentRB.isSelected()) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = (Connection)DriverManager.getConnection(db_url,user,pwd);
                    Statement stmt = (Statement)conn.createStatement();
                    String Sql = "select issued,adm_no from books where ACCESSION_NO = '" + acess + "';";
                    ResultSet rs = stmt.executeQuery(Sql);
                    rs.next();
                    status = rs.getBoolean("issued");
                    adm_no = rs.getString("adm_no");
                    rs.close();
                    if (!status) {
                        JOptionPane.showMessageDialog(null, "the book is already present in library");
                    }
                    else if (!adm_no.equals(admno)) {
                        JOptionPane.showMessageDialog(null, "The book is issued by admmission number " + adm_no);
                    }
                    else{
                    String Sql1 = "update books set issued = false,adm_no=null where accession_no='" + acess + "';";
                    String Sql2 = "update records set RETURN_DATE = curdate() where adm_no = '" + admno + "' and accession_no = '" + acess + "';";
                    stmt.executeUpdate(Sql1);
                    stmt.executeUpdate(Sql2);
                    stmt.close();
                    conn.close();
                    JOptionPane.showMessageDialog(null, "Returned Sucessfully");
                    }
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
                }
            } else if (TeacherRB.isSelected()) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = (Connection)DriverManager.getConnection(db_url,user,pwd);
                    Statement stmt = (Statement)conn.createStatement();
                    String Sql = "select issued,ADM_NO from books where ACCESSION_NO = '" + acess + "';";
                    ResultSet rs = stmt.executeQuery(Sql);
                    rs.next();
                    status = rs.getBoolean("issued");
                    adm_no = rs.getString("ADM_NO");
                    rs.close();
                    if (status == false) {
                        JOptionPane.showMessageDialog(null, "the book is already present in library");
                    }
                    else if (UserNo.equals(adm_no) == false) {
                        JOptionPane.showMessageDialog(null, "The book is issued by USER " + adm_no);
                    }
                    else{
                    String Sql1 = "update books set issued = false,ADM_NO=null where accession_no='" + acess + "';";
                    String Sql2 = "update records set RETURN_DATE = curdate() where User_No = '" + UserNo + "' and accession_no = '" + acess + "';";
                    stmt.executeUpdate(Sql1);
                    stmt.executeUpdate(Sql2);
                    stmt.close();
                    conn.close();
                    JOptionPane.showMessageDialog(null, "Returned Sucessfully");
                    }
                    }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select a Button");
            }
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        TeacherRB = new javax.swing.JRadioButton();
        StudentRB = new javax.swing.JRadioButton();
        Search_Box = new javax.swing.JComboBox();
        Info1 = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        Text = new javax.swing.JTextField();
        Info3 = new javax.swing.JTextField();
        Info2 = new javax.swing.JTextField();
        IDB = new javax.swing.JButton();
        SearchB = new javax.swing.JButton();
        ReturnB = new javax.swing.JButton();
        IssueB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        Circulation = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        Admin = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");

        buttonGroup1.add(TeacherRB);
        TeacherRB.setText("Teacher");
        TeacherRB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TeacherRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TeacherRBMouseClicked(evt);
            }
        });

        buttonGroup1.add(StudentRB);
        StudentRB.setText("Students");
        StudentRB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StudentRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentRBMouseClicked(evt);
            }
        });

        Search_Box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACCESSION_NO", "BOOK_TITLE", "BOOK_GROUP", "AUTHOR_NAME", "EDITOR_NAME", "PUBLISHER", "EDITION", "PAGES", "ISBN_NO", "VENDOR_NAME", "LANGUAGE", "VOLUMES", "PURCHASE_DATE", "BILL_NO", "BILL_DATE", "PRICE_PER_COPY", "DDC_CODE", "DDC_DESCRIPTION", "BOOK_LOCATION", "DONATED", "SPECIMEN", "PUBLICATION_YEAR", "CURRENCY_DESC", "ISSUED", "ADM_NO" }));
        Search_Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Info1.setEditable(false);

        ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDKeyPressed(evt);
            }
        });

        Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextKeyPressed(evt);
            }
        });

        Info3.setEditable(false);

        Info2.setEditable(false);

        IDB.setText("Student ID");
        IDB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDBActionPerformed(evt);
            }
        });

        SearchB.setText("Search");
        SearchB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBActionPerformed(evt);
            }
        });

        ReturnB.setText("Return");
        ReturnB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReturnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBActionPerformed(evt);
            }
        });

        IssueB.setText("Issue");
        IssueB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IssueB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueBActionPerformed(evt);
            }
        });

        ResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "BOOK GROUP", "BOOK TITLE", "ACCESSION NO.", "AUTHOR'S NAME", "EDITOR'S NAME", "ISSUED", "ADM. NO." , "Book Location" ,"Price"
            }
        ));
        ResultTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ResultTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResultTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ResultTable);

        jLabel1.setText("Adm. No.");

        jLabel2.setText("Name");

        jLabel3.setText("Class");

        jMenuBar1.setBorder(null);

        jMenu1.setText("Book Accession");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setText("Add Book");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Remove Book");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Modify Book");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Add Back");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        Circulation.setText("Circulation");
        Circulation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem5.setText("Issue/Return");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        Circulation.add(jMenuItem5);

        jMenuBar1.add(Circulation);

        Admin.setText("Management");
        Admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem6.setText("Change Password");
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        Admin.add(jMenuItem6);

        jMenuItem7.setText("Book Records");
        jMenuItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        Admin.add(jMenuItem7);

        jMenuItem8.setText("User Records");
        jMenuItem8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        Admin.add(jMenuItem8);

        jMenuItem9.setText("Update Database");
        jMenuItem9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        Admin.add(jMenuItem9);

        jMenuItem10.setText("Export");
        jMenuItem10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        Admin.add(jMenuItem10);

        jMenuBar1.add(Admin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Search_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SearchB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(IDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IssueB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReturnB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TeacherRB)
                        .addGap(18, 18, 18)
                        .addComponent(StudentRB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Info2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(Info1)
                    .addComponent(Info3))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TeacherRB)
                            .addComponent(StudentRB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDB)
                            .addComponent(IssueB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchB)
                            .addComponent(ReturnB)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Search_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Info1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Info2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Info3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String id;
    final String user = "root";
    final String pwd = "mysqlip";
    final String db_url = "jdbc:mysql://localhost:3306/library";
    String acess;
    int row;
    String name;
    String booktitle;
    boolean status;
    String admno;
    String adm_no;
    String UserNo;
    private void IssueBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueBActionPerformed
        String item = (String)Search_Box.getSelectedItem();
        String text = Text.getText();
        DefaultTableModel model = (DefaultTableModel)ResultTable.getModel();
        issue();
        new OpenPage().Search(item, text, model);
    }//GEN-LAST:event_IssueBActionPerformed

    private void IDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDBActionPerformed
        id = ID.getText();
        DefaultTableModel model = (DefaultTableModel)ResultTable.getModel();
        if (StudentRB.isSelected()) {
            StudentID(id);
        } else if (TeacherRB.isSelected()) {
            TeacherID(id);
        }
        BooksIssued(id, model);
    }//GEN-LAST:event_IDBActionPerformed

    private void SearchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBActionPerformed
String item = (String)Search_Box.getSelectedItem();
        String text = Text.getText();
        DefaultTableModel model = (DefaultTableModel)ResultTable.getModel();
        new OpenPage().Search(item, text, model);
    }//GEN-LAST:event_SearchBActionPerformed

    private void ResultTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResultTableMouseClicked
        row = ResultTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)ResultTable.getModel();
        acess = (String)model.getValueAt(row, 2);
        if (evt.getClickCount() == 2) {
            issue();
        }
    }//GEN-LAST:event_ResultTableMouseClicked

    private void TeacherRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeacherRBMouseClicked
        IDB.setText("Teacher ID");
        jLabel1.setText("Name");
        jLabel2.setText("Initials");
        jLabel3.setText("Subject");
    }//GEN-LAST:event_TeacherRBMouseClicked

    private void StudentRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentRBMouseClicked

        IDB.setText("Student ID");
        jLabel1.setText("Adm no.");
        jLabel2.setText("Name");
        jLabel3.setText("Class");
    }//GEN-LAST:event_StudentRBMouseClicked

    private void TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String item = (String)Search_Box.getSelectedItem();
            String text = Text.getText();
            DefaultTableModel model = (DefaultTableModel)ResultTable.getModel();
            new OpenPage().Search(item, text, model);
        }
    }//GEN-LAST:event_TextKeyPressed

    private void IDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            id = ID.getText();
            DefaultTableModel model = (DefaultTableModel)ResultTable.getModel();
            if (StudentRB.isSelected()) {
                StudentID(id);
            } else if (TeacherRB.isSelected()) {
                TeacherID(id);
            }
            BooksIssued(id, model);
        }
    }//GEN-LAST:event_IDKeyPressed

    private void ReturnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBActionPerformed
        String item = (String)Search_Box.getSelectedItem();
        String text = Text.getText();
        DefaultTableModel model = (DefaultTableModel)ResultTable.getModel();
        RETURN();
        new OpenPage().Search(item, text, model);
    }//GEN-LAST:event_ReturnBActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new addBook().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new RemoveBook().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new ModifyBook().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new WeddedOut().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new Issue_Return().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new ChangePassword().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new Books().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        new UsersData().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        new UpdateDatabases().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        new Export().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Issue_Return().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Admin;
    private javax.swing.JMenu Circulation;
    private javax.swing.JTextField ID;
    private javax.swing.JButton IDB;
    private javax.swing.JTextField Info1;
    private javax.swing.JTextField Info2;
    private javax.swing.JTextField Info3;
    private javax.swing.JButton IssueB;
    private javax.swing.JTable ResultTable;
    private javax.swing.JButton ReturnB;
    private javax.swing.JButton SearchB;
    private javax.swing.JComboBox Search_Box;
    private javax.swing.JRadioButton StudentRB;
    private javax.swing.JRadioButton TeacherRB;
    private javax.swing.JTextField Text;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
