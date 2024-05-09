package livraria.testes;

import livraria.model.Utente;



public class TesteUtente {

    public static void main(String[] args) {
        Utente utente = new Utente();
        utente.setCodUtente("UT9009");
        utente.setNome("Ernesto");
        utente.setBi("0000939495345");
        utente.setEndereco("Tchioco");
        utente.setTelefone("944122462");

//        
//        UtenteDao utenteDao = new UtenteDao();
//        utente = utenteDao.salvar(utente);
//        System.out.println("Utente salvo"+ utente.getNome());

    }
}
