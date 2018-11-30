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
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Bruno
 */
public class TableAlarme extends AbstractTableModel {

    private List<Alarme> dados = new ArrayList<Alarme>();
    private String[] colunas = {"Planta", "Horario", "Observação"};
    
    
    

    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    public void limpar() {
        this.dados.removeAll(dados);
        this.fireTableDataChanged();
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case -1:
                return dados.get(linha);
            case 0:
                return dados.get(linha).getPlantio().getPlanta().getNome_planta();
            case 1:
                return dados.get(linha).getHorario_alarme();
            case 2:
                return dados.get(linha).getObservacao();
        }
        return null;
    }


   public void preencherTabela(int usuario) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        this.dados.removeAll(dados);

        try {
            stmt = con.prepareStatement("call listarAlarmes("+usuario+")");
            if (stmt.execute() == true) {
                rs = stmt.getResultSet();
            }
            while (rs.next()) {
                Alarme a = new Alarme();
                a.setHorario_alarme(rs.getString("horario_alarme"));
                a.setObservacao(rs.getString("obs_alarme"));
                a.setIdAlarme(rs.getInt("idAlarme"));
                Plantio p = new Plantio();
                p.setIdPlantio(rs.getInt("idPlantio"));
                Planta pl = new Planta();
                pl.setNome_planta(rs.getString("nome_planta"));
                p.setPlanta(pl);
                a.setPlantio(p);
                addRow(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableModel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }

    public void addRow(Alarme p) {
        this.dados.add(p);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

}
