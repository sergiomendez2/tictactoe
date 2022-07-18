package tiktactoegame;

public enum Piece {
    HUMANPLAYER("O"),
    IAPLAYER("X");

    private final String piece;

    Piece(String piece) {
        this.piece = piece;
    }

    public String getPiece() {
        return piece;
    }
}
