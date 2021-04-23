package com.crud.app.rest.Models;
import javax.persistence.*;

@Entity
public class Vendedores {

    @Id
    protected String cdVend;

    @Column
    private String dsNome;
    private String dtNasc;
    private int cdTab;

    public String getCdVend() {
        return cdVend;
    }
    public void setCdVend(String cdVend){
        this.cdVend = cdVend;
    }

    public String getDtNasc(){
        return dtNasc;
    }
    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }


    public String getDsNome(){
        return dsNome;
    }
    public void setDsNome(String dsNome){
        this.dsNome = dsNome;
    }

    public int getCdTab(){
        return cdTab;
    }
    public void setCdTab(int cdTab){
        this.cdTab = cdTab;
    }

}



