/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Item;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AddToCart;
import Business.WorkQueue.OrderWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krupali
 */
public class CreateOrder extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Customer customer;
    private DefaultTableModel menuTable;
    private DefaultTableModel cartTable;
    private EcoSystem ecosystem;
    private RestaurantDirectory resturantDirectory;
    private List<AddToCart> cartItemsList = new ArrayList<AddToCart>();
    private int index = -1;
    private int qty = 0;


    /**
     * Creates new form CreateOrder
     */
    public CreateOrder(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        customer = (Customer) account;
        resturantDirectory = ecosystem.getRestaurantDirectory();
        menuTable = (DefaultTableModel) tblOrder.getModel();
        try{
        if (resturantDirectory.generateRestaurantList().size() > 0) {
            index = 0;
            for (Restaurant restaurant : resturantDirectory.generateRestaurantList()) {
                jComboRestList.addItem(restaurant.getRestaurantName());
            } 
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);        
        }
       

        totalPrice.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();
        lblMenuList = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        jComboRestList = new javax.swing.JComboBox();
        lblSelectRest = new javax.swing.JLabel();
        cartScrollPane = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        lblCart = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        totalPrice = new javax.swing.JTextField();
        lblCreateOrder = new javax.swing.JLabel();
        lblQty = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        btnOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));

        btnUpdate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/CustomerRole/edit1.png"))); // NOI18N
        btnUpdate.setText("Update Quantity");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        lblMenuList.setBackground(new java.awt.Color(153, 0, 0));
        lblMenuList.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblMenuList.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuList.setText("Choose from Menu");

        tblOrder.setBackground(new java.awt.Color(153, 0, 0));
        tblOrder.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblOrder.setForeground(new java.awt.Color(255, 255, 255));
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item Name", "Item Price"
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
        tblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        jComboRestList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboRestListItemStateChanged(evt);
            }
        });
        jComboRestList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboRestListActionPerformed(evt);
            }
        });

        lblSelectRest.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSelectRest.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectRest.setText("Select Restaurant");

        tblCart.setBackground(new java.awt.Color(153, 0, 0));
        tblCart.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblCart.setForeground(new java.awt.Color(255, 255, 255));
        tblCart.setModel(new javax.swing.table.DefaultTableModel(
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
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartScrollPane.setViewportView(tblCart);

        lblCart.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCart.setForeground(new java.awt.Color(255, 255, 255));
        lblCart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCart.setText("CART");

        lblTotal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("Total");

        lblCreateOrder.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblCreateOrder.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateOrder.setText("CREATE ORDER");

        lblQty.setBackground(new java.awt.Color(153, 0, 0));
        lblQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblQty.setForeground(new java.awt.Color(255, 255, 255));
        lblQty.setText("Quantity");

        txtQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnOrder.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnOrder.setText("Request Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
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
                        .addComponent(lblCreateOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 88, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSelectRest, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jComboRestList, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(320, 320, 320))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblMenuList, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnOrder)
                                .addGap(381, 381, 381))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCart, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(btnUpdate))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cartScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(137, 137, 137))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectRest, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboRestList, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(lblMenuList)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addComponent(lblCart)
                .addGap(14, 14, 14)
                .addComponent(cartScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(btnOrder)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tctQtyActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_tctQtyActionPerformed

    private void jComboRestListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboRestListItemStateChanged
        // TODO add your handling code here:
        index = jComboRestList.getSelectedIndex();
        String resName = (String) jComboRestList.getSelectedItem();
        for(Restaurant restaurant: resturantDirectory.generateRestaurantList()){
            if(restaurant.getRestaurantName().equals(resName)){
                insertToMenu(restaurant.getRestaurantMenu().getItemList());
            }
        }
        
        cartItemsList.removeAll(cartItemsList);
    }//GEN-LAST:event_jComboRestListItemStateChanged

    private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked
        // TODO add your handling code here:
            int selectedRow = tblOrder.getSelectedRow();

            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to update.");
            }
    }//GEN-LAST:event_tblOrderMouseClicked

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        if (cartItemsList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cart is empty. Please add items to your cart first!");
        } else {
            OrderWorkRequest orderWorkRequest = new OrderWorkRequest();
            orderWorkRequest.setItemsWithQuatityList(cartItemsList);
            if (customer != null) {
                orderWorkRequest.setCustomer(customer);
            } else {
                System.out.println("Customer empty!");
            }
            index=jComboRestList.getSelectedIndex();
            Restaurant restaurant = resturantDirectory.generateRestaurantList().get(index);
            if (restaurant != null) {
                orderWorkRequest.setRestaurant(restaurant);
            } else {
                System.out.println("Restaurant empty!");
            }
            orderWorkRequest.setRequestDate(new Date());
            orderWorkRequest.setStatus("Order Placed!");
            ecosystem.getWorkQueue().addWorkRequest(orderWorkRequest);

        }
            JOptionPane.showMessageDialog(null, "Ordered Placed Successfully");
            ManageOrder manageOrder = new ManageOrder(userProcessContainer, ecosystem, customer);
            userProcessContainer.add(manageOrder);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblOrder.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }
        try{
        if (selectedRow >= 0) {
            Item item = (Item) tblOrder.getValueAt(selectedRow, 0);


            if (item != null) {
                try {
                    qty = Integer.parseInt(txtQty.getText());
                } 
                catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e);
                }
                
                if (qty != 0) {
                    AddToCart cartItems = new AddToCart(item, qty);
                    cartItemsList.add(cartItems);
                    insertIntoCart();
                }

            }
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);            
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void jComboRestListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboRestListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboRestListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane cartScrollPane;
    private javax.swing.JComboBox<String> jComboRestList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCart;
    private javax.swing.JLabel lblCreateOrder;
    private javax.swing.JLabel lblMenuList;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblSelectRest;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextField totalPrice;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables


    private void insertToMenu(ArrayList<Item> menuItems) {
        //createAddToCartButton();
        menuTable.setRowCount(0);
        double total = 0.0;
            for (Item item : menuItems) {
                Object[] row = new Object[menuTable.getColumnCount()];
                row[0] = item;
                row[1] = item.getPrice();
                menuTable.addRow(row);    
            }

    }

    private void insertIntoCart() {
        double total = 0.0;
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();

        model.setRowCount(0);
        for (AddToCart cartItems : cartItemsList) {
            Object[] row = new Object[tblCart.getColumnCount()];
            row[0] = cartItems.getItem().getName();
            row[1] = cartItems.getQuantity();
            row[2] = cartItems.getItem().getPrice()* cartItems.getQuantity();
            total += cartItems.getItem().getPrice() * cartItems.getQuantity();
            model.addRow(row);
        }
        totalPrice.setText(total + "");
    }
}
