
package View;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

public class TelaInicialGerenteView extends javax.swing.JFrame {
    
    
    public TelaInicialGerenteView() {
         java.net.URL url = ClassLoader.getSystemResource("imagens/gymlogo.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        initComponents();
    }
    public void setNomeGerente(String nome){
        lbNomeGerente.setText(nome);
    }
    public void addAcaoBotaoAlterarSenha(ActionListener acao){
        btAlterarSenha.addActionListener(acao);
    }
    public void addAcaoBotaoListarAlunos(ActionListener acao){
        btListarAlunos.addActionListener(acao);
    }
    public void addAcaoBotaoListarFuncionarios(ActionListener acao){
        btListarFuncionarios.addActionListener(acao);
    }
    public void addAcaoBotaoRegistrar(ActionListener acao){
        btRegistrar.addActionListener(acao);
    }
    
    public void addAcaoBotaoGerenciarPlaylist(ActionListener acao){
        btPlaylist.addActionListener(acao);
    }
    
    public String getTipoPessoa(){
        return cbTipoPessoa.getSelectedItem().toString();
    }
    
    public void addAcaoBotaoVoltar(ActionListener acao){
        btVoltar.addActionListener(acao);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbNomeGerente = new javax.swing.JLabel();
        btListarFuncionarios = new javax.swing.JButton();
        btListarAlunos = new javax.swing.JButton();
        btRegistrar = new javax.swing.JButton();
        btAlterarSenha = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        cbTipoPessoa = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btPlaylist = new javax.swing.JButton();
        imagem = new javax.swing.JLabel();
        imagem1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNomeGerente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNomeGerente.setText("Nome do gerente");

        btListarFuncionarios.setText("Listar funcionarios");

        btListarAlunos.setText("Listar Alunos");

        btRegistrar.setText("Registrar");

        btAlterarSenha.setText("Alterar Senha");

        btVoltar.setText("Voltar");

        cbTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aluno", "Instrutor", "Gerente" }));

        btPlaylist.setText("Gerenciar Playlist");
        btPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlaylistActionPerformed(evt);
            }
        });

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gymlogo.png"))); // NOI18N

        imagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbNomeGerente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(btPlaylist)
                        .addGap(267, 267, 267)
                        .addComponent(btAlterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btVoltar)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(586, 586, 586)
                        .addComponent(imagem))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btListarFuncionarios)
                                .addGap(247, 247, 247)
                                .addComponent(btListarAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(418, 418, 418)
                                .addComponent(imagem1)))
                        .addGap(181, 181, 181)
                        .addComponent(btRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagem)
                .addGap(61, 61, 61)
                .addComponent(lbNomeGerente)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(imagem1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btListarFuncionarios)
                            .addComponent(btListarAlunos)
                            .addComponent(btRegistrar)
                            .addComponent(cbTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btPlaylist)
                            .addComponent(btAlterarSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)))
                .addComponent(btVoltar)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlaylistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPlaylistActionPerformed
    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicialGerenteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialGerenteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialGerenteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialGerenteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialGerenteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarSenha;
    private javax.swing.JButton btListarAlunos;
    private javax.swing.JButton btListarFuncionarios;
    private javax.swing.JButton btPlaylist;
    private javax.swing.JButton btRegistrar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbTipoPessoa;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel imagem1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbNomeGerente;
    // End of variables declaration//GEN-END:variables
    
    
}
