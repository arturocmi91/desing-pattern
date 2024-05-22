package StructuralDesingPatterns.Flyweight;

import StructuralDesingPatterns.Flyweight.assets.Animation;
import StructuralDesingPatterns.Flyweight.assets.Prefab;
import StructuralDesingPatterns.Flyweight.assets.Sound;
import StructuralDesingPatterns.Flyweight.assets.Texture;

import java.util.Arrays;
import java.util.List;

public class TestFlyweigth {
    public static void main(String[] args) {
        List<Animation> animation= Arrays.asList(
                new Animation("Walk"),
                new Animation("Jump"),
                new Animation("Dance")
        );
        List<Texture> texture= Arrays.asList(
                new Texture("texture.skin"),
                new Texture("texture.clothes"),
                new Texture("texture.boots")
        );
        List<Sound> sound= Arrays.asList(
                new Sound("Sound.en"),
                new Sound("Sound.en.fear")
        );

        Prefab prefab1= new Prefab(animation, texture, sound);
        Npc civil1= new Npc(prefab1);
        Npc civil2= new Npc(prefab1);
        System.out.println(" ===           civil1               ===");
        civil1.showNpc();
        System.out.println(" ===           civil2               ===");
        civil2.showNpc();

        List<Animation> animation2= Arrays.asList(
                new Animation("Funny Walk"),
                new Animation("Funny Jump"),
                new Animation("Bad Dance")
        );
        List<Texture> texture2= Arrays.asList(
                new Texture("texture.skin_black"),
                new Texture("texture.bad_clothes"),
                new Texture("texture.22")
        );
        List<Sound> sound2= Arrays.asList(
                new Sound("Sonido.es"),
                new Sound("Sonido.es.Fear")
        );
        Prefab prefab2= new Prefab(animation2,texture2,sound2);
        Npc mexicanMafia= new Npc(prefab2);
        Npc mexicanMafia2= new Npc(prefab2);
        System.out.println(" ===           Mexican Mafia 1              ===");
       mexicanMafia.showNpc();
        System.out.println(" ===           Mexican Mafia 2            ===");
        mexicanMafia2.showNpc();
    }

}
