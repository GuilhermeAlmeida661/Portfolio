package persistencia;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

public class BD {
      static final String URL_BD = "jdbc:mysql://localhost/Vacinação?serverTimezone=UTC";    
      static final String USUARIO = "root";    
      static final String SENHA = "root";    
      public static Connection conexão = null;
      
 public static void criaConexão () {
    try {conexão = DriverManager.getConnection (URL_BD, USUARIO, SENHA);
    } catch (SQLException excecao_sql) {excecao_sql.printStackTrace ();}    
 }
    
 
 public static void fechaConexão () {        
    try {conexão.close();        
    } catch (SQLException excecao_sql) {excecao_sql.printStackTrace ();} 

 }
}
