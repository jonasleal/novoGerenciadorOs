
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JonasJr
 */
public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste");
        factory.createEntityManager();

    }
}
