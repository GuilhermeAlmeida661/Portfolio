package interfaces;
import entidades.Campanha;
import javax.swing.JOptionPane;


public class painelSarampo extends javax.swing.JPanel {

    public enum Tipovac {Tríplice,Tetravalente};
    
    private Tipovac tipovac;
    private String período;
    private String restrições;
     
     public Tipovac getSelectedTipovac(){
       Tipovac tipovac = null;
       String  msg_erro = "Nenhuma Vacina foi selecionada";
       if(tipo_VacinabuttonGroup.getSelection() == null)
           JOptionPane.showMessageDialog(this, msg_erro ,"ERRO",JOptionPane.ERROR_MESSAGE);
       if(tipo_VacinabuttonGroup.getSelection() != null)
           tipovac = Tipovac.values()[tipo_VacinabuttonGroup.getSelection().getMnemonic()];
       return tipovac;
   }
   
   public void setSelectedTipovac(int indice_vacina){
       switch(indice_vacina){
           case 0: trípliceRadioButton.setSelected(true); break;
           case 1: tetravalenteRadioButton.setSelected(true); break;
          
       }
   }
   
    public String getPeríodo(){
       String período = períodoTextField.getText();
       if(período.isEmpty()) return null;
       else return período;
   }
   
   public void setPeríodo(String período){
       períodoTextField.setText(período);
   }
   
    public String getRestrições(){
       String restrições = restriçõesTextField.getText();
       if( restrições.isEmpty()) return null;
       else return restrições;
   }
   
   public void setRestrições(String restrições){
       restriçõesTextField.setText(restrições);
   }
    
    public void limparAbaSarampo(){
        tipo_VacinabuttonGroup.clearSelection();
        períodoTextField.setText("");
        restriçõesTextField.setText("");
    }
    
    public String toStringFull(){
         Tipovac tipovac = null;
         Campanha campanha = null;
         int indice_vacina = -1;
         String str = campanha.toStringFull();
         if(!tipovac.equals(null)){
            switch(indice_vacina){
                  case 0: trípliceRadioButton.setSelected(true);
                  str += ", Tipo da vacina- "; break;
                  case 1:  tetravalenteRadioButton.setSelected(true); 
                  str+= ", Tipo da vacina - "; break;
                  
            }
         }
         str += ", Período entre Doses da Vacina:" + período + ", Restrições:" + restrições;
         return str;
    }
    
    public painelSarampo() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        tipo_VacinabuttonGroup = new javax.swing.ButtonGroup();
        tipo_VacinaLabel = new javax.swing.JLabel();
        períodoLabel = new javax.swing.JLabel();
        restriçõesLabel = new javax.swing.JLabel();
        períodoTextField = new javax.swing.JTextField();
        restriçõesTextField = new javax.swing.JTextField();
        tipo_vacinaPanel = new javax.swing.JPanel();
        trípliceRadioButton = new javax.swing.JRadioButton();
        tetravalenteRadioButton = new javax.swing.JRadioButton();

        setMaximumSize(new java.awt.Dimension(385, 186));
        setLayout(new java.awt.GridBagLayout());

        tipo_VacinaLabel.setText("Tipo da Vacina:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 2, 0, 0);
        add(tipo_VacinaLabel, gridBagConstraints);

        períodoLabel.setText("Período entre doses:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 2, 0, 0);
        add(períodoLabel, gridBagConstraints);

        restriçõesLabel.setText("Restrições:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 2, 0, 0);
        add(restriçõesLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 3, 0, 0);
        add(períodoTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 268;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 3, 33, 23);
        add(restriçõesTextField, gridBagConstraints);

        tipo_vacinaPanel.setBorder(null);

        tipo_VacinabuttonGroup.add(trípliceRadioButton);
        trípliceRadioButton.setText("Tríplice");
        tipo_vacinaPanel.add(trípliceRadioButton);

        tipo_VacinabuttonGroup.add(tetravalenteRadioButton);
        tetravalenteRadioButton.setMnemonic('\u0001');
        tetravalenteRadioButton.setText("Tetravalente");
        tipo_vacinaPanel.add(tetravalenteRadioButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 3, 0, 0);
        add(tipo_vacinaPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel períodoLabel;
    private javax.swing.JTextField períodoTextField;
    private javax.swing.JLabel restriçõesLabel;
    private javax.swing.JTextField restriçõesTextField;
    private javax.swing.JRadioButton tetravalenteRadioButton;
    private javax.swing.JLabel tipo_VacinaLabel;
    private javax.swing.ButtonGroup tipo_VacinabuttonGroup;
    private javax.swing.JPanel tipo_vacinaPanel;
    private javax.swing.JRadioButton trípliceRadioButton;
    // End of variables declaration//GEN-END:variables
}
