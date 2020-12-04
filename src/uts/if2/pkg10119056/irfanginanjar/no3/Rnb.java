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
public class Rnb implements Blues,Jazz {

    @Override
    public void genreBlues(String artisName) {
        System.out.println(artisName+" adalah musisi Blues");
    }

    @Override
    public void genreJazz(String artisName) {
        System.out.println(artisName+" adalah musisi Jazz");
    }
    
}
