/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Aluno;
import model.bean.Personal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author almei
 */
public class AlunoDAOTest {
    
    public AlunoDAOTest() {
    }

    @Test
    public void inserir() {
        
        Personal p = new Personal();
        p.setId(1);
        Aluno a = new Aluno();
        a.setNome("pedro");
        a.setCpf("06006077777");
        a.setEmail("pedro@hotmail.com");
        a.setCep("51111655");
        a.setCelular("99888744");
        a.setEndereco("rua barão de souza leão,123");
        a.setPersonal(p);
        
        AlunoDAO dao = new AlunoDAO();
        dao.create(a);
        
    }
    
}
