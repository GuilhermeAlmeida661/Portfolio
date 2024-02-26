package interfaces;

import controles.ControladorCadastroCampanha;
import javax.swing.DefaultListModel;
import entidades.Campanha.Cidade;
import javax.swing.DefaultComboBoxModel;
import entidades.Campanha;
import entidades.Covid19;
import entidades.H1N1;
import entidades.Sarampo;
import interfaces.painelCovid19.Fabricante;
import interfaces.painelSarampo.Tipovac;
import javax.swing.JOptionPane;

public class JanelaCadastroCampanha extends javax.swing.JFrame {
    
    ControladorCadastroCampanha controlador;
    DefaultListModel modelo_lista_campanha;
    painelCovid19 campanha_painelCovid19;
    painelH1N1 campanha_painelH1N1;
    painelSarampo campanha_painelSarampo;
    
    
    public JanelaCadastroCampanha(ControladorCadastroCampanha controlador) {
         this.controlador = controlador;
         initComponents();
         campanha_painelCovid19 = new painelCovid19();
         campanha_painelH1N1 = new painelH1N1();
         campanha_painelSarampo = new painelSarampo();
         especialização_campanhasTabbedPane.addTab("Covid19", campanha_painelCovid19);
         especialização_campanhasTabbedPane.addTab("H1N1", campanha_painelH1N1);
         especialização_campanhasTabbedPane.addTab("Sarampo", campanha_painelSarampo);
         inicializarListaCampanha();
    }
    
    private void inicializarListaCampanha(){
         modelo_lista_campanha = (DefaultListModel) campanhas_CadastradasList.getModel();
         Campanha[] visoes = Campanha.getVisoes();
         for(Campanha visao : visoes) modelo_lista_campanha.addElement(visao);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sequencialTextField = new javax.swing.JTextField();
        sequencialLabel = new javax.swing.JLabel();
        idade_minLabel = new javax.swing.JLabel();
        idade_minTextField = new javax.swing.JTextField();
        idade_maxLabel = new javax.swing.JLabel();
        idade_maxTextField = new javax.swing.JTextField();
        cidadeLabel = new javax.swing.JLabel();
        cidadeComboBox = new javax.swing.JComboBox();
        profissionalLabel = new javax.swing.JLabel();
        profissionalTextField = new javax.swing.JTextField();
        dia_inicialLabel = new javax.swing.JLabel();
        dia_finalLabel = new javax.swing.JLabel();
        dia_inicialTextField = new javax.swing.JTextField();
        dia_finalTextField = new javax.swing.JTextField();
        InserirCampanhaButton = new javax.swing.JButton();
        ConsultarCampanhaButton = new javax.swing.JButton();
        AlterarCampanhaButton = new javax.swing.JButton();
        RemoverCampanhaButton = new javax.swing.JButton();
        LimparCampanhaButton = new javax.swing.JButton();
        campanhaLabel = new javax.swing.JLabel();
        campanhaTextField = new javax.swing.JTextField();
        ListasScrollPane = new javax.swing.JScrollPane();
        campanhas_CadastradasList = new javax.swing.JList();
        campanhaCadastradaLabel = new javax.swing.JLabel();
        especialização_campanhasTabbedPane = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Janela cadastro campanha");
        setPreferredSize(new java.awt.Dimension(600, 610));

        sequencialTextField.setEditable(false);

        sequencialLabel.setText("Sequencial:");

        idade_minLabel.setText("Idade min :");

        idade_maxLabel.setText("Idade max:");

        cidadeLabel.setText("Cidade:");

        cidadeComboBox.setModel(new DefaultComboBoxModel(Cidade.values()));

        profissionalLabel.setText("Profissional:");

        dia_inicialLabel.setText("Dia inicial:");

        dia_finalLabel.setText("Dia final:");

        InserirCampanhaButton.setText("Inserir");
        InserirCampanhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirCampanha(evt);
            }
        });

        ConsultarCampanhaButton.setText("Consultar");
        ConsultarCampanhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarCampanha(evt);
            }
        });

        AlterarCampanhaButton.setText("Alterar");
        AlterarCampanhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarCampanha(evt);
            }
        });

        RemoverCampanhaButton.setText("Remover");
        RemoverCampanhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerCampanha(evt);
            }
        });

        LimparCampanhaButton.setText("Limpar");
        LimparCampanhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCampanha(evt);
            }
        });

        campanhaLabel.setText("Campanha:");

        campanhas_CadastradasList.setModel(new DefaultListModel());
        ListasScrollPane.setViewportView(campanhas_CadastradasList);

        campanhaCadastradaLabel.setText("Campanhas cadastradas:");

        especialização_campanhasTabbedPane.setPreferredSize(new java.awt.Dimension(600, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campanhaCadastradaLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(ListasScrollPane)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(idade_maxLabel))
                            .addComponent(idade_minLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sequencialLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idade_maxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idade_minTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sequencialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dia_inicialLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dia_finalLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cidadeLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cidadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dia_inicialTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(dia_finalTextField))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campanhaLabel)
                            .addComponent(profissionalLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profissionalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campanhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(InserirCampanhaButton)
                .addGap(32, 32, 32)
                .addComponent(ConsultarCampanhaButton)
                .addGap(33, 33, 33)
                .addComponent(AlterarCampanhaButton)
                .addGap(34, 34, 34)
                .addComponent(RemoverCampanhaButton)
                .addGap(34, 34, 34)
                .addComponent(LimparCampanhaButton)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(especialização_campanhasTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campanhaCadastradaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListasScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sequencialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sequencialLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idade_minTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idade_minLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idade_maxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idade_maxLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cidadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cidadeLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dia_inicialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dia_inicialLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(profissionalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(profissionalLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campanhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campanhaLabel))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dia_finalTextField)
                            .addComponent(dia_finalLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(especialização_campanhasTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InserirCampanhaButton)
                    .addComponent(ConsultarCampanhaButton)
                    .addComponent(AlterarCampanhaButton)
                    .addComponent(RemoverCampanhaButton)
                    .addComponent(LimparCampanhaButton))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirCampanha(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirCampanha
         Campanha campanha = obterCampanhaInformada();
         String msg_erro = null;
         if(campanha != null)
                msg_erro = controlador.inserirCampanhaCadastrada(campanha);
         else msg_erro = "Algum Atributo da Campanha não foi informado";
         if(msg_erro == null){
            int sequencial = campanha.ultimoSequencial();
            campanha.setSequencial(sequencial);
            modelo_lista_campanha.addElement(campanha.getVisao());
            campanhas_CadastradasList.setSelectedIndex(modelo_lista_campanha.size() - 1);
            sequencialTextField.setText("" + sequencial);
         }else JOptionPane.showMessageDialog(this, msg_erro ,"ERRO",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_inserirCampanha

    private void consultarCampanha(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarCampanha
         Campanha visao =  (Campanha) campanhas_CadastradasList.getSelectedValue();
         Campanha campanha = null;
         String msg_erro = null;
         if(visao != null){
            campanha = Campanha.consultarCampanha(visao.getSequencial());
            if(campanha == null)
                msg_erro = "Campanha não Cadastrada";
         } else msg_erro = "Nenhuma Campanha ou Aba Selecionada";
         if(msg_erro == null){
            sequencialTextField.setText(campanha.getSequencial() + "");
            idade_minTextField.setText(campanha.getIdade_min());
            idade_maxTextField.setText(campanha.getIdade_max());
            cidadeComboBox.setSelectedItem(campanha.getCidade());
            dia_inicialTextField.setText(campanha.getDia_inicial());
            dia_finalTextField.setText(campanha.getDia_final());
            campanhaTextField.setText(campanha.getCampanhaAtual());
            profissionalTextField.setText(campanha.getProfissional());
            if(campanha instanceof Covid19){
                  especialização_campanhasTabbedPane.setSelectedIndex(0);
                  Covid19 covid19 = (Covid19) campanha;
                  campanha_painelCovid19.setRestrições(covid19.getRestrições());
                  campanha_painelCovid19.setSelectedFabricante(covid19.getFabricante().ordinal());
                  campanha_painelCovid19.setDoseUnica(covid19.isDose_unica());
                  campanha_painelCovid19.setDuasDoses(covid19.isDose_dupla());
                  campanha_painelCovid19.setPeríodo(covid19.getPeríodo());
            } else if(campanha instanceof H1N1){
                  especialização_campanhasTabbedPane.setSelectedIndex(1);
                  H1N1 h1n1 = (H1N1) campanha;
                  campanha_painelH1N1.setVariantes(h1n1.getVariantes());
                  campanha_painelH1N1.setRestrições(h1n1.getRestrições());
            } else if(campanha instanceof Sarampo){
                  especialização_campanhasTabbedPane.setSelectedIndex(2);
                  Sarampo sarampo = (Sarampo) campanha;
                  campanha_painelSarampo.setSelectedTipovac(sarampo.getTipovac().ordinal());
                  campanha_painelSarampo.setPeríodo(sarampo.getPeríodo());
                  campanha_painelSarampo.setRestrições(sarampo.getRestrições());
            }
         } else JOptionPane.showMessageDialog(this, msg_erro ,"ERRO",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_consultarCampanha

    private void alterarCampanha(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarCampanha
         Campanha campanha = obterCampanhaInformada();
         String msg_erro = null;
         String msg_succ = "Alteração realizada com sucesso";
         if(campanha != null)
            msg_erro = controlador.alterarCampanhaCadastrada(campanha);
         else msg_erro = "Algum atributo da Campanha não foi Informado";
         if(msg_erro == null){
            Campanha visao = (Campanha)  campanhas_CadastradasList.getSelectedValue();
            if(visao != null){
                visao.setCampanhaAtual(campanha.getCampanhaAtual());
                campanhas_CadastradasList.updateUI();
                JOptionPane.showMessageDialog(this,msg_succ,"Ação realizada com Sucesso",JOptionPane.INFORMATION_MESSAGE);
                  }
         }else JOptionPane.showMessageDialog(this, msg_erro ,"ERRO",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_alterarCampanha

 
    
    private void removerCampanha(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerCampanha
         Campanha visao = (Campanha) campanhas_CadastradasList.getSelectedValue();
         String msg_erro = null;
         if(visao != null)
            msg_erro = controlador.removerCampanhaCadastrada(visao.getSequencial());
         else msg_erro = "Nenhuma Campanha Selecionada";
         if(msg_erro == null) modelo_lista_campanha.removeElement(visao);
         else JOptionPane.showMessageDialog(this, msg_erro ,"ERRO",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_removerCampanha

    private void limparCampanha(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampanha
         idade_minTextField.setText("");
         idade_maxTextField.setText("");
         cidadeComboBox.setSelectedIndex(-1);
         dia_inicialTextField.setText("");
         dia_finalTextField.setText("");
         campanhaTextField.setText("");
         profissionalTextField.setText("");
         campanha_painelCovid19.limparAbaCovid19();
         campanha_painelH1N1.limparAbaH1N1();
         campanha_painelSarampo.limparAbaSarampo();
    }//GEN-LAST:event_limparCampanha
       
   public Campanha obterCampanhaInformada(){
         String sequencial_str = sequencialTextField.getText();
         int sequencial = 0;
            if(!sequencial_str.isEmpty()) 
            sequencial = Integer.parseInt(sequencial_str) ;
         String idade_min = idade_minTextField.getText();
            if(idade_min.isEmpty()) return null;
         String idade_max = idade_maxTextField.getText();
            if(idade_max.isEmpty()) return null;
         Cidade cidades = null;
            if(cidadeComboBox.getSelectedItem() != null)
                cidades = (Cidade) cidadeComboBox.getSelectedItem();
            else return null;
         String dia_inicial = dia_inicialTextField.getText();
            if(dia_inicial.isEmpty()) return null;
         String dia_final = dia_finalTextField.getText();
            if(dia_final.isEmpty()) return null;
         String profissional = profissionalTextField.getText();
         String campanha_atual = campanhaTextField.getText();
            if(campanha_atual.isEmpty()) return null;
         Campanha campanha = null;
         int indice_aba_sel = especialização_campanhasTabbedPane.getSelectedIndex();
         switch(indice_aba_sel){
             case  0:
                  String restrições = campanha_painelCovid19.getRestrições();
                    if(restrições.isEmpty()) return null;
                  Fabricante fabricante = campanha_painelCovid19.getSelectedFabricante();
                    if(fabricante == null) return null;
                  boolean dose_unica = campanha_painelCovid19.isDoseUnica();
                  boolean dose_dupla = campanha_painelCovid19.isDuasDoses();
                  String período_covid19 = campanha_painelCovid19.getPeríodo();
                    if(período_covid19.isEmpty()) return null;
                  campanha =  new  Covid19(sequencial , idade_min, idade_max , cidades  ,dia_inicial , dia_final, campanha_atual, profissional, restrições, fabricante,
                            dose_unica, dose_dupla, período_covid19);
                  break;
             case  1:
                  String variantes = campanha_painelH1N1.getVariantes();
                   if(variantes.isEmpty()) return null;
                  String restrições_h1n1 = campanha_painelH1N1.getRestrições();
                    if(restrições_h1n1.isEmpty()) return null;
                  campanha = new  H1N1(sequencial , idade_min, idade_max , cidades  , dia_inicial , dia_final, campanha_atual, profissional,
                          variantes, restrições_h1n1);
                  break;
             case  2:
                  Tipovac tipovac = campanha_painelSarampo.getSelectedTipovac();
                    if(tipovac == null) return null;
                  String período = campanha_painelSarampo.getPeríodo();
                    if(período.isEmpty()) return null;
                  String restrições_sarampo = campanha_painelSarampo.getRestrições();
                    if(restrições_sarampo.isEmpty()) return null;
                  campanha = new Sarampo(sequencial , idade_min, idade_max , cidades  , dia_inicial , dia_final, campanha_atual, profissional,
                   tipovac, período, restrições_sarampo);
            }
         return campanha;
         }
   
  
    public static void main(String args[]) {
    
         java.awt.EventQueue.invokeLater(new Runnable() {
                  @Override
                  public void run() {
                  
            }
         });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarCampanhaButton;
    private javax.swing.JButton ConsultarCampanhaButton;
    private javax.swing.JButton InserirCampanhaButton;
    private javax.swing.JButton LimparCampanhaButton;
    private javax.swing.JScrollPane ListasScrollPane;
    private javax.swing.JButton RemoverCampanhaButton;
    private javax.swing.JLabel campanhaCadastradaLabel;
    private javax.swing.JLabel campanhaLabel;
    private javax.swing.JTextField campanhaTextField;
    private javax.swing.JList campanhas_CadastradasList;
    private javax.swing.JComboBox cidadeComboBox;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JLabel dia_finalLabel;
    private javax.swing.JTextField dia_finalTextField;
    private javax.swing.JLabel dia_inicialLabel;
    private javax.swing.JTextField dia_inicialTextField;
    private javax.swing.JTabbedPane especialização_campanhasTabbedPane;
    private javax.swing.JLabel idade_maxLabel;
    private javax.swing.JTextField idade_maxTextField;
    private javax.swing.JLabel idade_minLabel;
    private javax.swing.JTextField idade_minTextField;
    private javax.swing.JLabel profissionalLabel;
    private javax.swing.JTextField profissionalTextField;
    private javax.swing.JLabel sequencialLabel;
    private javax.swing.JTextField sequencialTextField;
    // End of variables declaration//GEN-END:variables
}
