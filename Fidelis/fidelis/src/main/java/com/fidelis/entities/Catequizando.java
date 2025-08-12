package com.fidelis.entities;

import java.sql.ResultSet; 
import java.sql.PreparedStatement;
import java.sql.SQLException; 
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.fidelis.persistence.Bd;

public class Catequizando {

    private int id;
    private String nome_catequizando;
    private String idade;
    private String data_inicio_cat;
    private String qtd_faltas;
    private boolean faltas;

    public static String inserirCatequizandos(Catequizando catequizando){
        String sql = "INSERT INTO catequizando(nome_catequizando, idade, data_inicio_cat, qtd_faltas, falta) Values(?,?,?,?,?);";
        try (PreparedStatement comando = Bd.connect().prepareStatement(sql)) {
            comando.setString(1, catequizando.getNome_catequizando());
            comando.setString(2, catequizando.getIdade());
            comando.setString(3, catequizando.getData_inicio_cat());
            comando.setString(4, catequizando.getQtd_faltas());
            comando.setBoolean(5, catequizando.isFaltas());
            comando.executeUpdate();
            comando.close();
            return "Catequizando Inserido com Sucesso";
        } catch(SQLException excecao_sql){
            excecao_sql.printStackTrace();
            return "Erro na inserção do Catequizando no BD";
            }
    }

    public static String editarCatequizandos(Catequizando catequizando){
        String message = "Catequizando Editado com Sucesso!";
        String sql = "UPDATE catequizando SET nome_catequizando = ?, Idade = ?, data_inicio_cat = ?, qtd_faltas = ?, falta = ?  WHERE id = ?";
        try (PreparedStatement comando = Bd.connect().prepareStatement(sql)) {
                comando.setString(1, catequizando.getNome_catequizando());
                comando.setString(2, catequizando.getIdade());
                comando.setString(3, catequizando.getData_inicio_cat());
                comando.setString(4, catequizando.getQtd_faltas());
                comando.setBoolean(5, false);
                comando.setInt(6, catequizando.getId());
                comando.executeUpdate();
                comando.close();
                System.out.println("Verificando ID: " + catequizando.getId());
                JOptionPane.showMessageDialog(null, message);
                return message;
        } catch(SQLException excecao_sql){
            excecao_sql.printStackTrace();
            return "Erro na Edição do Catequizando";
            }
    }

    public static String removerCatequizandos(int id){
        String sql = "DELETE FROM catequizando WHERE id = ?";
        try (PreparedStatement comando = Bd.connect().prepareStatement(sql)) {
            comando.setInt(1, id);
            comando.executeUpdate();
            comando.close();
            return null;
        }
        catch(SQLException excecao_sql){
            excecao_sql.printStackTrace();
            return "Erro ao remover o Catequizando do BD";
        }
    }

    public static Catequizando consultarCatequizandos(int id){
        String sql = "SELECT nome_catequizando, idade, data_inicio_cat, qtd_faltas FROM catequizando  WHERE id = ?";
        ResultSet lista_resultados = null;
        Catequizando catequizando = null;
        try (PreparedStatement comando = Bd.connect().prepareStatement(sql)) {
                    comando.setInt(1, id);
                    lista_resultados = comando.executeQuery();
                    while(lista_resultados.next()){
                        catequizando = new Catequizando(id,
                           lista_resultados.getString("nome_catequizando"),
                           lista_resultados.getString("idade"),
                           lista_resultados.getString("data_inicio_cat"),  
                           lista_resultados.getString("qtd_faltas"));
                }
                    lista_resultados.close();
                    comando.close();
        }
        catch(SQLException excecao_sql){
           excecao_sql.printStackTrace();
           catequizando = null;
        }
       return catequizando;
    }


    public static Catequizando[] getVisao_Catequizandos(){
        String sql = "SELECT id, nome_catequizando, idade FROM catequizando";
        ResultSet lista_resultados = null;
        ArrayList<Catequizando> visoes = new ArrayList<>();
        try (PreparedStatement comando = Bd.connect().prepareStatement(sql)) {
            lista_resultados = comando.executeQuery();
            while(lista_resultados.next()){
                int id = lista_resultados.getInt("id");
                String  nome_catequizando = lista_resultados.getString("nome_catequizando");
                String idade = lista_resultados.getString("idade");
                visoes.add(new Catequizando(id, nome_catequizando, idade));
            }
            lista_resultados.close();
            comando.close();
        }
        catch(SQLException excecao_sql){
            excecao_sql.printStackTrace();
        }
        return visoes.toArray(new Catequizando[0]);
    }

    public Catequizando(String nome_catequizando, String idade){
        this.nome_catequizando = nome_catequizando;
        this.idade = idade;
    }

    public Catequizando(int id, String nome_catequizando, String idade){
        this.id = id;
        this.nome_catequizando = nome_catequizando;
        this.idade = idade;
    }

    public Catequizando(String nome_catequizando, String idade, String data_inicio_cat, String qtd_faltas, boolean faltas){
        this.nome_catequizando = nome_catequizando;
        this.idade = idade;
        this.data_inicio_cat = data_inicio_cat;
        this.qtd_faltas = qtd_faltas;
        this.faltas = faltas;
    }

    public Catequizando(int id, String nome_catequizando, String idade, String data_inicio_cat, String qtd_faltas){
        this.id = id;
        this.nome_catequizando = nome_catequizando;
        this.idade = idade;
        this.data_inicio_cat = data_inicio_cat;
        this.qtd_faltas = qtd_faltas;
    }

    public Catequizando(int id, String nome_catequizando, String idade, String data_inicio_cat, String qtd_faltas,
    boolean faltas){
        this.id = id;
        this.nome_catequizando = nome_catequizando;
        this.idade = idade;
        this.data_inicio_cat = data_inicio_cat;
        this.qtd_faltas = qtd_faltas;
        this.faltas = faltas;
    }

    public Catequizando getVisao(){
        return new Catequizando(nome_catequizando, idade);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_catequizando() {
        return nome_catequizando;
    }

    public void setNome_catequizando(String nome_catequizando) {
        this.nome_catequizando = nome_catequizando;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getData_inicio_cat() {
        return data_inicio_cat;
    }

    public void setData_inicio_cat(String data_inicio_cat) {
        this.data_inicio_cat = data_inicio_cat;
    }

    public String getQtd_faltas() {
        return qtd_faltas;
    }

    public void setQtd_faltas(String qtd_faltas) {
        this.qtd_faltas = qtd_faltas;
    }

    public boolean isFaltas() {
        return faltas;
    }

    public void setFaltas(boolean faltas) {
        this.faltas = faltas;
    }

    @Override
    public String toString(){
         return nome_catequizando + " - " + idade + " Anos";
    }
    
    public String toStringFull(){
         String str = nome_catequizando;
         if(nome_catequizando != null) str += " , Catequizando: " +  nome_catequizando + " , Idade:" + idade + " , Quantidade de Faltas: " + qtd_faltas + " , Faltas: " + faltas;
         return str;
    }
}
