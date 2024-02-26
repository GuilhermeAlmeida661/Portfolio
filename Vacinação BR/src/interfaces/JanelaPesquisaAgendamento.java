package interfaces;
import entidades.Agendamento;
import entidades.Campanha;
import entidades.Campanha.Cidade;
import entidades.Paciente;
import interfaces.painelCovid19.Fabricante;
import interfaces.painelSarampo.Tipovac;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JanelaPesquisaAgendamento extends javax.swing.JFrame {
    Paciente[] pacientesCadastrados;
    Campanha[] campanhasCadastradas;
    Agendamento[] agendamentosCadastrados;
    painelFiltroCovid19 painel_FiltrosCovid19;
    painelFiltroH1N1 painel_FiltrosH1N1;
    painelFiltroSarampo painel_FiltrosSarampo;
    
   
    public JanelaPesquisaAgendamento() {
         pacientesCadastrados = Paciente.getVisoes();
         campanhasCadastradas = Campanha.getVisoes();
         agendamentosCadastrados = Agendamento.getVisões();
         initComponents();
         painel_FiltrosCovid19 = new painelFiltroCovid19();
         painel_FiltrosH1N1 = new painelFiltroH1N1();
         painel_FiltrosSarampo = new painelFiltroSarampo();
         AbasTabbedPane.add("Covid19", painel_FiltrosCovid19 );
         AbasTabbedPane.add("H1N1", painel_FiltrosH1N1 );
         AbasTabbedPane.add("Sarampo", painel_FiltrosSarampo );
         limparFiltros(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        períodobuttonGroup = new javax.swing.ButtonGroup();
        restriçõesbuttonGroup = new javax.swing.ButtonGroup();
        FiltroPacientesPanel = new javax.swing.JPanel();
        pacientesCadComboBox = new javax.swing.JComboBox();
        pacientesCadLabel = new javax.swing.JLabel();
        idade_maximaTextField = new javax.swing.JTextField();
        idadePacLabel = new javax.swing.JLabel();
        restriçõesPacLabel = new javax.swing.JLabel();
        restriçõesPanel = new javax.swing.JPanel();
        temRadioButton = new javax.swing.JRadioButton();
        nãoTemRadioButton = new javax.swing.JRadioButton();
        filtroPacientesLabel = new javax.swing.JLabel();
        FiltroCampanhaPanel = new javax.swing.JPanel();
        campanhasCadLabel = new javax.swing.JLabel();
        campanhasCadComboBox = new javax.swing.JComboBox();
        cidadeComboBox = new javax.swing.JComboBox();
        cidadeLabel = new javax.swing.JLabel();
        AbasTabbedPane = new javax.swing.JTabbedPane();
        filtrosCampanhasLabel = new javax.swing.JLabel();
        FiltroAgendamentoPanel = new javax.swing.JPanel();
        agendamentosCadComboBox = new javax.swing.JComboBox();
        agendamentosPesLabel = new javax.swing.JLabel();
        dataHoraLabel = new javax.swing.JLabel();
        dataMinTextField = new javax.swing.JTextField();
        filtroAgendamentoLabel = new javax.swing.JLabel();
        filtroCampanhasLabel = new javax.swing.JLabel();
        pesquisarButton = new javax.swing.JButton();
        limparFiltrosButton = new javax.swing.JButton();
        limparPesquisaButton = new javax.swing.JButton();
        pesquisaFeitaLabel = new javax.swing.JLabel();
        PesquisaFeitaScrollPane = new javax.swing.JScrollPane();
        pesquisaFeitaTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Janela de Pesquisa de Agendamento");

        FiltroPacientesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        pacientesCadComboBox.setModel(new DefaultComboBoxModel(pacientesCadastrados));

        pacientesCadLabel.setText("Pacientes cadastrados:");

        idadePacLabel.setText("Idade Máxima:");

        restriçõesPacLabel.setText("Restrições:");

        restriçõesbuttonGroup.add(temRadioButton);
        temRadioButton.setMnemonic('t');
        temRadioButton.setText("Tem");

        restriçõesbuttonGroup.add(nãoTemRadioButton);
        nãoTemRadioButton.setMnemonic('n');
        nãoTemRadioButton.setText("Não tem");

        javax.swing.GroupLayout restriçõesPanelLayout = new javax.swing.GroupLayout(restriçõesPanel);
        restriçõesPanel.setLayout(restriçõesPanelLayout);
        restriçõesPanelLayout.setHorizontalGroup(
            restriçõesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restriçõesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(temRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nãoTemRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        restriçõesPanelLayout.setVerticalGroup(
            restriçõesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restriçõesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(restriçõesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temRadioButton)
                    .addComponent(nãoTemRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FiltroPacientesPanelLayout = new javax.swing.GroupLayout(FiltroPacientesPanel);
        FiltroPacientesPanel.setLayout(FiltroPacientesPanelLayout);
        FiltroPacientesPanelLayout.setHorizontalGroup(
            FiltroPacientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FiltroPacientesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pacientesCadLabel)
                .addGap(18, 18, 18)
                .addComponent(pacientesCadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(idadePacLabel)
                .addGap(18, 18, 18)
                .addComponent(idade_maximaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(restriçõesPacLabel)
                .addGap(18, 18, 18)
                .addComponent(restriçõesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        FiltroPacientesPanelLayout.setVerticalGroup(
            FiltroPacientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FiltroPacientesPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(FiltroPacientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(restriçõesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FiltroPacientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pacientesCadLabel)
                        .addComponent(pacientesCadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idadePacLabel)
                        .addComponent(idade_maximaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(restriçõesPacLabel)))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        filtroPacientesLabel.setText("Filtro de Pacientes:");

        FiltroCampanhaPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        campanhasCadLabel.setText("Campanhas cadastradas:");

        campanhasCadComboBox.setModel(new DefaultComboBoxModel(campanhasCadastradas));

        cidadeComboBox.setModel(new DefaultComboBoxModel(Campanha.Cidade.values()));

        cidadeLabel.setText("Cidade:");

        filtrosCampanhasLabel.setText("Filtros campanhas:");

        javax.swing.GroupLayout FiltroCampanhaPanelLayout = new javax.swing.GroupLayout(FiltroCampanhaPanel);
        FiltroCampanhaPanel.setLayout(FiltroCampanhaPanelLayout);
        FiltroCampanhaPanelLayout.setHorizontalGroup(
            FiltroCampanhaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FiltroCampanhaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campanhasCadLabel)
                .addGap(18, 18, 18)
                .addComponent(campanhasCadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cidadeLabel)
                .addGap(18, 18, 18)
                .addComponent(cidadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(filtrosCampanhasLabel)
                .addGap(18, 18, 18)
                .addComponent(AbasTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
        );
        FiltroCampanhaPanelLayout.setVerticalGroup(
            FiltroCampanhaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FiltroCampanhaPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(FiltroCampanhaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campanhasCadLabel)
                    .addComponent(campanhasCadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeLabel)
                    .addComponent(filtrosCampanhasLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FiltroCampanhaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AbasTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        FiltroAgendamentoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        agendamentosCadComboBox.setModel(new DefaultComboBoxModel(agendamentosCadastrados));

        agendamentosPesLabel.setText("Agendamentos cadastrados");

        dataHoraLabel.setText("Data:");

        javax.swing.GroupLayout FiltroAgendamentoPanelLayout = new javax.swing.GroupLayout(FiltroAgendamentoPanel);
        FiltroAgendamentoPanel.setLayout(FiltroAgendamentoPanelLayout);
        FiltroAgendamentoPanelLayout.setHorizontalGroup(
            FiltroAgendamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FiltroAgendamentoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agendamentosPesLabel)
                .addGap(18, 18, 18)
                .addComponent(agendamentosCadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dataHoraLabel)
                .addGap(18, 18, 18)
                .addComponent(dataMinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        FiltroAgendamentoPanelLayout.setVerticalGroup(
            FiltroAgendamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FiltroAgendamentoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FiltroAgendamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agendamentosCadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataMinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataHoraLabel)
                    .addComponent(agendamentosPesLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        filtroAgendamentoLabel.setText("Filtro de Agendamento:");

        filtroCampanhasLabel.setText("Filtro de Campanhas:");

        pesquisarButton.setText("Pesquisar");
        pesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarFiltros(evt);
            }
        });

        limparFiltrosButton.setText("Limpar Filtros");
        limparFiltrosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparFiltros(evt);
            }
        });

        limparPesquisaButton.setText("Limpar Pesquisa");
        limparPesquisaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparPesquisa(evt);
            }
        });

        pesquisaFeitaLabel.setText("Pesquisa Realizada:");

        pesquisaFeitaTextArea.setColumns(20);
        pesquisaFeitaTextArea.setRows(5);
        PesquisaFeitaScrollPane.setViewportView(pesquisaFeitaTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filtroAgendamentoLabel)
                            .addComponent(filtroPacientesLabel)
                            .addComponent(filtroCampanhasLabel)
                            .addComponent(pesquisaFeitaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FiltroAgendamentoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FiltroPacientesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FiltroCampanhaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PesquisaFeitaScrollPane)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(pesquisarButton)
                        .addGap(18, 18, 18)
                        .addComponent(limparFiltrosButton)
                        .addGap(18, 18, 18)
                        .addComponent(limparPesquisaButton)))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(filtroPacientesLabel)
                .addGap(18, 18, 18)
                .addComponent(FiltroPacientesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(filtroCampanhasLabel)
                .addGap(18, 18, 18)
                .addComponent(FiltroCampanhaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(filtroAgendamentoLabel)
                .addGap(18, 18, 18)
                .addComponent(FiltroAgendamentoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pesquisaFeitaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 52, Short.MAX_VALUE)
                .addComponent(PesquisaFeitaScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisarButton)
                    .addComponent(limparFiltrosButton)
                    .addComponent(limparPesquisaButton))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarFiltros(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarFiltros
         String chave_paciente = null;
            if(pacientesCadComboBox.getSelectedItem() != null)
             chave_paciente = ((Paciente) pacientesCadComboBox.getSelectedItem()).getCPF();
         Integer chave_campanha = -1;
            if(campanhasCadComboBox.getSelectedItem() != null)
             chave_campanha = ((Campanha) campanhasCadComboBox.getSelectedItem()).getSequencial();
         String idade_maxima = null;
            if(!idade_maximaTextField.getText().isEmpty())
             idade_maxima = idade_maximaTextField.getText();   
         char restriçoes = 'X';
            if(restriçõesbuttonGroup.getSelection() != null)
             restriçoes = (char) restriçõesbuttonGroup.getSelection().getMnemonic();
         Cidade cidades = null;
            if(cidadeComboBox.getSelectedItem() != null)
             cidades = (Cidade) cidadeComboBox.getSelectedItem();
         Fabricante fabricantes = null;
         Tipovac tipovac = null;
         String restrições = null;
         int abaSelecionada = AbasTabbedPane.getSelectedIndex();
         if(abaSelecionada == 0){
            fabricantes = painel_FiltrosCovid19.getSelectedFabricante();
         }
         else if(abaSelecionada == 1){
            restrições = painel_FiltrosH1N1.getRestrições();
         }
         else if(abaSelecionada == 2){
            tipovac = painel_FiltrosSarampo.getSelectedTipovac();
         }
         Agendamento agendamento = null;
            if(agendamentosCadComboBox.getSelectedItem() != null)
                agendamento = (Agendamento) agendamentosCadComboBox.getSelectedItem() ;
         Timestamp data_ag = null;
           data_ag = getDataMinima();
         ArrayList<Agendamento> agendamentos = Agendamento.pesquisarAgendamentos(chave_paciente, chave_campanha, idade_maxima, restriçoes, cidades, fabricantes, restrições, tipovac, agendamento, data_ag);
         mostrarAgendamentosSelecionados(agendamentos);
    }//GEN-LAST:event_pesquisarFiltros

    private void limparFiltros(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparFiltros
         pacientesCadComboBox.setSelectedIndex(-1);
         idade_maximaTextField.setText("");
         restriçõesbuttonGroup.clearSelection();
         campanhasCadComboBox.setSelectedIndex(-1);
         cidadeComboBox.setSelectedIndex(-1);
         painel_FiltrosCovid19.limparFiltros();
         painel_FiltrosH1N1.limparFiltros();
         painel_FiltrosSarampo.limparFiltros();
         agendamentosCadComboBox.setSelectedIndex(-1);
         dataMinTextField.setText("");
    }//GEN-LAST:event_limparFiltros

    private void limparPesquisa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparPesquisa
         pesquisaFeitaTextArea.setText("");
    }//GEN-LAST:event_limparPesquisa

    private Timestamp getDataMinima(){
         Timestamp dataMinima = null;
         String dataMinimaStr = dataMinTextField.getText();
         if(!dataMinimaStr.isEmpty()){
             String[] dataMinima_partes = dataMinimaStr.toString().split("/");
             String dia = dataMinima_partes[0];
             String mes = dataMinima_partes[1];
             String ano = dataMinima_partes[2];
             if((dia.length() == 2) && (mes.length() == 2) && (ano.length() == 4)){
                  dataMinimaStr = ano + "-" + mes + "-" + dia + "00:00:00";
                  dataMinima = Timestamp.valueOf(dataMinimaStr);
             }
         }
         return dataMinima;
    }
    
    public void mostrarAgendamentosSelecionados(ArrayList<Agendamento> agendamentos){
         boolean primeiroAgendamento = true;
         for(Agendamento agendamento : agendamentos){
             if(primeiroAgendamento){
                  pesquisaFeitaTextArea.append(agendamento.toStringFull());
                  primeiroAgendamento = false;
             } else pesquisaFeitaTextArea.append("\n" + agendamento.toStringFull());
         }
    }
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane AbasTabbedPane;
    private javax.swing.JPanel FiltroAgendamentoPanel;
    private javax.swing.JPanel FiltroCampanhaPanel;
    private javax.swing.JPanel FiltroPacientesPanel;
    private javax.swing.JScrollPane PesquisaFeitaScrollPane;
    private javax.swing.JComboBox agendamentosCadComboBox;
    private javax.swing.JLabel agendamentosPesLabel;
    private javax.swing.JComboBox campanhasCadComboBox;
    private javax.swing.JLabel campanhasCadLabel;
    private javax.swing.JComboBox cidadeComboBox;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JLabel dataHoraLabel;
    private javax.swing.JTextField dataMinTextField;
    private javax.swing.JLabel filtroAgendamentoLabel;
    private javax.swing.JLabel filtroCampanhasLabel;
    private javax.swing.JLabel filtroPacientesLabel;
    private javax.swing.JLabel filtrosCampanhasLabel;
    private javax.swing.JLabel idadePacLabel;
    private javax.swing.JTextField idade_maximaTextField;
    private javax.swing.JButton limparFiltrosButton;
    private javax.swing.JButton limparPesquisaButton;
    private javax.swing.JRadioButton nãoTemRadioButton;
    private javax.swing.JComboBox pacientesCadComboBox;
    private javax.swing.JLabel pacientesCadLabel;
    private javax.swing.ButtonGroup períodobuttonGroup;
    private javax.swing.JLabel pesquisaFeitaLabel;
    private javax.swing.JTextArea pesquisaFeitaTextArea;
    private javax.swing.JButton pesquisarButton;
    private javax.swing.JLabel restriçõesPacLabel;
    private javax.swing.JPanel restriçõesPanel;
    private javax.swing.ButtonGroup restriçõesbuttonGroup;
    private javax.swing.JRadioButton temRadioButton;
    // End of variables declaration//GEN-END:variables
}
