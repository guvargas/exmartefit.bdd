
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNomeGerente.setText("Nome do gerente");

        btListarFuncionarios.setText("Listar funcionarios");

        btListarAlunos.setText("Listar Alunos");

        btRegistrar.setText("Registrar");

        btAlterarSenha.setText("Alterar Senha");

        btVoltar.setText("Voltar");

        cbTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aluno", "Instrutor", "Gerente" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btListarAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btListarFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAlterarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(lbNomeGerente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btVoltar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbNomeGerente)
                .addGap(31, 31, 31)
                .addComponent(btListarFuncionarios)
                .addGap(18, 18, 18)
                .addComponent(btListarAlunos)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRegistrar)
                    .addComponent(cbTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btAlterarSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btVoltar))
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
    private javax.swing.JButton btRegistrar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbTipoPessoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbNomeGerente;
    // End of variables declaration//GEN-END:variables
    
    
}
