/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author romananchugov
 */
public class NewJFrame extends javax.swing.JFrame {

    private int ansCount = 0;
    ArrayList numbersList;
    
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.remakeButton.setEnabled(false);
        
        numbersList = new ArrayList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        ansProgressBar = new javax.swing.JProgressBar();
        ansCountTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ansGeneratorButton = new javax.swing.JButton();
        ansCurrentLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        remakeButton = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ansCountTextField.setToolTipText("кол-во вопросов");
        ansCountTextField.setName("ansCount"); // NOI18N
        ansCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansCountTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Введите количество вопросов");

        ansGeneratorButton.setText("Сгенерировать");
        ansGeneratorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansGeneratorButtonActionPerformed(evt);
            }
        });

        ansCurrentLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        ansCurrentLabel.setText("Текущий вопрос: $");

        jLabel3.setText("Прогресс");

        remakeButton.setText("Re:");
        remakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remakeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ansCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(remakeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(ansGeneratorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ansCurrentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ansProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ansCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remakeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ansGeneratorButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ansCurrentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ansProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ansCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansCountTextFieldActionPerformed
        
    }//GEN-LAST:event_ansCountTextFieldActionPerformed

    private void ansGeneratorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansGeneratorButtonActionPerformed
        if(this.ansGeneratorButton.getText().equals("Сгенерировать")){
            ansCount = Integer.parseInt(this.ansCountTextField.getText().toString());
            this.ansProgressBar.setMaximum(ansCount);
            this.ansCountTextField.setEnabled(false);
            this.remakeButton.setEnabled(true);
            this.ansGeneratorButton.setText("Next");
        }
        Random r = new Random();
        int current = r.nextInt(ansCount) + 1;
            
        while(numbersList.contains(current)){
            current = r.nextInt(ansCount) + 1;
        }
        this.ansCurrentLabel.setText("Текущий вопрос: " + current);
        numbersList.add(current);
            
        if(numbersList.size() == ansCount){
            this.ansCurrentLabel.setText("Congrat. It will be 10");
            this.ansGeneratorButton.setEnabled(false);
        }
              
        this.ansCurrentLabel.setToolTipText("Remaining : " + (ansCount - numbersList.size()));

        this.ansProgressBar.setValue(numbersList.size());
            
        for(int i = 0; i < numbersList.size(); i++){
            System.out.print(numbersList.get(i) + " ");
        }
        System.out.println(""); 
    }//GEN-LAST:event_ansGeneratorButtonActionPerformed

    private void remakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remakeButtonActionPerformed
        this.ansCountTextField.setEnabled(true);
        this.ansGeneratorButton.setText("Сгенерировать");
        this.ansGeneratorButton.setEnabled(true);
        this.ansCurrentLabel.setText("Ready?");
        numbersList.clear();
    }//GEN-LAST:event_remakeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ansCountTextField;
    private javax.swing.JLabel ansCurrentLabel;
    private javax.swing.JButton ansGeneratorButton;
    private javax.swing.JProgressBar ansProgressBar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton remakeButton;
    // End of variables declaration//GEN-END:variables
}
