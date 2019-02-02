/*************************************************************************
** changes to be made -                                                 **
** 2.add import for weddedout and export for records                    **
**************************************************************************/

package Library;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.File;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

                /*********************
                 ** @author Lalwani **
                 *********************/


public class addBook extends javax.swing.JFrame {
    
    public addBook() {
        initComponents();
        No_of_books.setText("1");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Accession_No = new javax.swing.JTextField();
        Book_Group = new javax.swing.JTextField();
        Editor_Name = new javax.swing.JTextField();
        Edition = new javax.swing.JTextField();
        Language = new javax.swing.JTextField();
        ISBN_No = new javax.swing.JTextField();
        Bill_Date = new javax.swing.JTextField();
        Purchase_Date = new javax.swing.JTextField();
        DDC_Code = new javax.swing.JTextField();
        Book_Location = new javax.swing.JTextField();
        Specimen = new javax.swing.JTextField();
        Currency_Desc = new javax.swing.JTextField();
        Book_Title = new javax.swing.JTextField();
        No_of_books = new javax.swing.JTextField();
        Publication_Year = new javax.swing.JTextField();
        Donated = new javax.swing.JTextField();
        DDC_Description = new javax.swing.JTextField();
        Price_Per_Copy = new javax.swing.JTextField();
        Bill_no = new javax.swing.JTextField();
        Volume = new javax.swing.JTextField();
        Vendor_Name = new javax.swing.JTextField();
        Pages = new javax.swing.JTextField();
        Publisher = new javax.swing.JTextField();
        Author_Name = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Select_File = new javax.swing.JButton();
        Submit_File = new javax.swing.JButton();
        File_Name = new javax.swing.JTextField();
        dir = new javax.swing.JTextField();
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

        jLabel1.setText("Book Group");

        jLabel2.setText("Book Title");

        jLabel3.setText("Accession No.");

        jLabel4.setText("Author Name");

        jLabel5.setText("Editor Name");

        jLabel6.setText("Publisher");

        jLabel7.setText("Edition");

        jLabel8.setText("Pages");

        jLabel9.setText("ISBN No.");

        jLabel10.setText("Vendor Name");

        jLabel11.setText("Language");

        jLabel12.setText("Volume");

        jLabel13.setText("Purchase Date");

        jLabel14.setText("Bill No.");

        jLabel15.setText("Bill Date");

        jLabel16.setText("Price per copy");

        jLabel17.setText("DDC code");

        jLabel18.setText("DDC Description");

        jLabel19.setText("Book Location");

        jLabel20.setText("Donated");

        jLabel21.setText("Specimen");

        jLabel22.setText("Publication Year");

        jLabel23.setText("Currency Desc.");

        jLabel24.setText("No.of Books");

        Accession_No.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Book_Group.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Editor_Name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Edition.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Language.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        ISBN_No.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Bill_Date.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Purchase_Date.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        DDC_Code.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Book_Location.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Specimen.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Currency_Desc.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Book_Title.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        No_of_books.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Publication_Year.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Donated.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        DDC_Description.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Price_Per_Copy.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Bill_no.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Volume.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Vendor_Name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Pages.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Publisher.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Author_Name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Submit.setText("Submit");
        Submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Select_File.setText("Select an Excel File");
        Select_File.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Select_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_FileActionPerformed(evt);
            }
        });

        Submit_File.setText("Submit File");
        Submit_File.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Submit_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_FileActionPerformed(evt);
            }
        });

        File_Name.setEditable(false);

        dir.setEditable(false);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Select_File)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dir)
                            .addComponent(File_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(Submit_File))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Book_Group, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Specimen, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Book_Location, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DDC_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bill_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Purchase_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Language, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ISBN_No, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Currency_Desc, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edition, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Accession_No, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Editor_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Book_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Publication_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Donated, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DDC_Description, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Price_Per_Copy, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Bill_no, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Volume, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Vendor_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Pages, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Author_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(No_of_books, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Submit, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(Book_Group, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(Accession_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(Editor_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(Edition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(ISBN_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(Language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(Purchase_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(Bill_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(DDC_Code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(Book_Location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(Specimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(Currency_Desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Book_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Author_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Pages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Vendor_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bill_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Price_Per_Copy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DDC_Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Donated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Publication_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(No_of_books, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Submit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Select_File)
                    .addComponent(File_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Submit_File))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Varaibles
    public final String user = "root";
    public final String pwd = "mysqlip";
    public final String db_url = "jdbc:mysql://localhost:3306/library";
    private String abcd;
    private String ext;
    private void Select_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_FileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Excel File");
        fileChooser.setFileSelectionMode(0);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Excel WorkBook(*.xlsx)", "xlsx"));
        fileChooser.setFileFilter(new FileNameExtensionFilter("Excel 97-2003 WorkBook(*.xls)", "xls"));
        fileChooser.setAcceptAllFileFilterUsed(true);
        int result = fileChooser.showOpenDialog(this);
        if (result == 0) {
            File_Name.setText(fileChooser.getSelectedFile().getName());
            dir.setText(fileChooser.getCurrentDirectory().toString());
            abcd = fileChooser.getCurrentDirectory().toString() + "\\" + fileChooser.getSelectedFile().getName();
            ext = fileChooser.getTypeDescription(fileChooser.getSelectedFile());
        }
        if (result == 1) {
            File_Name.setText("You pressed cancel");
            dir.setText("");
        }
    }//GEN-LAST:event_Select_FileActionPerformed

    private void Submit_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_FileActionPerformed
//        if (ext.equals("Microsoft Excel Worksheet")) {
//            try {
//                FileInputStream file = new FileInputStream(new File(abcd));
//                XSSFWorkbook yourworkbook = new XSSFWorkbook((InputStream)file);
//                XSSFSheet sheet1 = yourworkbook.getSheetAt(0);
//                Iterator rows = sheet1.rowIterator();
//                XSSFRow row = (XSSFRow)rows.next();
//                int rowNum = sheet1.getLastRowNum();
//                short colNum = sheet1.getRow(0).getLastCellNum();
//                int j = 1;
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection conn = (Connection)DriverManager.getConnection(db_url,user,pwd);
//                Statement stmt = (Statement)conn.createStatement();
//                String Sql1 = "truncate books;";
//                stmt.executeUpdate(Sql1);
//                for (int i = 0; i < rowNum; ++i) {
//                    String[] array = new String[colNum];
//                    boolean[] array1 = new boolean[colNum];
//                    int a = 0;
//                    try {
//                        while (rows.hasNext()) {
//                            row = sheet1.getRow(j);
//                            XSSFCell column = row.getCell(a);
//                            column.setCellType(1);
//                            if (column.getCellType() == 1) {
//                                array[a] = column.getStringCellValue();
//                            } else if (column.getCellType() == 4) {
//                                array1[a] = column.getBooleanCellValue();
//                            } else if (column.getCellType() == 3) {
//                                array[a] = "";
//                            }
//                            ++a;
//                        }
//                    }
//                    catch (NullPointerException column) {
//                        // empty catch block
//                    }
//                    String sql = "Insert into books(BOOK_GROUP,BOOK_TITLE,ACCESSION_NO,AUTHOR_NAME,EDITOR_NAME,PUBLISHER,EDITION,PAGES,ISBN_NO,VENDOR_NAME,LANGUAGE,VOLUMES,PURCHASE_DATE,BILL_NO,BILL_DATE,PRICE_PER_COPY,DDC_CODE,DDC_DESCRIPTION,BOOK_LOCATION,DONATED,SPECIMEN,PUBLICATION_YEAR,CURRENCY_DESC,ISSUED,ADM_NO) values ('" + array[0] + "','" + array[1] + "','" + array[2] + "','" + array[3] + "','" + array[4] + "','" + array[5] + "','" + array[6] + "','" + array[7] + "','" + array[8] + "','" + array[9] + "','" + array[10] + "','" + array[11] + "','" + array[12] + "','" + array[13] + "','" + array[14] + "','" + array[15] + "','" + array[16] + "','" + array[17] + "','" + array[18] + "','" + array[19] + "','" + array[20] + "','" + array[21] + "','" + array[22] + "'," + array1[23] + ",'" + array[24] + "');";
//                    stmt.executeUpdate(sql);
//                }
//            }
//            catch (Exception e) {
//                JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
//            }
//        } 
        if (ext.equals("Microsoft Excel 97-2003 Worksheet")) {
            try {
                FileInputStream file = new FileInputStream(new File(abcd));
                HSSFWorkbook workbook = new HSSFWorkbook(file);
                HSSFSheet sheet1 = workbook.getSheetAt(0);
                Iterator rows = sheet1.rowIterator();
                HSSFRow row = (HSSFRow)rows.next();
                int rowNum = sheet1.getLastRowNum();
                short colNum = sheet1.getRow(0).getLastCellNum();
                int j = 1;
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = (Connection)DriverManager.getConnection(db_url,user,pwd);
                Statement stmt = (Statement)conn.createStatement();
                String Sql1 = "truncate books;";
                stmt.executeUpdate(Sql1);
                for (int i = 0; i < rowNum; ++i) {
                    String[] array = new String[colNum];
                    int a = 0;
                    try {
                        while (rows.hasNext()) {
                            row = sheet1.getRow(j);
                            HSSFCell column = row.getCell(a);
                            column.setCellType(1);
                            if (column.getCellType() == 1) {
                                array[a] = column.getStringCellValue();
                            } 
                            else if (column.getCellType() == 3) {
                                array[a] = "";
                            }
//                            else if (column.getCellType() == 4){
//                                if(column.getBooleanCellValue() == true){
//                                    array[a] = "true";
//                                }
//                                else{
//                                    array[a] = "0";
//                                }
//                            }
                            ++a;
                        }
                    }
                    catch (NullPointerException column) {
                        // empty catch block
                    }
                    String sql = "Insert into books(BOOK_GROUP,BOOK_TITLE,ACCESSION_NO,AUTHOR_NAME,EDITOR_NAME,PUBLISHER,EDITION,PAGES,ISBN_NO,VENDOR_NAME,LANGUAGE,VOLUMES,PURCHASE_DATE,BILL_NO,BILL_DATE,PRICE_PER_COPY,DDC_CODE,DDC_DESCRIPTION,BOOK_LOCATION,DONATED,SPECIMEN,PUBLICATION_YEAR,CURRENCY_DESC,ISSUED,ADM_NO) values ('" + array[0] + "','" + array[1] + "','" + array[2] + "','" + array[3] + "','" + array[4] + "','" + array[5] + "','" + array[6] + "','" + array[7] + "','" + array[8] + "','" + array[9] + "','" + array[10] + "','" + array[11] + "','" + array[12] + "','" + array[13] + "','" + array[14] + "','" + array[15] + "','" + array[16] + "','" + array[17] + "','" + array[18] + "','" + array[19] + "','" + array[20] + "','" + array[21] + "','" + array[22] + "',"+ array[23] +",'"+ array[24] +"');";
                    stmt.executeUpdate(sql);
                    ++j;
                }
                stmt.close();
                conn.close();
                JOptionPane.showMessageDialog(null, "Database Updated");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            }
        }
    }//GEN-LAST:event_Submit_FileActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
            int NOB = 0;
        String[] ARRAY = new String[23];
            ARRAY[0]  = Book_Group.getText();
            ARRAY[1]  = Book_Title.getText();
            int Acession  = Integer.parseInt(Accession_No.getText());
            ARRAY[3]  = Author_Name.getText();
            ARRAY[4]  = Editor_Name.getText();
            ARRAY[5]  = Publisher.getText();
            ARRAY[6]  = Edition.getText();
            ARRAY[7]  = Pages.getText();
            ARRAY[8]  = ISBN_No.getText();
            ARRAY[9]  = Vendor_Name.getText();
            ARRAY[10] = Language.getText();
            ARRAY[11] = Volume.getText();
            ARRAY[12] = Purchase_Date.getText();
            ARRAY[13] = Bill_no.getText();
            ARRAY[14] = Bill_Date.getText();
            ARRAY[15] = Price_Per_Copy.getText();
            ARRAY[16] = DDC_Code.getText();
            ARRAY[17] = DDC_Description.getText();
            ARRAY[18] = Book_Location.getText();
            ARRAY[19] = Donated.getText();
            ARRAY[20] = Specimen.getText();
            ARRAY[21] = Publication_Year.getText();
            ARRAY[22] = Currency_Desc.getText();
            NOB   = Integer.parseInt(No_of_books.getText());
            while(NOB>0){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = (Connection)DriverManager.getConnection(db_url,user,pwd);
                Statement stmt = (Statement)conn.createStatement();
                String sql = "insert into books (BOOK_GROUP,BOOK_TITLE,ACCESSION_NO,AUTHOR_NAME,EDITOR_NAME,PUBLISHER,EDITION,PAGES,ISBN_NO,VENDOR_NAME,LANGUAGE,VOLUMES,PURCHASE_DATE,BILL_NO,BILL_DATE,PRICE_PER_COPY,DDC_CODE,DDC_DESCRIPTION,BOOK_LOCATION,DONATED,SPECIMEN,PUBLICATION_YEAR,CURRENCY_DESC) values('" + ARRAY[0] + "','" + ARRAY[1] + "','" + Acession + "','" + ARRAY[3] + "','" + ARRAY[4] + "','" + ARRAY[5] + "','" + ARRAY[6] + "','" + ARRAY[7] + "','" + ARRAY[8] + "','" + ARRAY[9] + "','" + ARRAY[10] + "','" + ARRAY[11] + "','" + ARRAY[12] + "','" + ARRAY[13] + "','" + ARRAY[14] + "','" + ARRAY[15] + "','" + ARRAY[16] + "','" + ARRAY[17] + "','" + ARRAY[18] + "','" + ARRAY[19] + "','" + ARRAY[20] + "','" + ARRAY[21] + "','" + ARRAY[22] + "');";
                stmt.executeUpdate(sql);
                stmt.close();
                conn.close();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error:" + e.getMessage());
            }
            Acession += 1;
            NOB -= 1;
            }
            JOptionPane.showMessageDialog(null, "Added Sucessfully");      
    }//GEN-LAST:event_SubmitActionPerformed

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
                new addBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Accession_No;
    private javax.swing.JMenu Admin;
    private javax.swing.JTextField Author_Name;
    private javax.swing.JTextField Bill_Date;
    private javax.swing.JTextField Bill_no;
    private javax.swing.JTextField Book_Group;
    private javax.swing.JTextField Book_Location;
    private javax.swing.JTextField Book_Title;
    private javax.swing.JMenu Circulation;
    private javax.swing.JTextField Currency_Desc;
    private javax.swing.JTextField DDC_Code;
    private javax.swing.JTextField DDC_Description;
    private javax.swing.JTextField Donated;
    private javax.swing.JTextField Edition;
    private javax.swing.JTextField Editor_Name;
    private javax.swing.JTextField File_Name;
    private javax.swing.JTextField ISBN_No;
    private javax.swing.JTextField Language;
    private javax.swing.JTextField No_of_books;
    private javax.swing.JTextField Pages;
    private javax.swing.JTextField Price_Per_Copy;
    private javax.swing.JTextField Publication_Year;
    private javax.swing.JTextField Publisher;
    private javax.swing.JTextField Purchase_Date;
    private javax.swing.JButton Select_File;
    private javax.swing.JTextField Specimen;
    private javax.swing.JButton Submit;
    private javax.swing.JButton Submit_File;
    private javax.swing.JTextField Vendor_Name;
    private javax.swing.JTextField Volume;
    private javax.swing.JTextField dir;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
