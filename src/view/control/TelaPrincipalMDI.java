package view.control;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.TelaCadastroCliente;
import view.TelaCadastroProduto;
import view.TelaCadastroUsuario;
import view.TelaConsultaVendas;
import view.TelaEfetuarVenda;
import view.TelaLogin;
import view.TelaSobre;
import view.table.ClientesTable;
import view.table.UsuariosTable;
import view.ud.DeleteCliente;
import view.ud.DeleteUsuario;
import view.ud.UpdateUsuario;

public class TelaPrincipalMDI extends javax.swing.JFrame {

    //instanciando janelas
    TelaCadastroUsuario telaCadUser;
    TelaCadastroCliente telaCadCliente;
    TelaCadastroProduto telaCadProd;
    TelaEfetuarVenda telaVenda;
    TelaConsultaVendas telaConsultaVendas;
    TelaSobre telaSobre;
    
    //instanciando janelas de tabela
    UsuariosTable telaUsuariosTable;
    ClientesTable telaClientesTable;
    
    //instanciando janelas de crud
    UpdateUsuario telaUpdateUsuario;
    DeleteUsuario telaDeleteUsuario;
    DeleteCliente telaDeleteCliente;
    
    public TelaPrincipalMDI() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);//definindo tela cheia
        logar();

    }

    private void logar() {//inicia outra classe que é a tela dialog de login e faz uma verificação de usuario
        TelaLogin tlm = new TelaLogin(this, true);
        tlm.setVisible(true);

        if (tlm.getLogin() == null) {
            System.exit(0);
        }
    }
   
    private void relogar() {//inicia outra classe que é a tela dialog de login e faz uma verificação de usuario
        TelaPrincipalMDI tela = new TelaPrincipalMDI();
        TelaLogin tlm = new TelaLogin(tela, true);
        tlm.setVisible(true);

        if (tlm.getLogin() == null) {
            System.exit(0);
        }
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuBarArquivo = new javax.swing.JMenu();
        menuTrocarUsuario = new javax.swing.JMenuItem();
        menuBarUsuarios = new javax.swing.JMenu();
        menuCadastrarUser = new javax.swing.JMenuItem();
        menuAlterarUser = new javax.swing.JMenuItem();
        menuExcluirUser = new javax.swing.JMenuItem();
        menuConsultarUser = new javax.swing.JMenuItem();
        menuBarClientes = new javax.swing.JMenu();
        menuCadastrarCliente = new javax.swing.JMenuItem();
        menuExcluiCliente = new javax.swing.JMenuItem();
        menuConsultarCliente = new javax.swing.JMenuItem();
        menuBarProdutos = new javax.swing.JMenu();
        menuGereciarProd = new javax.swing.JMenuItem();
        menuBarVenda = new javax.swing.JMenu();
        menuEfetuarVenda = new javax.swing.JMenuItem();
        menuConsultaVenda = new javax.swing.JMenuItem();
        menuBarSobre = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-mainmenu.png"))); // NOI18N

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        menuBarArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page.png"))); // NOI18N
        menuBarArquivo.setText("Arquivo");

        menuTrocarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/door_out.png"))); // NOI18N
        menuTrocarUsuario.setText("Trocar Usuário");
        menuTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTrocarUsuarioActionPerformed(evt);
            }
        });
        menuBarArquivo.add(menuTrocarUsuario);

        jMenuBar1.add(menuBarArquivo);

        menuBarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        menuBarUsuarios.setText("Usuários");

        menuCadastrarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_add.png"))); // NOI18N
        menuCadastrarUser.setText("Cadastrar");
        menuCadastrarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarUserActionPerformed(evt);
            }
        });
        menuBarUsuarios.add(menuCadastrarUser);

        menuAlterarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_edit.png"))); // NOI18N
        menuAlterarUser.setText("Alterar");
        menuAlterarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarUserActionPerformed(evt);
            }
        });
        menuBarUsuarios.add(menuAlterarUser);

        menuExcluirUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_delete.png"))); // NOI18N
        menuExcluirUser.setText("Excluir");
        menuExcluirUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirUserActionPerformed(evt);
            }
        });
        menuBarUsuarios.add(menuExcluirUser);

        menuConsultarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
        menuConsultarUser.setText("Consultar");
        menuConsultarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarUserActionPerformed(evt);
            }
        });
        menuBarUsuarios.add(menuConsultarUser);

        jMenuBar1.add(menuBarUsuarios);

        menuBarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group.png"))); // NOI18N
        menuBarClientes.setText("Clientes");

        menuCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group_add.png"))); // NOI18N
        menuCadastrarCliente.setText("Cadastrar");
        menuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarClienteActionPerformed(evt);
            }
        });
        menuBarClientes.add(menuCadastrarCliente);

        menuExcluiCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group_delete.png"))); // NOI18N
        menuExcluiCliente.setText("Excluir");
        menuExcluiCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluiClienteActionPerformed(evt);
            }
        });
        menuBarClientes.add(menuExcluiCliente);

        menuConsultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
        menuConsultarCliente.setText("Consultar");
        menuConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarClienteActionPerformed(evt);
            }
        });
        menuBarClientes.add(menuConsultarCliente);

        jMenuBar1.add(menuBarClientes);

        menuBarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/caixa.png"))); // NOI18N
        menuBarProdutos.setText("Produtos");

        menuGereciarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wrench_orange.png"))); // NOI18N
        menuGereciarProd.setText("Gerenciar");
        menuGereciarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGereciarProdActionPerformed(evt);
            }
        });
        menuBarProdutos.add(menuGereciarProd);

        jMenuBar1.add(menuBarProdutos);

        menuBarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/supermercado.png"))); // NOI18N
        menuBarVenda.setText("Venda");

        menuEfetuarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bolsa-de-compras.png"))); // NOI18N
        menuEfetuarVenda.setText("Efetuar");
        menuEfetuarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEfetuarVendaActionPerformed(evt);
            }
        });
        menuBarVenda.add(menuEfetuarVenda);

        menuConsultaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
        menuConsultaVenda.setText("Consultar");
        menuConsultaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaVendaActionPerformed(evt);
            }
        });
        menuBarVenda.add(menuConsultaVenda);

        jMenuBar1.add(menuBarVenda);

        menuBarSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information.png"))); // NOI18N
        menuBarSobre.setText("Sobre");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
        jMenuItem1.setText("Desenvolvedores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuBarSobre.add(jMenuItem1);

        jMenuBar1.add(menuBarSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTrocarUsuarioActionPerformed

        logar();
        
    }//GEN-LAST:event_menuTrocarUsuarioActionPerformed

    private void menuAlterarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarUserActionPerformed
        try {
            telaUpdateUsuario = new UpdateUsuario();
            jDesktopPane1.add(telaUpdateUsuario);
            telaUpdateUsuario.setVisible(true);
            
        } catch (Exception e) {
            System.err.println("Erro: "+ e);
        }
    }//GEN-LAST:event_menuAlterarUserActionPerformed

    private void menuCadastrarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarUserActionPerformed
        try {
            telaCadUser = new TelaCadastroUsuario();
            jDesktopPane1.add(telaCadUser);
            telaCadUser.setVisible(true);
            telaCadUser.setMaximum(true); //definindo ja maximizado a tela
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipalMDI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuCadastrarUserActionPerformed

    private void menuGereciarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGereciarProdActionPerformed
        try {
            telaCadProd = new TelaCadastroProduto();
            jDesktopPane1.add(telaCadProd);
            telaCadProd.setVisible(true);
            telaCadProd.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipalMDI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuGereciarProdActionPerformed

    private void menuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarClienteActionPerformed
        try {
            telaCadCliente = new TelaCadastroCliente();
            jDesktopPane1.add(telaCadCliente);
            telaCadCliente.setVisible(true);
            telaCadCliente.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipalMDI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuCadastrarClienteActionPerformed

    private void menuConsultarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarUserActionPerformed
        try {
            telaUsuariosTable = new UsuariosTable();
            jDesktopPane1.add(telaUsuariosTable);
            telaUsuariosTable.setVisible(true);
            telaUsuariosTable.setMaximum(true); //definindo ja maximizado a tela
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipalMDI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuConsultarUserActionPerformed

    private void menuConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarClienteActionPerformed
        try {
            telaClientesTable = new ClientesTable();
            jDesktopPane1.add(telaClientesTable);
            telaClientesTable.setVisible(true);
            telaClientesTable.setMaximum(true); //definindo ja maximizado a tela
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipalMDI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuConsultarClienteActionPerformed

    private void menuExcluirUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirUserActionPerformed
        try {
            telaDeleteUsuario = new DeleteUsuario();
            jDesktopPane1.add(telaDeleteUsuario);
            telaDeleteUsuario.setVisible(true);
            
        } catch (Exception e) {
            System.err.println("Erro: "+ e);
        }
    }//GEN-LAST:event_menuExcluirUserActionPerformed

    private void menuExcluiClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluiClienteActionPerformed
        try {
            telaDeleteCliente = new DeleteCliente();
            jDesktopPane1.add(telaDeleteCliente);
            telaDeleteCliente.setVisible(true);
            
        } catch (Exception e) {
            System.err.println("Erro: "+ e);
        }
    }//GEN-LAST:event_menuExcluiClienteActionPerformed

    private void menuEfetuarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEfetuarVendaActionPerformed
       try{
           telaVenda = new TelaEfetuarVenda();
           jDesktopPane1.add(telaVenda);
           telaVenda.setVisible(true);
       }catch (Exception e) {
            System.err.println("Erro: "+ e);
        }
    }//GEN-LAST:event_menuEfetuarVendaActionPerformed

    private void menuConsultaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaVendaActionPerformed
        try {
            telaConsultaVendas = new TelaConsultaVendas();
            jDesktopPane1.add(telaConsultaVendas);
            telaConsultaVendas.setVisible(true);
            telaConsultaVendas.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipalMDI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_menuConsultaVendaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            telaSobre = new TelaSobre();
            jDesktopPane1.add(telaSobre);
            telaSobre.setVisible(true);
            telaSobre.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipalMDI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void inicializa() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipalMDI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem menuAlterarUser;
    private javax.swing.JMenu menuBarArquivo;
    private javax.swing.JMenu menuBarClientes;
    private javax.swing.JMenu menuBarProdutos;
    private javax.swing.JMenu menuBarSobre;
    private javax.swing.JMenu menuBarUsuarios;
    private javax.swing.JMenu menuBarVenda;
    private javax.swing.JMenuItem menuCadastrarCliente;
    private javax.swing.JMenuItem menuCadastrarUser;
    private javax.swing.JMenuItem menuConsultaVenda;
    private javax.swing.JMenuItem menuConsultarCliente;
    private javax.swing.JMenuItem menuConsultarUser;
    private javax.swing.JMenuItem menuEfetuarVenda;
    private javax.swing.JMenuItem menuExcluiCliente;
    private javax.swing.JMenuItem menuExcluirUser;
    private javax.swing.JMenuItem menuGereciarProd;
    private javax.swing.JMenuItem menuTrocarUsuario;
    // End of variables declaration//GEN-END:variables
}
