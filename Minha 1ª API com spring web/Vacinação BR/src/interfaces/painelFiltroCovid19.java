package interfaces;
import interfaces.painelCovid19.Fabricante;
import javax.swing.JOptionPane;

public class painelFiltroCovid19 extends javax.swing.JPanel {

   private Fabricante fabricante;
    
   public void limparFiltros(){
       fabricantesbuttonGroup.clearSelection();
   }
    
   public Fabricante getSelectedFabricante(){
       Fabricante fabricante = null;
       if(fabricantesbuttonGroup.getSelection() != null)
           fabricante = Fabricante.values()[fabricantesbuttonGroup.getSelection().getMnemonic()];
       return fabricante;   
   }
   
   public void setSelectedFabricante(int indice_fabricante){
       switch(indice_fabricante){
           case 0: pfizerRadioButton.setSelected(true); break;
           case 1: astrazenecaRadioButton.setSelected(true); break;
           case 2: sinovacRadioButton.setSelected(true);
       }
   }
    
    public painelFiltroCovid19() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fabricantesbuttonGroup = new javax.swing.ButtonGroup();
        fabricanteLabel = new javax.swing.JLabel();
        fabricantesPanel = new javax.swing.JPanel();
        pfizerRadioButton = new javax.swing.JRadioButton();
        astrazenecaRadioButton = new javax.swing.JRadioButton();
        sinovacRadioButton = new javax.swing.JRadioButton();

        fabricanteLabel.setText("Fabricante da Vacina:");

        fabricantesPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fabricantesbuttonGroup.add(pfizerRadioButton);
        pfizerRadioButton.setMnemonic('0');
        pfizerRadioButton.setText("Pfizer");

        fabricantesbuttonGroup.add(astrazenecaRadioButton);
        astrazenecaRadioButton.setMnemonic('1');
        astrazenecaRadioButton.setText("Astrazeneca");

        fabricantesbuttonGroup.add(sinovacRadioButton);
        sinovacRadioButton.setMnemonic('2');
        sinovacRadioButton.setText("Sinovac");

        javax.swing.GroupLayout fabricantesPanelLayout = new javax.swing.GroupLayout(fabricantesPanel);
        fabricantesPanel.setLayout(fabricantesPanelLayout);
        fabricantesPanelLayout.setHorizontalGroup(
            fabricantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fabricantesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pfizerRadioButton)
                .addGap(18, 18, 18)
                .addComponent(astrazenecaRadioButton)
                .addGap(18, 18, 18)
                .addComponent(sinovacRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fabricantesPanelLayout.setVerticalGroup(
            fabricantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fabricantesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fabricantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfizerRadioButton)
                    .addComponent(astrazenecaRadioButton)
                    .addComponent(sinovacRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(fabricanteLabel)
                .addGap(18, 18, 18)
                .addComponent(fabricantesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(fabricanteLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(fabricantesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton astrazenecaRadioButton;
    private javax.swing.JLabel fabricanteLabel;
    private javax.swing.JPanel fabricantesPanel;
    private javax.swing.ButtonGroup fabricantesbuttonGroup;
    private javax.swing.JRadioButton pfizerRadioButton;
    private javax.swing.JRadioButton sinovacRadioButton;
    // End of variables declaration//GEN-END:variables
}
