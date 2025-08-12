package com.fidelis.entities;

public class Faltas {

    private Catequista catequista;
    private Catequizando catequizando;
    private String data_Falta;
    private Boolean faltou;
    private String descrição_falta;

    public Faltas(){}

    public Faltas(Catequista catequista, Catequizando catequizando, String data_falta, Boolean faltou, String descrição_falta){
        this.catequista = catequista;
        this.catequizando = catequizando;
        this.data_Falta = data_falta;
        this.faltou = faltou;
        this.descrição_falta = descrição_falta;
    }

    //O salvar falta vai adicionar já uma falta no catequizando quando for acionado?
    //Se caso sim, lembre se de transformar o qtd_falta para int
    public static String salvar_Faltas(Faltas faltas){
        return null;
    }

    // Libera para editar a qtd de faltas?
    public String editar_Faltas(){}

    public Faltas consultar_Faltas(){}
    
    //O remover vai subtrair uma falta na qtd de faltas?
    public String remover_faltas(){}

    //É Realmente necessário ter um método para isso, se sim não poderia ser no relatório?
    public static int verifica_Qtd_Faltas(){}

    public Faltas[] getVisões(){}


    public Catequista getCatequista() {
        return catequista;
    }
    public void setCatequista(Catequista catequista) {
        this.catequista = catequista;
    }
    public Catequizando getCatequizando() {
        return catequizando;
    }
    public void setCatequizando(Catequizando catequizando) {
        this.catequizando = catequizando;
    }
    public String getData_Falta() {
        return data_Falta;
    }
    public void setData_Falta(String data_Falta) {
        this.data_Falta = data_Falta;
    }
    public Boolean getFaltou() {
        return faltou;
    }
    public void setFaltou(Boolean faltou) {
        this.faltou = faltou;
    }
    public String getDescrição_falta() {
        return descrição_falta;
    }
    public void setDescrição_falta(String descrição_falta) {
        this.descrição_falta = descrição_falta;
    }

    

}
