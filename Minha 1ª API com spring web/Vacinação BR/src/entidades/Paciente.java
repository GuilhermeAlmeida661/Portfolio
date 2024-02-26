package entidades;

import java.sql.ResultSet; 
import java.sql.PreparedStatement;
import java.sql.SQLException; 
import java.util.ArrayList;
import persistencia.BD;


public class Paciente {
    private String CPF;
    private String nome;
    private String idade;
    private Endereço endereco;
    private String telefone;
    private String restrição;
    
 
    public static String inserirPaciente(Paciente paciente){
         String sql = "INSERT INTO pacientes(CPF, Nome, Idade, Logradouro, Numero , Complemento ,Cidade, UF, Telefone, Restrição)" + "Values(?,?,?,?,?,?,?,?,?,?)";
         try (PreparedStatement comando = BD.conexão.prepareStatement(sql)) {
                  comando.setString(1, paciente.getCPF());
                  comando.setString(2, paciente.getNome());
                  comando.setString(3, paciente.getIdade());
                  comando.setString(4, paciente.getEndereco().getLogradouro());
                  comando.setString(5, paciente.getEndereco().getNumero());
                  comando.setString(6, paciente.getEndereco().getComplemento());
                  comando.setString(7, paciente.getEndereco().getCidade());
                  comando.setString(8, paciente.getEndereco().getUF());
                  comando.setString(9, paciente.getTelefone());
                  comando.setString(10, paciente.getRestrição());
                  comando.executeUpdate();
                  comando.close();
                  return null;
         } 
         catch(SQLException excecao_sql){
            excecao_sql.printStackTrace();
         return "Erro na inserção do paciente no BD";
         }
    }
    
    public static String removerPaciente(String CPF){
         String sql = "DELETE FROM pacientes WHERE CPF = ?";
         try (PreparedStatement comando = BD.conexão.prepareStatement(sql)) {
                  comando.setString(1,CPF);
                  comando.executeUpdate();
                  comando.close();
                  return null;
         }
         catch(SQLException excecao_sql){
            excecao_sql.printStackTrace();
         return "Erro ao remover o paciente do BD";
         }
    }
    public static Paciente consultarPaciente(String CPF){
         String sql = "SELECT Nome, Idade, Logradouro, Numero, Complemento , Cidade, UF, Telefone, Restrição FROM pacientes" + " WHERE CPF = ?";
         ResultSet lista_resultados = null;
         Paciente paciente = null;
         Endereço endereco = null;
         try (PreparedStatement comando = BD.conexão.prepareStatement(sql)) {
                  comando.setString(1,CPF);
                  lista_resultados = comando.executeQuery();
                  while(lista_resultados.next()){
                    endereco = new Endereço(
                            lista_resultados.getString("Logradouro"),
                            lista_resultados.getString("Numero"),
                            lista_resultados.getString("Complemento"),
                            lista_resultados.getString("Cidade"),
                            lista_resultados.getString("UF"));
                    paciente = new Paciente(CPF,
                            lista_resultados.getString("Nome"),
                            lista_resultados.getString("Idade"), endereco,
                            lista_resultados.getString("Telefone"),  
                            lista_resultados.getString("Restrição"));
                  }
                lista_resultados.close();
                comando.close();
         }
        catch(SQLException excecao_sql){
            excecao_sql.printStackTrace();
            paciente = null;
         }
        return paciente;
    }
    
    public static String alterarPaciente(Paciente paciente){
         String sql = "UPDATE pacientes SET Nome = ?,Idade = ? ,Logradouro = ?, Numero = ?, Complemento = ? ,Cidade = ?,UF = ? ,Telefone = ?, Restrição = ?" + "WHERE CPF = ?";
         try (PreparedStatement comando = BD.conexão.prepareStatement(sql)) {
                comando.setString(1, paciente.getNome());
                comando.setString(2, paciente.getIdade());
                comando.setString(3, paciente.getEndereco().getLogradouro());
                comando.setString(4, paciente.getEndereco().getNumero());
                comando.setString(5, paciente.getEndereco().getComplemento());
                comando.setString(6, paciente.getEndereco().getCidade());
                comando.setString(7, paciente.getEndereco().getUF());
                comando.setString(8, paciente.getTelefone());
                comando.setString(9, paciente.getRestrição());
                comando.setString(10, paciente.getCPF());
                comando.executeUpdate();
                comando.close();
                return null;
         }  
         catch(SQLException excecao_sql){
            excecao_sql.printStackTrace();
            return "Erro na Edição do Paciente";
         }
    }
    
    public static Paciente[] getVisoes(){
         String sql = "SELECT CPF, Nome FROM pacientes";
         ResultSet lista_resultados = null;
         ArrayList<Paciente> visoes = new ArrayList();
         String CPF = null;
         String Nome = null;
         try (PreparedStatement comando = BD.conexão.prepareStatement(sql)) {
                lista_resultados = comando.executeQuery();
                while(lista_resultados.next()){
                    CPF = lista_resultados.getString("CPF");
                    Nome = lista_resultados.getString("Nome");
                    visoes.add(new Paciente (CPF, Nome));
                  }
                lista_resultados.close();
                comando.close();
         }
         catch(SQLException excecao_sql){
            excecao_sql.printStackTrace();
         }
         return visoes.toArray(new Paciente[ visoes.size() ]);
    }
    
    
    public Paciente(String CPF, String nome, String idade, Endereço endereco ,String telefone,String restrição){
         this.CPF = CPF;
         this.nome = nome;
         this.idade = idade;
         this.endereco = endereco;
         this.telefone = telefone;
         this.restrição = restrição;
    }
    
    public Paciente(String CPF,String nome){
         this.CPF = CPF;
         this.nome = nome;
    }
    
    public Paciente getVisão () {        
         return new Paciente (CPF, nome);    
     }
    
    public String getNome() {
         return nome;
    }
    
    public void setNome(String nome) {
         this.nome = nome;
    }
    
    public String getCPF(){
         return CPF;
    }
    
    public void setCPF(String CPF){
         this.CPF = CPF;
    }
   
    public String getTelefone() {
         return telefone;
    }
 
    public void setTelefone(String telefone) {
         this.telefone = telefone;
    }
       
    public Endereço getEndereco() {
         return endereco;
    }

    public void setEndereco(Endereço endereco) {
         this.endereco  =  endereco;
    }
    
    public String getRestrição() {
         return restrição;
    }

    public void setRestrição(String restrição) {
         this.restrição = restrição;
    }
  
    public String getIdade() {
         return idade;
    }

    public void setIdade(String idade) {
         this.idade = idade;
    }
    
    @Override
    public String toString(){
         return CPF + " -  " + nome;
    }
    
    public String toStringFull(){
         String str = CPF;
         if(CPF != null) str += " , Paciente: " +  nome + " , Idade:" + idade + " , Restrição: " + restrição + " , Telefone: " + telefone + " , Endereço: " + endereco;
         return str;
    }
}
