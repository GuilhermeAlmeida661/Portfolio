package entidades;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import persistencia.BD;
import interfaces.painelCovid19.Fabricante;
import interfaces.painelSarampo.Tipovac;

//tentar arrumar o toString dele para não ter a redundancia do campo campanha//
public class Campanha {

    public enum Cidade {
        Amambai, Bataguassú, CampoGrande, Dourados, Itaporã
    };

    private Integer sequencial;
    private String idade_min;
    private String idade_max;
    private Cidade cidade;
    private String dia_inicial;
    private String dia_final;
    private String campanhaAtual;
    private String profissional;

    public static String inserirCampanha(Campanha campanha) {
        String sql = "INSERT INTO campanha(Idade_min, Idade_max, Cidade, Dia_inicial, Dia_final, Campanha, Profissional )" + "Values(?,?,?,?,?,?,?)";
        int indice_cidades = campanha.getCidade().ordinal();
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, campanha.getIdade_min());
            comando.setString(2, campanha.getIdade_max());
            comando.setInt(3, indice_cidades);
            comando.setString(4, campanha.getDia_inicial());
            comando.setString(5, campanha.getDia_final());
            comando.setString(6, campanha.getCampanhaAtual());
            comando.setString(7, campanha.getProfissional());
            comando.executeUpdate();
            comando.close();
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
            return "Erro na inserção da campanha no BD";
        }
        Integer sequencial = ultimoSequencial();
        if (campanha instanceof Covid19) {
            Covid19 covid19 = (Covid19) campanha;
            sql = "INSERT INTO covid19(Restrições, Fabricantes, DoseUnica, DoseDupla, Período, CampanhaId)" + "Values(?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setString(1, covid19.getRestrições());
                comando.setInt(2, covid19.getFabricante().ordinal());
                comando.setBoolean(3, covid19.isDose_unica());
                comando.setBoolean(4, covid19.isDose_dupla());
                comando.setString(5, covid19.getPeríodo());
                comando.setInt(6, sequencial);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao_sql) {
                excecao_sql.printStackTrace();
                return "Erro na inserção da Aba Covid19 no BD";
            }
        } else if (campanha instanceof H1N1) {
            H1N1 h1n1 = (H1N1) campanha;
            sql = "INSERT INTO h1n1(Variantes, Restrições, CampanhaId)" + "Values(?, ?, ?)";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setString(1, h1n1.getVariantes());
                comando.setString(2, h1n1.getRestrições());
                comando.setInt(3, sequencial);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao_sql) {
                excecao_sql.printStackTrace();
                return "Erro na inserção da Aba H1N1 no BD";
            }
        } else if (campanha instanceof Sarampo) {
            Sarampo sarampo = (Sarampo) campanha;
            sql = "INSERT INTO sarampo(Tipovac, Período, Restrições, CampanhaId)" + "Values( ?, ?, ?, ?)";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setInt(1, sarampo.getTipovac().ordinal());
                comando.setString(2, sarampo.getPeríodo());
                comando.setString(3, sarampo.getRestrições());
                comando.setInt(4, sequencial);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao_sql) {
                excecao_sql.printStackTrace();
                return "Erro na inserção da Aba Sarampo no BD";
            }
        }
        return null;
    }

    public static String removerCampanha(Campanha campanha) {
        int sequencial = campanha.getSequencial();
        if (campanha instanceof Covid19) {
            String sql = "DELETE FROM covid19 WHERE CampanhaId = ?";
            try (PreparedStatement comando = BD.conexão.prepareStatement(sql)) {
                comando.setInt(1, sequencial);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao_sql) {
                excecao_sql.printStackTrace();
                return "Erro ao remover a campanha no BD";
            }
        }
        if (campanha instanceof H1N1) {
            String sql = "DELETE FROM h1n1 WHERE CampanhaId = ?";
            try (PreparedStatement comando = BD.conexão.prepareStatement(sql)) {
                comando.setInt(1, sequencial);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao_sql) {
                excecao_sql.printStackTrace();
                return "Erro ao remover a campanha no BD";
            }
        }
        if (campanha instanceof Sarampo) {
            String sql = "DELETE FROM sarampo WHERE CampanhaId = ?";
            try (PreparedStatement comando = BD.conexão.prepareStatement(sql)) {
                comando.setInt(1, sequencial);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao_sql) {
                excecao_sql.printStackTrace();
                return "Erro ao remover a campanha no BD";
            }
        }
        String sql = "DELETE FROM campanha WHERE Sequencial = ?";
        try (PreparedStatement comando = BD.conexão.prepareStatement(sql)) {
            comando.setInt(1, sequencial);
            comando.executeUpdate();
            comando.close();
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
            return "Erro ao remover a campanha no BD";
        }
        return null;
    }

    public static Campanha consultarCampanha(Integer sequencial) {
        String sql = null;
        sql = "SELECT  Sequencial, Idade_min, Idade_max, Cidade, Dia_inicial, Dia_final , Campanha, Profissional FROM campanha WHERE Sequencial = ? ";
        ResultSet lista_resultados = null;
        Campanha campanhaAtual = null;
        String Idade_min = null;
        String Idade_max = null;
        Cidade cidade = null;
        String Dia_inicial = null;
        String Dia_final = null;
        String Campanha = null;
        String Profissional = null;
        try (PreparedStatement comando = BD.conexão.prepareStatement(sql)) {
            comando.setInt(1, sequencial);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                cidade = Cidade.values()[lista_resultados.getInt("Cidade")];
                campanhaAtual = new Campanha(sequencial,
                        Idade_min = lista_resultados.getString("Idade_min"),
                        Idade_max = lista_resultados.getString("Idade_max"),
                        cidade,
                        Dia_inicial = lista_resultados.getString("Dia_inicial"),
                        Dia_final = lista_resultados.getString("Dia_final"),
                        Campanha = lista_resultados.getString("Campanha"),
                        Profissional = lista_resultados.getString("Profissional"));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
        }
        sql = "SELECT Restrições, Fabricantes, DoseUnica, DoseDupla, Período FROM covid19 WHERE CampanhaId = ?";
        lista_resultados = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                Fabricante fabricantes = Fabricante.values()[lista_resultados.getInt("Fabricantes")];
                return new Covid19(sequencial,
                        Idade_min,
                        Idade_max,
                        cidade,
                        Dia_inicial,
                        Dia_final,
                        Campanha,
                        Profissional,
                        lista_resultados.getString("Restrições"),
                        fabricantes,
                        lista_resultados.getBoolean("DoseUnica"),
                        lista_resultados.getBoolean("DoseDupla"),
                        lista_resultados.getString("Período"));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
        }
        sql = "SELECT  Variantes, Restrições FROM h1n1 WHERE CampanhaId = ?";
        lista_resultados = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                return (new H1N1(sequencial,
                        Idade_min,
                        Idade_max,
                        cidade,
                        Dia_inicial,
                        Dia_final,
                        Campanha,
                        Profissional,
                        lista_resultados.getString("Variantes"),
                        lista_resultados.getString("Restrições")));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
        }
        sql = "SELECT  Tipovac, Período, Restrições FROM sarampo WHERE CampanhaId = ?";
        lista_resultados = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                Tipovac tipovac = Tipovac.values()[lista_resultados.getInt("Tipovac")];
                return (new Sarampo(sequencial,
                        Idade_min,
                        Idade_max,
                        cidade,
                        Dia_inicial,
                        Dia_final,
                        Campanha,
                        Profissional,
                        tipovac,
                        lista_resultados.getString("Período"),
                        lista_resultados.getString("Restrições")));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
        }
        return null;
    }

    public static String alterarCampanha(Campanha campanha) {
        String sql = "UPDATE campanha SET  Idade_min = ?, Idade_max = ?, Cidade = ?, Dia_inicial = ? , Dia_final = ?, Campanha = ? , Profissional = ? WHERE Sequencial = ?";
        try (PreparedStatement comando = BD.conexão.prepareStatement(sql)) {
            comando.setString(1, campanha.getIdade_min());
            comando.setString(2, campanha.getIdade_max());
            comando.setInt(3, campanha.getCidade().ordinal());
            comando.setString(4, campanha.getDia_inicial());
            comando.setString(5, campanha.getDia_final());
            comando.setString(6, campanha.getCampanhaAtual());
            comando.setString(7, campanha.getProfissional());
            comando.setInt(8, campanha.getSequencial());
            comando.executeUpdate();
            comando.close();
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
            return "Erro na Edição da Campanha";
        }
        if (campanha instanceof Covid19) {
            Covid19 covid19 = (Covid19) campanha;
            sql = "UPDATE covid19 SET Restrições = ?, Fabricantes = ?, DoseUnica = ?, DoseDupla = ?, Período = ? WHERE CampanhaId = ?";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setString(1, covid19.getRestrições());
                comando.setInt(2, covid19.getFabricante().ordinal());
                comando.setBoolean(3, covid19.isDose_unica());
                comando.setBoolean(4, covid19.isDose_dupla());
                comando.setString(5, covid19.getPeríodo());
                comando.setInt(6, covid19.getSequencial());
                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao_sql) {
                excecao_sql.printStackTrace();
                return "Erro na Alteração de algum atributo da Aba Covid19 no BD";
            }
        } else if (campanha instanceof H1N1) {
            H1N1 h1n1 = (H1N1) campanha;
            sql = "UPDATE h1n1 SET  Variantes = ?, Restrições  = ?  WHERE CampanhaId = ?";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setString(1, h1n1.getVariantes());
                comando.setString(2, h1n1.getRestrições());
                comando.setInt(3, h1n1.getSequencial());
                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao_sql) {
                excecao_sql.printStackTrace();
                return "Erro na Alteração de algum atributo da Aba H1N1 no BD";
            }
        } else if (campanha instanceof Sarampo) {
            Sarampo sarampo = (Sarampo) campanha;
            sql = "UPDATE sarampo SET Tipovac = ?, Período = ?, Restrições = ?  WHERE CampanhaId = ?";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setInt(1, sarampo.getTipovac().ordinal());
                comando.setString(2, sarampo.getPeríodo());
                comando.setString(3, sarampo.getRestrições());
                comando.setInt(4, sarampo.getSequencial());
                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao_sql) {
                excecao_sql.printStackTrace();
                return "Erro na Alteração de algum atributo da Aba Sarampo no BD";
            }
        }
        return null;
    }

    public static Campanha[] getVisoes() {
        String sql = "SELECT Sequencial, Campanha FROM campanha";
        ResultSet lista_resultados = null;
        ArrayList<Campanha> visoes = new ArrayList();

        try (PreparedStatement comando = BD.conexão.prepareStatement(sql)) {
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                Integer sequencial = lista_resultados.getInt("Sequencial");
                String campanha_atual = lista_resultados.getString("Campanha");
                visoes.add(new Campanha(sequencial, campanha_atual));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
        }
        return visoes.toArray(new Campanha[visoes.size()]);
    }

    public static int ultimoSequencial() {
        String sql = "SELECT MAX(sequencial) FROM campanha ";
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

    public static boolean existeCampanhaMesmosAtributos(Campanha campanha) {
        String sql = "SELECT COUNT(Sequencial) FROM campanha WHERE Campanha = ? AND Cidade = ?";
        ResultSet lista_resultados = null;
        int n_campanhas_mesmos_atrib = 0;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, campanha.getCampanhaAtual());
            comando.setInt(2, campanha.getCidade().ordinal());
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                n_campanhas_mesmos_atrib = lista_resultados.getInt(1);
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
        }
        if (n_campanhas_mesmos_atrib > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Campanha(Integer sequencial, String idade_min, String idade_max, Cidade cidades, String dia_inicial, String dia_final, String campanhaAtual, String profissional) {
        this.sequencial = sequencial;
        this.idade_min = idade_min;
        this.idade_max = idade_max;
        this.cidade = cidades;
        this.dia_inicial = dia_inicial;
        this.dia_final = dia_final;
        this.campanhaAtual = campanhaAtual;
        this.profissional = profissional;
    }

    public Campanha(Integer sequencial, String campanhaAtual) {
        this.sequencial = sequencial;
        this.campanhaAtual = campanhaAtual;
    }

    public Campanha getVisao() {
        return new Campanha(sequencial, campanhaAtual);
    }

    @Override
    public String toString() {
        return "[" + sequencial + "] " + campanhaAtual;
    }
    
    public String toStringFull(){
        String str = sequencial + " - ";
        if(sequencial != null) str += " Campanha: " + campanhaAtual + " , Data Inicio: " + dia_inicial + " , Data Término: " + dia_final + "\n Idade minima para a Campanha de Vacinação: " + idade_min +
                " , Idade maxima para a Campanha de vacinação: " + idade_max + " , Cidade onde está ocorrendo: " + cidade;
         if(profissional != null) str += " , Profissionais com prioridade no atendimento: " + profissional;
         return str;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(Integer sequencial) {
        this.sequencial = sequencial;
    }

    public String getIdade_min() {
        return idade_min;
    }

    public void setIdade_min(String idade_min) {
        this.idade_min = idade_min;
    }

    public String getIdade_max() {
        return idade_max;
    }

    public void setIdade_max(String idade_max) {
        this.idade_max = idade_max;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getDia_inicial() {
        return dia_inicial;
    }

    public void setDia_inicial(String dia_inicial) {
        this.dia_inicial = dia_inicial;
    }

    public String getDia_final() {
        return dia_final;
    }

    public void setDia_final(String dia_final) {
        this.dia_final = dia_final;
    }

    public String getCampanhaAtual() {
        return campanhaAtual;
    }

    public void setCampanhaAtual(String campanhaAtual) {
        this.campanhaAtual = campanhaAtual;
    }

    public String getProfissional() {
        return profissional;
    }

    public void setProfissional(String profissional) {
        this.profissional = profissional;
    }
}
