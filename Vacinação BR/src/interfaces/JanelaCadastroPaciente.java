package interfaces;

import entidades.Paciente;
import entidades.Endereço;
import controles.ControladorCadastroPaciente;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class JanelaCadastroPaciente extends javax.swing.JFrame {

    ControladorCadastroPaciente controlador;
    Paciente[] pacientes_cadastrados;
    
    public JanelaCadastroPaciente(ControladorCadastroPaciente controlador) {
         this.controlador = controlador;
         pacientes_cadastrados = Paciente.getVisoes();
         initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeLabel = new javax.swing.JLabel();
        CPFLabel = new javax.swing.JLabel();
        logradouroLabel = new javax.swing.JLabel();
        cidadeLabel = new javax.swing.JLabel();
        telefoneLabel = new javax.swing.JLabel();
        InserirButton = new javax.swing.JButton();
        AlterarButton = new javax.swing.JButton();
        RemoverButton = new javax.swing.JButton();
        ConsultarButton = new javax.swing.JButton();
        LimparButton = new javax.swing.JButton();
        pacienteCadastradoLabel = new javax.swing.JLabel();
        pacientes_CadastradosComboBox = new javax.swing.JComboBox();
        nomeTextField = new javax.swing.JTextField();
        CPFTextField = new javax.swing.JTextField();
        logradouroTextField = new javax.swing.JTextField();
        cidadeTextField = new javax.swing.JTextField();
        telefoneTextField = new javax.swing.JTextField();
        restriçãoLabel = new javax.swing.JLabel();
        restriçãoTextField = new javax.swing.JTextField();
        UFLabel = new javax.swing.JLabel();
        UFTextField = new javax.swing.JTextField();
        IdadeLabel = new javax.swing.JLabel();
        idadeTextField = new javax.swing.JTextField();
        numeroLabel = new javax.swing.JLabel();
        numeroTextField = new javax.swing.JTextField();
        complementoLabel = new javax.swing.JLabel();
        complementoTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Paciente");

        nomeLabel.setText("Nome:");

        CPFLabel.setText("CPF:");

        logradouroLabel.setText("Logradouro:");

        cidadeLabel.setText("Cidade:");

        telefoneLabel.setText("Telefone:");

        InserirButton.setText("Inserir");
        InserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirPaciente(evt);
            }
        });

        AlterarButton.setText("Alterar");
        AlterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarPaciente(evt);
            }
        });

        RemoverButton.setText("Remover");
        RemoverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerPaciente(evt);
            }
        });

        ConsultarButton.setText("Consultar");
        ConsultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarPaciente(evt);
            }
        });

        LimparButton.setText("Limpar");
        LimparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCampos(evt);
            }
        });

        pacienteCadastradoLabel.setText("Paciente cadastrado:");

        pacientes_CadastradosComboBox.setModel(new DefaultComboBoxModel(pacientes_cadastrados));

        restriçãoLabel.setText("Restrição:");

        UFLabel.setText("UF:");

        IdadeLabel.setText("Idade:");

        numeroLabel.setText("Nº:");

        complementoLabel.setText("Comp:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pacienteCadastradoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(pacientes_CadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(InserirButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logradouroLabel)
                            .addComponent(cidadeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefoneLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(restriçãoLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CPFLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(restriçãoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CPFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(logradouroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(IdadeLabel)
                                                    .addComponent(numeroLabel))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(UFLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(UFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(complementoLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(complementoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(AlterarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(RemoverButton)
                                .addGap(26, 26, 26)
                                .addComponent(ConsultarButton)
                                .addGap(18, 18, 18)
                                .addComponent(LimparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pacienteCadastradoLabel)
                    .addComponent(pacientes_CadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPFLabel)
                    .addComponent(CPFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdadeLabel)
                    .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logradouroLabel)
                    .addComponent(logradouroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroLabel)
                    .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(complementoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(complementoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeLabel)
                    .addComponent(cidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UFLabel)
                    .addComponent(UFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneLabel)
                    .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restriçãoLabel)
                    .addComponent(restriçãoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InserirButton)
                    .addComponent(AlterarButton)
                    .addComponent(RemoverButton)
                    .addComponent(ConsultarButton)
                    .addComponent(LimparButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirPaciente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirPaciente
        Paciente paciente = obterPacienteInformado();
        String msg_erro = null;
        if(paciente != null)
           msg_erro = controlador.inserirPacienteCadastrado(paciente);
         else msg_erro = "Algum Atributo do paciente não foi informado";
        if(msg_erro == null){
           Paciente visao = paciente.getVisão();
           pacientes_CadastradosComboBox.addItem(visao);
           pacientes_CadastradosComboBox.setSelectedItem(visao);
         } else JOptionPane.showMessageDialog(this, msg_erro ,"ERRO",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_inserirPaciente

    private void alterarPaciente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarPaciente
         Paciente paciente = obterPacienteInformado();
         String msg_erro = null;
         if(paciente != null)
           msg_erro = controlador.alterarPacienteCadastrado(paciente);
         else msg_erro = "Algum atributo do paciente não foi Informado";
         if(msg_erro == null){
           Paciente visao = getVisaoPacientesCadastrados(paciente.getCPF());
         if(visao != null){
            visao.setCPF(paciente.getCPF());
            pacientes_CadastradosComboBox.updateUI();
            pacientes_CadastradosComboBox.setSelectedItem(visao);
            }
         } else JOptionPane.showMessageDialog(this, msg_erro ,"ERRO",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_alterarPaciente

    private void removerPaciente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerPaciente
         Paciente visao = (Paciente) pacientes_CadastradosComboBox.getSelectedItem();
         String msg_erro = null;
         if(visao != null)
           msg_erro = controlador.removerPacienteCadastrado(visao.getCPF());
         else msg_erro = "Nenhum Paciente Selecionado";
         if(msg_erro == null){
            pacientes_CadastradosComboBox.removeItem(visao);
            if(pacientes_cadastrados.length >= 1)
                 pacientes_CadastradosComboBox.setSelectedIndex(0);
            else pacientes_CadastradosComboBox.setSelectedIndex(-1);
         } else{
            JOptionPane.showMessageDialog(this, msg_erro ,"ERRO",JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_removerPaciente

    //Endereço vai virar lougradouro e precisa adicionar num e complemento//
    private void consultarPaciente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarPaciente
         Paciente visao = (Paciente) pacientes_CadastradosComboBox.getSelectedItem();
         Paciente paciente = null;
         String msg_erro = null;
         if(visao != null){
            paciente = Paciente.consultarPaciente(visao.getCPF());
            if(paciente == null)
                msg_erro = "Paciente não Cadastrado";
         } else msg_erro = "Nenhum Paciente Selecionado";
         if(msg_erro == null){
            nomeTextField.setText(paciente.getNome());
            CPFTextField.setText(paciente.getCPF());
            idadeTextField.setText(paciente.getIdade());
            logradouroTextField.setText(paciente.getEndereco().getLogradouro());
            numeroTextField.setText(paciente.getEndereco().getNumero());
            complementoTextField.setText(paciente.getEndereco().getComplemento());
            cidadeTextField.setText(paciente.getEndereco().getCidade());
            UFTextField.setText(paciente.getEndereco().getUF());
            telefoneTextField.setText(paciente.getTelefone());
            restriçãoTextField.setText(paciente.getRestrição());
         } else JOptionPane.showMessageDialog(this, msg_erro ,"ERRO",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_consultarPaciente
    
    private Paciente getVisaoPacientesCadastrados(String CPF){
         for(Paciente visao : pacientes_cadastrados){
            if(visao.getCPF().equals(CPF))
            return visao;
         }
         return null;
    }
    
    
    private void limparCampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampos
         CPFTextField.setText("");
         nomeTextField.setText("");
         idadeTextField.setText("");
         logradouroTextField.setText("");
         numeroTextField.setText("");
         complementoTextField.setText("");
         cidadeTextField.setText("");
         UFTextField.setText("");
         telefoneTextField.setText("");
         restriçãoTextField.setText("");
    }//GEN-LAST:event_limparCampos
    
    
     public Paciente obterPacienteInformado(){
         String CPF = CPFTextField.getText();
         if(CPF.isEmpty()) return null;
         String nome = nomeTextField.getText();
         if(nome.isEmpty()) return null;
         String idade = idadeTextField.getText();
         if(idade.isEmpty()) return null;
         String logradouro = logradouroTextField.getText();
         if(logradouro.isEmpty()) return null;
         String telefone = telefoneTextField.getText();
         if(telefone.isEmpty()) return null;
         String restrição = restriçãoTextField.getText();
         if(restrição.isEmpty()) return null;
         return new Paciente(CPF,nome,idade,obterEndereçoInformado(),telefone,restrição);
    }
    
    public Endereço obterEndereçoInformado(){
         String logradouro = logradouroTextField.getText();
         if(logradouro.isEmpty()) return null;
         String numero = numeroTextField.getText();
         if(numero.isEmpty()) return null;
         String complemento = complementoTextField.getText();
         if(complemento.isEmpty()) return null;
         String cidade = cidadeTextField.getText();
         if(cidade.isEmpty()) return null;
         String UF = UFTextField.getText();
         if(UF.isEmpty()) return null;
         return new Endereço(logradouro,numero,complemento,cidade,UF);
    }
   
    public static void main(String args[]) {
       
         java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() { }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarButton;
    private javax.swing.JLabel CPFLabel;
    private javax.swing.JTextField CPFTextField;
    private javax.swing.JButton ConsultarButton;
    private javax.swing.JLabel IdadeLabel;
    private javax.swing.JButton InserirButton;
    private javax.swing.JButton LimparButton;
    private javax.swing.JButton RemoverButton;
    private javax.swing.JLabel UFLabel;
    private javax.swing.JTextField UFTextField;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JTextField cidadeTextField;
    private javax.swing.JLabel complementoLabel;
    private javax.swing.JTextField complementoTextField;
    private javax.swing.JTextField idadeTextField;
    private javax.swing.JLabel logradouroLabel;
    private javax.swing.JTextField logradouroTextField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JTextField numeroTextField;
    private javax.swing.JLabel pacienteCadastradoLabel;
    private javax.swing.JComboBox pacientes_CadastradosComboBox;
    private javax.swing.JLabel restriçãoLabel;
    private javax.swing.JTextField restriçãoTextField;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JTextField telefoneTextField;
    // End of variables declaration//GEN-END:variables
}
