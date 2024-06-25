package Interface;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUPrincipal().setVisible(true);
            }
        });
//        Sistema sis = new Sistema();
//        sis.executar();  
    }
    
}
