

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class HideAndSeek implements HideAndGoSeek, Runnable{

    //instantiate arraylists to hold our hiders, seekers, and players
    public static ArrayList<Player> players = new ArrayList<Player>();
    public static ArrayList<String> hiders = new ArrayList<String>();
    public static ArrayList<String> seekers = new ArrayList<String>();




    public static void main(String[] args) {

        HideAndSeek start = new HideAndSeek();

        start.addPlayer("Dan", PlayerClass.ADULT, PlayerRoles.SEEKER);
        start.addPlayer("Lucy", PlayerClass.CHILD, PlayerRoles.HIDER);
        start.addPlayer("Sebastion", PlayerClass.ADULT, PlayerRoles.SEEKER);
        start.addPlayer("Tommy", PlayerClass.ADULT, PlayerRoles.HIDER);
        start.addPlayer("Tony", PlayerClass.CHILD, PlayerRoles.SEEKER);

        System.out.println(players.toString());
        for(Player player: players){
            if(player.role.toString().equals("SEEKER"));
                seekers.add(player.role.toString());

        }

        for(Player player: players){
            if(player.role.toString().equals("HIDER"));
            hiders.add(player.role.toString());

        }

        start.startTurn(2, seekers, hiders);

        //start.startTurn(2);

        Scanner input = new Scanner(System.in);



    }

    public void run(){

    }

    public void addPlayer(String name, PlayerClass playerClass, PlayerRoles playerRoles){
        Player newPlayer = new Player(name, playerClass, playerRoles);
        players.add(newPlayer);

    }
    public void startTurn(int turn, List<String> seekers, List<String> hiders){
        Random chance = new Random();
        Double chances = Math.random();


        if(chances < 0.05){
            for(String seeker : seekers){
                System.out.println(seeker.toString());
            }
            //found hidder
            //give up?
        }







    }
    public void endTurn(int turn, List<String> seekers, List<String> hiders){

    }


}