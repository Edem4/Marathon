package day17;

import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<ChessPiece> figure = Arrays.asList(
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK
        );
        for(ChessPiece chess: figure){
            System.out.print(chess.getIcon());
        }
    }
}