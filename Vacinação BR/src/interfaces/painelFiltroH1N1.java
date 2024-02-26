package interfaces;


public class painelFiltroH1N1 extends javax.swing.JPanel {

    private String restrições;
    
     public void limparFiltros(){
         restriçõesTextField.setText("");
     }
     
      public String getRestrições(){
       String restrições = restriçõesTextField.getText();
       if(restrições.isEmpty()) return null;
       else return restrições;
   }
    
    public painelFiltroH1N1() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        restriçõesLabel = new javax.swing.JLabel();
        restriçõesTextField = new javax.swing.JTextField();

        restriçõesLabel.setText("Restrições:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(restriçõesLabel)
                .addGap(18, 18, 18)
                .addComponent(restriçõesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restriçõesLabel)
                    .addComponent(restriçõesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel restriçõesLabel;
    private javax.swing.JTextField restriçõesTextField;
    // End of variables declaration//GEN-END:variables
}
