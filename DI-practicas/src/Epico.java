public class Epico extends Brawler{

    private int curitas;

    public Epico(String name, int health, int curitas) {
        super(name, health);
        this.curitas = curitas;
    }
    public void accionEspecial(Brawler enemigo){
        setHealth(getHealth() + this.curitas);

        System.out.println("["+ getName()+":" +getHealth()+ "] Increase heealth to "+ getHealth());
        System.out.println("["+ enemigo.getName()+ ":"+ enemigo.getHealth()+ "]\n");
    }
}

