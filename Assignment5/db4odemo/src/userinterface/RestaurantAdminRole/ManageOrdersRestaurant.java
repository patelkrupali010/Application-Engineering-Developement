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
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkRequest;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krupa
 */
public class ManageOrdersRestaurant extends javax.swing.JPanel {

    /**
     * Creates new form manageMenu
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory userAccountList;
    private List<WorkRequest> workRequestList;
    UserAccount account;
    Restaurant restaurant;
    
    public ManageOrdersRestaurant(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderDetails = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cartScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetails1 = new javax.swing.JTable();
        addDeliveryPerson = new javax.swing.JButton();
        assignDeliveryPersonLabel = new javax.swing.JLabel();
        assignDeliveryPerson = new javax.swing.JComboBox<>();
        deliveryManNameValue = new javax.swing.JLabel();
        deliveryManLabel = new javax.swing.JLabel();
        requestDate = new javax.swing.JLabel();
        restaurantName = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        acceptOrder = new javax.swing.JButton();
        declineOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setForeground(java.awt.Color.white);

        tblOrderDetails.setBackground(new java.awt.Color(153, 0, 0));
        tblOrderDetails.setForeground(new java.awt.Color(255, 255, 255));
        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Status", "Request Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrderDetails);

        jLabel2.setBackground(new java.awt.Color(153, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MANAGE ORDER");

        cartScrollPane1.setForeground(java.awt.Color.white);

        tblOrderDetails1.setBackground(new java.awt.Color(153, 0, 0));
        tblOrderDetails1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Qty", "Item Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartScrollPane1.setViewportView(tblOrderDetails1);

        addDeliveryPerson.setText("Add");
        addDeliveryPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDeliveryPersonActionPerformed(evt);
            }
        });

        assignDeliveryPersonLabel.setForeground(java.awt.Color.white);
        assignDeliveryPersonLabel.setText("Assign Delivery Person");

        assignDeliveryPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignDeliveryPersonActionPerformed(evt);
            }
        });

        deliveryManNameValue.setForeground(java.awt.Color.white);
        deliveryManNameValue.setText("adarsh");

        deliveryManLabel.setForeground(java.awt.Color.white);
        deliveryManLabel.setText("Delivery Man Name");

        requestDate.setForeground(java.awt.Color.white);
        requestDate.setText("<value>");

        restaurantName.setForeground(java.awt.Color.white);
        restaurantName.setText("arun");

        status.setForeground(java.awt.Color.white);
        status.setText("<value>");

        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Request Date");

        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Status");

        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Restaurant Name");

        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Total");

        totalPrice.setForeground(java.awt.Color.white);
        totalPrice.setText("<value>");

        acceptOrder.setText("Accept Order");
        acceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptOrderActionPerformed(evt);
            }
        });

        declineOrder.setText("Decline Order");
        declineOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                declineOrderMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1027, Short.MAX_VALUE)
                .addGap(144, 144, 144))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(cartScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(assignDeliveryPersonLabel)
                                    .addComponent(deliveryManLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(assignDeliveryPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(addDeliveryPerson))
                                    .addComponent(deliveryManNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(acceptOrder)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(declineOrder))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(80, 80, 80)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(restaurantName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(requestDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(cartScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignDeliveryPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignDeliveryPersonLabel)
                    .addComponent(addDeliveryPerson))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryManLabel)
                    .addComponent(deliveryManNameValue))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(restaurantName)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(requestDate)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(status))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(totalPrice))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptOrder)
                    .addComponent(declineOrder))
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addDeliveryPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDeliveryPersonActionPerformed
        // TODO add your handling code here:
        if(index >= 0){
            DeliveryMan deliveryMan = deliveryManDirectory.getDeliveryManList().get(index);
            workRequest.setDeliverMan(deliveryMan);
            JOptionPane.showMessageDialog(null, "Delivery person assigned successfully!!!");
            populateDeliveryManUI();
        }
    }//GEN-LAST:event_addDeliveryPersonActionPerformed

    private void assignDeliveryPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignDeliveryPersonActionPerformed
        // TODO add your handling code here:
        index = assignDeliveryPerson.getSelectedIndex();
        //clear of the selected items

    }//GEN-LAST:event_assignDeliveryPersonActionPerformed

    private void acceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptOrderActionPerformed
        // TODO add your handling code here:
        if (workRequest.getStatus().equals("Ordered")) {
            workRequest.setStatus("Preparing");
            JOptionPane.showMessageDialog(null, " Order Accepted Successfully!!, Please assign delivery person");
        }else if(workRequest.getStatus().equals("Preparing")){
            workRequest.setStatus("Prepared");
            if(workRequest.getDeliverMan() == null){
                JOptionPane.showMessageDialog(null, " Order Prepared Successfully!!, Please assign delivery person");
            }else{
                JOptionPane.showMessageDialog(null, "Hurray, Delivery person will pick up the order in few minutes !!!");
            }
        }else if (workRequest.getStatus().equalsIgnoreCase("delivered")){
            setVisibleEditable();
        }else{
            acceptOrder.setVisible(false);
        }
        changeButtonText();
        status.setText(workRequest.getStatus());

    }//GEN-LAST:event_acceptOrderActionPerformed

    private void declineOrderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declineOrderMousePressed
        declineOrder();
    }//GEN-LAST:event_declineOrderMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptOrder;
    private javax.swing.JButton addDeliveryPerson;
    private javax.swing.JComboBox<String> assignDeliveryPerson;
    private javax.swing.JLabel assignDeliveryPersonLabel;
    private javax.swing.JScrollPane cartScrollPane1;
    private javax.swing.JButton declineOrder;
    private javax.swing.JLabel deliveryManLabel;
    private javax.swing.JLabel deliveryManNameValue;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel requestDate;
    private javax.swing.JLabel restaurantName;
    private javax.swing.JLabel status;
    private javax.swing.JTable tblOrderDetails;
    private javax.swing.JTable tblOrderDetails1;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables

    private void insertIntoTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrderDetails.getModel();
        model.setRowCount(0);
        workRequestList = ecosystem.getWorkQueue().getWorkRequestListRestaurant(account);
        for (WorkRequest request : workRequestList) {
            Object[] row = new Object[tblOrderDetails.getColumnCount()];
            row[0] = request.getCustomer();
            row[1] = request.getStatus();
            row[2] = request.getRequestDate();
            model.addRow(row);
        }
    }
}
