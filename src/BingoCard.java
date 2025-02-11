import java.util.*;

public class BingoCard {
    private int id, counter  = 1;
    private int[][] card;

    public  BingoCard(){
        this.id = counter++;
        this.card = generateCard();
    }

    private int[][] generateCard() {
        int [][] card = new int[5][5];
        Random rand = new Random();

        for(int col = 0; col < 5; col++) {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 1 + col * 15; i <= 15 + col * 15; i++) {
                Collections.shuffle(numbers);
                for (int row = 0; row < 5; row++) {
                    if (col == 2 && row == 2) {
                        card[row][col] = 0;
                    } else {
                        card[row][col] = numbers.removeFirst();
                    }
                }
            }
        }
        return card;
    }
    public  int getId(){return  id;}
    public int[][] getCard() {return card;}
}
