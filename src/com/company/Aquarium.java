package com.company;

public class Aquarium {
    private String walls;
    private String sand;
    private String plants;
    private String fish;
    private String water;


    private Aquarium(AquariumBuilder aquariumBuilder){
        this.walls = aquariumBuilder.walls;
        this.sand = aquariumBuilder.sand;
        this.plants = aquariumBuilder.plants;
        this.fish = aquariumBuilder.fish;
        this.water = aquariumBuilder.water;
    }

    public String getWalls(){
        return walls;
    }
    public String getSand() {
        return sand;
    }
    public String getPlants() {
        return plants;
    }
    public String getFish() {
        return fish;
    }
    public String getWater(){
        return water;
    }


 public static class AquariumBuilder{
     private String walls;
     private String sand;
     private String plants;
     private String fish;
     private String water;

     public AquariumBuilder buildWalls(String walls){
         this.walls = walls;
         return this;
     }
     public AquariumBuilder buildSand(String sand){
         this.sand = sand;
         return this;
     }
     public AquariumBuilder buildPlants(String plants){
         this.plants = plants;
         return this;
     }
     public AquariumBuilder buildFish(String fish){
         this.fish = fish;
         return this;
     }
     public AquariumBuilder buildWater(String water){
         this.water = water;
         return this;
     }

     public Aquarium build(){
         return new Aquarium(this);
     }
 }
}
