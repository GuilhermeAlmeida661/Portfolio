package interfaces;
import controles.ControladorCadastroAgendamento;
import entidades.Agendamento;
import javax.swing.DefaultListModel;
import javax.swing.DefaultComboBoxModel;
import java.sql.Timestamp;
import entidades.Campanha;
import entidades.Paciente;
import java.util.Calendar;
import javax.swing.JOptionPane;


public class JanelaCadastroAgendamento extends javax.swing.JFrame {

    ControladorCadastroAgendamento controlador;
    DefaultListModel modelo_listaAgendamento;
    Paciente[] pacientes_cadastrados;
    Campanha[] campanhas_cadastradas;
    
    
    public JanelaCadastroAgendamento(ControladorCadastroAgendamento controlador) {
         this.controlador = controlador;
         pacientes_cadastrados = Paciente.getVisoes();
         campanhas_cadastradas = Campanha.getVisoes();
         initComponents();
         inicializarListaAgendamento();
         limparCampos(null);
    }
    
    public void inicializarListaAgendamento(){
         modelo_listaAgendamento = (DefaultListModel) agendamentosCadastradosList.getModel();
         Agendamento[] visoes = Agendamento.getVisões();
         for(Agendamento visao : visoes) modelo_listaAgendamento.addElement(visao);
    }
    
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PerídobuttonGroup = new javax.swing.ButtonGroup();
        agendamentosCadastradosScrollPane = new javax.swing.JScrollPane();
        agendamentosCadastradosList = new javax.swing.JList();
        InserirButton = new javax.swing.JButton();
        AlterarButton = new javax.swing.JButton();
        ConsultarButton = new javax.swing.JButton();
        RemoverButton = new javax.swing.JButton();
        LimparButton = new javax.swing.JButton();
        pacientesCadastradosComboBox = new javax.swing.JComboBox();
        campanhasCadastradasComboBox = new javax.swing.JComboBox();
        códigoAgendamentoTextField = new javax.swing.JTextField();
        códigoLabel = new javax.swing.JLabel();
        pacientesCadastradosLabel = new javax.swing.JLabel();
        campanhasCadastradasLabel = new javax.swing.JLabel();
        dataHoraLabel = new javax.swing.JLabel();
        agendamentosCadastradosLabel = new javax.swing.JLabel();
        dataHoraTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Janela de Cadastro de Agendamento");

        agendamentosCadastradosList.setModel(new DefaultListModel());
        agendamentosCadastradosScrollPane.setViewportView(agendamentosCadastradosList);

        InserirButton.setText("Inserir");
        InserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirAgendamento(evt);
            }
        });

        AlterarButton.setText("Alterar");
        AlterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarAgendamento(evt);
            }
        });

        ConsultarButton.setText("Consultar");
        ConsultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarAgendamento(evt);
            }
        });

        RemoverButton.setText("Remover");
        RemoverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerAgendamento(evt);
            }
        });

        LimparButton.setText("Limpar");
        LimparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCampos(evt);
            }
        });

        pacientesCadastradosComboBox.setModel(new DefaultComboBoxModel(pacientes_cadastrados));

        campanhasCadastradasComboBox.setModel(new DefaultComboBoxModel(campanhas_cadastradas));

        códigoAgendamentoTextField.setEditable(false);

        códigoLabel.setText("Código Agendamento:");

        pacientesCadastradosLabel.setText("Pacientes:");

        campanhasCadastradasLabel.setText("Campanhas:");

        dataHoraLabel.setText("Data e Hora:");

        agendamentosCadastradosLabel.setText("Agendamentos Cadastrados:");

        dataHoraTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(códigoLabel)
                                    .addComponent(pacientesCadastradosLabel)
                                    .addComponent(campanhasCadastradasLabel)
                                    .addComponent(dataHoraLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(códigoAgendamentoTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pacientesCadastradosComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(campanhasCadastradasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dataHoraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(InserirButton)
                                .addGap(18, 18, 18)
                                .addComponent(AlterarButton)
                                .addGap(18, 18, 18)
                                .addComponent(ConsultarButton)
                                .addGap(18, 18, 18)
                                .addComponent(RemoverButton)
                                .addGap(18, 18, 18)
                                .addComponent(LimparButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agendamentosCadastradosLabel)
                            .addComponent(agendamentosCadastradosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(agendamentosCadastradosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agendamentosCadastradosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(códigoAgendamentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(códigoLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pacientesCadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pacientesCadastradosLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campanhasCadastradasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campanhasCadastradasLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataHoraLabel)
                    .addComponent(dataHoraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InserirButton)
                    .addComponent(AlterarButton)
                    .addComponent(ConsultarButton)
                    .addComponent(RemoverButton)
                    .addComponent(LimparButton))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampos
         códigoAgendamentoTextField.setText("");
         pacientesCadastradosComboBox.setSelectedIndex(-1);
         campanhasCadastradasComboBox.setSelectedIndex(-1);
         dataHoraTextField.setText("");
    }//GEN-LAST:event_limparCampos

    private void removerAgendamento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerAgendamento
         Agendamento visao = (Agendamento) agendamentosCadastradosList.getSelectedValue();
         String msg_erro = null;
         if(visao != null)
             msg_erro = controlador.removerAgendamento(visao.getSequencial());
         else msg_erro = "Nenhum Agendamento Selecionado";
         if(msg_erro == null) modelo_listaAgendamento.removeElement(visao);
         else JOptionPane.showMessageDialog(this, msg_erro ,"ERRO",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_removerAgendamento

    private void consultarAgendamento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarAgendamento
         Agendamento visao = (Agendamento) agendamentosCadastradosList.getSelectedValue();
         Agendamento agendamento = null;
         String msg_erro = null;
         if(visao != null){
             agendamento = Agendamento.buscarAgendamento(visao.getSequencial());
             if(agendamento == null)
                 msg_erro = "Agendamento não cadastrado";
         } else msg_erro = "Não houve nenhum paciente ou campanha selecionada";
         if(msg_erro == null){
             códigoAgendamentoTextField.setText(agendamento.getSequencial() + "");
             pacientesCadastradosComboBox.setSelectedItem(getVisaoPacienteSelecionado(agendamento));
             campanhasCadastradasComboBox.setSelectedItem(getVisaoCampanhaSelecionada(agendamento));
             dataHoraTextField.setText(Agendamento.formatarDataHora(agendamento.getDataHora().toString()));
         }
         else  JOptionPane.showMessageDialog(this, msg_erro ,"ERRO",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_consultarAgendamento

    private void alterarAgendamento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarAgendamento
         Agendamento agendamento = obtemAgendamentoInformado();
         String msg_erro = null;
         if(agendamento != null) msg_erro = controlador.alterarAgendamento(agendamento);
         else msg_erro = "Algum atributo do Agendamento não foi informado";
         if(msg_erro != null) 
             JOptionPane.showMessageDialog(this, msg_erro ,"ERRO",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_alterarAgendamento

    private void inserirAgendamento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirAgendamento
         Agendamento agendamento = obtemAgendamentoInformado();
         String msg_erro = null;
         if(agendamento != null) msg_erro = controlador.inserirAgendamento(agendamento);
         else msg_erro = "Algum atributo do Agendamento não foi Informado";
         if(msg_erro == null){
             Integer sequencial = Agendamento.ultimoSequencial();
             agendamento.setSequencial(sequencial);
             modelo_listaAgendamento.addElement(agendamento.getVisão());
             agendamentosCadastradosList.setSelectedIndex(modelo_listaAgendamento.size() -1);
             códigoAgendamentoTextField.setText("" + sequencial);
             dataHoraTextField.setText(Agendamento.formatarDataHora(agendamento.getDataHora().toString()));
         } else JOptionPane.showMessageDialog(this, msg_erro ,"ERRO",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_inserirAgendamento

    private Agendamento obtemAgendamentoInformado(){
         String sequencial_str = códigoAgendamentoTextField.getText();
         Integer sequencial = 0;
         if(!sequencial_str.isEmpty()) sequencial = Integer.parseInt(sequencial_str);
         Paciente visao_paciente = (Paciente) pacientesCadastradosComboBox.getSelectedItem();
         if(visao_paciente == null) return null;
         Campanha visao_campanha = (Campanha) campanhasCadastradasComboBox.getSelectedItem();
         if(visao_campanha == null) return null;
         Timestamp data_Hora = new Timestamp(Calendar.getInstance().getTimeInMillis());
         return new Agendamento(sequencial, visao_paciente, visao_campanha, data_Hora);
    }
    
    public Paciente getVisaoPacienteSelecionado(Agendamento agendamento){
        String chave_paciente = agendamento.getPaciente().getCPF();
         for(Paciente visão_paciente : pacientes_cadastrados){
             if(visão_paciente.getCPF().equals(chave_paciente)) return visão_paciente;
         }
        return null;
    }
    
    public Campanha getVisaoCampanhaSelecionada(Agendamento agendamento){
        Integer chave_campanha = agendamento.getCampanha().getSequencial();
        for(Campanha visao_campanha : campanhas_cadastradas){
            if(visao_campanha.getSequencial() == chave_campanha) return visao_campanha;
        }
        return null;
    }
    
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
            java.util.logging.Logger.getLogger(JanelaCadastroAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarButton;
    private javax.swing.JButton ConsultarButton;
    private javax.swing.JButton InserirButton;
    private javax.swing.JButton LimparButton;
    private javax.swing.ButtonGroup PerídobuttonGroup;
    private javax.swing.JButton RemoverButton;
    private javax.swing.JLabel agendamentosCadastradosLabel;
    private javax.swing.JList agendamentosCadastradosList;
    private javax.swing.JScrollPane agendamentosCadastradosScrollPane;
    private javax.swing.JComboBox campanhasCadastradasComboBox;
    private javax.swing.JLabel campanhasCadastradasLabel;
    private javax.swing.JTextField códigoAgendamentoTextField;
    private javax.swing.JLabel códigoLabel;
    private javax.swing.JLabel dataHoraLabel;
    private javax.swing.JTextField dataHoraTextField;
    private javax.swing.JComboBox pacientesCadastradosComboBox;
    private javax.swing.JLabel pacientesCadastradosLabel;
    // End of variables declaration//GEN-END:variables
}
