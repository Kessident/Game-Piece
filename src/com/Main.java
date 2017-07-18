package com;

public class Main {

    public static void main(String[] args) {
	    GamePiece piece = new GamePiece(){};

        System.out.print("isfrozen: ");
        System.out.println(piece.isFrozen());
        piece.freeze();
        System.out.print("isFrozen: ");
        System.out.println(piece.isFrozen());
        piece.unfreeze();

        System.out.println();

        System.out.println("Position X: " + piece.getPositionX());
        System.out.println("Position Y: " + piece.getPositionY());
        piece.move(4,2);
        System.out.println("New Position X: " + piece.getPositionX());
        System.out.println("New Position Y: " + piece.getPositionY());

        System.out.println();

        piece.freeze();
        piece.move(100, 100);
        System.out.println("Position X after freezing: " + piece.getPositionX());
        System.out.println("Position Y after freezing: " + piece.getPositionY());
        piece.unfreeze();

        piece.move();
        System.out.println(piece.toString());

        piece.move(123, 4123454);
        System.out.println("Piece X and Y should be 100 and 500");
        System.out.println(piece.toString());

    }
}
