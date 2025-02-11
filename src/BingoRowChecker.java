
 class BingoRowChecker extends  BingoChecker{
    private int row;
     public BingoRowChecker(BingoGame game, BingoCard card, int row) {
         super(game, card);
         this.row = row;
     }

     @Override
    public void run() {

    }
}
