package fr.pantheonsorbonne.miage.engine.local;

import java.util.ArrayList;
import java.util.List;

public class Domino {

    private int gauche;
    private int droite;

    public Domino(int gauche, int droite){
        this.gauche=gauche;
        this.droite=droite;
    }

    public int getGauche(){
        return gauche;
    }
    public int getDroite(){
        return droite;
    }
    public static List<Domino> GenerationDominos(){
        List <Domino> domino = new ArrayList<>();
        for (int i=1;i<7;i++){
            for (int j=i; j<7; j++){
                domino.add(new Domino(i,j));
            }
        }
        return domino;
    }
}



