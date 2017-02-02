/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
import java.util.Random;
/**
 *
 * @author DVC
 */
public class pmon {
    Random rand = new Random();
    private String name;
    private int states;
    
    public pmon(String name){
        this.name = name;
        this.states = rand.nextInt(6)+1;
    }
    
    public String getName(){return name;}
    public int getStates(){return states;}
    public void infomation(){
        System.out.println("ポケモンの名前は"+name+"です。");
        System.out.println("能力値の評価(6段階)は"+states+"です。");
    }
}

class GlassPokemon extends pmon{
    public String arts;
    public GlassPokemon(String name,String arts){
        super(name);
        this.arts = arts;
    }
    public String getArts(){return arts;};
    @Override public void infomation(){
        System.out.println("このポケモンは、草タイプの"+getName()+"です。");
        System.out.println("能力値の評価(6段階)は"+getStates()+"です。");
        System.out.println("技「"+arts+"」をおぼえています。");
    }
}
class FirePokemon extends pmon{
    public String arts;
    public FirePokemon(String name,String arts){
        super(name);
        this.arts = arts;
    }
    public String getArts(){return arts;};
    @Override public void infomation(){
        System.out.println("このポケモンは、炎タイプの"+getName()+"です。");
        System.out.println("能力値の評価(6段階)は"+getStates()+"です。");
        System.out.println("技「"+arts+"」をおぼえています。");
}
}

class WaterPokemon extends pmon{
    public String arts;
    public WaterPokemon(String name,String arts){
        super(name);
        this.arts = arts;
    }
    public String getArts(){return arts;};
    @Override public void infomation(){
        System.out.println("このポケモンは、水タイプの"+getName()+"です。");
        System.out.println("能力値の評価(6段階)は"+getStates()+"です。");
        System.out.println("技「"+arts+"」をおぼえています。");
    }
}   



