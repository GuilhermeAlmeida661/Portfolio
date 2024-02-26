package entidades;

public class H1N1 extends Campanha{

    private String variantes;
    private String restrições;
    
  public H1N1(Integer sequencial, String idade_min, String idade_max, Campanha.Cidade cidades, String dia_inicial, String dia_final, String campanha_atual, String profissional, String variantes, String restrições){
       super(sequencial,idade_min,idade_max,cidades,dia_inicial,dia_final,campanha_atual,profissional);
       this.variantes = variantes;
       this.restrições = restrições;
  }
  
    public String getVariantes() {
        return variantes;
    }

    public void setVariantes(String variantes) {
        this.variantes = variantes;
    }

    public String getRestrições() {
        return restrições;
    }
 
    public void setRestrições(String restrições) {
        this.restrições = restrições;
    }   
}
