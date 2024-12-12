package fr.pantheonsorbonne.miage.engine.local;

import fr.pantheonsorbonne.miage.Facade;

public class Main {
    public static void main (String[] args){
        Facade facade = Facade.getFacade();
        facade.waitReady();

        Game game = new Game (facade);
        game.start();
    }

}
