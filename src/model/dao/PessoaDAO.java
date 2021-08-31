package model.dao;

import connection.Connectionfactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PessoaDAO {
    public void create(){
        Connection con = Connectionfactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("");
            
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
