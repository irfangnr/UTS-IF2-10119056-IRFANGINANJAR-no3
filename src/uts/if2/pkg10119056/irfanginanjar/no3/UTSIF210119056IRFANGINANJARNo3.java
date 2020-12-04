/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119056.irfanginanjar.no3;

/**
 * 
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Genre Musik
 */
public class UTSIF210119056IRFANGINANJARNo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rnb rnb=new Rnb();
        MusicGenre musik=new MusicGenre();
        
        Rockability rockability=new Rockability();
        Folk folk=new Folk();
        
        HardRock hardrock=new HardRock();
        Metal metal=new Metal();

        rnb.genreBlues("Jimmy Hendrik");
        rnb.genreJazz("Chad Baker");
        
        musik.setArtisName("Bob Dylan");
        folk.genreFolk(musik.getArtisName());
        musik.setArtisName("Elvis Presley");
        rockability.genreRockability(musik.getArtisName());
        
        hardrock.genreProgressiveRock("DreamTheater");
        hardrock.genrePsychedellic("The Dors");
        hardrock.genrePopRock("Kiss");
        
        metal.genrePunk("MXPX");
        metal.genreHeavyMetal("METALLICA");
        
        Grindcore grindcore=new Grindcore();
        DeathMetal deth=new DeathMetal();
        DethCoreKepiting kepiting=new DethCoreKepiting();
        
        musik.setArtisName("Mesin Tempur");
        grindcore.genreGrindCore(musik.getArtisName());
        

        
    }
    
}
