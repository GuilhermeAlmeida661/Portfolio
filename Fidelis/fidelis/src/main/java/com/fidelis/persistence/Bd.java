package com.fidelis.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Bd {

    private static final String URL ="jdbc:h2:~/fidelis_db";
    private static final String USER ="sa";
    private static final String PASSWORD ="";

    public static Connection connect(){
        Connection conexao = null;
        try{ conexao = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão com H2 Estabelecida com sucesso!");
            return conexao;
        }catch(SQLException e){
            System.out.println("Erro ao estabelecer conexão: " + e.getMessage());
        }
        return conexao;
    }

    public static void createTables(){
        String sqlCatequista = "CREATE TABLE IF NOT EXISTS CATEQUISTA (\n"
                           + " id INT AUTO_INCREMENT PRIMARY KEY,\n"
                           + " nome VARCHAR(100) not null,\n"
                           + " senha VARCHAR(100) not null,\n"
                           + " admin BOOLEAN DEFAULT FALSE\n"
                           + ");";

        String sqlCatequizando = "CREATE TABLE IF NOT EXISTS CATEQUIZANDO (\n"
                           + " id BIGINT PRIMARY KEY AUTO_INCREMENT,\n"
                           + " nome_catequizando VARCHAR(100) not null,\n"
                           + " idade VARCHAR(100),\n"
                           + " data_inicio_cat VARCHAR(100) not null,\n"
                           + " qtd_faltas VARCHAR(100) not null,\n"
                           + " falta BOOLEAN DEFAULT FALSE\n"
                           + ");";
                           
        String sqlFaltas = "CREATE TABLE IF NOT EXISTS FALTAS (\n"
                           + " id INT AUTO_INCREMENT PRIMARY KEY,\n"
                           + " catequista_id INT,\n"
                           + " catequizando_id INT,\n"
                           + " data_falta VARCHAR(100) not null,\n"
                           + " faltou BOOLEAN,\n"
                           + " FOREIGN KEY (catequista_id) REFERENCES catequista(id)\n"
                           + " FOREIGN KEY (catequizando_id) REFERENCES catequizando(id)\n"
                           + ");";

        try (Connection conn = connect();
            Statement stmt = conn.createStatement()) {
                stmt.execute(sqlCatequista);
                stmt.execute(sqlCatequizando);
                stmt.execute(sqlFaltas);
                System.out.println("Tabelas criadas com sucesso.");
        }catch (SQLException e) {
            System.out.println("Erro ao criar tabelas: " + e.getMessage());
        }
    }  

}
