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
public class Alarme {

    private int idAlarme;
    private String horario_alarme;
    private Plantio Plantio;
    private String observacao;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Plantio getPlantio() {
        return Plantio;
    }

    public void setPlantio(Plantio plantio) {
        this.Plantio = plantio;
    }

    public int getIdAlarme() {
        return idAlarme;
    }

    public void setIdAlarme(int idAlarme) {
        this.idAlarme = idAlarme;
    }

    public String getHorario_alarme() {
        return horario_alarme;
    }

    public void setHorario_alarme(String horario_alarme) {
        this.horario_alarme = horario_alarme;
    }

    public void Avisar() {

    }

    public void AdicionarAlarme() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO alarme (idPlantio, horario_alarme, obs_alarme) values (" + this.getPlantio().getIdPlantio() + ",'" + this.getHorario_alarme() + "','" + this.getObservacao() + "')");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alarme cadastrado com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(Alarme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ExcluirAlarme() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM alarme WHERE idAlarme = " + this.idAlarme);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alarme removido com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(Plantio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
