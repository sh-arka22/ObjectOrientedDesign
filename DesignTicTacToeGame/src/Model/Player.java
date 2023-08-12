package Model;

public class Player {
    /**Attributes*/
    private String name;
    private PlayingPiece playingPiece;

    /**Constructor*/
    public Player(String name, PlayingPiece playingPiece) {
        this.setName(name);
        this.setPlayingPiece(playingPiece);
    }

    /**Setters*/
    public void setName(String name) {
        this.name = name;
    }
    public void setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }

    /**Getters*/
    public String getName() {
        return name;
    }
    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }


}
