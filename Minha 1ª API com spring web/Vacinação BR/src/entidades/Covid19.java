package entidades;

import interfaces.painelCovid19.Fabricante;

public class Covid19 extends Campanha{
     
    private String restrições;
    private Fabricante fabricante;
    private boolean dose_unica;
    private boolean dose_dupla;
    private String período;
    

    public Covid19(Integer sequencial, String idade_min, String idade_max, Campanha.Cidade cidades, String dia_inicial, String dia_final, String campanha_atual, String profissional, String Restrições, Fabricante fabricante, boolean dose_unica, boolean dose_dupla, String Período) {
         super(sequencial,idade_min,idade_max,cidades,dia_inicial,dia_final,campanha_atual,profissional);
         this.restrições = Restrições;
         this.fabricante = fabricante;
         this.dose_unica = dose_unica;
         this.dose_dupla = dose_dupla;
         this.período = Período;
    }

    
    public String getRestrições() {
        return restrições;
    }

    
    public void setRestrições(String restrições) {
        this.restrições = restrições;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

   
    public boolean isDose_unica() {
        return dose_unica;
    }

    public void setDose_unica(boolean dose_unica) {
        this.dose_unica = dose_unica;
    }

    public boolean isDose_dupla() {
        return dose_dupla;
    }

    public void setDose_dupla(boolean dose_dupla) {
        this.dose_dupla = dose_dupla;
    }

    public String getPeríodo() {
        return período;
    }

    public void setPeríodo(String período) {
        this.período = período;
    }
}
