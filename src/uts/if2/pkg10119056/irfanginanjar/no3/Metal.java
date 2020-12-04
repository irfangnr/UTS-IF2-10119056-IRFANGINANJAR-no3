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
public class Metal implements HeavyMetal,Punk {

    @Override
    public void genreHeavyMetal(String artisName) {
        System.out.println(artisName+" adalah musisi Heavy Metal");
    }

    @Override
    public void genrePunk(String artisName) {
        System.out.println(artisName+" adalah musisi Punk");
    }
    
}
