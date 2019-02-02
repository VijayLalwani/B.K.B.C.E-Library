/*************************************************************************
** changes to be made -                                                 **
**************************************************************************/
package Library;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/*******************
 * @author Lalwani *
 ******************/


public class Export extends javax.swing.JFrame {

    public Export() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Export_Folder = new javax.swing.JTextField();
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

        jLabel1.setText("Students");

        jLabel2.setText("Teachers");

        jLabel3.setText("Books");

        jLabel4.setText("Weddedout");

        jButton1.setText("Export");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Export");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Export");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Export");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Export Folder:");

        Export_Folder.setText("D:\\");

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
                    .addGap(45, 45, 45)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(31, 31, 31)
                            .addComponent(jButton1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(30, 30, 30)
                            .addComponent(jButton2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(46, 46, 46)
                            .addComponent(jButton3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jButton4)))
                    .addGap(130, 130, 130)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Export_Folder, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(213, 213, 213))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jButton1)
                        .addComponent(jLabel5)
                        .addComponent(Export_Folder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jButton2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jButton4))
                    .addContainerGap(100, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents
    final String user = "root";
    final String pwd = "mysqlip";
    final String db_url = "jdbc:mysql://localhost:3306/library";
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Location = Export_Folder.getText();
        try {
            String excelFileName = Location+"Students.xls";
            String sheetName = "Sheet1";
            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet sheet = wb.createSheet(sheetName);
            HSSFRow row1 = sheet.createRow(0);
            HSSFCell cell = row1.createCell(0);
            cell.setCellType(1);
            cell.setCellValue("ADM_NO");
            HSSFCell cell1 = row1.createCell(1);
            cell1.setCellType(1);
            cell1.setCellValue("NAME");
            HSSFCell cell2 = row1.createCell(2);
            cell2.setCellType(1);
            cell2.setCellValue("STD");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection)DriverManager.getConnection(db_url,user,pwd);
            Statement stmt = (Statement)conn.createStatement();
            String sql = "select * from students";
            String sql1 = "select count(*) from students;";
            ResultSet rs1 = stmt.executeQuery(sql1);
            rs1.next();
            int TOTAL = rs1.getInt("count(*)");
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            for (int j = 1; j <= TOTAL; ++j) {
                HSSFRow row = sheet.createRow(j);
                HSSFCell cell4 = row.createCell(0);
                cell4.setCellType(1);
                cell4.setCellValue(rs.getString("ADM_NO"));
                HSSFCell cell5 = row.createCell(1);
                cell5.setCellType(1);
                cell5.setCellValue(rs.getString("NAME"));
                HSSFCell cell6 = row.createCell(2);
                cell6.setCellType(1);
                cell6.setCellValue(rs.getString("STD"));
                rs.next();
            }
            stmt.close();
            conn.close();
            FileOutputStream fileOut = new FileOutputStream(excelFileName);
            wb.write((OutputStream)fileOut);
            fileOut.flush();
            fileOut.close();
            JOptionPane.showMessageDialog(null, "Exported Sucessfully");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String Location = Export_Folder.getText();
        try {
            String excelFileName = Location+"Teachers.xls";
            String sheetName = "Sheet1";
            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet sheet = wb.createSheet(sheetName);
            HSSFRow row1 = sheet.createRow(0);
            HSSFCell cell = row1.createCell(0);
            cell.setCellType(1);
            cell.setCellValue("SL_NO");
            HSSFCell cell1 = row1.createCell(1);
            cell1.setCellType(1);
            cell1.setCellValue("NAME");
            HSSFCell cell2 = row1.createCell(2);
            cell2.setCellType(1);
            cell2.setCellValue("INITIAL");
            HSSFCell cell3 = row1.createCell(3);
            cell3.setCellType(1);
            cell3.setCellValue("SUBJECT");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection)DriverManager.getConnection(db_url,user,pwd);
            Statement stmt = (Statement)conn.createStatement();
            String sql = "select * from teachers";
            String sql1 = "select count(*) from teachers;";
            ResultSet rs1 = stmt.executeQuery(sql1);
            rs1.next();
            int TOTAL = rs1.getInt("count(*)");
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            for (int j = 1; j < TOTAL; ++j) {
                HSSFRow row = sheet.createRow(j);
                HSSFCell cell4 = row.createCell(0);
                cell4.setCellType(1);
                cell4.setCellValue(rs.getString("SL_NO"));
                HSSFCell cell5 = row.createCell(1);
                cell5.setCellType(1);
                cell5.setCellValue(rs.getString("NAME"));
                HSSFCell cell6 = row.createCell(2);
                cell6.setCellType(1);
                cell6.setCellValue(rs.getString("INITIAL"));
                HSSFCell cell7 = row.createCell(3);
                cell7.setCellType(1);
                cell7.setCellValue(rs.getString("SUBJECT"));
                rs.next();
            }
            stmt.close();
            conn.close();
            FileOutputStream fileOut = new FileOutputStream(excelFileName);
            wb.write((OutputStream)fileOut);
            fileOut.flush();
            fileOut.close();
            JOptionPane.showMessageDialog(null, "Exported Sucessfully");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Location = Export_Folder.getText();
        try {
            String excelFileName = Location+"Books.xls";
            String sheetName = "Sheet1";
            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet sheet = wb.createSheet(sheetName);
            HSSFRow row1 = sheet.createRow(0);
            HSSFCell cell = row1.createCell(0);
            cell.setCellType(1);
            cell.setCellValue("BOOK_GROUP");
            HSSFCell cell1 = row1.createCell(1);
            cell1.setCellType(1);
            cell1.setCellValue("BOOK_TITLE");
            HSSFCell cell2 = row1.createCell(2);
            cell2.setCellType(1);
            cell2.setCellValue("ACCESSION_NO");
            HSSFCell cell3 = row1.createCell(3);
            cell3.setCellType(1);
            cell3.setCellValue("AUTHOR_NAME");
            HSSFCell cell8 = row1.createCell(4);
            cell8.setCellType(1);
            cell8.setCellValue("EDITOR_NAME");
            HSSFCell cell9 = row1.createCell(5);
            cell9.setCellType(1);
            cell9.setCellValue("PUBLISHER");
            HSSFCell cell10 = row1.createCell(6);
            cell10.setCellType(1);
            cell10.setCellValue("EDITION");
            HSSFCell cell11 = row1.createCell(7);
            cell11.setCellType(1);
            cell11.setCellValue("PAGES");
            HSSFCell cell12 = row1.createCell(8);
            cell12.setCellType(1);
            cell12.setCellValue("ISBN_NO");
            HSSFCell cell13 = row1.createCell(9);
            cell13.setCellType(1);
            cell13.setCellValue("VENDOR_NAME");
            HSSFCell cell14 = row1.createCell(10);
            cell14.setCellType(1);
            cell14.setCellValue("LANGUAGE");
            HSSFCell cell15 = row1.createCell(11);
            cell15.setCellType(1);
            cell15.setCellValue("VOLUMES");
            HSSFCell cell16 = row1.createCell(12);
            cell16.setCellType(1);
            cell16.setCellValue("PURCHASE_DATE");
            HSSFCell cell17 = row1.createCell(13);
            cell17.setCellType(1);
            cell17.setCellValue("BILL_NO");
            HSSFCell cell18 = row1.createCell(14);
            cell18.setCellType(1);
            cell18.setCellValue("BILL_DATE");
            HSSFCell cell19 = row1.createCell(15);
            cell19.setCellType(1);
            cell19.setCellValue("PRICE_PER_COPY");
            HSSFCell cell20 = row1.createCell(16);
            cell20.setCellType(1);
            cell20.setCellValue("DDC_CODE");
            HSSFCell cell21 = row1.createCell(17);
            cell21.setCellType(1);
            cell21.setCellValue("DDC_DESCRIPTION");
            HSSFCell cell22 = row1.createCell(18);
            cell22.setCellType(1);
            cell22.setCellValue("BOOK_LOCATION");
            HSSFCell cell23 = row1.createCell(19);
            cell23.setCellType(1);
            cell23.setCellValue("DONATED");
            HSSFCell cell24 = row1.createCell(20);
            cell24.setCellType(1);
            cell24.setCellValue("SPECIMEN");
            HSSFCell cell25 = row1.createCell(21);
            cell25.setCellType(1);
            cell25.setCellValue("PUBLICATION_YEAR");
            HSSFCell cell26 = row1.createCell(22);
            cell26.setCellType(1);
            cell26.setCellValue("CURRENCY_DESC");
            HSSFCell cell27 = row1.createCell(23);
            cell27.setCellType(1);
            cell27.setCellValue("ISSUED");
            HSSFCell cell28 = row1.createCell(24);
            cell28.setCellType(1);
            cell28.setCellValue("ADM_NO");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection)DriverManager.getConnection(db_url,user,pwd);
            Statement stmt = (Statement)conn.createStatement();
            String sql = "select * from books";
            String sql1 = "select count(*) from books;";
            ResultSet rs1 = stmt.executeQuery(sql1);
            rs1.next();
            int TOTAL = rs1.getInt("count(*)");
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            for (int j = 1; j <= TOTAL; ++j) {
                HSSFRow row = sheet.createRow(j);
                HSSFCell cell4 = row.createCell(0);
                cell4.setCellType(1);
                cell4.setCellValue(rs.getString("BOOK_GROUP"));
                HSSFCell cell5 = row.createCell(1);
                cell5.setCellType(1);
                cell5.setCellValue(rs.getString("BOOK_TITLE"));
                HSSFCell cell6 = row.createCell(2);
                cell6.setCellType(1);
                cell6.setCellValue(rs.getString("ACCESSION_NO"));
                HSSFCell cell7 = row.createCell(3);
                cell7.setCellType(1);
                cell7.setCellValue(rs.getString("AUTHOR_NAME"));
                HSSFCell cell81 = row.createCell(4);
                cell81.setCellType(1);
                cell81.setCellValue(rs.getString("EDITOR_NAME"));
                HSSFCell cell91 = row.createCell(5);
                cell91.setCellType(1);
                cell91.setCellValue(rs.getString("PUBLISHER"));
                HSSFCell cell101 = row.createCell(6);
                cell101.setCellType(1);
                cell101.setCellValue(rs.getString("EDITION"));
                HSSFCell cell111 = row.createCell(7);
                cell111.setCellType(1);
                cell111.setCellValue(rs.getString("PAGES"));
                HSSFCell cell121 = row.createCell(8);
                cell121.setCellType(1);
                cell121.setCellValue(rs.getString("ISBN_NO"));
                HSSFCell cell131 = row.createCell(9);
                cell131.setCellType(1);
                cell131.setCellValue(rs.getString("VENDOR_NAME"));
                HSSFCell cell141 = row.createCell(10);
                cell141.setCellType(1);
                cell141.setCellValue(rs.getString("LANGUAGE"));
                HSSFCell cell151 = row.createCell(11);
                cell151.setCellType(1);
                cell151.setCellValue(rs.getString("VOLUMES"));
                HSSFCell cell161 = row.createCell(12);
                cell161.setCellType(1);
                cell161.setCellValue(rs.getString("PURCHASE_DATE"));
                HSSFCell cell171 = row.createCell(13);
                cell171.setCellType(1);
                cell171.setCellValue(rs.getString("BILL_NO"));
                HSSFCell cell181 = row.createCell(14);
                cell181.setCellType(1);
                cell181.setCellValue(rs.getString("BILL_DATE"));
                HSSFCell cell191 = row.createCell(15);
                cell191.setCellType(1);
                cell191.setCellValue(rs.getString("PRICE_PER_COPY"));
                HSSFCell cell201 = row.createCell(16);
                cell201.setCellType(1);
                cell201.setCellValue(rs.getString("DDC_CODE"));
                HSSFCell cell211 = row.createCell(17);
                cell211.setCellType(1);
                cell211.setCellValue(rs.getString("DDC_DESCRIPTION"));
                HSSFCell cell221 = row.createCell(18);
                cell221.setCellType(1);
                cell221.setCellValue(rs.getString("BOOK_LOCATION"));
                HSSFCell cell231 = row.createCell(19);
                cell231.setCellType(1);
                cell231.setCellValue(rs.getString("DONATED"));
                HSSFCell cell251 = row.createCell(20);
                cell251.setCellType(1);
                cell251.setCellValue(rs.getString("SPECIMEN"));
                HSSFCell cell261 = row.createCell(21);
                cell261.setCellType(1);
                cell261.setCellValue(rs.getString("PUBLICATION_YEAR"));
                HSSFCell cell271 = row.createCell(22);
                cell271.setCellType(1);
                cell271.setCellValue(rs.getString("CURRENCY_DESC"));
                HSSFCell cell281 = row.createCell(23);
                cell281.setCellType(4);
                cell281.setCellValue(rs.getBoolean("ISSUED"));
                HSSFCell cell291 = row.createCell(24);
                cell291.setCellType(1);
                cell291.setCellValue(rs.getString("ADM_NO"));
                rs.next();
            }
            stmt.close();
            conn.close();
            FileOutputStream fileOut = new FileOutputStream(excelFileName);
            wb.write((OutputStream)fileOut);
            fileOut.flush();
            fileOut.close();
            JOptionPane.showMessageDialog(null, "Exported Sucessfully");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String Location = Export_Folder.getText();
        try {
            String excelFileName = Location+"Wedded out.xls";
            String sheetName = "Sheet1";
            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet sheet = wb.createSheet(sheetName);
            HSSFRow row1 = sheet.createRow(0);
            HSSFCell cell = row1.createCell(0);
            cell.setCellType(1);
            cell.setCellValue("BOOK_GROUP");
            HSSFCell cell1 = row1.createCell(1);
            cell1.setCellType(1);
            cell1.setCellValue("BOOK_TITLE");
            HSSFCell cell2 = row1.createCell(2);
            cell2.setCellType(1);
            cell2.setCellValue("ACCESSION_NO");
            HSSFCell cell3 = row1.createCell(3);
            cell3.setCellType(1);
            cell3.setCellValue("AUTHOR_NAME");
            HSSFCell cell8 = row1.createCell(4);
            cell8.setCellType(1);
            cell8.setCellValue("EDITOR_NAME");
            HSSFCell cell9 = row1.createCell(5);
            cell9.setCellType(1);
            cell9.setCellValue("PUBLISHER");
            HSSFCell cell10 = row1.createCell(6);
            cell10.setCellType(1);
            cell10.setCellValue("EDITION");
            HSSFCell cell11 = row1.createCell(7);
            cell11.setCellType(1);
            cell11.setCellValue("PAGES");
            HSSFCell cell12 = row1.createCell(8);
            cell12.setCellType(1);
            cell12.setCellValue("ISBN_NO");
            HSSFCell cell13 = row1.createCell(9);
            cell13.setCellType(1);
            cell13.setCellValue("VENDOR_NAME");
            HSSFCell cell14 = row1.createCell(10);
            cell14.setCellType(1);
            cell14.setCellValue("LANGUAGE");
            HSSFCell cell15 = row1.createCell(11);
            cell15.setCellType(1);
            cell15.setCellValue("VOLUMES");
            HSSFCell cell16 = row1.createCell(12);
            cell16.setCellType(1);
            cell16.setCellValue("PURCHASE_DATE");
            HSSFCell cell17 = row1.createCell(13);
            cell17.setCellType(1);
            cell17.setCellValue("BILL_NO");
            HSSFCell cell18 = row1.createCell(14);
            cell18.setCellType(1);
            cell18.setCellValue("BILL_DATE");
            HSSFCell cell19 = row1.createCell(15);
            cell19.setCellType(1);
            cell19.setCellValue("PRICE_PER_COPY");
            HSSFCell cell20 = row1.createCell(16);
            cell20.setCellType(1);
            cell20.setCellValue("DDC_CODE");
            HSSFCell cell21 = row1.createCell(17);
            cell21.setCellType(1);
            cell21.setCellValue("DDC_DESCRIPTION");
            HSSFCell cell22 = row1.createCell(18);
            cell22.setCellType(1);
            cell22.setCellValue("BOOK_LOCATION");
            HSSFCell cell23 = row1.createCell(19);
            cell23.setCellType(1);
            cell23.setCellValue("DONATED");
            HSSFCell cell24 = row1.createCell(20);
            cell24.setCellType(1);
            cell24.setCellValue("SPECIMEN");
            HSSFCell cell25 = row1.createCell(21);
            cell25.setCellType(1);
            cell25.setCellValue("PUBLICATION_YEAR");
            HSSFCell cell26 = row1.createCell(22);
            cell26.setCellType(1);
            cell26.setCellValue("CURRENCY_DESC");
            HSSFCell cell27 = row1.createCell(23);
            cell27.setCellType(1);
            cell27.setCellValue("ISSUED");
            HSSFCell cell28 = row1.createCell(24);
            cell28.setCellType(1);
            cell28.setCellValue("ADM_NO");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection)DriverManager.getConnection(db_url,user,pwd);
            Statement stmt = (Statement)conn.createStatement();
            String sql = "select * from weddedout";
            String sql1 = "select count(*) from weddedout;";
            ResultSet rs1 = stmt.executeQuery(sql1);
            rs1.next();
            int TOTAL = rs1.getInt("count(*)");
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            for (int j = 1; j <= TOTAL; ++j) {
                HSSFRow row = sheet.createRow(j);
                HSSFCell cell4 = row.createCell(0);
                cell4.setCellType(1);
                cell4.setCellValue(rs.getString("BOOK_GROUP"));
                HSSFCell cell5 = row.createCell(1);
                cell5.setCellType(1);
                cell5.setCellValue(rs.getString("BOOK_TITLE"));
                HSSFCell cell6 = row.createCell(2);
                cell6.setCellType(1);
                cell6.setCellValue(rs.getString("ACCESSION_NO"));
                HSSFCell cell7 = row.createCell(3);
                cell7.setCellType(1);
                cell7.setCellValue(rs.getString("AUTHOR_NAME"));
                HSSFCell cell81 = row.createCell(4);
                cell81.setCellType(1);
                cell81.setCellValue(rs.getString("EDITOR_NAME"));
                HSSFCell cell91 = row.createCell(5);
                cell91.setCellType(1);
                cell91.setCellValue(rs.getString("PUBLISHER"));
                HSSFCell cell101 = row.createCell(6);
                cell101.setCellType(1);
                cell101.setCellValue(rs.getString("EDITION"));
                HSSFCell cell111 = row.createCell(7);
                cell111.setCellType(1);
                cell111.setCellValue(rs.getString("PAGES"));
                HSSFCell cell121 = row.createCell(8);
                cell121.setCellType(1);
                cell121.setCellValue(rs.getString("ISBN_NO"));
                HSSFCell cell131 = row.createCell(9);
                cell131.setCellType(1);
                cell131.setCellValue(rs.getString("VENDOR_NAME"));
                HSSFCell cell141 = row.createCell(10);
                cell141.setCellType(1);
                cell141.setCellValue(rs.getString("LANGUAGE"));
                HSSFCell cell151 = row.createCell(11);
                cell151.setCellType(1);
                cell151.setCellValue(rs.getString("VOLUMES"));
                HSSFCell cell161 = row.createCell(12);
                cell161.setCellType(1);
                cell161.setCellValue(rs.getString("PURCHASE_DATE"));
                HSSFCell cell171 = row.createCell(13);
                cell171.setCellType(1);
                cell171.setCellValue(rs.getString("BILL_NO"));
                HSSFCell cell181 = row.createCell(14);
                cell181.setCellType(1);
                cell181.setCellValue(rs.getString("BILL_DATE"));
                HSSFCell cell191 = row.createCell(15);
                cell191.setCellType(1);
                cell191.setCellValue(rs.getString("PRICE_PER_COPY"));
                HSSFCell cell201 = row.createCell(16);
                cell201.setCellType(1);
                cell201.setCellValue(rs.getString("DDC_CODE"));
                HSSFCell cell211 = row.createCell(17);
                cell211.setCellType(1);
                cell211.setCellValue(rs.getString("DDC_DESCRIPTION"));
                HSSFCell cell221 = row.createCell(18);
                cell221.setCellType(1);
                cell221.setCellValue(rs.getString("BOOK_LOCATION"));
                HSSFCell cell231 = row.createCell(19);
                cell231.setCellType(1);
                cell231.setCellValue(rs.getString("DONATED"));
                HSSFCell cell251 = row.createCell(20);
                cell251.setCellType(1);
                cell251.setCellValue(rs.getString("SPECIMEN"));
                HSSFCell cell261 = row.createCell(21);
                cell261.setCellType(1);
                cell261.setCellValue(rs.getString("PUBLICATION_YEAR"));
                HSSFCell cell271 = row.createCell(22);
                cell271.setCellType(1);
                cell271.setCellValue(rs.getString("CURRENCY_DESC"));
                HSSFCell cell281 = row.createCell(23);
                cell281.setCellType(4);
                cell281.setCellValue(rs.getBoolean("ISSUED"));
                HSSFCell cell291 = row.createCell(24);
                cell291.setCellType(1);
                cell291.setCellValue(rs.getString("ADM_NO"));
                rs.next();
            }
            stmt.close();
            conn.close();
            FileOutputStream fileOut = new FileOutputStream(excelFileName);
            wb.write((OutputStream)fileOut);
            fileOut.flush();
            fileOut.close();
            JOptionPane.showMessageDialog(null, "Exported Sucessfully");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
                new Export().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Admin;
    private javax.swing.JMenu Circulation;
    private javax.swing.JTextField Export_Folder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    // End of variables declaration//GEN-END:variables
}
