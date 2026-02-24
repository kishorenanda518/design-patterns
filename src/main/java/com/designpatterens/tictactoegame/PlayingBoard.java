package com.designpatterens.tictactoegame;


import ch.qos.logback.core.joran.sanity.Pair;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PlayingBoard {
    public int size;
    public PlayingPiece[][] board;

    public PlayingBoard(int size){
        this.size=size;
        board= new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column,PlayingPiece playingPiece) {
        // ✅ Check boundaries first
        if (row < 0 || row >= size || column < 0 || column >= size) {
            return false;
        }
        if (board[row][column] != null) {
            return false;
        }
        board[row][column] = playingPiece;
        return true;

    }

    public List<Map.Entry<Integer, Integer>> getFreeCells(){
        List<Map.Entry<Integer, Integer>> freeCells = new ArrayList<>();

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j] == null) {   // IMPORTANT FIX
                    freeCells.add(new AbstractMap.SimpleEntry<>(i, j));
                }
            }
        }
        return freeCells;
    }

    public void printBoard(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j] == null){
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + board[i][j].pieceType + " ");
                }
            }
            System.out.println();
        }
    }
}
