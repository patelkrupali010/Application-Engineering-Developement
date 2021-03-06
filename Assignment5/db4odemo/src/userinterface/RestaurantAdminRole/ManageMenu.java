/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Item;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krupa
 */
public class ManageMenu extends javax.swing.JPanel {

    /**
     * Creates new form manageMenu
     */

    EcoSystem ecosystem;
    UserAccount account;
    Restaurant restaurant;
    
    public ManageMenu(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.account = account;
        restaurant = (Restaurant) account;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE MENU");

        tblMenu.setBackground(new java.awt.Color(153, 0, 0));
        tblMenu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tblMenu.setForeground(new java.awt.Color(255, 255, 255));
        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMenu.setSelectionBackground(new java.awt.Color(204, 0, 51));
        tblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMenu);

        lblName.setBackground(new java.awt.Color(153, 0, 0));
        lblName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name");

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblPrice.setBackground(new java.awt.Color(153, 0, 0));
        lblPrice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setText("Price");

        txtPrice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPriceKeyPressed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/RestaurantAdminRole/addMenu.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnModify.setIcon(new javax.swing.ImageIcon("C:\\Users\\krupa\\Downloads\\Assignment5Skeleton\\db4odemo\\edit1.png")); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\krupa\\Downloads\\Assignment5Skeleton\\db4odemo\\del.png")); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                    .addComponent(txtPrice)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(323, 323, 323))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtName, txtPrice});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblName, lblPrice});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtPrice)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtName, txtPrice});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblName, lblPrice});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int flag = 1;

        if( (txtName.getText().isEmpty() || txtName.getText() == null)){
            JOptionPane.showMessageDialog(txtName, "Error: Name is null or empty");
            flag = 0;
            return;
        }
        
        if( (txtPrice.getText().isEmpty() || txtPrice.getText() == null)){
            JOptionPane.showMessageDialog(txtPrice, "Error: Price is null or empty");
            flag = 0;
            return;
        }

        if( txtName.getText().isEmpty()||txtPrice.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter all mandatory fields");
            return;
        }

        if(flag == 1){
        for (Item item : restaurant.getRestaurantMenu().getItemList()) {
            if (txtName.getText().equals(item.getName())) {
                JOptionPane.showMessageDialog(null, "Same Item already exists!");
                return;
            }
        }
        
        Item item = new Item(txtName.getText(), Double.valueOf(txtPrice.getText()));
        String resId = restaurant.getRestaurantId();
        for(Restaurant restaurant:ecosystem.getRestaurantDirectory().generateRestaurantList())
        {
            if(resId.equals(restaurant.getRestaurantId()))
            {
                restaurant.getRestaurantMenu().addItem(item);
            }
        }
        
        insertIntoTable();
        txtName.setText("");
        txtPrice.setText("");

        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        int flag = 1;
        if( (txtName.getText().isEmpty() || txtName.getText() == null)){
            JOptionPane.showMessageDialog(txtName, "Error: Name is null or empty");
            flag = 0;
            return;
        }

        if( (txtPrice.getText().isEmpty() || txtPrice.getText() == null)){
            JOptionPane.showMessageDialog(txtPrice, "Error: Password is null or empty");
            flag = 0;
            return;
        }

        if( txtName.getText().isEmpty() || txtPrice.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter all mandatory fields");
            return;
        }

        int selectedRow = tblMenu.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
        else {
            if(flag == 1){
            Item item = restaurant.getRestaurantMenu().getItemList().get(selectedRow);            
            item.setName(txtName.getText());
            item.setPrice(Double.valueOf(txtPrice.getText()));
            insertIntoTable();
            txtName.setText("");
            txtPrice.setText("");

            JOptionPane.showMessageDialog(this,"Menu items are updated.");
            }
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblMenu.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");
            } else {
            Item item = restaurant.getRestaurantMenu().getItemList().get(selectedRow);
            restaurant.getRestaurantMenu().getItemList().remove(item);
        
            JOptionPane.showMessageDialog(null, "Menu Item "  +item.getName()+ " deleted");
            
            insertIntoTable();
            
            txtName.setText("");
            txtPrice.setText("");

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            txtPrice.setEditable(true);
        }
        else{
            txtPrice.setEditable(false);
            JOptionPane.showMessageDialog(txtPrice, "Invalid entry. Please enter digits only.");
        }        
    }//GEN-LAST:event_txtPriceKeyPressed

    private void tblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMenuMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblMenu.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }
        else{
            try{
                DefaultTableModel model = (DefaultTableModel)tblMenu.getModel();
                Item item = restaurant.getRestaurantMenu().getItemList().get(selectedRow);
                if(item!=null){
                    txtName.setText(item.getName());
                    txtPrice.setText(Double.toString(item.getPrice()));
                }
            }

            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_tblMenuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    private void insertIntoTable() {
        Menu menu = restaurant.getRestaurantMenu();
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        tblMenu.setEditingRow(-1);

        model.setRowCount(0);
        for (Item item : menu.getItemList()) {
                    Object[] row = new Object[2];
                    row[0] = item.getName();
                    row[1] = item.getPrice();

                    model.addRow(row);
                
            }
    }
}
