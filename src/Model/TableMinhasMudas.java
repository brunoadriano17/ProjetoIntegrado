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
public class TableMinhasMudas extends AbstractTableModel {

    private List<Plantio> dados = new ArrayList<Plantio>();
    private String[] colunas = {"Planta", "Data de Cadastro", "Observação"};
    
    
    

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
            case -2:
                return dados.get(linha);
            case -1:
                return dados.get(linha).getPlanta();
            case 0:
                return dados.get(linha).getPlanta().getNome_planta();
            case 1:
                return dados.get(linha).getData_cadastro();
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
            stmt = con.prepareStatement("call listarMudas("+usuario+")");
            if (stmt.execute() == true) {
                rs = stmt.getResultSet();
            }
            while (rs.next()) {
                Plantio plantio = new Plantio();
                plantio.setData_cadastro(rs.getString("data_cad"));
                plantio.setIdPlantio(rs.getInt("idPlantio"));
                Usuario u = new Usuario();
                u.setIdUsuario(rs.getInt("idUsuario"));
                plantio.setUsuario(u);
                plantio.setObservacao(rs.getString("obs_plantio"));
                Planta p = new Planta();
                p.setIdPlanta(rs.getInt("idPlanta"));
                p.setNome_planta(rs.getString("nome_planta"));
                p.setRegiao_planta(rs.getString("regiao_planta"));
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
                plantio.setPlanta(p);
                addRow(plantio);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableModel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }

    public void addRow(Plantio p) {
        this.dados.add(p);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

}
