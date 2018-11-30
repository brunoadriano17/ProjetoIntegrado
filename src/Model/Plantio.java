/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cg3002624
 */

public class Plantio {
    
    private int idPlantio;
    private Planta Planta;
    private Usuario Usuario;
    private String data_cadastro;
    private String observacao;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
    
    

    public Plantio() {
        this.idPlantio = 0;
        this.Planta = new Planta();
        this.Usuario = new Usuario();
    }

    
    public void listar(){
        
    }
    
    
    public int getIdPlantio() {
        return idPlantio;
    }

    public void setIdPlantio(int idPlantio) {
        this.idPlantio = idPlantio;
    }

    public Planta getPlanta() {
        return Planta;
    }

    public void setPlanta(Planta Planta) {
        this.Planta = Planta;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public void adicionarMuda(int planta, int usuario, String obs){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("call adicionarMuda("+planta+","+usuario+",'"+obs+"')");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Muda adicionada a sua lista com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(Planta.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void remover(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("DELETE FROM alarme WHERE idPlantio = "+this.idPlantio);
            stmt.executeUpdate();
            stmt = con.prepareStatement("DELETE FROM plantio WHERE idPlantio = "+this.idPlantio);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Muda removida com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(Plantio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}

