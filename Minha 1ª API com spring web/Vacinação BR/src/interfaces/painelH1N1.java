package interfaces;
import entidades.Campanha;

public class painelH1N1 extends javax.swing.JPanel {

    private String variantes;
    private String restrições;

    public void limparAbaH1N1(){
        variantesTextField.setText("");
        restriçõesTextField.setText("");
    }
    
   public String getVariantes(){
       String variantes = variantesTextField.getText();
       if(variantes.isEmpty()) return null;
       else return variantes;
   }
   
   public void setVariantes(String Variantes){
       variantesTextField.setText(Variantes);
   }
   
    public String getRestrições(){
       String restrições = restriçõesTextField.getText();
       if(restrições.isEmpty()) return null;
       else return restrições;
   }
   
   public void setRestrições(String Restrições){
       restriçõesTextField.setText(Restrições);
   } 
   
   public String toStringFull(){
       Campanha campanha = null;
       String str = campanha.toStringFull();
       str += " , Variantes cobertas: " + variantes + " , Restrições:  " + restrições;
       return str;
   }
   
    public painelH1N1() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        variantesLabel = new javax.swing.JLabel();
        restriçõesLabel = new javax.swing.JLabel();
        variantesTextField = new javax.swing.JTextField();
        restriçõesTextField = new javax.swing.JTextField();

        variantesLabel.setText("Variantes cobertas:");

        restriçõesLabel.setText("Restrições:");

        variantesTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                variantesTextFieldActionPerformed(evt);
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
                        .addComponent(variantesLabel)
                        .addGap(20, 20, 20)
                        .addComponent(variantesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(restriçõesLabel)
                        .addGap(18, 18, 18)
                        .addComponent(restriçõesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(variantesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(variantesLabel))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restriçõesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restriçõesLabel))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void variantesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_variantesTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_variantesTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel restriçõesLabel;
    private javax.swing.JTextField restriçõesTextField;
    private javax.swing.JLabel variantesLabel;
    private javax.swing.JTextField variantesTextField;
    // End of variables declaration//GEN-END:variables
}
