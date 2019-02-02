
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;

public class OpenPage extends javax.swing.JFrame 
   {
  
     public OpenPage() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchBox = new javax.swing.JComboBox();
        SearchButton = new javax.swing.JButton();
        SearchTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        SearchResult = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Library Management System");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(MAXIMIZED_BOTH );
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);

        SearchBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BOOK_TITLE", "ACCESSION_NO", "BOOK_GROUP", "AUTHOR_NAME", "EDITOR_NAME", "PUBLISHER", "LANGUAGE", "BOOK_LOCATION", "PUBLICATION_YEAR", "ISSUED", "ADM_NO" }));
        SearchBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        SearchButton.setText("Search");
        SearchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        SearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchTextFieldKeyPressed(evt);
            }
        });

        SearchResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOK_GROUP", "BOOK_TITLE", "ACCESSION_NO", "AUTHOR_NAME", "EDITOR_NAME", "ISSUED", "ADM_NO", "BOOK_LOCATION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SearchResult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(SearchResult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(SearchButton)
                .addGap(229, 439, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
final String user   = "root";                                      //mysql username
final String pwd    = "mysqlip";                                   //mysql password
final String db_url  = "jdbc:mysql://192.168.0.56/library";     // mysql connection machine                             

    
int Search(String item,String text,DefaultTableModel model){
        
        while(model.getRowCount() > 0){
            model.setRowCount(0);
        }
        try{
       
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection(db_url,user,pwd);
            Statement stmt  = (Statement) conn.createStatement();
            String sql     = "select * from books where "+item+" like'%"+text+"%';";
            ResultSet rs    = stmt.executeQuery(sql);
            while(rs.next()){
                    String BOOK_GROUP      = rs.getString("BOOK_GROUP")      ;
                    String BOOK_TITLE      = rs.getString("BOOK_TITLE")      ;
                    String ACCESSION_NO    = rs.getString("ACCESSION_NO")    ;
                    String AUTHOR_NAME     = rs.getString("AUTHOR_NAME")     ;
                    String EDITOR_NAME     = rs.getString("EDITOR_NAME")     ;
                    Boolean ISSUED         = rs.getBoolean("ISSUED")         ;
                    String ADM_NO          = rs.getString("ADM_NO")          ;
                    String BOOK_LOCATION   = rs.getString("BOOK_LOCATION")   ;
                    String ISSUE;
                    if (ISSUED == true)
                    {ISSUE = "Issued";}
                    else
                    {ISSUE = "Available";}
                    model.addRow(new Object[] {BOOK_GROUP,BOOK_TITLE,ACCESSION_NO,AUTHOR_NAME,EDITOR_NAME,ISSUE,ADM_NO,BOOK_LOCATION});
            }
            rs.close();
            conn.close();
            stmt.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
        }
        return 0;
    }

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        String search             = (String) SearchBox.getSelectedItem();
        String text           = SearchTextField.getText();
        DefaultTableModel model = (DefaultTableModel)SearchResult.getModel();
        Search(search,text,model);
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void SearchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextFieldKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String search             = (String) SearchBox.getSelectedItem();
            String text           = SearchTextField.getText();
            DefaultTableModel model = (DefaultTableModel)SearchResult.getModel();
            Search(search,text,model);
        }
    }//GEN-LAST:event_SearchTextFieldKeyPressed

    public static void main(String args[]) {
       try{
              UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
          }
       catch (Exception ex){
              JOptionPane.showMessageDialog(null,ex.getLocalizedMessage());
           }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new OpenPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox SearchBox;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTable SearchResult;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
