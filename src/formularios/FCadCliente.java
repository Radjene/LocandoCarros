package formularios;

import classes.Cliente;
import classes.PessoaFisica;
import classes.PessoaJuridica;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class FCadCliente extends javax.swing.JDialog {
    private Cliente clienteTemp = null;
    private boolean alterar = false;

    public FCadCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public Cliente execute(){
        this.setVisible(true);
                
        return this.clienteTemp;
    }
    
    public Cliente execute(Cliente p){
        this.clienteTemp = p;
        this.alterar = true;
        
        rdbPF.setEnabled(false);
        rdbPJ.setEnabled(false);
        
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        txtNome.setText(p.getNome());
        txtEndereco.setText(p.getEndereco());
        txtCPFCNPJ.setText(p.getCpfOuCnpj());
        txtCNH.setText(p.getCnhOuCnhr());
        txtDtNasc.setText(f.format(p.getDtNascimento()));
        txtDesconto.setText(Double.toString(p.getDesconto()));
        
        if(p instanceof PessoaFisica){
            PessoaFisica x = (PessoaFisica)p;
            txtCPFCNPJ.setText(x.getCpf());
        }else{
            txtCPFCNPJ.setText(((PessoaJuridica)p).getCnpj());
        }
        
        this.setVisible(true);
        return this.clienteTemp;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        cancelarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblCPFCNPJ = new javax.swing.JLabel();
        txtCPFCNPJ = new javax.swing.JFormattedTextField();
        lblCNH = new javax.swing.JLabel();
        txtCNH = new javax.swing.JFormattedTextField();
        lblDtNasc = new javax.swing.JLabel();
        txtDtNasc = new javax.swing.JFormattedTextField();
        gravarCliente = new javax.swing.JButton();
        rdbPF = new javax.swing.JRadioButton();
        rdbPJ = new javax.swing.JRadioButton();
        txtDesconto = new javax.swing.JFormattedTextField();
        lblDesconto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cancelarCliente.setText("Cancelar");
        cancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Endereço");

        lblCPFCNPJ.setText("CPF");

        try {
            txtCPFCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFCNPJActionPerformed(evt);
            }
        });

        lblCNH.setText("CNH");

        txtCNH.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        lblDtNasc.setText("Data de Nascimento");

        try {
            txtDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDtNascActionPerformed(evt);
            }
        });

        gravarCliente.setText("Gravar");
        gravarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarClienteActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbPF);
        rdbPF.setSelected(true);
        rdbPF.setText("Pessoa Física");
        try{
            MaskFormatter mask = new MaskFormatter("###.###.###-##");
            DefaultFormatterFactory dff = new DefaultFormatterFactory(mask);
            txtCPFCNPJ.setFormatterFactory(dff);
        }catch(Exception e){};
        rdbPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPFActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbPJ);
        rdbPJ.setText("Pessoa Jurídica");
        rdbPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPJActionPerformed(evt);
            }
        });

        lblDesconto.setText("Desconto PJ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDesconto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gravarCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCPFCNPJ)
                            .addComponent(lblDtNasc)
                            .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCNH, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCNH)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEndereco)
                                    .addComponent(jLabel4)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbPF)
                                    .addComponent(rdbPJ))))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdbPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbPJ)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCPFCNPJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCPFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCNH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lblDtNasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gravarCliente)
                            .addComponent(cancelarCliente)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDesconto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarClienteActionPerformed
        this.clienteTemp = null;
        this.setVisible(false);
    }//GEN-LAST:event_cancelarClienteActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtDtNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDtNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDtNascActionPerformed

    private void gravarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarClienteActionPerformed
        try{ 
        String nome = txtNome.getText();
        String Endereco = txtEndereco.getText();
        String cpfOuCnpj = txtCPFCNPJ.getText();
        String Cnh = txtCNH.getText();
        Double descontoPj = Double.parseDouble(txtDesconto.getText());
        if(this.alterar){
                
            }
            else{
                if(rdbPF.isSelected()){
                    PessoaFisica cliente = new PessoaFisica();
                    java.util.Date dtNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(txtDtNasc.getText());
                    cliente.setNome(nome);
                    cliente.setCpf(cpfOuCnpj);
                    cliente.setEndereco(Endereco);
                    cliente.setdtNascimento(dtNascimento);
                    cliente.setCnh(Cnh);
                    
                    this.clienteTemp = cliente;
                }
                else if(rdbPJ.isSelected()){
                    PessoaJuridica cliente = new PessoaJuridica();
                    cliente.setNome(nome);
                    cliente.setEndereco(Endereco);
                    cliente.setCnpj(cpfOuCnpj);
                    cliente.setCnhResponsavel(Cnh);
                    cliente.setDesconto(descontoPj);
                    this.clienteTemp = cliente;
                }
            }
            this.setVisible(false);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,
                "Não foi possível gravar pessoa. \n\n" + ex.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_gravarClienteActionPerformed

    private void rdbPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPFActionPerformed
        try{
            if(rdbPF.isSelected()){
                lblCPFCNPJ.setText("CPF");

                MaskFormatter mask = new MaskFormatter("###.###.###-##");
                DefaultFormatterFactory dff = new DefaultFormatterFactory(mask);
                txtCPFCNPJ.setFormatterFactory(dff);
            }
        }catch(Exception ex){
        }
    }//GEN-LAST:event_rdbPFActionPerformed

    private void rdbPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPJActionPerformed
        try{
            if(rdbPJ.isSelected()){
                lblCPFCNPJ.setText("CNPJ");
                MaskFormatter mask = new MaskFormatter("##.###.###/####-##");
                DefaultFormatterFactory dff = new DefaultFormatterFactory(mask);
                txtCPFCNPJ.setFormatterFactory(dff);
            }
        }catch(Exception ex){
        }
    }//GEN-LAST:event_rdbPJActionPerformed

    private void txtCPFCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFCNPJActionPerformed

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
            java.util.logging.Logger.getLogger(FCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FCadCliente dialog = new FCadCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelarCliente;
    private javax.swing.JButton gravarCliente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCNH;
    private javax.swing.JLabel lblCPFCNPJ;
    private javax.swing.JLabel lblDesconto;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JRadioButton rdbPF;
    private javax.swing.JRadioButton rdbPJ;
    private javax.swing.JFormattedTextField txtCNH;
    private javax.swing.JFormattedTextField txtCPFCNPJ;
    private javax.swing.JFormattedTextField txtDesconto;
    private javax.swing.JFormattedTextField txtDtNasc;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
