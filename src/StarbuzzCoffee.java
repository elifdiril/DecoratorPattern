/**
 * @author Elif
 */
public class StarbuzzCoffee {
    public static void main(String [] Args){
        Beverage beverage = new Espresso();
        beverage= new Mocha(beverage);
        beverage= new Whip(beverage);
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription()+" $ " + beverage2.cost());

        Beverage beverage3 = new DarkRoast();
        beverage3= new Soy(beverage3);
        beverage3= new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());

    }
}
