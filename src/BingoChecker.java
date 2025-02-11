abstract class BingoChecker implements  Runnable{
    private  BingoCard card;
    private  BingoGame game;

    public BingoChecker(BingoGame game, BingoCard card) {
        this.game = game;
        this.card = card;
    }

}
