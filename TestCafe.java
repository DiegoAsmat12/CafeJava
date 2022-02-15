import java.util.ArrayList;

public class TestCafe{
    public static void main(String[] args) {
        CafeUtil util = new CafeUtil();
        int cantidadDeCafes = util.getStreakGoal(10);
        double[] precios = new double[] {1,3.5,7,8.9,15};
        double totalDeOrden = util.getOrderTotal(precios);
        ArrayList<String> menu = new ArrayList<String>();
        
        menu.add("café de goteo");
        menu.add("capuchino");
        menu.add("latte");
        menu.add("moka");



        System.out.println("----Streak Goal Test----");
        System.out.println("Cantidad de café minima para premios en 10 semanas: "+cantidadDeCafes);
        System.out.println("----Order Total Test----");
        System.out.println("La orden requerida tiene como precio total "+totalDeOrden);
        System.out.println("----Display Menu Test----");
        util.DisplayMenu(menu);
        System.out.println("----Add Customer Test----");
        ArrayList<String> costumers = new ArrayList<String>();

        for(int i=0; i<3; i++){
            util.addCustomer(costumers);
        }



    }
}