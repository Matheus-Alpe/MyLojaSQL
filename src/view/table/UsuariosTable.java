/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.table;

import javax.swing.table.DefaultTableModel;
import modal.bean.Usuario;
import modal.dao.UsuarioDAO;

/**
 *
 * @author mathe
 */
public class UsuariosTable extends javax.swing.JInternalFrame {

    /**
     * Creates new form ClienteTable
     */
    public UsuariosTable() {
        initComponents();
        
        readJTable();
    }

    public void readJTable() {//metodo que le os dados da tabela e joga dentro da jTable
        DefaultTableModel modelo = (DefaultTableModel) tableUsuariosCad.getModel();
        modelo.setNumRows(0);//metodo pra não retornar tabela duplicada

        UsuarioDAO uDao = new UsuarioDAO();

        for (Usuario u : uDao.read()) {
            modelo.addRow(new Object[]{
                u.getId(),
                u.getNome(),
                u.getDataNasc(),
                u.getFuncao(),
                u.getSexo(),
                u.getEmail(),
                u.getTelefone(),
                u.getUsuario()
            });
        }
    }
    
    public void findJTable(String desc) {//metodo que le os dados da tabela e joga dentro da jTable
        DefaultTableModel modelo = (DefaultTableModel) tableUsuariosCad.getModel();
        modelo.setNumRows(0);//metodo pra não retornar tabela duplicada

        UsuarioDAO uDao = new UsuarioDAO();

        for (Usuario u : uDao.find(desc)) {
            modelo.addRow(new Object[]{
                u.getId(),
                u.getNome(),
                u.getDataNasc(),
                u.getFuncao(),
                u.getSexo(),
                u.getEmail(),
                u.getTelefone(),
                u.getUsuario()
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtBusca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuariosCad = new javax.swing.JTable();

        setClosable(true);
        setTitle("Tabela Usuários");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela Usuarios"));

        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaKeyReleased(evt);
            }
        });

        jLabel3.setText("Buscar por Nome ou Função:");

        tableUsuariosCad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Nascimento", "Função", "Sexo", "Email", "Telefone", "Usuário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableUsuariosCad);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUsuariosCad;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
