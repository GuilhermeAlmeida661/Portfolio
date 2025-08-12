package com.fidelis.entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.fidelis.persistence.Bd;

public class CatequistaDAO {

    public Catequista buscarPorNome(String nome){
        String sql = "SELECT * FROM Catequista WHERE nome = ?";

        try(Connection con = Bd.connect();
        PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return new Catequista(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("senha"),
                    rs.getBoolean("admin")
                    );
            }
        } catch(Exception e){
            e.printStackTrace();
            }
        return null;
    }
}
