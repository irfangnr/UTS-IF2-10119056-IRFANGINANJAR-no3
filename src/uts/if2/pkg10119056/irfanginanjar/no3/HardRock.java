/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119056.irfanginanjar.no3;

/**
 *
 * @author ACER
 */
public class HardRock implements PopRock,ProgressiveRock,PsychedelicRock {

    public void genreHardRock(String artisName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void genrePopRock(String artisName) {
        System.out.println(artisName+" adalah musisi PopRock");
    }

    @Override
    public void genrePsychedellic(String artisName) {
        System.out.println(artisName+" adalah musisi PsychedellicRock");
    }
    
    @Override
    public void genreProgressiveRock(String artisName) {
        System.out.println(artisName+" adalah musisi ProgressiveRock");
    }

    
}
