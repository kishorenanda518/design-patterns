package com.designpatterens.tictactoegame;


import java.util.*;

public class TicTacToeGame {
    Deque<Player> players; // is used when we want to remove player so that we use deque
    PlayingBoard gameBoard;

    TicTacToeGame(){
        inializeGame();
    }
    public void inializeGame(){

        //creating 2 players
        players = new LinkedList<>();

        PlayingPiece crossPiece= new PlayingPieceX();
        Player player1 = new Player("Player1",crossPiece);

        PlayingPiece noughtsPiece = new PlayingPieceO();
        Player player2=new Player("Player2",noughtsPiece);

        // ✅ ADD THESE TWO LINES
        players.addLast(player1);
        players.addLast(player2);

        gameBoard = new PlayingBoard(3);

    }

    public String startGame(){
        boolean noWinner = true;
        while (noWinner){

            //take out the player whose turn is and also put the player in the list back
            Player playerTurn= players.removeFirst();

            //get the free space from the board
            gameBoard.printBoard();
            List<Map.Entry<Integer, Integer>> freeSpaces = gameBoard.getFreeCells();

            if(freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }

            //read the user input
            System.out.println("Player:"+ playerTurn.name+" Enter row,column: ");
            Scanner inputScanner =  new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            //place the piece
            boolean pieceAddedSuccesfully = gameBoard.addPiece(inputRow,inputColumn,playerTurn.playingPiece);

            if(!pieceAddedSuccesfully){
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isTheWinner(inputRow,inputColumn,playerTurn.playingPiece.pieceType);
            if(winner){
                return playerTurn.name;
            }
        }
        return "tie";
    }

    public boolean isTheWinner(int row,int column,PieceType pieceType){
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0; i< gameBoard.size; i++){
            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType){
                rowMatch = false;
            }
        }
        //need to check in column
        for(int i=0;i<gameBoard.size;i++){
            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType){
                columnMatch=false;
            }
        }
        //need to check diagonals
        for(int i=0,j=0; i<gameBoard.size;i++,j++){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType){
                diagonalMatch = false;
            }
        }

        //need to check anti-diagnols
        for(int i=0,j= gameBoard.size-1; i<gameBoard.size;i++,j--){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
