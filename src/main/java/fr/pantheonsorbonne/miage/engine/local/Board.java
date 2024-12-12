package fr.pantheonsorbonne.miage.engine.local;

import java.util.List;
import java.util.ArrayList;

public class Board {
    private List<Domino> dominosJoués;


    public Board(){
        dominosJoués= new ArrayList<>();
    }
    public boolean Matcher(Domino domino1, Domino domino2){
        if(domino1.getGauche()== domino2.getGauche() || domino1.getGauche() == domino2.getDroite() || domino1.getDroite() == domino2.getGauche() || domino1.getDroite()== domino2.getDroite()){
            return true;
        }
        return false;
    }

    public boolean ajoutDomino(Domino domino){
        if (dominosJoués.isEmpty()){
            dominosJoués.add(domino);
            return true;
        }

        Domino dernierDomino = dominosJoués.get(dominosJoués.size()-1);
        if(){

        }
    }
}