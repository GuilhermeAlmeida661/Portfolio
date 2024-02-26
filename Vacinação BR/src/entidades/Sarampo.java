package entidades;

import interfaces.painelSarampo.Tipovac;

public class Sarampo extends Campanha {
    
    private Tipovac tipovac;
    private String período;
    private String restrições;
    
   public Sarampo(Integer sequencial, String idade_min, String idade_max, Campanha.Cidade cidades, String dia_inicial, String dia_final, String campanha_atual, String profissional, Tipovac tipovac, String período, String restrições){
       super(sequencial, idade_min, idade_max, cidades, dia_inicial, dia_final, campanha_atual, profissional);
       this.tipovac = tipovac;
       this.período = período;
       this.restrições = restrições;   
   }
   
    public Tipovac getTipovac() {
        return tipovac;
    }

    public void setTipovac(Tipovac tipovac) {
        this.tipovac = tipovac;
    }

    public String getPeríodo() {
        return período;
    }

    public void setPeríodo(String período) {
        this.período = período;
    }

    public String getRestrições() {
        return restrições;
    }

    public void setRestrições(String restrições) {
        this.restrições = restrições;
    }    
}
