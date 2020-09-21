
package View;

import Model.PessoaModel;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaListarAlunosView extends javax.swing.JFrame {
    
    public TelaListarAlunosView() {
         java.net.URL url = ClassLoader.getSystemResource("imagens/gymlogo.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        initComponents();
    }
    
    public String getIdAlterarTreino(){
        return tfIdAlunoAlterarTreino.getText();
    }
    
    public String getTituloDoTreino(){
        return cbTreino.getSelectedItem().toString();
    }
    
    public void adicionarTreinoComboBox(String treino){
        cbTreino.addItem(treino);
    }
    public String IdAlterarHorario(){
        return tfIdAlterarHorario.getText();
    }
    public int getHora(){
        return (int)spnHora.getValue();
    }
    public int getMinutos(){
        return (int)spnMinuto.getValue();
    }
    public void adicionarAcaoAlterarHorario(ActionListener acao){
        btAlterarHorario.addActionListener(acao);
    }
    public void adicionarAcaoBotaoAlterarTreino(ActionListener acao){
        btAlterarTreino.addActionListener(acao);
    }
    public void limparDados(){
        tfIdAlterarHorario.setText(null);
        tfIdAlunoAlterarTreino.setText(null);
        
    }
    public void ExibirMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    public void addAcaoBotaoVoltar(ActionListener acao){
        btVoltar.addActionListener(acao);
    }
    public void setDadosTable(List<PessoaModel> encontradas) {
        
        //botar a table aq
        DefaultTableModel model = (DefaultTableModel)tabAlunos.getModel();
        
        encontradas.forEach(aluno -> {
            //id nome cpf nascimento treino horario
            model.addRow(new Object[]{aluno.getId(),aluno.getNome(),aluno.getCpf(),aluno.getDataNascimento(),
                aluno.getTreino(), aluno.getHorario()});
        });
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbAlterarHorario = new javax.swing.JLabel();
        tfIdAlterarHorario = new javax.swing.JTextField();
        lbVizualizarAlunos = new javax.swing.JLabel();
        lbIdAlunoAlterarHorario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabAlunos = new javax.swing.JTable();
        spnHora = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        btAlterarTreino = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbAlterarTreino = new javax.swing.JLabel();
        btAlterarHorario = new javax.swing.JButton();
        lbIDAlutoAlterarTreino = new javax.swing.JLabel();
        spnMinuto = new javax.swing.JSpinner();
        tfIdAlunoAlterarTreino = new javax.swing.JTextField();
        lbTituloDoTreino = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        cbTreino = new javax.swing.JComboBox<>();
        imagem = new javax.swing.JLabel();
        imagem2 = new javax.swing.JLabel();
        imagem1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbAlterarHorario.setText("Alterar horário de aluno");

        lbVizualizarAlunos.setText("Lista de alunos");

        lbIdAlunoAlterarHorario.setText("ID do aluno");

        tabAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Data de nascimento", "Treino", "Horario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabAlunos);

        spnHora.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        jLabel1.setText("Hora");

        btAlterarTreino.setText("Alterar Treino");

        jLabel2.setText("Minuto");

        lbAlterarTreino.setText("Alterar treino de aluno");

        btAlterarHorario.setText("Alterar Horario");

        lbIDAlutoAlterarTreino.setText("ID do aluno");

        spnMinuto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        lbTituloDoTreino.setText("Título do treino");

        btVoltar.setText("Voltar");

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gymlogo.png"))); // NOI18N

        imagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rapidez.png"))); // NOI18N

        imagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/haltere.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbVizualizarAlunos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfIdAlunoAlterarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbIDAlutoAlterarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTituloDoTreino))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbAlterarTreino)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btAlterarTreino)
                                        .addGap(18, 18, 18)
                                        .addComponent(imagem1)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagem)
                        .addGap(11, 11, 11)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfIdAlterarHorario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIdAlunoAlterarHorario, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(spnMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btAlterarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(imagem2))
                    .addComponent(lbAlterarHorario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbIDAlutoAlterarTreino)
                            .addComponent(lbTituloDoTreino)
                            .addComponent(lbAlterarTreino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfIdAlunoAlterarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btAlterarTreino))
                            .addComponent(imagem1))
                        .addGap(18, 18, 18)
                        .addComponent(lbVizualizarAlunos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagem)))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAlterarHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbIdAlunoAlterarHorario)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIdAlterarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAlterarHorario)
                            .addComponent(spnMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imagem2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVoltar)
                .addGap(13, 13, 13))
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
            java.util.logging.Logger.getLogger(TelaListarAlunosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListarAlunosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListarAlunosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListarAlunosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListarAlunosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarHorario;
    private javax.swing.JButton btAlterarTreino;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbTreino;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel imagem1;
    private javax.swing.JLabel imagem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAlterarHorario;
    private javax.swing.JLabel lbAlterarTreino;
    private javax.swing.JLabel lbIDAlutoAlterarTreino;
    private javax.swing.JLabel lbIdAlunoAlterarHorario;
    private javax.swing.JLabel lbTituloDoTreino;
    private javax.swing.JLabel lbVizualizarAlunos;
    private javax.swing.JSpinner spnHora;
    private javax.swing.JSpinner spnMinuto;
    private javax.swing.JTable tabAlunos;
    private javax.swing.JTextField tfIdAlterarHorario;
    private javax.swing.JTextField tfIdAlunoAlterarTreino;
    // End of variables declaration//GEN-END:variables
    
    
}
