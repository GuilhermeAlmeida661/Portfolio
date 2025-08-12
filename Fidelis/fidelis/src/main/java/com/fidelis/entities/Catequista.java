package com.fidelis.entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fidelis.persistence.Bd;

public class Catequista {

    private int id;
    private String nome;
    private String senha;
    private boolean admin;

    public static String inserirCatequista(Catequista catequista){
        String sql = "INSERT INTO catequista(nome, senha, admin)" + "Values(?,?,?)";
            try (PreparedStatement comando = Bd.connect().prepareStatement(sql)) {
                comando.setString(1, catequista.getNome());
                comando.setString(2, catequista.getSenha());
                comando.setBoolean(3, catequista.isAdmin());
                comando.executeUpdate();
                comando.close();
                return null;
            } 
            
            catch(SQLException excecao_sql){
                excecao_sql.printStackTrace();
                return "Erro na inserção do Catequista no BD";
            }
    }

    public static String editarCatequista(Catequista catequista){
        String sql = "UPDATE catequista SET nome = ?, senha = ?, admin = ?  WHERE id = ?";
         try (Connection con = Bd.connect();
            PreparedStatement comando = con.prepareStatement(sql)) {
                System.out.println("Id Capturada Antes da edicao: " + catequista.getId());
                comando.setString(1, catequista.getNome());
                comando.setString(2, catequista.getSenha());
                comando.setBoolean(3, catequista.isAdmin());
                comando.setInt(4, catequista.getId());
                comando.executeUpdate();
                System.out.println("Id Capturada depois da edicao: " + catequista.getId());
                return null;
         }catch(SQLException excecao_sql){
            excecao_sql.printStackTrace();
            return "Erro na Edição do Catequista";
         }
    }

    public static String removerCatequista(int id){
        String sql = "DELETE FROM catequista WHERE id = ?";
        try (PreparedStatement comando = Bd.connect().prepareStatement(sql)) {
            comando.setInt(1, id);
            comando.executeUpdate();
            comando.close();
            return null;
        }
        catch(SQLException excecao_sql){
            excecao_sql.printStackTrace();
            return "Erro ao remover o catequista do BD";
        }
    }

    public static Catequista consultarCatequista(int id){
        String sql = "SELECT nome, senha, admin FROM catequista  WHERE id = ?";
        Catequista catequista = null;
        try (Connection con = Bd.connect(); 
            PreparedStatement comando = con.prepareStatement(sql)) {
            comando.setInt(1, id);
                    try(ResultSet lista_resultados = comando.executeQuery()){
                        while(lista_resultados.next()){
                            catequista = new Catequista(id,
                                lista_resultados.getString("nome"),
                                lista_resultados.getString("senha"),  
                                lista_resultados.getBoolean("admin"));
                            System.out.println("Catequista encontrado: " + catequista.getNome());
                            System.out.println("Catequista encontrado com o id: " + catequista.getId());
                        }   
                    }
            }catch(SQLException excecao_sql){
            excecao_sql.printStackTrace();
            catequista = null;
            }
    return catequista;
    }
    
    public static Catequista[] getVisao_Catequistas(){
        String sql = "SELECT id, nome FROM catequista";
        ResultSet lista_resultados = null;
        ArrayList<Catequista> visoes_catequista = new ArrayList<>();
        try (PreparedStatement comando = Bd.connect().prepareStatement(sql)) {
            lista_resultados = comando.executeQuery();
            while(lista_resultados.next()){
                int id = lista_resultados.getInt("id");
                String nome = lista_resultados.getString("nome");
                visoes_catequista.add(new Catequista(id, nome));
            }
            lista_resultados.close();
            comando.close();
        }
        catch(SQLException excecao_sql){
            excecao_sql.printStackTrace();
        }
        return visoes_catequista.toArray(new Catequista[0]);
    }

    public Catequista(String nome){
        this.nome = nome;
    }

    public Catequista(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Catequista(String nome,String senha){
        this.nome = nome;
        this.senha = senha;
    }

    public Catequista(String nome, String senha, boolean admin){
        this.nome = nome;
        this.senha = senha;
        this.admin = admin;
    }

    public Catequista(int id, String nome, String senha, boolean admin){
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.admin = admin;
    }

    public Catequista getVisao(){
       return new Catequista(nome);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean autenticar(String nomeDigitado, String senhaDigitada){
        return this.nome.equals(nomeDigitado) && this.senha.equals(senhaDigitada);
    }

    @Override
    public String toString(){
        return nome;
    }
    
    public String toStringFull(){
        String str = nome;
        if(nome != null) str += "Catequista: " +  nome + "\nSenha:" + senha + "\nÉ um Administrador? " + admin;
        return str;
    }
}