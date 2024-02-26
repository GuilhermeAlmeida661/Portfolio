package interfaces;
import interfaces.painelSarampo.Tipovac;
import javax.swing.JOptionPane;

public class painelFiltroSarampo extends javax.swing.JPanel {

    private Tipovac tipovac;
    
    public void limparFiltros(){
        tipoVacinabuttonGroup.clearSelection();
    }
            
    public Tipovac getSelectedTipovac(){
       Tipovac tipovac = null;
       if(tipoVacinabuttonGroup.getSelection() != null)
           tipovac = Tipovac.values()[tipoVacinabuttonGroup.getSelection().getMnemonic()];
       return tipovac;
   }
   
   public void setSelectedTipovac(int indice_vacina){
       switch(indice_vacina){
           case 0: trípliceRadioButton.setSelected(true); break;
           case 1: tetravalenteRadioButton.setSelected(true); break;
          
       }
   }
    
    public painelFiltroSarampo() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoVacinabuttonGroup = new javax.swing.ButtonGroup();
        tipoVacinaPanel = new javax.swing.JPanel();
        trípliceRadioButton = new javax.swing.JRadioButton();
        tetravalenteRadioButton = new javax.swing.JRadioButton();
        tipoVacinaLabel = new javax.swing.JLabel();

        tipoVacinaPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tipoVacinabuttonGroup.add(trípliceRadioButton);
        trípliceRadioButton.setMnemonic('0');
        trípliceRadioButton.setText("Tríplice");

        tipoVacinabuttonGroup.add(tetravalenteRadioButton);
        tetravalenteRadioButton.setMnemonic('1');
        tetravalenteRadioButton.setText("Tetravalente");

        javax.swing.GroupLayout tipoVacinaPanelLayout = new javax.swing.GroupLayout(tipoVacinaPanel);
        tipoVacinaPanel.setLayout(tipoVacinaPanelLayout);
        tipoVacinaPanelLayout.setHorizontalGroup(
            tipoVacinaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tipoVacinaPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(trípliceRadioButton)
                .addGap(18, 18, 18)
                .addComponent(tetravalenteRadioButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        tipoVacinaPanelLayout.setVerticalGroup(
            tipoVacinaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tipoVacinaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tipoVacinaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trípliceRadioButton)
                    .addComponent(tetravalenteRadioButton))
                .addGap(17, 17, 17))
        );

        tipoVacinaLabel.setText("Tipo da Vacina:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tipoVacinaLabel)
                .addGap(18, 18, 18)
                .addComponent(tipoVacinaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(tipoVacinaLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(tipoVacinaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton tetravalenteRadioButton;
    private javax.swing.JLabel tipoVacinaLabel;
    private javax.swing.JPanel tipoVacinaPanel;
    private javax.swing.ButtonGroup tipoVacinabuttonGroup;
    private javax.swing.JRadioButton trípliceRadioButton;
    // End of variables declaration//GEN-END:variables
}
