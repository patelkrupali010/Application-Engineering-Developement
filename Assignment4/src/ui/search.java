/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.AbnormalPatients;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.VisitHistory;
import model.Visits;

/**
 *
 * @author krupa
 */
public class search extends javax.swing.JPanel {
    PersonDirectory persondirectory;
    PatientDirectory patientdirectory;
    VisitHistory visitHistory;
    /**
     * Creates new form search
     */
    ArrayList<Patient> searchList = new ArrayList<Patient>(); 

    public search(PersonDirectory persondirectory, Patient patient, PatientDirectory patientdirectory) {
        initComponents();
        this.persondirectory=persondirectory;
        this.patientdirectory=patientdirectory;
        this.visitHistory = visitHistory;
//        txtPatName.setEditable(false);

//        insertIntoAptTable(patientdirectory);    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearch = new javax.swing.JTable();
        jComboCity = new javax.swing.JComboBox<>();
        jComboCommunity = new javax.swing.JComboBox<>();
        jComboAgeGrp = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        btnSearch.setBackground(new java.awt.Color(102, 102, 102));
        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Id", "Patient First Name", "Patient Last Name", "City", "Community", "Appointment Date", "Blood Pressure"
            }
        ));
        jScrollPane1.setViewportView(tblSearch);

        jComboCity.setBackground(new java.awt.Color(255, 204, 204));
        jComboCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "NY", "Chicago" }));
        jComboCity.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jComboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCityActionPerformed(evt);
            }
        });

        jComboCommunity.setBackground(new java.awt.Color(255, 204, 204));
        jComboCommunity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bridges Community", "Friends Community", "Christian Community", "Jewish Community" }));
        jComboCommunity.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboAgeGrp.setBackground(new java.awt.Color(255, 204, 204));
        jComboAgeGrp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboAgeGrp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Under 15", "Working age (15-64)", "Senior Citizen (65 and above)" }));
        jComboAgeGrp.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Community");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 204), new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("City");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 204), new java.awt.Color(153, 153, 153)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Age Group");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 204), new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboAgeGrp, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboCity, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 271, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(502, 502, 502)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboAgeGrp, jComboCity, jComboCommunity});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboCity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboAgeGrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboAgeGrp, jComboCity, jComboCommunity});

    }// </editor-fold>//GEN-END:initComponents
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        Visits visit = new Visits();
        ArrayList<AbnormalPatients> abnormalPatient=new  ArrayList<>();
        for(Patient patient: patientdirectory.getPatientList()){
            for(Person person: persondirectory.getPersonList()){
                if(patient.getPatientId().equals(person.getPatient().getPatientId()))
                {
                                    if(person.getHouse().getCommunity().getCity().getCityName().equalsIgnoreCase(jComboCity.getSelectedItem().toString()) && person.getHouse().getCommunity().getCommunityName().equalsIgnoreCase(jComboCommunity.getSelectedItem().toString())){
                        int index=jComboAgeGrp.getSelectedIndex(); 
                        ArrayList<Visits> visithistory  = patient.getVisitHistory().getVisitHistory();
                        Visits lastVisit= visithistory.get(visithistory.size()-1); 
                        AbnormalPatients abnormalPatients = new AbnormalPatients();
                        
                        switch(index){ 
                            case 0:
                                if(person.getAge()<15 && lastVisit.getVitalSigns().getBloodPressure()>75){ 
                                    abnormalPatients.setPatientId(String.valueOf(patient.getPatientId()));
                                    abnormalPatients.setFirstName(person.firstName);
                                    abnormalPatients.setLastName(person.getLastName());
                                    abnormalPatients.setCity(person.getHouse().getCommunity().getCity().getCityName());
                                    abnormalPatients.setCommunity(person.getHouse().getCommunity().getCommunityName());
                                    abnormalPatients.setAptDate(lastVisit.getVisitOn());
                                    abnormalPatients.setBloodPressure(lastVisit.getVitalSigns().getBloodPressure());
                                    
                                    
                                    abnormalPatient.add(abnormalPatients);
//                                    insertToTable(patient);
                                }
                               break;

                           case 1:
                               if( (person.getAge()>=15 && person.getAge()<=64) && lastVisit.getVitalSigns().getBloodPressure()>85 ){
                                      abnormalPatients.setPatientId(String.valueOf(patient.getPatientId()));
                                    abnormalPatients.setFirstName(person.firstName);
                                    abnormalPatients.setLastName(person.getLastName());
                                    abnormalPatients.setCity(person.getHouse().getCommunity().getCity().getCityName());
                                    abnormalPatients.setCommunity(person.getHouse().getCommunity().getCommunityName());
                                    abnormalPatients.setAptDate(lastVisit.getVisitOn());
                                    abnormalPatients.setBloodPressure(lastVisit.getVitalSigns().getBloodPressure());
                                    
                                    
                                    abnormalPatient.add(abnormalPatients);
                               }
                               break;

                           case 2:
                                if( (person.getAge()>=65 ) && lastVisit.getVitalSigns().getBloodPressure()>85 ){
                                     abnormalPatients.setPatientId(String.valueOf(patient.getPatientId()));
                                    abnormalPatients.setFirstName(person.firstName);
                                    abnormalPatients.setLastName(person.getLastName());
                                    abnormalPatients.setCity(person.getHouse().getCommunity().getCity().getCityName());
                                    abnormalPatients.setCommunity(person.getHouse().getCommunity().getCommunityName());
                                    abnormalPatients.setAptDate(lastVisit.getVisitOn());
                                    abnormalPatients.setBloodPressure(lastVisit.getVitalSigns().getBloodPressure());
                                    
                                    
                                    abnormalPatient.add(abnormalPatients);
                                   break;
                               }

                           default:
                               break;
                        }
                      
                }
                }

            }
        }
        insertToTable(abnormalPatient);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jComboCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCityActionPerformed
//        // TODO add your handling code here:
//        DefaultTableModel model = (DefaultTableModel)tblSearch.getModel();
//        model.setRowCount(0);
//        searchList.removeAll(searchList);
//        for( Patient patient: patientdirectory.getPatientList()){
//            for(Person person: persondirectory.getPersonList()){
//                if(person.getHouse().getCommunity().getCity().getCityName().equalsIgnoreCase(jComboCity.getSelectedItem().toString())){
//                searchList.add(patient);
//                insertToTable(searchList);   
//            }
//        }
//        }
    }//GEN-LAST:event_jComboCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> jComboAgeGrp;
    private javax.swing.JComboBox<String> jComboCity;
    private javax.swing.JComboBox<String> jComboCommunity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSearch;
    // End of variables declaration//GEN-END:variables

    private void insertToTable(ArrayList<AbnormalPatients> patient) {
        try{
            DefaultTableModel model = (DefaultTableModel)tblSearch.getModel();
            model.setRowCount(0);
            tblSearch.setRowHeight(40);      
            tblSearch.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tblSearch.getTableHeader().setPreferredSize(new Dimension(250, 40));
            tblSearch.getTableHeader().setBackground(Color.RED);
            tblSearch.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 20));
            tblSearch.setFont(new Font("Times New Roman", Font.PLAIN,18 ));
            Object[] row= new Object[7];
            for(AbnormalPatients abnormalPatients:patient)
            {
                row[0] = abnormalPatients.getPatientId();
                row[1]=abnormalPatients.getFirstName();
                row[2]=abnormalPatients.getLastName();
                row[3]=abnormalPatients.getCity();
                row[4]=abnormalPatients.getCommunity(); 
                row[5]=abnormalPatients.getAptDate();
                row[6]=abnormalPatients.getBloodPressure();
            model.addRow(row);

            }
        
        }
        catch(Exception ex)
        {
            
        JOptionPane.showMessageDialog(this, ex);
        }
    }
}