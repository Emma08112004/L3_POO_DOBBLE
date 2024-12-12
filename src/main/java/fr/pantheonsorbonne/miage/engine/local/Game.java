package fr.pantheonsorbonne.miage.engine.local;

import fr.pantheonsorbonne.miage.Facade;
import fr.pantheonsorbonne.miage.PlayerFacade;

public class Game {
    private Facade facade;
    private String playerName;

    public void createNewPlayer (String playerName){
        PlayerFacade playerFacade = (PlayerFacade) Facade.getFacade();
        playerFacade.waitReady(); 

        playerFacade.createNewPlayer(playerName);

        System.out.println("Player created: " + playerName);
    }

}
