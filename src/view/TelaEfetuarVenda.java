/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modal.bean.Cliente;
import modal.bean.Produto;
import modal.dao.ClienteDAO;
import modal.dao.ProdutoDAO;
import javax.swing.table.DefaultTableModel;
import modal.bean.Venda;
import modal.dao.VendaDAO;

public class TelaEfetuarVenda extends javax.swing.JInternalFrame {

    public TelaEfetuarVenda() {
        initComponents();

        setDataAtual();

        //desativando foco dos campos de texto
        txtNome.setFocusable(false);
        txtNasc.setFocusable(false);
        txtEstado.setFocusable(false);
        txtCPF.setFocusable(false);
        txtDescricao.setFocusable(false);
        txtPreco.setFocusable(false);

        //desatibilitando edição de texto nos campos
        txtNome.setEditable(false);
        txtNasc.setEditable(false);
        txtEstado.setEditable(false);
        txtCPF.setEditable(false);
        txtDescricao.setEditable(false);
        txtPreco.setEditable(false);

        //desativando botões
        btnAtualizarItem.setEnabled(false);
        btnExcluirProduto.setEnabled(false);
        btnInserirProduto.setEnabled(false);
        btnFinalizaVenda.setEnabled(false);

        //desativando o foco na tabela
        tableProdutosCad.setFocusable(false);

        //desativando os campos de texto
        statusCamposCliente(false);
        statusCamposProduto(false);
    }

    private void setDataAtual() { //metodo para definir a data atual na label

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dateobj = new Date();
        lblDataAtual.setText(df.format(dateobj));
    }

    public boolean acharUmCliente(String valor) {

        ClienteDAO uDao = new ClienteDAO();
        Cliente c = uDao.umCliente(valor);
        if (c.getId() != 0) {
            txtNome.setText(c.getNome());
            txtNasc.setText(c.getDataNasc());
            txtEstado.setText(c.getEstado());
            txtCPF.setText(c.getCpf());
            return true;
        }
        return false;
    }

    public boolean acharUmProduto(String id) {

        ProdutoDAO pDao = new ProdutoDAO();
        Produto p = pDao.umProduto(id);
        if (p.getId() != 0) {
            txtDescricao.setText(p.getDescricao());
            txtPreco.setText("" + p.getPreco());
            return true;
        }
        return false;
    }

    public boolean acharPrecoOriginal(String id) {

        ProdutoDAO pDao = new ProdutoDAO();
        Produto p = pDao.umProduto(id);
        if (p.getId() != 0) {
            txtPreco.setText("" + p.getPreco());
            return true;
        }
        return false;
    }

    private void statusCamposCliente(boolean b) {//false para desativar - true para ativar
        txtNome.setEnabled(b);
        txtNasc.setEnabled(b);
        txtEstado.setEnabled(b);
        txtCPF.setEnabled(b);

        txtBuscaProdutoID.setEnabled(b);
        txtQuantidadeDesejada.setEnabled(b);
        statusCamposProduto(!b);
    }

    private void statusCamposProduto(boolean b) {
        txtDescricao.setEnabled(b);
        txtPreco.setEnabled(b);
    }

    void statusPainelCliente(boolean b) {
        txtBuscaID.setEnabled(b);
        txtNome.setEnabled(b);
        txtNasc.setEnabled(b);
        txtEstado.setEnabled(b);
        txtCPF.setEnabled(b);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtNasc = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtBuscaID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblDataAtual = new javax.swing.JLabel();
        panelCadProd = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnInserirProduto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnAtualizarItem = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtBuscaProdutoID = new javax.swing.JTextField();
        txtQuantidadeDesejada = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutosCad = new javax.swing.JTable();
        btnFinalizaVenda = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Efetuar Venda");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Efetuar Venda"));

        panelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLabel1.setText("ID Cliente:");

        jLabel2.setText("Busca:");

        jLabel3.setText("Estado:");

        jLabel4.setText("Nome:");

        jLabel5.setText("CPF:");

        jLabel6.setText("Data de Nascimento");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscaID, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jLabel7.setText("Data:");

        lblDataAtual.setText("00/00/0000");

        panelCadProd.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Produto"));

        jLabel18.setText("Descrição:");

        jLabel19.setText("Quantidade:");

        btnInserirProduto.setText("Inserir Item");
        btnInserirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirProdutoActionPerformed(evt);
            }
        });

        jLabel8.setText("Preço / uni.: R$");

        btnAtualizarItem.setText("Atualizar Item");
        btnAtualizarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarItemActionPerformed(evt);
            }
        });

        btnExcluirProduto.setText("Excluir Item");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        jLabel9.setText("Busca: ID Produto:");

        txtBuscaProdutoID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaProdutoIDKeyReleased(evt);
            }
        });

        txtQuantidadeDesejada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantidadeDesejadaKeyReleased(evt);
            }
        });

        tableProdutosCad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProdutosCad.setColumnSelectionAllowed(true);
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
        jScrollPane1.setViewportView(tableProdutosCad);
        tableProdutosCad.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tableProdutosCad.getColumnModel().getColumnCount() > 0) {
            tableProdutosCad.getColumnModel().getColumn(0).setResizable(false);
            tableProdutosCad.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableProdutosCad.getColumnModel().getColumn(2).setResizable(false);
            tableProdutosCad.getColumnModel().getColumn(2).setPreferredWidth(0);
        }

        javax.swing.GroupLayout panelCadProdLayout = new javax.swing.GroupLayout(panelCadProd);
        panelCadProd.setLayout(panelCadProdLayout);
        panelCadProdLayout.setHorizontalGroup(
            panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadProdLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(panelCadProdLayout.createSequentialGroup()
                        .addGroup(panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCadProdLayout.createSequentialGroup()
                                .addComponent(btnAtualizarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnInserirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCadProdLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscaProdutoID, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantidadeDesejada, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(202, 202, 202)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelCadProdLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        panelCadProdLayout.setVerticalGroup(
            panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel9)
                    .addComponent(txtBuscaProdutoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidadeDesejada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel18)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserirProduto)
                    .addComponent(btnExcluirProduto)
                    .addComponent(btnAtualizarItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnFinalizaVenda.setText("Finalizar Venda");
        btnFinalizaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizaVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDataAtual))
                    .addComponent(panelCadProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinalizaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblDataAtual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCadProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFinalizaVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Double valorProdMultQtd(String preco, String qtd) {
        double valorTotal = Double.parseDouble(preco);
        int qtDesejada = Integer.parseInt(qtd);
        Double resultado = valorTotal * qtDesejada;
        return resultado;
    }
    private void btnInserirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirProdutoActionPerformed

        if (!txtBuscaProdutoID.getText().equals("") && !txtQuantidadeDesejada.getText().equals("")) {
            DefaultTableModel dtmProdutos = (DefaultTableModel) tableProdutosCad.getModel();
            Double valorTotal = valorProdMultQtd(txtPreco.getText(), txtQuantidadeDesejada.getText());
            Object[] dados = {txtBuscaProdutoID.getText(), txtDescricao.getText(), txtQuantidadeDesejada.getText(), valorTotal};
            dtmProdutos.addRow(dados);

            btnFinalizaVenda.setEnabled(true);

            statusCamposProduto(false);
            txtBuscaProdutoID.setText("");
            txtDescricao.setText("");
            txtQuantidadeDesejada.setText("");
            txtPreco.setText("");

            btnExcluirProduto.setEnabled(true);

            System.out.println("Dentro do btn INSERIR: " + tableProdutosCad.getRowCount());
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos campos.");
        }
    }//GEN-LAST:event_btnInserirProdutoActionPerformed

    private void btnAtualizarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarItemActionPerformed

        if (tableProdutosCad.getSelectedRow() != -1) {

            tableProdutosCad.setValueAt(txtBuscaProdutoID.getText(), tableProdutosCad.getSelectedRow(), 0);
            tableProdutosCad.setValueAt(txtDescricao.getText(), tableProdutosCad.getSelectedRow(), 1);
            tableProdutosCad.setValueAt(txtQuantidadeDesejada.getText(), tableProdutosCad.getSelectedRow(), 2);

            Double valorTotal = valorProdMultQtd(txtPreco.getText(), txtQuantidadeDesejada.getText());
            tableProdutosCad.setValueAt(valorTotal, tableProdutosCad.getSelectedRow(), 3);

            txtBuscaProdutoID.setEnabled(true);
            txtBuscaProdutoID.setText("");
            txtDescricao.setText("");
            txtQuantidadeDesejada.setText("");
            txtPreco.setText("");

            btnAtualizarItem.setEnabled(false);

            tableProdutosCad.clearSelection();
        }

    }//GEN-LAST:event_btnAtualizarItemActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed

        if (tableProdutosCad.getSelectedRow() != -1) {
            DefaultTableModel dtm = (DefaultTableModel) tableProdutosCad.getModel();
            dtm.removeRow(tableProdutosCad.getSelectedRow());

            txtBuscaProdutoID.setEnabled(true);

            txtBuscaProdutoID.setText("");
            txtDescricao.setText("");
            txtQuantidadeDesejada.setText("");
            txtPreco.setText("");

            tableProdutosCad.clearSelection();
            btnInserirProduto.setEnabled(false);
            btnAtualizarItem.setEnabled(false);

            if (tableProdutosCad.getRowCount() == 0) {
                btnFinalizaVenda.setEnabled(false);
            }
        }
        txtBuscaProdutoID.setText("");
        txtDescricao.setText("");
        txtQuantidadeDesejada.setText("");
        txtPreco.setText("");
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private boolean jaEstaNaTabela(String valor) {
        for (int i = 0; i < tableProdutosCad.getRowCount(); i++) {
            if (valor.equals(tableProdutosCad.getValueAt(i, 0))) {
                return true;
            }
        }
        return false;
    }
    private void txtBuscaProdutoIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaProdutoIDKeyReleased
        if (evt.getKeyCode() != KeyEvent.VK_ENTER) {
            if (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != KeyEvent.VK_SPACE) {
                if (txtBuscaProdutoID.getText().matches("[0-9]+")) {
                    if (!jaEstaNaTabela(txtBuscaProdutoID.getText())) {

                        if (acharUmProduto(txtBuscaProdutoID.getText())) {
                            statusCamposProduto(true);

                        } else {
                            statusCamposProduto(false);
                            txtBuscaProdutoID.setText("");
                            txtDescricao.setText("");
                            txtPreco.setText("");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Produto ja inserido no Carrinho de Compra.");
                        statusCamposProduto(false);
                        txtBuscaProdutoID.setText("");
                        txtDescricao.setText("");
                        txtPreco.setText("");
                    }
                } else {
                    statusCamposProduto(false);
                    txtBuscaProdutoID.setText("");
                    txtDescricao.setText("");
                    txtPreco.setText("");
                }

            } else {
                statusCamposProduto(false);
                txtBuscaProdutoID.setText("");
                txtDescricao.setText("");
                txtPreco.setText("");
            }
        }
    }//GEN-LAST:event_txtBuscaProdutoIDKeyReleased
    private void verificandoEdefinindoTexto() { // metodo feito para economizar linhas em alguns blocos
        if (tableProdutosCad.getSelectedColumn() != -1) {

            /*int result = JOptionPane.showConfirmDialog(null, "Confirme para atualizar:",null, JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION) {
                //exemplo
            } */
            //definindo texto com objeto de cada linha
            txtBuscaProdutoID.setText("" + tableProdutosCad.getValueAt(tableProdutosCad.getSelectedRow(), 0));
            txtDescricao.setText("" + tableProdutosCad.getValueAt(tableProdutosCad.getSelectedRow(), 1));
            txtQuantidadeDesejada.setText("" + tableProdutosCad.getValueAt(tableProdutosCad.getSelectedRow(), 2));
            acharPrecoOriginal(txtBuscaProdutoID.getText());

            //desativando botão cadastrar
            btnInserirProduto.setEnabled(false);
            //ativando botão atualizar e excluir
            btnExcluirProduto.setEnabled(true);
            btnAtualizarItem.setEnabled(true);

        }
    }

    private void tableProdutosCadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableProdutosCadKeyReleased
        verificandoEdefinindoTexto();
        txtBuscaProdutoID.setEnabled(false);
    }//GEN-LAST:event_tableProdutosCadKeyReleased

    private void tableProdutosCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutosCadMouseClicked
        verificandoEdefinindoTexto();
        txtBuscaProdutoID.setEnabled(false);
    }//GEN-LAST:event_tableProdutosCadMouseClicked

    public boolean verificaQtdEstoque(String id, String qtdDesejada) {
        int qtd = Integer.parseInt(qtdDesejada);
        ProdutoDAO pDao = new ProdutoDAO();
        Produto p = pDao.umProduto(id);

        return (p.getQtd() - qtd) >= 0;
    }
    private void txtQuantidadeDesejadaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeDesejadaKeyReleased
        if (tableProdutosCad.getSelectedColumn() == -1) {
            if (evt.getKeyCode() != KeyEvent.VK_ENTER) {
                if (txtQuantidadeDesejada.getText().matches("[0-9]+")) {
                    if (verificaQtdEstoque(txtBuscaProdutoID.getText(), txtQuantidadeDesejada.getText())
                            && Integer.parseInt(txtQuantidadeDesejada.getText()) > 0) {
                        btnInserirProduto.setEnabled(true);
                    } else {
                        btnInserirProduto.setEnabled(false);
                    }
                } else if (txtQuantidadeDesejada.getText().equals("")) {
                    btnInserirProduto.setEnabled(false);
                } else {
                    btnInserirProduto.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Insira um valor válido");
                    txtQuantidadeDesejada.setText("");
                }
            }
        }
    }//GEN-LAST:event_txtQuantidadeDesejadaKeyReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        statusCamposProduto(false);

        if (txtBuscaID.getText().matches("[0-9]+")) {
            if (acharUmCliente(txtBuscaID.getText())) {
                // VALIDAÇÕES
                setDataAtual(); //definindo data atual
                statusCamposCliente(true);//ativando os campos de texto
                statusPainelCliente(false);
                btnBuscar.setEnabled(false);
            } else {
                statusCamposCliente(false);
                statusCamposProduto(false);
                txtBuscaID.setText("");
                txtNome.setText("");
                txtNasc.setText("");
                txtEstado.setText("");
                txtCPF.setText("");
            }
        } else {
            statusCamposCliente(false);
            statusCamposProduto(false);
            txtBuscaID.setText("");
            txtNome.setText("");
            txtNasc.setText("");
            txtEstado.setText("");
            txtCPF.setText("");
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private Double valorTotal() {
        double soma = 0.0;

        for (int i = 0; i < tableProdutosCad.getRowCount(); i++) {
            double valorProd = (double) tableProdutosCad.getValueAt(i, 3);
            soma += valorProd;
        }

        return soma;
    }

    private void updateQtsProdutos() {
        Produto p = new Produto();
        ProdutoDAO pdao = new ProdutoDAO();

        String id;
        String qtd;

        for (int i = 0; i < tableProdutosCad.getRowCount(); i++) {
            id = "" + tableProdutosCad.getModel().getValueAt(i, 0);
            qtd = "" + tableProdutosCad.getValueAt(i, 2);
            p.setId(Integer.parseInt(id));

            int qtdInt = Integer.parseInt(qtd);

            for (Produto pDB : pdao.read()) {
                if (p.getId() == pDB.getId()) {
                    p.setQtd(pDB.getQtd() - qtdInt);
                    break;
                }
            }
            pdao.updateQtd(p);
        }

        
    }


    private void btnFinalizaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizaVendaActionPerformed

        int result = JOptionPane.showConfirmDialog(null, "Valor Total: R$" + valorTotal(), null, JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {

            Venda venda = new Venda();
            VendaDAO vDAO = new VendaDAO();

            venda.setIdCliente(Integer.parseInt(txtBuscaID.getText()));
            venda.setDataVenda(lblDataAtual.getText());
            venda.setValorTotal(valorTotal());
            vDAO.create(venda);

            updateQtsProdutos();
            dispose();
        }

    }//GEN-LAST:event_btnFinalizaVendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarItem;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnFinalizaVenda;
    private javax.swing.JButton btnInserirProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDataAtual;
    private javax.swing.JPanel panelCadProd;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JTable tableProdutosCad;
    private javax.swing.JTextField txtBuscaID;
    private javax.swing.JTextField txtBuscaProdutoID;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNasc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidadeDesejada;
    // End of variables declaration//GEN-END:variables
}
