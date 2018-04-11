package view.cliente;

import java.text.ParseException;
import model.Cliente;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class ClienteView extends javax.swing.JFrame {
    
    private ClienteController clienteController;
    
    public ClienteView() {
        initComponents();
    }
   
    public ClienteView(ClienteController clienteController) {
        initComponents();
        
        if(this.clienteController == null)
            this.clienteController = clienteController;
        
        /*MaskFormatter data;
        try {
            data = new MaskFormatter("##/##/####");
            jFTxtDataNasc = new javax.swing.JFormattedTextField(data);
        } catch (ParseException ex) {
            JOptionPane.showConfirmDialog(null, "Data inválida!");
        }*/
        
        carregarCB();
    }
    
    private void carregarCB(){
        jCbxPais.removeAllItems();
        for (String p : clienteController.paises())
            jCbxPais.addItem(p);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtTelefone = new javax.swing.JTextField();
        jCbxPais = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBtnSalvarCliente = new javax.swing.JButton();
        jBtnCadastrarPais = new javax.swing.JButton();
        jFTxtDataNasc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastrar Cliente");

        jLabel2.setText("Nome:");

        jLabel3.setText("Telefone:");

        jCbxPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbxPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCbxPaisMouseClicked(evt);
            }
        });

        jLabel4.setText("Pais:");

        jLabel5.setText("Data Nasc.:");

        jBtnSalvarCliente.setText("Salvar");
        jBtnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarClienteActionPerformed(evt);
            }
        });

        jBtnCadastrarPais.setText("+");
        jBtnCadastrarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarPaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtTelefone)
                            .addComponent(jTxtNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCbxPais, 0, 249, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnCadastrarPais))
                            .addComponent(jFTxtDataNasc)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnSalvarCliente)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jBtnCadastrarPais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFTxtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(jBtnSalvarCliente)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarClienteActionPerformed
        int dia, mes, ano;
        String data = jFTxtDataNasc.getText();
        dia = Integer.parseInt(data.substring(0, 2));
        mes = Integer.parseInt(data.substring(3, 5)) - 1;
        ano = Integer.parseInt(data.substring(6, 10));
        
        System.out.println(data.substring(0, 2));
        System.out.println(data.substring(3, 5));
        System.out.println(data.substring(6, 10));
        
        String nome = jTxtNome.getText();
        String telefone = jTxtTelefone.getText();
        String pais = jCbxPais.getSelectedItem().toString();
        GregorianCalendar dataNasc = new GregorianCalendar(ano, mes, dia);//jFTxtDataNasc.getText()
        
        
        try {
           ClienteModel clienteModel = new ClienteModel(nome, telefone, pais, dataNasc);
           clienteController.cadastrarCiente(clienteModel);
            
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, (ex.getMessage() != null)?ex.getMessage():ex);
        }
        
    }//GEN-LAST:event_jBtnSalvarClienteActionPerformed

    private void jBtnCadastrarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarPaisActionPerformed
        //PaisView p = new PaisView(paises);
        //p.setVisible(true);
    }//GEN-LAST:event_jBtnCadastrarPaisActionPerformed

    private void jCbxPaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCbxPaisMouseClicked
        carregarCB();
    }//GEN-LAST:event_jCbxPaisMouseClicked
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrarPais;
    private javax.swing.JButton jBtnSalvarCliente;
    private javax.swing.JComboBox<String> jCbxPais;
    private javax.swing.JTextField jFTxtDataNasc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtTelefone;
    // End of variables declaration//GEN-END:variables
}
