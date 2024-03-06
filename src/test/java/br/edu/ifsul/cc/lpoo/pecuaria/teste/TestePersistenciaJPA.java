package br.edu.ifsul.cc.lpoo.pecuaria.teste;

import br.edu.ifsul.cc.lpoo.pecuaria.modelo.Raca;
import br.edu.ifsul.cc.lpoo.pecuaria.modelo.dao.PersistenceJPA;
import org.junit.Test;

/**
 *
 * @author malek
 */
public class TestePersistenciaJPA {
    
    
   // @Test
    public void testConexaoJPA(){
        //criar um objeto do tipo PersistenciaJPA.
        PersistenceJPA jpa = new PersistenceJPA();
        if(jpa.conexaoAberta()){
            System.out.println("conectou no BD via jpa ...");
            jpa.fecharConexao();
        }else{
            System.out.println("nao conectou no BD ...");
                        
        }
    }
    
    //criar um novo teste para gerar um registro de Raca.

//@Test
public void testInserirRegistro() throws Exception
{
    PersistenceJPA jpa = new PersistenceJPA();
     if(jpa.conexaoAberta()){
            System.out.println("conectou no BD via jpa ...");
            
            Raca r = new Raca();
            r.setNome("Raca de teste!!!");
            jpa.persist(r);
            
            System.out.println("Raca id: " + r.getId());
            jpa.fecharConexao();
        }else{
            System.out.println("nao conectou no BD ...");
                        
        }
}

//Criar um novo teste para alterar um registro de Raca

//@Test
public void testUpdate() throws Exception
{
    PersistenceJPA jpa = new PersistenceJPA();
    
     if(jpa.conexaoAberta()){ //Testa a conexão // caso a conexão seja estabelecida, retorna true
            System.out.println("conectou no BD via jpa ...");  //informa que foi conectado
            Raca r; //Criação do objeto com o tipo da classe
            r = (Raca) jpa.find(Raca.class, 1); // procura no banco passando o objeto e o identificador da classe
          //Raca r = jpa.find(Raca.class, Integer.valueOf(1));
            
          if(r != null){ // se r não for nulo, ou seja, encontrou um registro com o identificador, entra no bloco
            String nome = r.getNome(); //pega o campo "Nome" do registro
            
            r.setNome("Raca 1 novo"); //altera o campo "nome" (APENAS NO OBJETO)
            jpa.persist(r); //altera no banco de dados
         
            System.out.println("Raca id: " + r.getId() +  " alterado o nome de " + nome+ " para: " + r.getNome());
          }else{
              System.out.println("não foi encontrado nnehum registro com o id informado!");
          }
            jpa.fecharConexao(); // fecha a conexão com o banco
        }else{ // se r for nulo, ou seja, não encontrou nenhum registro, pula para o ELSE
            System.out.println("nao conectou no BD ...");
                        
        }
}

//Criar um novo teste para alterar um registro de Raca
@Test
public void testRemove() throws Exception
{
    PersistenceJPA jpa = new PersistenceJPA();
    
     if(jpa.conexaoAberta()){ //Testa a conexão // caso a conexão seja estabelecida, retorna true
            System.out.println("conectou no BD via jpa ...");  //informa que foi conectado
            Raca r; //Criação do objeto com o tipo da classe
            r = (Raca) jpa.find(Raca.class, 1); // procura no banco passando o objeto e o identificador da classe
          //Raca r = jpa.find(Raca.class, Integer.valueOf(1));
            
          if(r != null){ // se r não for nulo, ou seja, encontrou um registro com o identificador, entra no bloco
           
            jpa.remover(r); //remove do banco de dados
            
              System.out.println("Registro apagado!");

          }else{
              System.out.println("não foi encontrado nnehum registro com o id informado!");
          }
            jpa.fecharConexao(); // fecha a conexão com o banco
        }else{ // se r for nulo, ou seja, não encontrou nenhum registro, pula para o ELSE
            System.out.println("nao conectou no BD ...");
                        
        }
}
}
