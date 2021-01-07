package com.company;

public class Main {

    public static void main(String[] args) {
	Aquarium aquarium = new Aquarium.AquariumBuilder()
            .buildWalls("walls")
            .buildSand("yellow sand")
            .buildPlants("small plants")
            .buildWater("30 litres of water")
            .buildFish("golden fishes")
            .build();
	System.out.println(aquarium);
    }
}
