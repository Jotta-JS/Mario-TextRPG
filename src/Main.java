import co.objects.Character;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instance Scanner
        Scanner input = new Scanner(System.in);
        //Creating Mario
        Character Mario = new Character();
        Mario.setInfo("Mario", "20", "8", "4");

        //Creating a Turtle Enemy
        Character Turtle = new Character();
        Turtle.setInfo("It's just a generic enemy", "12", "2", "2");

        //Starting the Game
        System.out.println("SUPER MARIO TEXT RPG\n\n ARE YOU READY? (write yes/no)");
        //Getting a response from the player
        String response = input.nextLine();

        if(response.equals("no")){
            System.out.println("\n\nOh no!, sorry!, i see you later, bye bye buddy!");
        }else{
            //Selecting a hero
            System.out.println("\n\n SELECT YOUR HERO! : \n a) Mario (´▽`ʃ♡ƪ)\n b) Mario (´▽`ʃ♡ƪ)\n c) Mario (´▽`ʃ♡ƪ)\n\n (write the hero name)\n");
            response = input.nextLine();

            //Checking if the chosen hero is valid
            if(!response.equals("Mario")) {
                System.out.println("You are chose an invalid hero!.");
            } else {
                //continue the game
                System.out.println("Nice choice buddy!\n Here is your hero stats: " + Mario.getInfo() + "\n\n Press Enter");
                input.nextLine();
                System.out.println("and here is your enemy stats: " + Turtle.getInfo() + "\n\n Press Enter");


                System.out.println("STARTING THE BATTLE, PREPARE YOUR WEAPONS! \n Press Enter\n");
                input.nextLine();

                //Setting the charactersLife
                int heroLife = Mario.stats("life");
                int heroDamage = Mario.stats("damage");
                int heroDefense = Mario.stats("defense");
                int enemyLife = Turtle.stats("life");
                int enemyDamage = Turtle.stats("life");
                int enemyDefense = Turtle.stats("defense");

                //The Battle
                while(heroLife > 0 && enemyLife > 0){
                    System.out.println("Your life is: "+ heroLife +"\nThe life of your enemy is: " + enemyLife + "\n What you want to do?\n attack / defend ");
                    String choice = input.nextLine();

                    if (choice.equals("attack")){
                        enemyLife = enemyLife - (heroDamage - enemyDefense);
                        System.out.println("You are caused " + (heroDamage-enemyDefense) + " of damage! \n Press Enter");
                        input.nextLine();
                    }else {
                        heroLife = heroLife - (enemyDamage - heroDefense);
                        System.out.println("You are received " + (enemyDamage-heroDefense) + " of damage! \n Press Enter");
                        input.nextLine();
                    }

                }

                if (heroLife > 0){
                    System.out.println("Congratulations buddy!, you have won this Challenge!");
                }else{
                    System.out.println("Oh no!, Sorry buddy!, good luck trying in the next time. \n\n\n\n\n __________GAME_OVER__________");
                }

            }
        }
    }
}