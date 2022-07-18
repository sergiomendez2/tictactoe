package tiktactoegame;

public enum Piece {
    HUMANPLAYER("X"),
    IAPLAYER("O");

    private final String piece;

    Piece(String piece) {
        this.piece = piece;
    }

    public String getPiece() {
        return piece;
    }
}
