package com.crud.app.rest.Models;
import javax.persistence.*;

@Entity
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cdCl;

    @Column
    private String cdVend;
    public String getCdVend() {
        return cdVend;
    }
    public void setCdVend(String cdVend){
        this.cdVend = cdVend;
    }

    //Enviar uma variavel de outra classe para codigo aq
    //Definir uma uma PK e uma FK
    //Mudar variaveis string para varchar

    @Column
    private String dtNome;
    @Column
    private char idTipo[];
    @Column
    private float dsLim;

    public String getCdCl(){
        return cdCl;
    }
    public void setCdCl(String cdCl){
        this.cdCl = cdCl;
    }

    public String getDtNome(){
        return dtNome;
    }
    public void setDtNome(String dtNasc) {
        this.dtNome = dtNasc;
    }


    public char[] getIdTipo(){
        return idTipo;
    }
    public void setIdTipo(char[] idTipo){
        this.idTipo = idTipo;
    }

    public float getDsLim(){
        return dsLim;
    }
    public void setDsLim(float dsLim){
        this.dsLim = dsLim;
    }
}
