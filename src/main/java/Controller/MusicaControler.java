//package Controller;
//
//import Model.MusicasModel;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.List;
//import javax.swing.JColorChooser;
//import javax.swing.JOptionPane;
//import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
//import Controller.CampoVazioExceptionControler;
//import View.TelaMusicaView;
//
//public class MusicaControler {
//    
//    private TelaMusicaView musica= new TelaMusicaView();
//    PessoaDAO pessoaRepositorio = new PessoaDAO();
//    List<PessoaModel> pessoas = pessoaRepositorio.buscarTodos();
//    List<PessoaModel> encontradas = new ArrayList<>();
//    
//    
//    public MusicaControler() {
//        
//        
//        for (PessoaModel p: pessoas ) {
//            if("Instrutor".equals(p.getTipo())){
//                
//                encontradas.add(p);
//            }
//        }
//        if(encontradas!=null){
//            listarFuncionarios.setDadosTable(encontradas);
//        }else{
//            JOptionPane.showMessageDialog(null, "Nao há instrutores cadastrados");
//        }
//        adicionarAcoesBotoes();
//        listarFuncionarios.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//        listarFuncionarios.setTitle("ExMarteFit");
//        exibirTela();
//        
//        
//    }
//    
//     public void adicionarAcoesBotoes(){
//        acaoVisualizarPontos();
//         acaoVoltar();
//      
//    }
//    
//     public void acaoVoltar(){
//        listarFuncionarios.addAcaoBotaoVoltar(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                listarFuncionarios.dispose();
//            
//            }
//        }
//        );
//    }
//      public void acaoVisualizarPontos(){
//        listarFuncionarios.addAcaoBotaoVizualisarPontos(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                try{
//                if(listarFuncionarios.getId().equals("")){
//                    throw new CampoVazioExceptionControler();
//                }
//                
//                PontosDao pdao = new PontosDao();
//                List<PontoModel> listaPontos = pdao.buscarTodos();
//                StringBuffer sb = new StringBuffer();
//                for(PontoModel ponto: listaPontos){
//                    if(ponto.getIdDoInstrutor()== Integer.parseInt(listarFuncionarios.getId())){
//                        sb.append(ponto.getHorario()+"\n");
//                    }
//                }
//                listarFuncionarios.setTextAreaVisualizarPontos(sb.toString());
//                }catch(CampoVazioExceptionControler c){
//                }
//            
//            }
//        }
//        );
//    }
//      
//    public void exibirTela(){
//        listarFuncionarios.setVisible(true);
//    }
//}
