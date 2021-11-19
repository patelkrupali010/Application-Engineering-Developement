

package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.ManageRestaurantJPanel;

/**
 *
 * @author  raunak
 */


public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    
    /** Creates new form AdminWorkAreaJPanel
     * @param userProcessContainer
     * @param userAccount
     * @param ecosystem */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem=ecosystem;
        this.userAccount = userAccount;
        //valueLabel.setText();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnManageMenu = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        lblLogout = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        rightWorkPanel = new javax.swing.JPanel();

        systemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnManageMenu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnManageMenu.setForeground(new java.awt.Color(102, 102, 102));
        btnManageMenu.setText("Manage Menu");
        btnManageMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null, null));
        btnManageMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 230, 50));

        btnOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnOrder.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnOrder.setForeground(new java.awt.Color(102, 102, 102));
        btnOrder.setText("Manage Orders");
        btnOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null, null));
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 230, 50));

        lblLogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\krupa\\OneDrive\\Documents\\NetBeansProjects\\patel_krupali_001096158-main\\Assignment5\\db4odemo\\logout.png")); // NOI18N
        jPanel1.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 174, -1));

        btnInfo.setBackground(new java.awt.Color(255, 255, 255));
        btnInfo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(102, 102, 102));
        btnInfo.setText("Manage Info");
        btnInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null, null));
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        jPanel1.add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 230, 50));

        rightWorkPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rightWorkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
            .addComponent(rightWorkPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(systemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(systemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
                ManageInfo manageInfo = new ManageInfo(rightWorkPanel,userAccount,ecosystem);
                rightWorkPanel.add(manageInfo);
                CardLayout layout = (CardLayout) rightWorkPanel.getLayout();
                layout.next(rightWorkPanel);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
                ManageOrdersRestaurant manageOrders = new ManageOrdersRestaurant(rightWorkPanel,userAccount,ecosystem);
                rightWorkPanel.add(manageOrders);
                CardLayout layout = (CardLayout) rightWorkPanel.getLayout();
                layout.next(rightWorkPanel);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnManageMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMenuActionPerformed
        // TODO add your handling code here:

                ManageMenu manageMenu = new ManageMenu(rightWorkPanel,userAccount,ecosystem);
                rightWorkPanel.add(manageMenu);
                CardLayout layout = (CardLayout) rightWorkPanel.getLayout();
                layout.next(rightWorkPanel);
    }//GEN-LAST:event_btnManageMenuActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnManageMenu;
    private javax.swing.JButton btnOrder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JPanel rightWorkPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
    
}
