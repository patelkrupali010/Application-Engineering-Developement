/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krupali
 */
public class ManageRestaurantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantJPanel
     */

    EcoSystem ecosystem;
    UserAccountDirectory userAccountList;
    UserAccount userAccount;
   
    
    public ManageRestaurantJPanel(UserAccount userAccount,EcoSystem ecosystem) {
        initComponents();
        this.ecosystem=ecosystem;
        this.userAccount = userAccount;
        insertIntoTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnCreateRestaurant = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRestaurant = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Restaurant");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 940, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 150, 30));

        txtUserName.setBackground(new java.awt.Color(153, 0, 0));
        txtUserName.setForeground(new java.awt.Color(255, 255, 255));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 290, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 170, 30));

        txtPassword.setBackground(new java.awt.Color(153, 0, 0));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 290, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Restaurant Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 170, 30));

        txtName.setBackground(new java.awt.Color(153, 0, 0));
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 290, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Restaurant Address");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 140, 30));

        txtAddress.setBackground(new java.awt.Color(153, 0, 0));
        txtAddress.setForeground(new java.awt.Color(255, 255, 255));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 290, 30));

        btnCreateRestaurant.setIcon(new javax.swing.ImageIcon("C:\\Users\\krupa\\Downloads\\Assignment5Skeleton\\db4odemo\\add1.png")); // NOI18N
        btnCreateRestaurant.setText("Create");
        btnCreateRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRestaurantActionPerformed(evt);
            }
        });
        add(btnCreateRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 90, 30));

        btnModify.setIcon(new javax.swing.ImageIcon("C:\\Users\\krupa\\Downloads\\Assignment5Skeleton\\db4odemo\\edit1.png")); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 90, 30));

        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\krupa\\Downloads\\Assignment5Skeleton\\db4odemo\\del.png")); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 100, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Restaurant Phone");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 170, 30));

        txtPhone.setBackground(new java.awt.Color(153, 0, 0));
        txtPhone.setForeground(new java.awt.Color(255, 255, 255));
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 290, 30));

        tblRestaurant.setBackground(new java.awt.Color(153, 0, 0));
        tblRestaurant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tblRestaurant.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblRestaurant.setForeground(new java.awt.Color(255, 255, 255));
        tblRestaurant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Restaurant Name", "Restaurant Address", "Restaurant Phone", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRestaurant.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblRestaurant.setGridColor(new java.awt.Color(255, 255, 255));
        tblRestaurant.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblRestaurant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRestaurantMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRestaurant);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 650, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            txtName.setEditable(true);
        }
        else{
            txtName.setEditable(false);
            JOptionPane.showMessageDialog(txtName, "Invalid entry. Please enter letters only.");
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void btnCreateRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRestaurantActionPerformed
        // TODO add your handling code here:
        int flag = 1;

        if( (txtName.getText().isEmpty() || txtName.getText() == null)){
            JOptionPane.showMessageDialog(txtName, "Error: Restaurant Name is null or empty");
            flag = 0;
            return;
        }

        if( (txtAddress.getText().isEmpty() || txtAddress.getText() == null)){
            JOptionPane.showMessageDialog(txtAddress, "Error: Restaurant Address is null or empty");
            flag = 0;
            return;
        }

        if(txtPhone.getText().isEmpty() || txtPhone.getText() == null || !txtPhone.getText().matches("^\\d{3}-\\d{3}-\\d{4}$")){
            JOptionPane.showMessageDialog(this,"Error: Restaurant Phone Number must be in the form XXX-XXX-XXXX and cannot be null or empty");
            return;
        }

        if( (txtUserName.getText().isEmpty() || txtUserName.getText() == null)){
            JOptionPane.showMessageDialog(txtUserName, "Error: Username is null or empty");
            flag = 0;
            return;
        }

        if( (txtPassword.getText().isEmpty() || txtPassword.getText() == null)){
            JOptionPane.showMessageDialog(txtPassword, "Error: Password is null or empty");
            flag = 0;
            return;
        }

        if( txtUserName.getText().isEmpty()||txtPassword.getText().isEmpty()|| txtName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtPhone.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please fill all details");
            return;
        }

        if(flag == 1){
            String restaurantId = UUID.randomUUID().toString();

            if(ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserName.getText())){

            Restaurant restaurant = new Restaurant(txtUserName.getText(), txtPassword.getText(), txtName.getText(),txtAddress.getText(), txtPhone.getText());
                restaurant.setRestaurantId(restaurantId);
                ecosystem.getUserAccountDirectory().addUserAccount(restaurant);
                ecosystem.getRestaurantDirectory().addRestaurant(restaurant);

                insertIntoTable();
                txtUserName.setText("");
                txtPassword.setText("");
                txtName.setText("");
                txtAddress.setText("");
                txtPhone.setText("");
                JOptionPane.showMessageDialog(this,"Restaurant details are created.");
            }else{
                JOptionPane.showMessageDialog(null, "Username " + txtUserName.getText() + " already exists !!!, Please try a new one");
            }
        }
    }//GEN-LAST:event_btnCreateRestaurantActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        int flag = 1;
        if( (txtName.getText().isEmpty() || txtName.getText() == null)){
            JOptionPane.showMessageDialog(txtName, "Error: Restaurant Name is null or empty");
            flag = 0;
            return;
        }

        if( (txtAddress.getText().isEmpty() || txtAddress.getText() == null)){
            JOptionPane.showMessageDialog(txtAddress, "Error: Restaurant Address is null or empty");
            flag = 0;
            return;
        }

        if(txtPhone.getText().isEmpty() || txtPhone.getText() == null || !txtPhone.getText().matches("^\\d{3}-\\d{3}-\\d{4}$")){
            JOptionPane.showMessageDialog(this,"Error: Restaurant Phone Number must be in the form XXX-XXX-XXXX and cannot be null or empty");
            return;
        }

        if( (txtUserName.getText().isEmpty() || txtUserName.getText() == null)){
            JOptionPane.showMessageDialog(txtUserName, "Error: Restaurant Username is null or empty");
            flag = 0;
            return;
        }

        if( (txtPassword.getText().isEmpty() || txtPassword.getText() == null)){
            JOptionPane.showMessageDialog(txtPassword, "Error: Restaurant Password is null or empty");
            flag = 0;
            return;
        }

        if( txtUserName.getText().isEmpty()||txtPassword.getText().isEmpty()|| txtName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtPhone.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please fill all details");
            return;
        }

        int selectedRow = tblRestaurant.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
        else {
            if(flag == 1){
                for(UserAccount userAccount: ecosystem.getUserAccountDirectory().getUserAccountList()){
                    if(txtUserName.getText().equals(userAccount.getUsername())){
                        if(userAccount.getRestaurantId()!= ecosystem.getRestaurantDirectory().generateRestaurantList().get(selectedRow).getRestaurantId())
                        {
                            JOptionPane.showMessageDialog(null, "Username already exists!");
                            return;
                        }
                    }
                }
                Restaurant restaurant = ecosystem.getRestaurantDirectory().generateRestaurantList().get(selectedRow);
                restaurant.setUsername(txtUserName.getText());
                restaurant.setPassword(txtPassword.getText());
                restaurant.setRestaurantName(txtName.getText());
                restaurant.setRestaurantContact(txtPhone.getText());
                restaurant.setRestaurantAddress(txtAddress.getText());
                insertIntoTable();
                txtUserName.setText("");
                txtPassword.setText("");
                txtName.setText("");
                txtPhone.setText("");
                txtAddress.setText("");

                JOptionPane.showMessageDialog(this,"Restaurant details are updated.");

            }
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblRestaurant.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        } else {
            //            Customer customer = (Customer) tblCustomer.getValueAt(selectedRow, 0);
            Restaurant restaurant = ecosystem.getRestaurantDirectory().generateRestaurantList().get(selectedRow);
            RestaurantDirectory restaurantDirectory = ecosystem.getRestaurantDirectory();
            restaurantDirectory.removeRestaurant(restaurant);
            JOptionPane.showMessageDialog(null, "Restaurant   "  + txtUserName.getText() + " deleted");
            insertIntoTable();
            txtName.setText("");
            txtPhone.setText("");
            txtUserName.setText("");
            txtPassword.setText("");
            txtAddress.setText("");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblRestaurantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRestaurantMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblRestaurant.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }
        else{
            try{
                DefaultTableModel model = (DefaultTableModel)tblRestaurant.getModel();
                Restaurant restaurant = ecosystem.getRestaurantDirectory().generateRestaurantList().get(selectedRow);
                //            Customer  customer  = (Customer) tblCustomer.getValueAt(selectedRow, 0);
                if(restaurant!=null){
                    txtName.setText(restaurant.getRestaurantName());
                    txtAddress.setText(restaurant.getRestaurantAddress());
                    txtPhone.setText(restaurant.getRestaurantContact());
                    txtUserName.setText(restaurant.getUsername());
                    txtPassword.setText(restaurant.getPassword());
                }
            }

            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_tblRestaurantMouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateRestaurant;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRestaurant;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void insertIntoTable() {
        RestaurantDirectory restaurantDirectory = ecosystem.getRestaurantDirectory();
        DefaultTableModel model = (DefaultTableModel) tblRestaurant.getModel();
        tblRestaurant.setEditingRow(-1);

        model.setRowCount(0);
        for (Restaurant restaurant : restaurantDirectory.generateRestaurantList()) {
                    Object[] row = new Object[5];
                    row[0] = restaurant.getRestaurantName();
                    row[1] = restaurant.getRestaurantAddress();
                    row[2] = restaurant.getRestaurantContact();
                    row[3] = restaurant.getUsername();
                    row[4] = restaurant.getPassword();

                    model.addRow(row);
                
            }
    
    }
}
