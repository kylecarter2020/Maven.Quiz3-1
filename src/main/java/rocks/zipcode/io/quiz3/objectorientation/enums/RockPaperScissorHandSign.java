package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        if(this == PAPER)
            return SCISSOR;
        else if (this == ROCK)
            return PAPER;
        else
            return ROCK;
    }

    public RockPaperScissorHandSign getLoser() {
        if(this == PAPER)
            return ROCK;
        else if (this == ROCK)
            return SCISSOR;
        else
            return PAPER;
    }
}