package com;

import java.util.Random;

public class GamePiece {
    private int positionX;
    private int positionY;
    private boolean isFrozen;
    private String colour;
    private String name;
    private int minX;
    private int maxX;
    private int minY;
    private int maxY;

    public GamePiece() {
        positionX = 0;
        positionY = 0;
        isFrozen = false;
        minX = 0;
        maxX = 100;
        minY = 0;
        maxY = 500;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(int newX, int newY){
        if (!isFrozen) {
            if (newX > maxX){
                positionX = maxX;
            } else if (newX < minX) {
                positionX = minX;
            } else {
                positionX = newX;
            }

            if (newY > maxY){
                positionY = maxY;
            } else if (newY < minX) {
                positionY = minY;
            } else {
                positionY = newY;
            }
        }
    }

    public void move(){
        if (!isFrozen) {
            Random rand = new Random();
            this.positionX = rand.nextInt(maxX);
            this.positionY = rand.nextInt(maxY);
        }
    }
    public void freeze(){
        this.isFrozen = true;
    }
    public void unfreeze(){
        this.isFrozen = false;
    }

    public String toString(){
        String frozenString;
        if (this.isFrozen){
            frozenString = "is frozen";
        } else {
            frozenString = "is not frozen";
        }
        return "Piece is at X: " + this.positionX + ", Y: " + this.positionY + ", and " + frozenString;
    }
}
