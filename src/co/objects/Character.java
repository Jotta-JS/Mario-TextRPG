package co.objects;

public class Character {
    private String name;
    private int life;
    private int damage;
    private int defense;

    //SETTER
        public void setInfo(String name, String life, String damage, String defense){
            this.name = name;
            this.life = Integer.parseInt(life);
            this.damage = Integer.parseInt(damage);
            this.defense = Integer.parseInt(defense);
        }


    //GETTERS
        public int stats(String value){
            int response = 0;
            switch (value){
                case "life" -> response = life;
                case "damage" -> response = damage;
                case "defense" -> response = defense;
            }
            return response;
        }
        public String getInfo(){
            return name + " info: " +
                    "\n life: " + life +
                    "\n damage: " + damage +
                    "\n defense: " + defense;
        }
}
