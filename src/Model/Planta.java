/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cg3002624
 */
public class Planta {

    private int idPlanta;
    private String nome_planta;
    private String regiao_planta;
    private String imagem_planta;
    private Clima clima_planta;
    private Irrigacao irrigacao_planta;
    private Colheita colheita_planta;
    private Luminosidade luminosidade_planta;
    private Solo solo_planta;
    private TratosCulturais tratos_culturais_planta;

    public Planta() {
        this.clima_planta = new Clima();
        this.irrigacao_planta = new Irrigacao();
        this.colheita_planta = new Colheita();
        this.luminosidade_planta = new Luminosidade();
        this.solo_planta = new Solo();
        this.tratos_culturais_planta = new TratosCulturais();
    }

    public int getIdPlanta() {
        return idPlanta;
    }

    public void setIdPlanta(int idPlanta) {
        this.idPlanta = idPlanta;
    }

    public String getNome_planta() {
        return nome_planta;
    }

    public void setNome_planta(String nome_planta) {
        this.nome_planta = nome_planta;
    }

    public String getRegiao_planta() {
        return regiao_planta;
    }

    public void setRegiao_planta(String regiao_planta) {
        this.regiao_planta = regiao_planta;
    }

    public String getImagem_planta() {
        return imagem_planta;
    }

    public void setImagem_planta(String imagem_planta) {
        this.imagem_planta = imagem_planta;
    }

    public Clima getClima_planta() {
        return clima_planta;
    }

    public void setClima_planta(Clima clima_planta) {
        this.clima_planta = clima_planta;
    }

    public Irrigacao getIrrigacao_planta() {
        return irrigacao_planta;
    }

    public void setIrrigacao_planta(Irrigacao irrigacao_planta) {
        this.irrigacao_planta = irrigacao_planta;
    }

    public Colheita getColheita_planta() {
        return colheita_planta;
    }

    public void setColheita_planta(Colheita colheita_planta) {
        this.colheita_planta = colheita_planta;
    }

    public Luminosidade getLuminosidade_planta() {
        return luminosidade_planta;
    }

    public void setLuminosidade_planta(Luminosidade luminosidade_planta) {
        this.luminosidade_planta = luminosidade_planta;
    }

    public Solo getSolo_planta() {
        return solo_planta;
    }

    public void setSolo_planta(Solo solo_planta) {
        this.solo_planta = solo_planta;
    }

    public TratosCulturais getTratos_culturais_planta() {
        return tratos_culturais_planta;
    }

    public void setTratos_culturais_planta(TratosCulturais tratos_culturais_planta) {
        this.tratos_culturais_planta = tratos_culturais_planta;
    }

    public List<Planta> ListarPlantas(){
        List<Planta> plantas = new ArrayList<Planta>();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            stmt = con.prepareStatement("call listar()");
            rs = stmt.executeQuery();
            while(rs.next()){
                Planta p = new Planta();
                p.setNome_planta(rs.getString("nome_planta"));
                p.setIdPlanta(rs.getInt("idPlanta"));
                p.setImagem_planta(rs.getString("imagem_planta"));
                p.getClima_planta().setDescricao_clima(rs.getString("descricao_clima"));
                p.getClima_planta().setImagem_clima(rs.getString("imagem_clima"));
                p.getColheita_planta().setDescricao_colheita(rs.getString("descricao_colheita"));
                p.getColheita_planta().setImagem_colheita(rs.getString("imagem_colheita"));
                p.getIrrigacao_planta().setDescricao_irrigacao(rs.getString("descricao_irrigacao"));
                p.getIrrigacao_planta().setImagem_irrigacao(rs.getString("imagem_irrigacao"));
                p.getLuminosidade_planta().setDescricao_luminosidade(rs.getString("descricao_luminosidade"));
                p.getLuminosidade_planta().setImagem_luminosidade(rs.getString("imagem_luminosidade"));
                p.getSolo_planta().setDescricao_solo(rs.getString("descricao_solo"));
                p.getSolo_planta().setImagem_solo(rs.getString("imagem_solo"));
                p.getTratos_culturais_planta().setDescricao_tratos_culturais(rs.getString("descricao_tratos_culturais"));
                p.getTratos_culturais_planta().setImagem_tratos_culturais(rs.getString("imagem_tratos_culturais"));
                plantas.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Planta.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return plantas;
    }
    
    public List<Planta> ListarPorRegiao(String regiao) {
        List<Planta> plantas = new ArrayList<Planta>();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("call listarRegiao('" + regiao + "')");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Planta p = new Planta();
                p.setNome_planta(rs.getString("nome_planta"));
                p.setIdPlanta(rs.getInt("idPlanta"));
                p.setImagem_planta(rs.getString("imagem_planta"));
                p.getClima_planta().setDescricao_clima(rs.getString("descricao_clima"));
                p.getClima_planta().setImagem_clima(rs.getString("imagem_clima"));
                p.getColheita_planta().setDescricao_colheita(rs.getString("descricao_colheita"));
                p.getColheita_planta().setImagem_colheita(rs.getString("imagem_colheita"));
                p.getIrrigacao_planta().setDescricao_irrigacao(rs.getString("descricao_irrigacao"));
                p.getIrrigacao_planta().setImagem_irrigacao(rs.getString("imagem_irrigacao"));
                p.getLuminosidade_planta().setDescricao_luminosidade(rs.getString("descricao_luminosidade"));
                p.getLuminosidade_planta().setImagem_luminosidade(rs.getString("imagem_luminosidade"));
                p.getSolo_planta().setDescricao_solo(rs.getString("descricao_solo"));
                p.getSolo_planta().setImagem_solo(rs.getString("imagem_solo"));
                p.getTratos_culturais_planta().setDescricao_tratos_culturais(rs.getString("descricao_tratos_culturais"));
                p.getTratos_culturais_planta().setImagem_tratos_culturais(rs.getString("imagem_tratos_culturais"));
                plantas.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Planta.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return plantas;
    }    
    
    
    public void Modificar() {

    }

    public void Listar() {

    }

    public void Buscar() {

    }

    public void Excluir() {

    }

}
