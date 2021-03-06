/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.toedter.calendar.JTextFieldDateEditor;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Person;

/**
 *
 * @author krupa
 */
public class createPanel extends javax.swing.JPanel {

    /**
     * Creates new form createPanel
     */
    Person personObj;
    public createPanel(Person personObj) {
        initComponents();
        this.personObj = personObj;
        validateDate();
    }
    
    //set flag variable
    boolean flag = true;

   // jDate validation to not allow editing in JTextField    
    private void validateDate(){
        JTextFieldDateEditor editor = (JTextFieldDateEditor)jDate.getDateEditor();
        editor.setEditable(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblVehicleId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblHealthPlanBnfNum = new javax.swing.JLabel();
        lblLicenseNum = new javax.swing.JLabel();
        lblIP = new javax.swing.JLabel();
        lblMedicalRecordNum = new javax.swing.JLabel();
        lblFax = new javax.swing.JLabel();
        lblTelephoneNum = new javax.swing.JLabel();
        lblDeviceId = new javax.swing.JLabel();
        lblLinkedIn = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblFullFaceImage = new javax.swing.JLabel();
        lblBiometricId = new javax.swing.JLabel();
        lblBankAccNum = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        txtIp = new javax.swing.JTextField();
        txtHealthPlanBnfId = new javax.swing.JTextField();
        txtLicenseNum = new javax.swing.JTextField();
        jDate = new com.toedter.calendar.JDateChooser();
        txtLinkedin = new javax.swing.JTextField();
        txtVehicleId = new javax.swing.JTextField();
        txtDeviceId = new javax.swing.JTextField();
        txtFAXNum = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        txtBankAccNum = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtTeleNum = new javax.swing.JTextField();
        txtMedicalRecordNum = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUploadBiometric = new javax.swing.JButton();
        btnUploadPhoto = new javax.swing.JButton();
        lblCreatePersonProfile = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblVehicleId.setText("Vehicle identifiers and serial numbers including license plates ");

        lblName.setText("Name");

        lblHealthPlanBnfNum.setText("Health plan beneficiary number");

        lblLicenseNum.setText("Certificate/license number ");

        lblIP.setText("Internet protocol addresses");

        lblMedicalRecordNum.setText("Medical Record Number");

        lblFax.setText("FAX number");

        lblTelephoneNum.setText("Telephone numbers");

        lblDeviceId.setText("Device identifiers and serial numbers");

        lblLinkedIn.setText("LinkedIn");

        lblAddress.setText("Address");

        lblEmail.setText("Email addresses");

        lblSSN.setText("Social Security Number");

        lblFullFaceImage.setText("Full face photos and comparable images");

        lblBiometricId.setText("Biometric identifiers");

        lblBankAccNum.setText("Bank account numbers");

        lblDob.setText("Date of Birth");

        txtIp.setToolTipText("Enter IP address (X[XX].X[XX].X[XX].X[XX])");

        txtHealthPlanBnfId.setToolTipText("Enter Health Plan Beneficiary number (alphanumeric)");
        txtHealthPlanBnfId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHealthPlanBnfIdKeyPressed(evt);
            }
        });

        txtLicenseNum.setToolTipText("Enter alphanumeric License number");
        txtLicenseNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLicenseNumKeyPressed(evt);
            }
        });

        jDate.setToolTipText("Select DOB (DOB has to be before current date)");
        jDate.setDateFormatString("MM-dd-yyyy");

        txtVehicleId.setToolTipText("Enter alphanumeric vehicle ID");
        txtVehicleId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVehicleIdKeyPressed(evt);
            }
        });

        txtDeviceId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDeviceIdKeyPressed(evt);
            }
        });

        txtFAXNum.setToolTipText("Enter atleast 6 digit FAX number starting with +");

        txtEmailId.setToolTipText("Enter email (make sure to add @ and .com)");

        txtBankAccNum.setToolTipText("Enter bank account number (Atmost 9 digits only)");

        txtAddress.setToolTipText("Enter Address (alphanumeric)");

        txtSSN.setToolTipText("Enter 9 digit SSN in XXX-XX-XXXX format");

        txtTeleNum.setToolTipText("Enter telephone number in XXX-XXX-XXXX format");

        txtMedicalRecordNum.setToolTipText("Enter MRN in alphanumeric format");
        txtMedicalRecordNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMedicalRecordNumKeyPressed(evt);
            }
        });

        txtName.setToolTipText("Enter full name");
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUploadBiometric.setText("Upload Photo");
        btnUploadBiometric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadBiometricActionPerformed(evt);
            }
        });

        btnUploadPhoto.setText("Upload Biometric");
        btnUploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadPhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(lblTelephoneNum, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(lblFax, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(lblSSN, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(lblMedicalRecordNum, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(lblHealthPlanBnfNum, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBankAccNum, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDob, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(lblLicenseNum, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(lblVehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDeviceId, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLinkedIn, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(lblIP, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(lblBiometricId, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(358, 358, 358)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtIp, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtLinkedin, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDeviceId, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtVehicleId, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtLicenseNum, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtHealthPlanBnfId, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMedicalRecordNum, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSSN)
                                        .addComponent(txtEmailId)
                                        .addComponent(txtFAXNum)
                                        .addComponent(txtTeleNum)
                                        .addComponent(jDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAddress))
                                    .addComponent(txtBankAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(btnUploadPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(lblFullFaceImage)
                                .addGap(35, 35, 35)
                                .addComponent(btnUploadBiometric, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 1151, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAddress, lblBankAccNum, lblBiometricId, lblDeviceId, lblDob, lblEmail, lblFax, lblFullFaceImage, lblHealthPlanBnfNum, lblIP, lblLicenseNum, lblLinkedIn, lblMedicalRecordNum, lblSSN, lblTelephoneNum, lblVehicleId});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnUploadBiometric, btnUploadPhoto});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAddress, txtBankAccNum, txtDeviceId, txtEmailId, txtFAXNum, txtHealthPlanBnfId, txtIp, txtLicenseNum, txtLinkedin, txtMedicalRecordNum, txtName, txtSSN, txtTeleNum, txtVehicleId});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDob, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelephoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTeleNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFax, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFAXNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSSN)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedicalRecordNum)
                    .addComponent(txtMedicalRecordNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHealthPlanBnfNum)
                    .addComponent(txtHealthPlanBnfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBankAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicenseNum)
                    .addComponent(txtLicenseNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeviceId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDeviceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIP, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBiometricId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUploadPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUploadBiometric, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFullFaceImage, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(163, 163, 163)))
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAddress, lblBankAccNum, lblBiometricId, lblDeviceId, lblDob, lblEmail, lblFax, lblFullFaceImage, lblHealthPlanBnfNum, lblIP, lblLicenseNum, lblLinkedIn, lblMedicalRecordNum, lblName, lblSSN, lblTelephoneNum, lblVehicleId});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDate, txtAddress, txtBankAccNum, txtDeviceId, txtEmailId, txtFAXNum, txtHealthPlanBnfId, txtIp, txtLicenseNum, txtLinkedin, txtMedicalRecordNum, txtName, txtSSN, txtTeleNum, txtVehicleId});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnUploadBiometric, btnUploadPhoto});

        jScrollPane1.setViewportView(jPanel1);

        lblCreatePersonProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCreatePersonProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreatePersonProfile.setText("Create Person Profile");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(lblCreatePersonProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1605, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCreatePersonProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1407, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try{
        personObj.setName(txtName.getText());  
        
        //address validation for handling null & empty
        personObj.setGeographicData(txtAddress.getText());
        if(txtAddress.getText().isEmpty() || txtAddress.getText() == null)
        {
            JOptionPane.showMessageDialog(txtName, "Invalid address.");
            flag = false;
        }
        
        //DOB validation for handling less than current date condition
        personObj.setDateOfBirth(jDate.getDate());

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy	");
        String currentDate = sdf.format(new Date());
        String selectedDate = sdf.format(jDate.getDate());
        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

        if(!(dateFormat.parse(selectedDate).before(dateFormat.parse(currentDate)))){
            JOptionPane.showMessageDialog(this, "Error: DOB has to be before current date.");
            flag=false;
        }

        
        // phone number validation for handling XXX-XXX-XXXX format
        personObj.setPhone(txtTeleNum.getText());
        if(!txtTeleNum.getText().matches("^\\d{3}-\\d{3}-\\d{4}$")){
            JOptionPane.showMessageDialog(this,"Phone Number must be in the form XXX-XXX-XXXX");
            flag = false;
        }
        
        // FAX number validation for handling +XXXXXX format
        personObj.setFaxNumber(txtFAXNum.getText());
        if(!txtFAXNum.getText().matches("^\\+?[0-9]{6,}$")){
            JOptionPane.showMessageDialog(this, "Error: Invalid FAX Number. Please enter FAX number starting with a + and has atleast 6 digits between 0-9.");
            flag = false;
        }    
        
        
        // email ID validation - 
        personObj.setEmail(txtEmailId.getText());
        if(!txtEmailId.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$")){
            JOptionPane.showMessageDialog(this, "Error: Invalid Email address.");
            flag = false;
        }
        
        /*SSN Validation:
        The first three digits called the area number. The area number cannot be 000, 666, or between 900 and 999.
        Digits four and five are called the group number and range from 01 to 99.
        The last four digits are serial numbers from 0001 to 9999. */
        
        personObj.setSsn(txtSSN.getText());
        if(!txtSSN.getText().matches(("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$"))){
            JOptionPane.showMessageDialog(this, "Error: Invalid SSN Number.");
            flag = false;
        }
        
        
        
        personObj.setMedicalRecordNumber(txtMedicalRecordNum.getText());
        personObj.setHealthPlanBeneficiaryNumber(txtHealthPlanBnfId.getText());
        
        // validate if bank account has atmost 9 digits, not emplty and not null
        personObj.setBankAccountNumbers(txtBankAccNum.getText());
        if(txtBankAccNum.getText().isEmpty() || txtBankAccNum.getText() == null || !txtBankAccNum.getText().matches("^[0-9]{1,9}+$") )  {
            txtBankAccNum.setEditable(false);
            JOptionPane.showMessageDialog(txtBankAccNum, "Invalid Bank Account Number.");
            flag = false;
        }

        
        
        
        personObj.setLicenseNumber(txtLicenseNum.getText());
        personObj.setVehicleIdentifiers(Integer.parseInt(txtVehicleId.getText()));
        personObj.setDeviceIdentifiers(Integer.parseInt(txtDeviceId.getText()));
        
        personObj.setLinkedInId(txtLinkedin.getText());
        if(!txtLinkedin.getText().matches(("^https:\\/\\/[a-z]{2,3}\\.linkedin\\.com\\/.*$"))){
            JOptionPane.showMessageDialog(this, "Error: Invalid Linkedin ID.");
            flag = false;
        }        
        
        
        personObj.setIpAddresses(txtIp.getText());
        String regex = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";
        if(txtIp.getText().matches((regex)) == false){
            JOptionPane.showMessageDialog(this, "Error: Invalid IP address.");
            flag = false;
        }
        
      
        if(flag == true){
        JOptionPane.showMessageDialog(this, "Yayy! Person details are added.");
        }
        
        }
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: Please fill all the fields.");
            flag = false; 
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            txtName.setEditable(true);  
        }
        else{
            txtName.setEditable(false);
            JOptionPane.showMessageDialog(txtName, "Invalid entry. Please enter letters only.");
            flag = false;
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtMedicalRecordNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedicalRecordNumKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) ||Character.isDigit(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            txtMedicalRecordNum.setEditable(true);  
        }
        else{
            txtMedicalRecordNum.setEditable(false);
            JOptionPane.showMessageDialog(txtMedicalRecordNum, "Invalid Medical Record Number.");
            flag = false;
        }        
    }//GEN-LAST:event_txtMedicalRecordNumKeyPressed

    private void txtHealthPlanBnfIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHealthPlanBnfIdKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) ||Character.isDigit(c) || Character.isWhitespace(c) || Character.isISOControl(c))    {
            txtHealthPlanBnfId.setEditable(true);  
        }
        else{
            txtHealthPlanBnfId.setEditable(false);
            JOptionPane.showMessageDialog(txtHealthPlanBnfId, "Invalid Health Plan Beneficiary Number.");
            flag = false;
        }
    }//GEN-LAST:event_txtHealthPlanBnfIdKeyPressed

    private void txtLicenseNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLicenseNumKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) ||Character.isDigit(c) || Character.isWhitespace(c) || Character.isISOControl(c))    {
            txtLicenseNum.setEditable(true);  
        }
        else{
            txtLicenseNum.setEditable(false);
            JOptionPane.showMessageDialog(txtLicenseNum, "Invalid License Number.");
            flag = false;
        }
    }//GEN-LAST:event_txtLicenseNumKeyPressed

    private void txtVehicleIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleIdKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || Character.isWhitespace(c) || Character.isISOControl(c))    {
            txtVehicleId.setEditable(true);  
        }
        else{
            txtVehicleId.setEditable(false);
            JOptionPane.showMessageDialog(txtVehicleId, "Invalid Vehicle ID.");
            flag = false;
        }
    }//GEN-LAST:event_txtVehicleIdKeyPressed

    private void txtDeviceIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeviceIdKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || Character.isWhitespace(c))    {
            txtDeviceId.setEditable(true);  
        }
        else{
            txtDeviceId.setEditable(false);
            JOptionPane.showMessageDialog(txtDeviceId, "Invalid Device ID.");
            flag = false;
        }        
    }//GEN-LAST:event_txtDeviceIdKeyPressed

    private void btnUploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadPhotoActionPerformed
        // TODO add your handling code here:
            JFileChooser file = new JFileChooser();
            file.setCurrentDirectory(new File(System.getProperty("user.home")));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
            file.addChoosableFileFilter(filter);
            int result = file.showSaveDialog(null);
            if(result == JFileChooser.APPROVE_OPTION){
                File selectedFile = file.getSelectedFile();
                String path = selectedFile.getAbsolutePath();
                personObj.setBioMetricUrl(path);
                setVisible(true);

            }
        
    }//GEN-LAST:event_btnUploadPhotoActionPerformed

    private void btnUploadBiometricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadBiometricActionPerformed
        // TODO add your handling code here:
            JFileChooser file = new JFileChooser();
            file.setCurrentDirectory(new File(System.getProperty("user.home")));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
            file.addChoosableFileFilter(filter);
            int result = file.showSaveDialog(null);
            if(result == JFileChooser.APPROVE_OPTION){
                File selectedFile = file.getSelectedFile();
                String path = selectedFile.getAbsolutePath();
                personObj.setFullFaceUrl(path);
               // setSize(700,400);
                setVisible(true);
            }
    }//GEN-LAST:event_btnUploadBiometricActionPerformed
  
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUploadBiometric;
    private javax.swing.JButton btnUploadPhoto;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBankAccNum;
    private javax.swing.JLabel lblBiometricId;
    private javax.swing.JLabel lblCreatePersonProfile;
    private javax.swing.JLabel lblDeviceId;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblFullFaceImage;
    private javax.swing.JLabel lblHealthPlanBnfNum;
    private javax.swing.JLabel lblIP;
    private javax.swing.JLabel lblLicenseNum;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblMedicalRecordNum;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTelephoneNum;
    private javax.swing.JLabel lblVehicleId;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBankAccNum;
    private javax.swing.JTextField txtDeviceId;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtFAXNum;
    private javax.swing.JTextField txtHealthPlanBnfId;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtLicenseNum;
    private javax.swing.JTextField txtLinkedin;
    private javax.swing.JTextField txtMedicalRecordNum;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtTeleNum;
    private javax.swing.JTextField txtVehicleId;
    // End of variables declaration//GEN-END:variables
}
