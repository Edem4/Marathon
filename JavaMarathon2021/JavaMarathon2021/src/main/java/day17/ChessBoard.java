package day17;

import java.util.Arrays;

public class ChessBoard {
    private ChessPiece[][] board;

    public ChessBoard(ChessPiece[][] board) {
        this.board = board;
    }

    public void print() {
        for (ChessPiece[] lines : this.board) {
            for (ChessPiece icons : lines) {
                System.out.print(icons);
            }
            System.out.println("");
        }
    }
}
