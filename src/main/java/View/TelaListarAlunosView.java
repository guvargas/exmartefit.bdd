
package View;

import Model.PessoaModel;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaListarAlunosView extends javax.swing.JFrame {
    
    public TelaListarAlunosView() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbAlterarHorario.setText("Alterar Horario");

        lbVizualizarAlunos.setText("Vizualizar alunos");

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

        lbAlterarTreino.setText("Alterar Treino");

        btAlterarHorario.setText("Alterar Horario");

        lbIDAlutoAlterarTreino.setText("ID do aluno");

        spnMinuto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        lbTituloDoTreino.setText("TituloDoTreino");

        btVoltar.setText("Voltar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfIdAlunoAlterarTreino, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIDAlutoAlterarTreino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbTituloDoTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbTreino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addComponent(btAlterarTreino))
                    .addComponent(lbAlterarHorario)
                    .addComponent(lbAlterarTreino)
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
                                .addComponent(spnMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btAlterarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))))
                .addContainerGap(175, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbVizualizarAlunos)
                        .addGap(173, 173, 173))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVizualizarAlunos)
                    .addComponent(btVoltar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbAlterarTreino)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIDAlutoAlterarTreino)
                    .addComponent(lbTituloDoTreino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIdAlunoAlterarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterarTreino)
                    .addComponent(cbTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbAlterarHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdAlunoAlterarHorario)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIdAlterarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterarHorario)
                    .addComponent(spnMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
