/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cg3002624
 */
public class Usuario {

    private int idUsuario;
    private String nome_usuario;
    private String email_usuario;
    private String senha_usuario;
    private int nivel_usuario;
    private Date data_cadastro;

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public int getNivel_usuario() {
        return nivel_usuario;
    }

    public void setNivel_usuario(int nivel_usuario) {
        this.nivel_usuario = nivel_usuario;
    }

    
    /* CASO SEJA O PRIMEIRO LOGIN É OBRIGATORIO ACEITAR OS TERMOS E DEIXAR REGISTRADO NO BD ANTES DE UTILIZAR O SISTEMA */
    public int aceitarTermos(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("UPDATE usuario SET primeiro_acesso = 1 WHERE idUsuario = "+this.idUsuario);
            stmt.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return 0;
    }
    
    /* VERIFICAR LOGIN, RETORNA 1 CASO ESTEJA OK, 0 CASO USUÁRIO OU SENHA INCORRETO E 2 CASO SEJA O PRIMEIRO ACESSO PARA ACEITAR OS TERMOS DE USO */
    public int Conectar(String senha) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("call login('" + this.email_usuario + "','" + senha + "')");
            rs = stmt.executeQuery();
            if (rs.next()) {
                this.idUsuario = rs.getInt("idUsuario");
                this.nome_usuario = rs.getString("nome_usuario");
                this.nivel_usuario = rs.getInt("nivel_usuario");
                this.data_cadastro = rs.getDate("data_cadastro");
                if(rs.getInt("primeiro_acesso") == 0){
                    return 2;
                }else
                    return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return 0;
    }
    
    /* CADASTRA USUÁRIO ATRAVÉS DA PROCEDURE cadUsuario */
    public void Cadastrar() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("call cadUsuario('" + this.nome_usuario + "','" + this.email_usuario + "','" + this.senha_usuario + "',1)");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

}
