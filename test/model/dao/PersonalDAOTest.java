/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.HashSet;
import java.util.Set;
import model.bean.Personal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author almei
 */
public class PersonalDAOTest {
    
    public PersonalDAOTest() {
    }

    @Test
    public void inserir() {
        
        Personal p = new Personal();
        p.setNome("marcel");
        p.setCpf("12345678900");
        p.setEmail("lmarcelmusic@gmail.com");
        p.setRegistro("12365454");
        p.setCep("51150650");
        p.setCelular("98289355");
        p.setSenha("123456");
        p.setEndereco("rua borrazopolis,353");
        
        
        p.setNascimento("27/01/1988");
        
        PersonalDAO dao = new PersonalDAO();
        dao.create(p);
    }
    
}
