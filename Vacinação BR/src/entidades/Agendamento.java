package entidades;
import entidades.Campanha.Cidade;
import interfaces.painelCovid19.Fabricante;
import interfaces.painelSarampo.Tipovac;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import persistencia.BD;
import java.sql.Timestamp;



//Lembrar que para toda Visão agora terá um getVisão diferenciado e isso valerá para todas as abas e etc//
public class Agendamento {
 
    private Integer sequencial;
    private Paciente paciente;
    private Campanha campanha;
    private Timestamp dataHora;

    
    
    public static String inserirAgendamento(Agendamento agendamento){
         String sql = "INSERT INTO agendamento(PacienteId,CampanhaId,DataHora)" + "Values(?,?,?)";
         try{
             PreparedStatement comando = BD.conexão.prepareStatement(sql);
             comando.setString(1, agendamento.getPaciente().getCPF());
             comando.setInt(2, agendamento.getCampanha().getSequencial());
             comando.setTimestamp(3, agendamento.getDataHora());
             comando.executeUpdate();
             comando.close();
             return null;
         }catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
            return "Erro na inserção do Agendamento no Banco de Dados";
         }
    }
    
    public static Agendamento buscarAgendamento(Integer sequencial){
         String sql = "SELECT * FROM agendamento WHERE Sequencial = ?";
         ResultSet lista_resultados = null;
         Agendamento agendamento = null;
         try{
             PreparedStatement comando = BD.conexão.prepareStatement(sql);
             comando.setInt(1, sequencial);
             lista_resultados = comando.executeQuery();
             while(lista_resultados.next()){
                  agendamento = new Agendamento(sequencial,
                           Paciente.consultarPaciente(lista_resultados.getString("PacienteId")),
                           Campanha.consultarCampanha(lista_resultados.getInt("CampanhaId")),
                           lista_resultados.getTimestamp("DataHora"));
                  }
         lista_resultados.close();
         comando.close();
         }catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
            agendamento = null;
         }
        return agendamento;
    }
    
    public static String alterarAgendamento(Agendamento agendamento){
         String sql = "UPDATE agendamento SET PacienteId = ? , CampanhaId = ? , DataHora = ?";
           try (PreparedStatement comando = BD.conexão.prepareStatement(sql)) {
                comando.setString(1, agendamento.getPaciente().getCPF());
                comando.setInt(2, agendamento.getCampanha().getSequencial());
                comando.setTimestamp(3, agendamento.getDataHora());
                comando.executeUpdate();
                comando.close();
                return null;
            } catch (SQLException excecao_sql) {
                excecao_sql.printStackTrace();
                return "Erro ao alterar a campanha no BD";
            }
    }
    
    public static String removerAgendamento(Integer sequencial){
         String sql = "DELETE FROM agendamento WHERE Sequencial = ?";
         try (PreparedStatement comando = BD.conexão.prepareStatement(sql)) {
                comando.setInt(1, sequencial);
                comando.executeUpdate();
                comando.close();
                return null;
            } catch (SQLException excecao_sql) {
                excecao_sql.printStackTrace();
                return "Erro ao remover a campanha no BD";
            }
    }
    
    public static Agendamento[] getVisões(){
         String sql = "SELECT Sequencial, PacienteId, CampanhaId, DataHora FROM agendamento";
         ResultSet lista_resultados = null;
         ArrayList<Agendamento> visões = new ArrayList();
         try{
             PreparedStatement comando = BD.conexão.prepareStatement(sql);
             lista_resultados = comando.executeQuery();
             while(lista_resultados.next()){
                  visões.add( new Agendamento( lista_resultados.getInt("Sequencial"),
                  Paciente.consultarPaciente(lista_resultados.getString("PacienteId")).getVisão(),
                  Campanha.consultarCampanha(lista_resultados.getInt("CampanhaId")).getVisao(),
                  lista_resultados.getTimestamp("DataHora")));
             }         
              lista_resultados.close();
              comando.close();
         }catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
         }
         return visões.toArray(new Agendamento[visões.size()]);
    }
    
    public static boolean existeAgendamento(Integer sequencial){
         String sql = "SELECT COUNT(Sequencial) FROM agendamento WHERE Sequencial = ?";
         ResultSet lista_resultados = null;
         boolean existe = false;
         try{
              PreparedStatement comando = BD.conexão.prepareStatement(sql);
              comando.setInt(1, sequencial);
              lista_resultados = comando.executeQuery();
              while(lista_resultados.next()){
                  existe = true;
              }
              lista_resultados.close();
              comando.close();
         }catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
         }
         return existe;
    }
    
    public static boolean existeAgendamento(String chave_Paciente, Integer chave_Campanha ){
         String sql = "SELECT Sequencial FROM agendamento WHERE PacienteId = ? AND CampanhaId = ?";
         ResultSet lista_resultados = null;
         boolean existe = false;
         try{
              PreparedStatement comando = BD.conexão.prepareStatement(sql);
              comando.setString(1, chave_Paciente);
              comando.setInt(2, chave_Campanha);
              lista_resultados = comando.executeQuery();
              while(lista_resultados.next()){
                  existe = true;
              }
              lista_resultados.close();
              comando.close();
         }catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
         }
         return existe;
    }
    
    public static int ultimoSequencial() {
        String sql = "SELECT MAX(sequencial) FROM agendamento ";
        ResultSet lista_resultados = null;
        int sequencial = 0;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                sequencial = lista_resultados.getInt(1);
            }

            lista_resultados.close();
            comando.close();
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
        }
        return sequencial;
    }
    
    public static String formatarDataHora(String dataHoraBd){
         String[] dataHora = dataHoraBd.split(" ");
         String[] ano_mes_dia = dataHora[0].split("-");
         String[] hora_minuto_resto = dataHora[1].split(":");
         String dataHora_formatada = ano_mes_dia[2] + "/" + ano_mes_dia[1] + "/" + ano_mes_dia[0] + "  " + hora_minuto_resto[0] + ":" + hora_minuto_resto[1] + "Hs";
         return dataHora_formatada;
    }
   
    public static ArrayList<Agendamento> pesquisarAgendamentos(String chave_paciente, Integer chave_campanha, String idade_maxima , char restriçoes , Cidade cidades, Fabricante fabricante, String  restrições, Tipovac tipovac, Agendamento agendamento, Timestamp data_ag){
         String sql = " SELECT Pac.CPF, Pac.Idade, Pac.Restrição, Cam.Sequencial, Cam.Cidade," 
                + " Ag.Sequencial, Ag.DataHora" 
                + " FROM Pacientes Pac, Campanha Cam, Agendamento Ag"
                + " WHERE Ag.PacienteId = Pac.CPF AND Ag.CampanhaId = Cam.Sequencial";
         if(chave_paciente != null) sql += " AND Pac.CPF = ?";
         if(chave_campanha > -1) sql += " AND Cam.Sequencial = ?";
         if(idade_maxima != null) sql += " AND Pac.Idade = ?";
         if(restriçoes != 'X') sql += " AND Pac.Restrição = ?";
         if(cidades != null) sql += " AND Cam.Cidade = ?";
         if(agendamento != null) sql += " AND Ag.Sequencial = ?";
         if(data_ag != null) sql += " AND Ag.DataHora = ?";
         sql += " ORDER BY Ag.Sequencial";
         ResultSet lista_resultados = null;
         ArrayList<Agendamento> agendamentosSelecionados = new ArrayList();
         int index = 0;
         int sequencial_campanha = -1;
         try{
               PreparedStatement comando = BD.conexão.prepareStatement(sql);
               if(chave_paciente != null) comando.setString(++index, chave_paciente); 
               if(chave_campanha > -1)  comando.setInt(++index, chave_campanha);
               if(idade_maxima != null) comando.setString(++index, idade_maxima);
               if(restriçoes != 'X') comando.setString(++index , restriçoes + ""); 
               if(cidades != null) comando.setInt(++index, cidades.ordinal()); 
               if(agendamento != null) comando.setInt(++index, agendamento.getSequencial());
               if(data_ag != null) comando.setTimestamp(++index, data_ag);
               lista_resultados = comando.executeQuery();
               while(lista_resultados.next()){
                  Agendamento agendamentoPesquisado = Agendamento.buscarAgendamento(lista_resultados.getInt(6));
                  sequencial_campanha = lista_resultados.getInt(2);
                  if(fabricante != null){
                       if(isOkPesquisaemCovid19(sequencial_campanha, fabricante)) 
                           agendamentosSelecionados.add(agendamentoPesquisado);
                  } else if(restrições != null){
                      if(isOkPesquisaemH1N1(sequencial_campanha, restrições))
                           agendamentosSelecionados.add(agendamentoPesquisado);
                  } else if(tipovac != null){
                      if(isOkPesquisaemSarampo(sequencial_campanha, tipovac))
                           agendamentosSelecionados.add(agendamentoPesquisado);
                  } else agendamentosSelecionados.add(agendamentoPesquisado);    
               }
               lista_resultados.close();
               comando.close();
         } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
        }
      return agendamentosSelecionados;   
    }
    
    private static boolean isOkPesquisaemCovid19(int sequencial_campanha, Fabricante fabricante){
         boolean pesquisaOk = false;
         String sql = "SELECT * FROM covid19 WHERE CampanhaId = ?";
         if(fabricante != null) sql += " AND Fabricantes = ?";
         ResultSet lista_resultados = null;
         int index = 1;
         try{
              PreparedStatement comando = BD.conexão.prepareStatement(sql);
              comando.setInt(1, sequencial_campanha);
              if(fabricante != null) comando.setInt(++index, fabricante.ordinal());
              lista_resultados = comando.executeQuery();
              while(lista_resultados.next()) pesquisaOk = true;
              lista_resultados.close();
              comando.close();
         }catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
        }
         return pesquisaOk;
    }
    private static boolean isOkPesquisaemH1N1(int sequencial_campanha, String restriçoes){
         boolean pesquisaOk = false;
         String sql = "SELECT * FROM h1n1 WHERE CampanhaId = ?";
         if(restriçoes != null) sql += " AND Restrições = ?";
         ResultSet lista_resultados = null;
         int index = 1;
         try{
              PreparedStatement comando = BD.conexão.prepareStatement(sql);
               comando.setInt(1, sequencial_campanha);
               if(restriçoes != null) comando.setString(++index, restriçoes.toString());
               lista_resultados = comando.executeQuery();
               while(lista_resultados.next()) pesquisaOk = true;
               lista_resultados.close();
               comando.close();
         }catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
        }
         return pesquisaOk;
    }
    private static boolean isOkPesquisaemSarampo(int sequencial_campanha,Tipovac tipovac){
         boolean pesquisaOk = false;
         String sql = "SELECT * FROM sarampo WHERE CampanhaId = ?";
         if(tipovac != null) sql += " AND Tipovac = ?";
         ResultSet lista_resultados = null;
         int index = 1;
         try{
              PreparedStatement comando = BD.conexão.prepareStatement(sql);
               comando.setInt(1, sequencial_campanha);
               if(tipovac != null) comando.setInt(++index, tipovac.ordinal());
               lista_resultados = comando.executeQuery();
               while(lista_resultados.next()) pesquisaOk = true;
               lista_resultados.close();
              comando.close();
         }catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
        }
         return pesquisaOk;
    }
    
    public Agendamento(Integer sequencial, Paciente paciente, Campanha campanha, Timestamp dataHora){
         this.sequencial = sequencial;
         this.paciente = paciente;
         this.campanha = campanha;
         this.dataHora = dataHora;
    }
    
    public Agendamento(Paciente paciente){
        this.paciente = paciente;
    }
    
    public Paciente getVisaoPaciente(Agendamento agendamento){
         return  agendamento.getPaciente().getVisão();
    }
    
    public Campanha getVisaoCampanha(Agendamento agendamento){
         return agendamento.getCampanha().getVisao();
    }
    
    public Agendamento getVisão(){
         return new Agendamento(sequencial, paciente, campanha, dataHora);
    }
    
    @Override
    public String toString(){
         return "[" + sequencial + "]" + "  -   " + paciente + "  -  " + campanha + "  --  " + dataHora;
    }
    
    public String toStringFull(){
         String str = campanha.toStringFull() + "  \n Cpf : " + paciente.toStringFull() + "\n";
         str += " Data e Hora: " + formatarDataHora(dataHora.toString());
         return str;
    }
    
    public Integer getSequencial() {
         return sequencial;
    }

    public void setSequencial(Integer sequencial) {
         this.sequencial = sequencial;
    }

    public Paciente getPaciente() {
         return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Campanha getCampanha() {
         return campanha;
    }

    public void setCampanha(Campanha campanha) {
        this.campanha = campanha;
    }

    public Timestamp getDataHora() {
         return dataHora;
    }

    public void setDataHora(Timestamp dataHora) {
         this.dataHora = dataHora;
    }
    
}
