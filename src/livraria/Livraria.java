package livraria;

//import livraria.config.HibernateConfig;
//import livraria.view.TelaLogin;
import livraria.view.TelaPrincipal;

public class Livraria {

    public static void main(String[] args) {
        // TODO code application logic here
          java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });

//        new HibernateConfig();
    }

}
