/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modal.bean.Produto;
import modal.dao.ProdutoDAO;


public class TelaCadastroProduto extends javax.swing.JInternalFrame {

    
    public TelaCadastroProduto() {
        initComponents();
        btnAtualizarItem.setEnabled(false);
        btnExcluirProduto.setEnabled(false);

        readJTable();
    }

    public void readJTable() {//metodo que le os dados da tabela e joga dentro da jTable
        DefaultTableModel modelo = (DefaultTableModel) tableProdutosCad.getModel();
        modelo.setNumRows(0);//metodo pra não retornar tabela duplicada

        ProdutoDAO pDao = new ProdutoDAO();

        for (Produto p : pDao.read()) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getDescricao(),
                p.getTipo(),
                p.getQtd(),
                p.getPreco()
            });
        }
    }

    public void findJTable(String desc) {//metodo que le os dados da tabela e joga dentro da jTable
        DefaultTableModel modelo = (DefaultTableModel) tableProdutosCad.getModel();
        modelo.setNumRows(0);//metodo pra não retornar tabela duplicada

        ProdutoDAO pDao = new ProdutoDAO();

        for (Produto p : pDao.find(desc)) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getDescricao(),
                p.getTipo(),
                p.getQtd(),
                p.getPreco()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        panelCadProd = new javax.swing.JPanel();
        txtDescricao = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        btnCadastrarProduto = new javax.swing.JButton();
        txtQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoTipo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAtualizarItem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProdutosCad = new javax.swing.JTable();
        btnExcluirProduto = new javax.swing.JButton();
        txtBusca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro Produto");

        panelCadProd.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Produto"));

        txtDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescricaoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescricaoFocusLost(evt);
            }
        });

        jLabel18.setText("Descrição:");

        jLabel19.setText("Quantidade:");

        txtPreco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoFocusLost(evt);
            }
        });
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        jLabel22.setText("Preço / uni.:");

        btnCadastrarProduto.setText("Cadastrar Item");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });

        txtQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantidadeFocusLost(evt);
            }
        });

        jLabel1.setText("R$");

        txtCodigoTipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoTipoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoTipoFocusLost(evt);
            }
        });

        jLabel2.setText("Código Tipo:");

        btnAtualizarItem.setText("Atualizar Item");
        btnAtualizarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCadProdLayout = new javax.swing.GroupLayout(panelCadProd);
        panelCadProd.setLayout(panelCadProdLayout);
        panelCadProdLayout.setHorizontalGroup(
            panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadProdLayout.createSequentialGroup()
                        .addGroup(panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadProdLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAtualizarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadProdLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCadProdLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(73, 73, 73))
                            .addGroup(panelCadProdLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))))
                    .addGroup(panelCadProdLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelCadProdLayout.setVerticalGroup(
            panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadProdLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCadProdLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(panelCadProdLayout.createSequentialGroup()
                        .addGroup(panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarProduto)
                    .addComponent(btnAtualizarItem))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela Produtos"));

        tableProdutosCad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Código Tipo", "Quantidade", "Preço R$"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProdutosCad.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableProdutosCad.getTableHeader().setReorderingAllowed(false);
        tableProdutosCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdutosCadMouseClicked(evt);
            }
        });
        tableProdutosCad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableProdutosCadKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tableProdutosCad);
        if (tableProdutosCad.getColumnModel().getColumnCount() > 0) {
            tableProdutosCad.getColumnModel().getColumn(0).setResizable(false);
            tableProdutosCad.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableProdutosCad.getColumnModel().getColumn(2).setResizable(false);
            tableProdutosCad.getColumnModel().getColumn(3).setResizable(false);
        }

        btnExcluirProduto.setText("Excluir Item");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });
        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaKeyReleased(evt);
            }
        });

        jLabel3.setText("Buscar por Descrição ou Código Tipo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluirProduto)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCadProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCadProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed

    }//GEN-LAST:event_txtPrecoActionPerformed

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed

        if (!txtDescricao.getText().equals("") && !txtCodigoTipo.getText().equals("") && !txtQuantidade.getText().equals("")
                && !txtPreco.getText().equals("")) {

            Produto p = new Produto();
            ProdutoDAO prodDAO = new ProdutoDAO();

            p.setDescricao(txtDescricao.getText());
            p.setTipo(Integer.parseInt(txtCodigoTipo.getText()));
            p.setQtd(Integer.parseInt(txtQuantidade.getText()));
            p.setPreco(Double.parseDouble(txtPreco.getText()));
            prodDAO.create(p);

            readJTable();
//            DefaultTableModel dtmProdutos = (DefaultTableModel) tableProdutosCad.getModel();
//            Object[] dados = {txtCodigoTipo.getText(),txtDescricao.getText(),txtQuantidade.getText(),txtPreco.getText()};
//            dtmProdutos.addRow(dados);

            txtCodigoTipo.setText("");
            txtDescricao.setText("");
            txtQuantidade.setText("");
            txtPreco.setText("");

            btnExcluirProduto.setEnabled(true);
        }

    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed

        if (tableProdutosCad.getSelectedRow() != -1) {
            Produto p = new Produto();
            ProdutoDAO prodDAO = new ProdutoDAO();

            p.setId((int) tableProdutosCad.getValueAt(tableProdutosCad.getSelectedRow(), 0));//cast int pra transformar object em int
            prodDAO.delete(p);

            readJTable();

            //campos de texto vazio pra n quebrar o bloco de atualização
            txtCodigoTipo.setText("");
            txtDescricao.setText("");
            txtQuantidade.setText("");
            txtPreco.setText("");

            btnCadastrarProduto.setEnabled(true);
            btnAtualizarItem.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void verificandoEdefinindoTexto() { // metodo feito para economizar linhas em alguns blocos
        if (tableProdutosCad.getSelectedColumn() != -1) {

            //definindo texto com objeto de cada linha
            txtDescricao.setText("" + tableProdutosCad.getValueAt(tableProdutosCad.getSelectedRow(), 1));
            txtCodigoTipo.setText("" + tableProdutosCad.getValueAt(tableProdutosCad.getSelectedRow(), 2));
            txtQuantidade.setText("" + tableProdutosCad.getValueAt(tableProdutosCad.getSelectedRow(), 3));
            txtPreco.setText("" + tableProdutosCad.getValueAt(tableProdutosCad.getSelectedRow(), 4));

            //desativando botão cadastrar
            btnCadastrarProduto.setEnabled(false);
            //ativando botão atualizar e excluir
            btnExcluirProduto.setEnabled(true);
            btnAtualizarItem.setEnabled(true);

        }
    }
    private void tableProdutosCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutosCadMouseClicked
        verificandoEdefinindoTexto();
    }//GEN-LAST:event_tableProdutosCadMouseClicked

    private void isVazio() {
        if (txtDescricao.getText().equals("") && txtCodigoTipo.getText().equals("") && txtQuantidade.getText().equals("")
                && txtPreco.getText().equals("")) {

            btnCadastrarProduto.setEnabled(true);
            btnAtualizarItem.setEnabled(false);
        }
    }
    private void txtDescricaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoFocusGained
        isVazio();
    }//GEN-LAST:event_txtDescricaoFocusGained

    private void txtCodigoTipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoTipoFocusGained
        isVazio();
    }//GEN-LAST:event_txtCodigoTipoFocusGained

    private void txtQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeFocusGained
        isVazio();
    }//GEN-LAST:event_txtQuantidadeFocusGained

    private void txtPrecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoFocusGained
        isVazio();
    }//GEN-LAST:event_txtPrecoFocusGained

    private void tableProdutosCadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableProdutosCadKeyReleased
        verificandoEdefinindoTexto();
    }//GEN-LAST:event_tableProdutosCadKeyReleased

    private void isVazioIndividualmente() {
        if (txtDescricao.getText().equals("")) {
            btnCadastrarProduto.setEnabled(true);
            btnAtualizarItem.setEnabled(false);
        }
        if (txtCodigoTipo.getText().equals("")) {
            btnCadastrarProduto.setEnabled(true);
            btnAtualizarItem.setEnabled(false);
        }
        if (txtQuantidade.getText().equals("")) {
            btnCadastrarProduto.setEnabled(true);
            btnAtualizarItem.setEnabled(false);
        }
        if (txtPreco.getText().equals("")) {
            btnCadastrarProduto.setEnabled(true);
            btnAtualizarItem.setEnabled(false);
        }
    }
    private void txtDescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoFocusLost
        isVazioIndividualmente();
    }//GEN-LAST:event_txtDescricaoFocusLost

    private void txtCodigoTipoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoTipoFocusLost
        isVazioIndividualmente();
    }//GEN-LAST:event_txtCodigoTipoFocusLost

    private void txtQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeFocusLost
        isVazioIndividualmente();
    }//GEN-LAST:event_txtQuantidadeFocusLost

    private void txtPrecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoFocusLost
        isVazioIndividualmente();
    }//GEN-LAST:event_txtPrecoFocusLost

    private void btnAtualizarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarItemActionPerformed
        if (tableProdutosCad.getSelectedRow() != -1) {
            Produto p = new Produto();
            ProdutoDAO prodDAO = new ProdutoDAO();

            p.setId((int) tableProdutosCad.getValueAt(tableProdutosCad.getSelectedRow(), 0));//cast int pra transformar object em int
            p.setDescricao(txtDescricao.getText());
            p.setTipo(Integer.parseInt(txtCodigoTipo.getText()));
            p.setQtd(Integer.parseInt(txtQuantidade.getText()));
            p.setPreco(Double.parseDouble(txtPreco.getText()));
            prodDAO.update(p);

            readJTable();

            txtCodigoTipo.setText("");
            txtDescricao.setText("");
            txtQuantidade.setText("");
            txtPreco.setText("");

            btnCadastrarProduto.setEnabled(true);
            btnAtualizarItem.setEnabled(false);
        }
    }//GEN-LAST:event_btnAtualizarItemActionPerformed

    private void txtBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyPressed
        if (!txtBusca.getText().equals("")) {
            findJTable(txtBusca.getText());
        } else {
            readJTable();
        }
    }//GEN-LAST:event_txtBuscaKeyPressed

    private void txtBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyReleased
        if (!txtBusca.getText().equals("")) {
            findJTable(txtBusca.getText());
        } else {
            readJTable();
        }
    }//GEN-LAST:event_txtBuscaKeyReleased

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarItem;
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelCadProd;
    private javax.swing.JTable tableProdutosCad;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtCodigoTipo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
