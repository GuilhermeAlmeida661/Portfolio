package interfaces;

import persistencia.BD;
import controles.ControladorCadastroCampanha;
import controles.ControladorCadastroPaciente;
import controles.ControladorCadastroAgendamento;
import javax.swing.JOptionPane;


public class Vacinação extends javax.swing.JFrame {

    public Vacinação() {
         BD.criaConexão();
         initComponents();
    }

    private void informaServicoIndisponivel(){
     JOptionPane.showMessageDialog(this, "Serviço Indisponível","Informação", JOptionPane.INFORMATION_MESSAGE); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuBarVacinação = new javax.swing.JMenuBar();
        Cadastrar = new javax.swing.JMenu();
        cadastro_Paciente = new javax.swing.JMenuItem();
        Campanha = new javax.swing.JMenu();
        cadastro_Campanha = new javax.swing.JMenuItem();
        Agendamento = new javax.swing.JMenu();
        cadastroAgendamento = new javax.swing.JMenuItem();
        pesquisaAgendamento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vacinação");
        setMinimumSize(new java.awt.Dimension(400, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharSistema(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        Cadastrar.setText("Cadastrar");

        cadastro_Paciente.setText("Cadastro_de_Paciente");
        cadastro_Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastro_Paciente(evt);
            }
        });
        Cadastrar.add(cadastro_Paciente);

        MenuBarVacinação.add(Cadastrar);

        Campanha.setText("Campanha");

        cadastro_Campanha.setText("Cadastro_Campanha");
        cadastro_Campanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastro_Campanha(evt);
            }
        });
        Campanha.add(cadastro_Campanha);

        MenuBarVacinação.add(Campanha);

        Agendamento.setText("Agendamento");

        cadastroAgendamento.setText("Cadastro_de_Agendamento");
        cadastroAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroAgendamento(evt);
            }
        });
        Agendamento.add(cadastroAgendamento);

        pesquisaAgendamento.setText("Pesquisa_de_Agendamento");
        pesquisaAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaAgendamento(evt);
            }
        });
        Agendamento.add(pesquisaAgendamento);

        MenuBarVacinação.add(Agendamento);

        setJMenuBar(MenuBarVacinação);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastro_Paciente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastro_Paciente
         new ControladorCadastroPaciente();
    }//GEN-LAST:event_cadastro_Paciente

    private void cadastroAgendamento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroAgendamento
         new ControladorCadastroAgendamento();
    }//GEN-LAST:event_cadastroAgendamento

    private void pesquisaAgendamento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaAgendamento
         new JanelaPesquisaAgendamento().setVisible(true);
    }//GEN-LAST:event_pesquisaAgendamento

    private void fecharSistema(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharSistema
         BD.fechaConexão();        
         System.exit(1); 
    }//GEN-LAST:event_fecharSistema

    private void cadastro_Campanha(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastro_Campanha
         new ControladorCadastroCampanha();
    }//GEN-LAST:event_cadastro_Campanha

   
    public static void main(String args[]) {
       
         java.awt.EventQueue.invokeLater(() -> {
            new Vacinação().setVisible(true);                    
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Agendamento;
    private javax.swing.JMenu Cadastrar;
    private javax.swing.JMenu Campanha;
    private javax.swing.JMenuBar MenuBarVacinação;
    private javax.swing.JMenuItem cadastroAgendamento;
    private javax.swing.JMenuItem cadastro_Campanha;
    private javax.swing.JMenuItem cadastro_Paciente;
    private javax.swing.JMenuItem pesquisaAgendamento;
    // End of variables declaration//GEN-END:variables
}
