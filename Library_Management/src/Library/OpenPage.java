/*************************************************************************
** changes to be made -                                                 **
**************************************************************************/
package Library;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/*******************
 * @author Lalwani *
 ******************/

public class OpenPage extends javax.swing.JFrame {
    public OpenPage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Search_Box = new javax.swing.JComboBox();
        Text = new javax.swing.JTextField();
        SearchB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultTable = new javax.swing.JTable();
        ID = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");

        Search_Box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACCESSION_NO", "BOOK_TITLE", "BOOK_GROUP", "AUTHOR_NAME", "EDITOR_NAME", "PUBLISHER", "EDITION", "PAGES", "ISBN_NO", "VENDOR_NAME", "LANGUAGE", "VOLUMES", "PURCHASE_DATE", "BILL_NO", "BILL_DATE", "PRICE_PER_COPY", "DDC_CODE", "DDC_DESCRIPTION", "BOOK_LOCATION", "DONATED", "SPECIMEN", "PUBLICATION_YEAR", "CURRENCY_DESC", "ISSUED", "ADM_NO" }));
        Search_Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Text.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextKeyPressed(evt);
            }
        });

        SearchB.setText("Search");
        SearchB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBActionPerformed(evt);
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
        jScrollPane1.setViewportView(ResultTable);

        Login.setText("Login");
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        jLabel1.setText("User ID");

        jLabel2.setText("Password");

        Pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PassKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(Pass)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Search_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchB)
                            .addComponent(Search_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Login)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    final String user = "root";
    final String pwd = "mysqlip";
    final String db_url = "jdbc:mysql://localhost:3306/library";
    int Login(String id, String pass) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "mysqlip");
            Statement stmt = (Statement)conn.createStatement();
            String sql = "select * from users;";
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            String a = rs.getString("id");
            String b = rs.getString("pass");
            rs.close();
            conn.close();
            stmt.close();
            if (id.equals(a) && pass.equals(b)) {
                new Main().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Wrong email or password");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
        return 0;
    }
    
    void Search(String item, String text, DefaultTableModel model) {
        while (model.getRowCount() > 0) {
            model.setRowCount(0);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "mysqlip");
            Statement stmt = (Statement)conn.createStatement();
            String sql = "select * from books where "+item+" like'%"+text+"%';";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String BOOK_GROUP = rs.getString("BOOK_GROUP");
                String BOOK_TITLE = rs.getString("BOOK_TITLE");
                String ACCESSION_NO = rs.getString("ACCESSION_NO");
                String AUTHOR_NAME = rs.getString("AUTHOR_NAME");
                String EDITOR_NAME = rs.getString("EDITOR_NAME");
                Boolean ISSUED = rs.getBoolean("ISSUED");
                String ADM_NO = rs.getString("ADM_NO");
                String BOOK_LOCATION = rs.getString("BOOK_LOCATION");
                String ISSUE = ISSUED == true ? "Issued" : "Available";
                String PRICE = rs.getString("Price_per_copy");
                model.addRow(new Object[]{BOOK_GROUP, BOOK_TITLE, ACCESSION_NO, AUTHOR_NAME, EDITOR_NAME, ISSUE, ADM_NO, BOOK_LOCATION,PRICE});
            }
            rs.close();
            conn.close();
            stmt.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }
    
    private void TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String item = (String)Search_Box.getSelectedItem();
            String text = Text.getText();
            DefaultTableModel model = (DefaultTableModel)ResultTable.getModel();
            Search(item, text, model);
        }
    }//GEN-LAST:event_TextKeyPressed

    private void SearchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBActionPerformed
        String item = (String)Search_Box.getSelectedItem();
        String text = Text.getText();
        DefaultTableModel model = (DefaultTableModel)ResultTable.getModel();
        Search(item, text, model);
    }//GEN-LAST:event_SearchBActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        String uid = ID.getText();
        String pwd = Pass.getText();
        Login(uid, pwd);
    }//GEN-LAST:event_LoginActionPerformed

    private void PassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        String uid = ID.getText();
        String pwd = Pass.getText();
        Login(uid, pwd);
        }
    }//GEN-LAST:event_PassKeyPressed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel((LookAndFeel)new SyntheticaAluOxideLookAndFeel());
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpenPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTable ResultTable;
    private javax.swing.JButton SearchB;
    private javax.swing.JComboBox Search_Box;
    private javax.swing.JTextField Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
