package Model;

import javax.swing.table.AbstractTableModel;

public class TabelaFuncionarios extends AbstractTableModel{

    private String[] nomeColunas = {"nome", "ID"};
    
    private final int FUNCIONARIO_NOME = 0;
    private final int FUNCIONARIO_ID = 1;
    
    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //return [bdd.size];
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }
    
    @Override
    public String getColumnName(int index){
        return nomeColunas[index];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //instanciar o funcionario usando o row index
        switch (columnIndex){
            case FUNCIONARIO_NOME:
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                //return funcionario.getNome();
            case FUNCIONARIO_ID:
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                //return funcionario.getID();
        }
        return null;
    }

    
}
