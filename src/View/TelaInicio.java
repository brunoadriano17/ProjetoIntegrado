/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Alarme;
import Model.Planta;
import Model.Plantio;
import Model.TableAlarme;
import Model.TableMinhasMudas;
import Model.TableModel;
import Model.Usuario;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author cg3002624
 */
public class TelaInicio extends javax.swing.JFrame {

    Usuario u;
    private TableModel tm = new TableModel();
    private TableMinhasMudas tmm = new TableMinhasMudas();
    private TableAlarme ta = new TableAlarme();

    public JTable getTabelaAlarmes() {
        return tabelaAlarmes;
    }

    public void setTabelaAlarmes(JTable tabelaAlarmes) {
        this.tabelaAlarmes = tabelaAlarmes;
    }

    public TableMinhasMudas getTmm() {
        return tmm;
    }

    public void setTmm(TableMinhasMudas tmm) {
        this.tmm = tmm;
    }

    public TableModel getTm() {
        return tm;
    }

    public void setTm(TableModel tm) {
        this.tm = tm;
    }

    /**
     * Creates new form TelaInicio
     */
    public TelaInicio(Usuario u) {
        initComponents();
        this.u = u;
        tabbedPanel.setFont(new Font("Arial", Font.PLAIN, 15));
        labelNome.setText(u.getNome_usuario());
        labelEmail.setText("<html><center>Email: " + u.getEmail_usuario() + "<br>Usuário desde: " + this.u.getData_cadastro() + "<br>Localização: Caraguatatuba - SP</html>");

        /* TABELA MUDAS */
        tabelaMudas.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        tabelaMudas.setModel(tm);
        tabelaMudas.setShowVerticalLines(false);
        tm.preencherTabela();

        /* TABELA MINHAS MUDAS */
        tabelaMinhasMudas.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        tabelaMinhasMudas.setModel(tmm);
        tabelaMinhasMudas.setShowVerticalLines(false);
        tmm.preencherTabela(this.u.getIdUsuario());

        /* TABELA ALARMES */
        tabelaAlarmes.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        tabelaAlarmes.setModel(ta);
        tabelaAlarmes.setShowVerticalLines(false);
        ta.preencherTabela(this.u.getIdUsuario());

        /* FOTO PERFIL */
        ImageIcon img = new ImageIcon("perfil/perfil.png");
        img.setImage(img.getImage().getScaledInstance(150, 130, 100));
        labelFoto.setIcon(img);

        /* PLANTA */
        ImageIcon img2 = new ImageIcon("imgs/logo.png");
        img2.setImage(img2.getImage().getScaledInstance(320, 320, 100));
        imagemPlanta.setIcon(img2);
        ImageIcon img3 = new ImageIcon("imgs/logo.png");
        img3.setImage(img3.getImage().getScaledInstance(320, 320, 100));
        imagemMinhasMudas.setIcon(img3);

        /* ALARME */
        ImageIcon img4 = new ImageIcon("imgs/despertador.png");
        img4.setImage(img4.getImage().getScaledInstance(320, 320, 100));
        imagemAlarmes.setIcon(img4);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        panelDireita = new javax.swing.JPanel();
        tabbedPanel = new javax.swing.JTabbedPane();
        panelMudas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMudas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnInformacoes = new javax.swing.JButton();
        btnAdicionarMuda = new javax.swing.JButton();
        imagemPlanta = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        panelMinhasMudas = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        tabelaMinhasMudas = new javax.swing.JTable();
        panelSuperior = new javax.swing.JPanel();
        panelInferior = new javax.swing.JPanel();
        panelMinhasMudasDireita = new javax.swing.JPanel();
        imagemMinhasMudas = new javax.swing.JLabel();
        btnInformacoes_dois = new javax.swing.JButton();
        btnRemoverMuda = new javax.swing.JButton();
        btnRemoverMuda2 = new javax.swing.JButton();
        panelEsquerdaMinhasMudas = new javax.swing.JPanel();
        panelMinhasMudas1 = new javax.swing.JPanel();
        scrollPane1 = new javax.swing.JScrollPane();
        tabelaAlarmes = new javax.swing.JTable();
        panelSuperior1 = new javax.swing.JPanel();
        panelInferior1 = new javax.swing.JPanel();
        panelMinhasMudasDireita1 = new javax.swing.JPanel();
        imagemAlarmes = new javax.swing.JLabel();
        btnRemoverMuda1 = new javax.swing.JButton();
        panelEsquerdaMinhasMudas1 = new javax.swing.JPanel();
        panelEsquerda = new javax.swing.JPanel();
        logoInicio = new javax.swing.JLabel();
        labelFoto = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ever Green");
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout());

        panelDireita.setLayout(new java.awt.BorderLayout());

        tabbedPanel.setBackground(new java.awt.Color(255, 255, 255));

        panelMudas.setLayout(new java.awt.BorderLayout());

        tabelaMudas.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tabelaMudas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaMudas.setRowHeight(30);
        tabelaMudas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMudasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaMudas);

        panelMudas.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(532, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 924, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelMudas.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(532, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 924, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelMudas.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(340, 155));
        jPanel3.setLayout(null);

        btnInformacoes.setText("Informações");
        btnInformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacoesActionPerformed(evt);
            }
        });
        jPanel3.add(btnInformacoes);
        btnInformacoes.setBounds(40, 330, 130, 23);

        btnAdicionarMuda.setText("Adicionar Muda");
        btnAdicionarMuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarMudaActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdicionarMuda);
        btnAdicionarMuda.setBounds(180, 330, 130, 23);
        jPanel3.add(imagemPlanta);
        imagemPlanta.setBounds(10, 0, 320, 320);

        panelMudas.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(20, 155));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        panelMudas.add(jPanel4, java.awt.BorderLayout.LINE_START);

        tabbedPanel.addTab("Mudas", panelMudas);

        panelMinhasMudas.setLayout(new java.awt.BorderLayout());

        tabelaMinhasMudas.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        tabelaMinhasMudas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaMinhasMudas.setRowHeight(30);
        scrollPane.setViewportView(tabelaMinhasMudas);

        panelMinhasMudas.add(scrollPane, java.awt.BorderLayout.CENTER);

        panelSuperior.setBackground(new java.awt.Color(255, 255, 255));
        panelSuperior.setPreferredSize(new java.awt.Dimension(540, 20));

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 924, Short.MAX_VALUE)
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelMinhasMudas.add(panelSuperior, java.awt.BorderLayout.PAGE_START);

        panelInferior.setBackground(new java.awt.Color(255, 255, 255));
        panelInferior.setPreferredSize(new java.awt.Dimension(540, 20));

        javax.swing.GroupLayout panelInferiorLayout = new javax.swing.GroupLayout(panelInferior);
        panelInferior.setLayout(panelInferiorLayout);
        panelInferiorLayout.setHorizontalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 924, Short.MAX_VALUE)
        );
        panelInferiorLayout.setVerticalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelMinhasMudas.add(panelInferior, java.awt.BorderLayout.PAGE_END);

        panelMinhasMudasDireita.setBackground(new java.awt.Color(255, 255, 255));
        panelMinhasMudasDireita.setPreferredSize(new java.awt.Dimension(340, 155));

        btnInformacoes_dois.setText("Informações");
        btnInformacoes_dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacoes_doisActionPerformed(evt);
            }
        });

        btnRemoverMuda.setText("Remover Muda");
        btnRemoverMuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverMudaActionPerformed(evt);
            }
        });

        btnRemoverMuda2.setText("Adicionar Alarme");
        btnRemoverMuda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverMuda2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMinhasMudasDireitaLayout = new javax.swing.GroupLayout(panelMinhasMudasDireita);
        panelMinhasMudasDireita.setLayout(panelMinhasMudasDireitaLayout);
        panelMinhasMudasDireitaLayout.setHorizontalGroup(
            panelMinhasMudasDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinhasMudasDireitaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMinhasMudasDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelMinhasMudasDireitaLayout.createSequentialGroup()
                        .addComponent(btnInformacoes_dois)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoverMuda2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemoverMuda))
                    .addComponent(imagemMinhasMudas, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMinhasMudasDireitaLayout.setVerticalGroup(
            panelMinhasMudasDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinhasMudasDireitaLayout.createSequentialGroup()
                .addComponent(imagemMinhasMudas, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMinhasMudasDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInformacoes_dois)
                    .addComponent(btnRemoverMuda)
                    .addComponent(btnRemoverMuda2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMinhasMudas.add(panelMinhasMudasDireita, java.awt.BorderLayout.LINE_END);

        panelEsquerdaMinhasMudas.setBackground(new java.awt.Color(255, 255, 255));
        panelEsquerdaMinhasMudas.setPreferredSize(new java.awt.Dimension(20, 155));

        javax.swing.GroupLayout panelEsquerdaMinhasMudasLayout = new javax.swing.GroupLayout(panelEsquerdaMinhasMudas);
        panelEsquerdaMinhasMudas.setLayout(panelEsquerdaMinhasMudasLayout);
        panelEsquerdaMinhasMudasLayout.setHorizontalGroup(
            panelEsquerdaMinhasMudasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelEsquerdaMinhasMudasLayout.setVerticalGroup(
            panelEsquerdaMinhasMudasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        panelMinhasMudas.add(panelEsquerdaMinhasMudas, java.awt.BorderLayout.LINE_START);

        tabbedPanel.addTab("Minhas Mudas", panelMinhasMudas);

        panelMinhasMudas1.setLayout(new java.awt.BorderLayout());

        tabelaAlarmes.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        tabelaAlarmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaAlarmes.setRowHeight(30);
        scrollPane1.setViewportView(tabelaAlarmes);

        panelMinhasMudas1.add(scrollPane1, java.awt.BorderLayout.CENTER);

        panelSuperior1.setBackground(new java.awt.Color(255, 255, 255));
        panelSuperior1.setPreferredSize(new java.awt.Dimension(540, 20));

        javax.swing.GroupLayout panelSuperior1Layout = new javax.swing.GroupLayout(panelSuperior1);
        panelSuperior1.setLayout(panelSuperior1Layout);
        panelSuperior1Layout.setHorizontalGroup(
            panelSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 924, Short.MAX_VALUE)
        );
        panelSuperior1Layout.setVerticalGroup(
            panelSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelMinhasMudas1.add(panelSuperior1, java.awt.BorderLayout.PAGE_START);

        panelInferior1.setBackground(new java.awt.Color(255, 255, 255));
        panelInferior1.setPreferredSize(new java.awt.Dimension(540, 20));

        javax.swing.GroupLayout panelInferior1Layout = new javax.swing.GroupLayout(panelInferior1);
        panelInferior1.setLayout(panelInferior1Layout);
        panelInferior1Layout.setHorizontalGroup(
            panelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 924, Short.MAX_VALUE)
        );
        panelInferior1Layout.setVerticalGroup(
            panelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelMinhasMudas1.add(panelInferior1, java.awt.BorderLayout.PAGE_END);

        panelMinhasMudasDireita1.setBackground(new java.awt.Color(255, 255, 255));
        panelMinhasMudasDireita1.setPreferredSize(new java.awt.Dimension(340, 155));

        btnRemoverMuda1.setText("Remover Alarme");
        btnRemoverMuda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverMuda1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMinhasMudasDireita1Layout = new javax.swing.GroupLayout(panelMinhasMudasDireita1);
        panelMinhasMudasDireita1.setLayout(panelMinhasMudasDireita1Layout);
        panelMinhasMudasDireita1Layout.setHorizontalGroup(
            panelMinhasMudasDireita1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinhasMudasDireita1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMinhasMudasDireita1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinhasMudasDireita1Layout.createSequentialGroup()
                        .addComponent(imagemAlarmes, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinhasMudasDireita1Layout.createSequentialGroup()
                        .addComponent(btnRemoverMuda1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))))
        );
        panelMinhasMudasDireita1Layout.setVerticalGroup(
            panelMinhasMudasDireita1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinhasMudasDireita1Layout.createSequentialGroup()
                .addComponent(imagemAlarmes, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoverMuda1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMinhasMudas1.add(panelMinhasMudasDireita1, java.awt.BorderLayout.LINE_END);

        panelEsquerdaMinhasMudas1.setBackground(new java.awt.Color(255, 255, 255));
        panelEsquerdaMinhasMudas1.setPreferredSize(new java.awt.Dimension(20, 155));

        javax.swing.GroupLayout panelEsquerdaMinhasMudas1Layout = new javax.swing.GroupLayout(panelEsquerdaMinhasMudas1);
        panelEsquerdaMinhasMudas1.setLayout(panelEsquerdaMinhasMudas1Layout);
        panelEsquerdaMinhasMudas1Layout.setHorizontalGroup(
            panelEsquerdaMinhasMudas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelEsquerdaMinhasMudas1Layout.setVerticalGroup(
            panelEsquerdaMinhasMudas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        panelMinhasMudas1.add(panelEsquerdaMinhasMudas1, java.awt.BorderLayout.LINE_START);

        tabbedPanel.addTab("Alarmes", panelMinhasMudas1);

        panelDireita.add(tabbedPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelDireita, java.awt.BorderLayout.CENTER);

        panelEsquerda.setBackground(new java.awt.Color(255, 255, 255));
        panelEsquerda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelEsquerda.setPreferredSize(new java.awt.Dimension(270, 349));

        logoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo_inicio.png"))); // NOI18N

        labelNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labelEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton3.setText("Modificar Perfil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEsquerdaLayout = new javax.swing.GroupLayout(panelEsquerda);
        panelEsquerda.setLayout(panelEsquerdaLayout);
        panelEsquerdaLayout.setHorizontalGroup(
            panelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEsquerdaLayout.createSequentialGroup()
                .addGroup(panelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelEsquerdaLayout.createSequentialGroup()
                        .addGroup(panelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEsquerdaLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(panelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(logoInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelEsquerdaLayout.createSequentialGroup()
                                        .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28))))
                            .addGroup(panelEsquerdaLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jButton3)))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelEsquerdaLayout.setVerticalGroup(
            panelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEsquerdaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(logoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(114, 114, 114))
        );

        getContentPane().add(panelEsquerda, java.awt.BorderLayout.LINE_START);

        setSize(new java.awt.Dimension(1215, 466));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaMudasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMudasMouseClicked
        Planta p = (Planta) tabelaMudas.getValueAt(tabelaMudas.getSelectedRow(), -1);
        ImageIcon img = new ImageIcon(p.getImagem_planta());
        Border borda = new LineBorder(new Color(181, 177, 177), 2);
        imagemPlanta.setBorder(borda);
        img.setImage(img.getImage().getScaledInstance(320, 320, 100));
        imagemPlanta.setIcon(img);

    }//GEN-LAST:event_tabelaMudasMouseClicked

    private void btnInformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacoesActionPerformed
        try {
            TelaPlanta tp = new TelaPlanta((Planta) tabelaMudas.getValueAt(tabelaMudas.getSelectedRow(), -1));
            tp.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma muda");
        }
    }//GEN-LAST:event_btnInformacoesActionPerformed

    private void btnAdicionarMudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarMudaActionPerformed
        try {
            Planta p = (Planta) tabelaMudas.getValueAt(tabelaMudas.getSelectedRow(), -1);
            Plantio pl = new Plantio();
            pl.adicionarMuda(p.getIdPlanta(), this.u.getIdUsuario(), JOptionPane.showInputDialog("Observação:"));
            tmm.preencherTabela(this.u.getIdUsuario());
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma muda");
        }
    }//GEN-LAST:event_btnAdicionarMudaActionPerformed

    private void btnInformacoes_doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacoes_doisActionPerformed
        try {
            TelaPlanta tp = new TelaPlanta((Planta) tabelaMinhasMudas.getValueAt(tabelaMinhasMudas.getSelectedRow(), -1));
            tp.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma muda");
        }
    }//GEN-LAST:event_btnInformacoes_doisActionPerformed

    private void btnRemoverMudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverMudaActionPerformed
        try {
            Plantio p = (Plantio) tabelaMinhasMudas.getValueAt(tabelaMinhasMudas.getSelectedRow(), -2);
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente remover?") == 0) {
                p.remover();
                tmm.preencherTabela(this.u.getIdUsuario());
                ta.preencherTabela(this.u.getIdUsuario());
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma muda");
        }

    }//GEN-LAST:event_btnRemoverMudaActionPerformed

    private void btnRemoverMuda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverMuda1ActionPerformed
        try {
            Alarme a = (Alarme) tabelaAlarmes.getValueAt(tabelaAlarmes.getSelectedRow(), -1);
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente remover?") == 0) {
                a.ExcluirAlarme();
                ta.preencherTabela(this.u.getIdUsuario());
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione um alarme");
        }
    }//GEN-LAST:event_btnRemoverMuda1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TelaPerfil tp = new TelaPerfil(this.u);
        tp.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnRemoverMuda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverMuda2ActionPerformed
        String horario = JOptionPane.showInputDialog("Informe o horario no modelo '24:00':");
        String obs = JOptionPane.showInputDialog("Anotação:");
        Alarme a = new Alarme();
        a.setHorario_alarme(horario);
        a.setObservacao(obs);
        Plantio p = (Plantio) tabelaMinhasMudas.getValueAt(tabelaMinhasMudas.getSelectedRow(), -2);
        a.setPlantio(p);
        a.AdicionarAlarme();
        ta.preencherTabela(this.u.getIdUsuario());
    }//GEN-LAST:event_btnRemoverMuda2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Usuario u = new Usuario();
                new TelaInicio(u).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarMuda;
    private javax.swing.JButton btnInformacoes;
    private javax.swing.JButton btnInformacoes_dois;
    private javax.swing.JButton btnRemoverMuda;
    private javax.swing.JButton btnRemoverMuda1;
    private javax.swing.JButton btnRemoverMuda2;
    private javax.swing.JLabel imagemAlarmes;
    private javax.swing.JLabel imagemMinhasMudas;
    private javax.swing.JLabel imagemPlanta;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel logoInicio;
    private javax.swing.JPanel panelDireita;
    private javax.swing.JPanel panelEsquerda;
    private javax.swing.JPanel panelEsquerdaMinhasMudas;
    private javax.swing.JPanel panelEsquerdaMinhasMudas1;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelInferior1;
    private javax.swing.JPanel panelMinhasMudas;
    private javax.swing.JPanel panelMinhasMudas1;
    private javax.swing.JPanel panelMinhasMudasDireita;
    private javax.swing.JPanel panelMinhasMudasDireita1;
    private javax.swing.JPanel panelMudas;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JPanel panelSuperior1;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JTabbedPane tabbedPanel;
    private javax.swing.JTable tabelaAlarmes;
    private javax.swing.JTable tabelaMinhasMudas;
    private javax.swing.JTable tabelaMudas;
    // End of variables declaration//GEN-END:variables
}
