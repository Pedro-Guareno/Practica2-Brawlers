public class Brawler {

        private String name;
        private int health;


    public Brawler(String name, int health ) {
        this.name = name;
        this.health = health;
    }

    public String getName(){
            return this.name;
        }
        public int getHealth(){
            return this.health;
        }
    public  void setHealth(int NewHealth){this.health = NewHealth;}

    public void accionEspecial(Brawler enemigo){
    }
}
