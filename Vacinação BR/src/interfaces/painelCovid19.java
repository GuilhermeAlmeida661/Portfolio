package interfaces;
import entidades.Campanha;

import javax.swing.JOptionPane;

public class painelCovid19 extends javax.swing.JPanel {

   public enum Fabricante {Astrazeneca, Pfizer, Sinovac};
   
    private String restrições;
    private Fabricante fabricante;
    private boolean dose_unica;
    private boolean dose_dupla;
    private String período;
    
    
   public void limparAbaCovid19(){
        restriçõesTextField.setText("");
         fabricantesbuttonGroup.clearSelection();
         dosesbuttonGroup.clearSelection();
         períodoTextField.setText("");
   }
   
   public String getRestrições(){
        String restrições = restriçõesTextField.getText();
        if(restrições.isEmpty()) return null;
         else return restrições;
   }
   
   public void setRestrições(String restrições){
       restriçõesTextField.setText(restrições);
   }
   
   public Fabricante getSelectedFabricante(){
       Fabricante fabricante = null;
       String  msg_erro = "Nenhum fabricante foi selecionado";
       if(fabricantesbuttonGroup.getSelection() == null)
           JOptionPane.showMessageDialog(this, msg_erro ,"ERRO",JOptionPane.ERROR_MESSAGE);
       if(fabricantesbuttonGroup.getSelection() != null)
           fabricante = Fabricante.values()[fabricantesbuttonGroup.getSelection().getMnemonic()];
       return fabricante;   
   }
   
   public void setSelectedFabricante(int indice_fabricante){
       switch(indice_fabricante){
           case 0: astrazenecaRadioButton.setSelected(true); break;
           case 1: pfizerRadioButton.setSelected(true); break;
           case 2: sinovacRadioButton.setSelected(true);
       }
   }
   
   public boolean isDoseUnica(){
       return doseÚnicaCheckBox.isSelected();
   }
   
   public void setDoseUnica(boolean dose_Unica){
       doseÚnicaCheckBox.setSelected(dose_Unica);
   }
   
    public boolean isDuasDoses(){
       return duasDosesCheckBox.isSelected();
   }
   
   public void setDuasDoses(boolean duas_Doses){
       duasDosesCheckBox.setSelected(duas_Doses);
   }
   
    public String getPeríodo(){
       String período = períodoTextField.getText();
       if(período.isEmpty()) return null;
       else return período;
   }
   
   public void setPeríodo(String período){
       períodoTextField.setText(período);
   }
   
   public String toStringFull(){
         Fabricante fabricante = null;
         Campanha campanha = null;
         int indice_fabricante = -1;
         String str = campanha.toStringFull() + " , Restrições: " + restrições;
         if(!fabricante.equals(null)){
            switch(indice_fabricante){
                  case 0: astrazenecaRadioButton.setSelected(true);
                  str += " , Fabricante -  "; break;
                  case 1:  pfizerRadioButton.setSelected(true); 
                  str+= " , Fabricante -  "; break;
                  case 2:  sinovacRadioButton.setSelected(true); 
                  str += " , Fabricante -  "; 
            }
         }
         str += ", Período entre Doses da Vacina: " + período;
         return str;
    }
    
     public painelCovid19(){
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fabricantesbuttonGroup = new javax.swing.ButtonGroup();
        dosesbuttonGroup = new javax.swing.ButtonGroup();
        restriçõesTextField = new javax.swing.JTextField();
        restriçõesLabel = new javax.swing.JLabel();
        fabricanteLabel = new javax.swing.JLabel();
        numDosesLabel = new javax.swing.JLabel();
        periodoDosesLabel = new javax.swing.JLabel();
        períodoTextField = new javax.swing.JTextField();
        dosesPanel = new javax.swing.JPanel();
        doseÚnicaCheckBox = new javax.swing.JCheckBox();
        duasDosesCheckBox = new javax.swing.JCheckBox();
        fabricantesPanel = new javax.swing.JPanel();
        astrazenecaRadioButton = new javax.swing.JRadioButton();
        pfizerRadioButton = new javax.swing.JRadioButton();
        sinovacRadioButton = new javax.swing.JRadioButton();

        setPreferredSize(new java.awt.Dimension(600, 200));

        restriçõesLabel.setText("Restrições:");

        fabricanteLabel.setText("Fabricantes:");

        numDosesLabel.setText("Nº de Doses:");

        periodoDosesLabel.setText("Período entre Doses:");

        dosesPanel.setBorder(null);

        dosesbuttonGroup.add(doseÚnicaCheckBox);
        doseÚnicaCheckBox.setText("Dose Única");
        dosesPanel.add(doseÚnicaCheckBox);

        dosesbuttonGroup.add(duasDosesCheckBox);
        duasDosesCheckBox.setText("Duas Doses");
        dosesPanel.add(duasDosesCheckBox);

        fabricantesPanel.setBorder(null);

        fabricantesbuttonGroup.add(astrazenecaRadioButton);
        astrazenecaRadioButton.setText("Astrazeneca");
        fabricantesPanel.add(astrazenecaRadioButton);

        fabricantesbuttonGroup.add(pfizerRadioButton);
        pfizerRadioButton.setMnemonic('\u0001');
        pfizerRadioButton.setText("Pfizer");
        fabricantesPanel.add(pfizerRadioButton);

        fabricantesbuttonGroup.add(sinovacRadioButton);
        sinovacRadioButton.setMnemonic('\u0002');
        sinovacRadioButton.setText("Sinovac");
        fabricantesPanel.add(sinovacRadioButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(periodoDosesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(períodoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(restriçõesLabel)
                        .addGap(18, 18, 18)
                        .addComponent(restriçõesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numDosesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dosesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fabricanteLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fabricantesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restriçõesLabel)
                    .addComponent(restriçõesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fabricantesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fabricanteLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dosesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numDosesLabel))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoDosesLabel)
                    .addComponent(períodoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton astrazenecaRadioButton;
    private javax.swing.JPanel dosesPanel;
    private javax.swing.ButtonGroup dosesbuttonGroup;
    private javax.swing.JCheckBox doseÚnicaCheckBox;
    private javax.swing.JCheckBox duasDosesCheckBox;
    private javax.swing.JLabel fabricanteLabel;
    private javax.swing.JPanel fabricantesPanel;
    private javax.swing.ButtonGroup fabricantesbuttonGroup;
    private javax.swing.JLabel numDosesLabel;
    private javax.swing.JLabel periodoDosesLabel;
    private javax.swing.JTextField períodoTextField;
    private javax.swing.JRadioButton pfizerRadioButton;
    private javax.swing.JLabel restriçõesLabel;
    private javax.swing.JTextField restriçõesTextField;
    private javax.swing.JRadioButton sinovacRadioButton;
    // End of variables declaration//GEN-END:variables
}
