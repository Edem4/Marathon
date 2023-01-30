package day17;

public enum ChessPiece {
//    Пешка (белая)  ♙
//    Конь (белый)   ♘
//    Слон (белый)   ♗
//    Ладья (белая)  ♖
//    Ферзь (белый)  ♕
//    Король (белый) ♔
//
//
//    Пешка (черная)  ♟
//    Конь (черный)   ♞
//    Слон (черный)   ♝
//    Ладья (черная)  ♜
//    Ферзь (черный)  ♛
//    Король (черный) ♚

    KING_WHITE(100,"♔"), KING_BLACK(100,"♚"),QUEEN_WHITE(9,"♕"),QUEEN_BLACK(9,"♛"),
    ROOK_WHITE(5,"♖"),ROOK_BLACK(5,"♜"),BISHOP_WHITE(3.5,"♗"), BISHOP_BLACK(3.5,"♝"),
    KNIGHT_WHITE(3,"♘"),KNIGHT_BLACK(3,"♞"),PAWN_WHITE(1,"♙"),PAWN_BLACK(1,"♟"),
    EMPTY(-1,"_");
    private double lvl;
    private String icon;

    ChessPiece(double lvl, String icon) {
        this.lvl = lvl;
        this.icon = icon;
    }

    @Override
    public String toString() {
        return getIcon();
    }

    public String getIcon() {
        return icon;
    }
}
