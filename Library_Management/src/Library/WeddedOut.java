/*************************************************************************
** changes to be made -                                                 **
** 1.table selection                                                    **
**************************************************************************/
package Library;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*******************
 * @author Lalwani *
 ******************/

public class WeddedOut extends javax.swing.JFrame {
    public WeddedOut() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchB = new javax.swing.JButton();
        Text = new javax.swing.JTextField();
        Search_Box = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultTable = new javax.swing.JTable();
        AddBack = new javax.swing.JButton();
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

        SearchB.setText("Search");
        SearchB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBActionPerformed(evt);
            }
        });

        Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextKeyPressed(evt);
            }
        });

        Search_Box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACCESSION_NO", "BOOK_TITLE", "BOOK_GROUP", "AUTHOR_NAME", "EDITOR_NAME", "PUBLISHER", "EDITION", "PAGES", "ISBN_NO", "VENDOR_NAME", "LANGUAGE", "VOLUMES", "PURCHASE_DATE", "BILL_NO", "BILL_DATE", "PRICE_PER_COPY", "DDC_CODE", "DDC_DESCRIPTION", "BOOK_LOCATION", "DONATED", "SPECIMEN", "PUBLICATION_YEAR", "CURRENCY_DESC", "ISSUED", "ADM_NO" }));
        Search_Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        AddBack.setText("Add Back");
        AddBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBackActionPerformed(evt);
            }
        });

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
                .addComponent(Search_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AddBack))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchB)
                    .addComponent(Search_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddBack))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    final String user = "root";
    final String pwd = "mysqlip";
    final String db_url = "jdbc:mysql://localhost:3306/library";
    Object acess;
    int row;
    int column;
    
    int weddout(String item, String text, DefaultTableModel model) {
        while (model.getRowCount() > 0) {
            model.setRowCount(0);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "mysqlip");
            Statement stmt = (Statement)conn.createStatement();
            String sql = "INSERT INTO books (BOOK_GROUP,BOOK_TITLE,ACCESSION_NO,AUTHOR_NAME,EDITOR_NAME,PUBLISHER,EDITION,PAGES,ISBN_NO,VENDOR_NAME,LANGUAGE,VOLUMES,PURCHASE_DATE,BILL_NO,BILL_DATE,PRICE_PER_COPY,DDC_CODE,DDC_DESCRIPTION,BOOK_LOCATION,DONATED,SPECIMEN,PUBLICATION_YEAR,CURRENCY_DESC)Select BOOK_GROUP,BOOK_TITLE,ACCESSION_NO,AUTHOR_NAME,EDITOR_NAME,PUBLISHER,EDITION,PAGES,ISBN_NO,VENDOR_NAME,LANGUAGE,VOLUMES,PURCHASE_DATE,BILL_NO,BILL_DATE,PRICE_PER_COPY,DDC_CODE,DDC_DESCRIPTION,BOOK_LOCATION,DONATED,SPECIMEN,PUBLICATION_YEAR,CURRENCY_DESC FROM weddedout WHERE accession_no ='" + acess + "' ;";
            String sql1 = "DELETE FROM weddedout WHERE ACCESSION_NO ='" + acess + "';";
            stmt.executeUpdate(sql);
            stmt.executeUpdate(sql1);
            while (model.getRowCount() > 0) {
                model.setRowCount(0);
            }
            String sql2 = "select * from weddedout where " + item + " like'%" + text + "%';";
            ResultSet rs = stmt.executeQuery(sql2);
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
            conn.close();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Added to Available Books");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
        return 0;
    }
    
    void Search(String item, String text, DefaultTableModel model){
        try {
            while (model.getRowCount() > 0) {
                model.setRowCount(0);
            }
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "mysqlip");
            Statement stmt = (Statement)conn.createStatement();
            String sql = "select * from weddedout where " + item + " like'%" + text + "%';";
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
    
    private void SearchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBActionPerformed
        String item = (String)Search_Box.getSelectedItem();
        String text = Text.getText();
        DefaultTableModel model = (DefaultTableModel)ResultTable.getModel();
        Search(item, text, model);
    }//GEN-LAST:event_SearchBActionPerformed

    private void TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String item = (String)Search_Box.getSelectedItem();
            String text = Text.getText();
            DefaultTableModel model = (DefaultTableModel)ResultTable.getModel();
            Search(item, text, model);
        }
    }//GEN-LAST:event_TextKeyPressed

    private void ResultTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResultTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ResultTable.getModel();
        row = ResultTable.getSelectedRow();
        acess = model.getValueAt(row, 2);
        if (evt.getClickCount() == 2) {
            String item = (String)Search_Box.getSelectedItem();
            String text = Text.getText();
            weddout(item, text, model);
        }
    }//GEN-LAST:event_ResultTableMouseClicked

    private void AddBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBackActionPerformed
        DefaultTableModel model = (DefaultTableModel)ResultTable.getModel();
        String item = (String)Search_Box.getSelectedItem();
        String text = Text.getText();
        weddout(item, text, model);
    }//GEN-LAST:event_AddBackActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new addBook().setVisible(true);
        dispose();
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
                new WeddedOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBack;
    private javax.swing.JMenu Admin;
    private javax.swing.JMenu Circulation;
    private javax.swing.JTable ResultTable;
    private javax.swing.JButton SearchB;
    private javax.swing.JComboBox Search_Box;
    private javax.swing.JTextField Text;
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