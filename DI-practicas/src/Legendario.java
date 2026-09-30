public class Legendario extends Brawler{

    private int damage;

    public Legendario(String name, int health, int daño) {
        super(name, health);
        this.damage = daño;
    }

    public void accionEspecial(Brawler enemigo){
        enemigo.setHealth(enemigo.getHealth() - this.damage);

        System.out.println("["+getName()+ ":"+ getHealth()+ "] Apply -" + this.damage + " daño a " + enemigo.getName());
        System.out.println("["+ enemigo.getName()+ ":"+ enemigo.getHealth()+ "]\n");
    }
}
