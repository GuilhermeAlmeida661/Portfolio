package entidades;

public class Endereço {
    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String UF;
    
    
public Endereço(String logradouro, String numero, String complemento ,  String cidade, String UF){
    this.logradouro = logradouro;
    this.numero = numero;
    this.complemento = complemento;
    this.cidade = cidade;
    this.UF = UF;
 }

    public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
  
    public String getUF() {
        return UF;
    }
    
    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getLogradouro() {
        return logradouro;
    }
    
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
   
    public String getNumero() {
        return numero;
    }
   
    public void setNumero(String numero) {
        this.numero = numero;
    }

   
    public String getComplemento() {
        return complemento;
    }

    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
   @Override
   public String toString(){
       return logradouro + " , " + numero + " , " + complemento + " , "+ cidade + " -- " + UF + "  ";
   }
}