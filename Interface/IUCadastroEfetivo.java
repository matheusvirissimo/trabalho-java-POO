
package Interface;

import controlador.Controlador;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import base.Departamento;
import base.DocenteEfetivo;
import base.Funcionario;

public class IUCadastroEfetivo extends javax.swing.JFrame {

    /**
     * Creates new form IUCadastroEfetivo
     */
    public IUCadastroEfetivo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupAreas = new javax.swing.ButtonGroup();
        comboNivel = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboTitu = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboDepart = new javax.swing.JComboBox<>();
        radioExatas = new javax.swing.JRadioButton();
        radioBio = new javax.swing.JRadioButton();
        radioHumanas = new javax.swing.JRadioButton();
        radioSaude = new javax.swing.JRadioButton();
        labelMsg = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Docente Efetivo");

        comboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        comboNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNivelActionPerformed(evt);
            }
        });

        jLabel3.setText("Nível");

        jLabel4.setText("Area");

        comboTitu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Graduação", "Mestrado", "Doutorado", "Livre-Docente", "Titular" }));

        jLabel5.setText("Titulação");

        btnSubmit.setText("Cadastrar Docente");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel1.setText("Código");

        textCod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textCodFocusLost(evt);
            }
        });
        textCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel6.setText("Departamento:");

        comboDepart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciência da computação", "Arquitetura e Urbanismo", "Engenharia Cartográfica", "Engenharia Ambiental", "Geografia", "Educação Física", "Fisioterapia", "Matemática", "Química" }));
        comboDepart.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        comboDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDepartActionPerformed(evt);
            }
        });

        groupAreas.add(radioExatas);
        radioExatas.setText("Exatas");
        radioExatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioExatasActionPerformed(evt);
            }
        });

        groupAreas.add(radioBio);
        radioBio.setText("Biológicas");
        radioBio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBioActionPerformed(evt);
            }
        });

        groupAreas.add(radioHumanas);
        radioHumanas.setText("Humanas");
        radioHumanas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHumanasActionPerformed(evt);
            }
        });

        groupAreas.add(radioSaude);
        radioSaude.setText("Saúde");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cadastro de Docente Efetivo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(labelMsg)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(textCod, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(comboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(16, 16, 16))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(comboTitu, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(33, 33, 33))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnSubmit)
                                            .addGap(184, 184, 184))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radioBio)
                                                .addGap(18, 18, 18)
                                                .addComponent(radioSaude)
                                                .addGap(18, 18, 18)
                                                .addComponent(radioHumanas)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radioExatas)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(comboDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(62, 62, 62)))))
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(labelMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTitu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBio)
                    .addComponent(radioSaude)
                    .addComponent(radioHumanas)
                    .addComponent(radioExatas))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(34, 34, 34)
                .addComponent(btnSubmit)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNivelActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        JFrame jFrame = new JFrame();
        String cod = textCod.getText();
        String nome = textNome.getText();
        String nivel = (String) comboNivel.getSelectedItem();
        String titulacao = " ";
        String area = " ";
        String departamento = " ";
        int index = comboDepart.getSelectedIndex();
        switch (index) {
            case 0:
                departamento = "Ciências da computação";
                break;
            case 1:
                departamento = "Arquitetura e Urbanismo";
                break;

            case 2:
                departamento = "Engenharia Cartográfica";
                break;

            case 3:
                departamento = "Engenharia Ambiental";
                break;

            case 4:
                departamento = "Geografia";
                break;

            case 5:
                departamento = "Educação Física";
                break;
            case 6:
                departamento = "Fisioterapia";
                break;

            case 7:
                departamento = "Matemática";
                break;

            case 8:
                departamento = "Química";
                break;
        }

        int index2 = comboTitu.getSelectedIndex();
        switch (index2) {
            case 0:
                titulacao = "Graduação";
                break;
            case 1:
                titulacao = "Mestrado";
                break;

            case 2:
                titulacao = "Doutorado";
                break;

            case 3:
                titulacao = "Livre-Docente";
                break;

            case 4:
                titulacao = "Titular";
                break;
        }

        if (radioBio.isSelected()) {
            area = "Biológicas";
        } else if (radioExatas.isSelected()) {
            area = "Exatas";
        } else if (radioHumanas.isSelected()) {
            area = "Humanas";
        } else if (radioSaude.isSelected()) {
            area = "Saude";
        } else {

            JOptionPane.showMessageDialog(jFrame, "Por favor, selecione uma área de atuação do Docente");
        }

        if (groupAreas.getSelection() != null) {

            Controlador control = new Controlador();
            Departamento d = control.buscaNomeDepart(departamento);
            if (d != null) {
                control.addEfetivo(cod, nome, nivel, titulacao, area, departamento);
                JOptionPane.showMessageDialog(jFrame, "Docente efetivo cadastrado com sucesso!");
                btnSubmit.setEnabled(false);
            } else {

                JOptionPane.showMessageDialog(jFrame, "Não foi possível cadastrar o funcionário pois o departamento selecionado não está cadastrado. \n"
                        + "Para cadastrar o funcionário no departamento dejesado, primeiramente, você deve cadastrar o departamento.");
            }

        } 

        //System.out.println(" cod " + cod + " nome " + nome + " nivel " + nivel  + " departamento " + departamento + " funcao " + funcao);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void textCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodActionPerformed

    private void comboDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDepartActionPerformed

    private void radioHumanasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHumanasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioHumanasActionPerformed

    private void radioExatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioExatasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioExatasActionPerformed

    private void radioBioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBioActionPerformed

    private void textCodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textCodFocusLost
        // TODO add your handling code here:

        String cod = textCod.getText();
        Controlador control = new Controlador();
        Funcionario e =  control.buscaCod(cod);

        if (e == null) {
            textNome.setText("");
            btnSubmit.setEnabled(true);
            labelMsg.setVisible(false);
        } else {
            textNome.setText(e.getNome());
            comboNivel.setActionCommand("1");
            btnSubmit.setEnabled(false);
            //labelMsg.setVisible(true); //aparece mesmo quando vc acabou de cadastrar - ta estranho.
            if(e instanceof DocenteEfetivo){}else{
                 JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Já há um funcionario (não docente efetivo) cadastrado com este código. "
                                                                    + "\nInsira um código inédito, por favor.");
            }
        }
    }//GEN-LAST:event_textCodFocusLost

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
            java.util.logging.Logger.getLogger(IUCadastroEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUCadastroEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUCadastroEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUCadastroEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUCadastroEfetivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> comboDepart;
    private javax.swing.JComboBox<String> comboNivel;
    private javax.swing.JComboBox<String> comboTitu;
    private javax.swing.ButtonGroup groupAreas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelMsg;
    private javax.swing.JRadioButton radioBio;
    private javax.swing.JRadioButton radioExatas;
    private javax.swing.JRadioButton radioHumanas;
    private javax.swing.JRadioButton radioSaude;
    private javax.swing.JTextField textCod;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables
}