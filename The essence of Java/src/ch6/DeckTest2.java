package ch6;
//import ch6.Card;

public class DeckTest2 {
    public static void main(String[] args) {
        Deck d = new Deck();        // 카드 한 벌(Deck)을 만든다.
        Card c = d.pick(0);     // 섞기 전에 제일 위의 카드를 뽑는다.
        System.out.println(c);      // System.out.println(c.toString());과 같다.

        d.shuffle();                // 카드를 섞는다.
        c = d.pick(0);          // 섞은 후에 제일 위의 카드를 뽑는다.
        System.out.println(c);
    }
}

class Deck{
    final int CARD_NUM = 52;        // 카드의 개수
    Card cardArr[] = new Card[CARD_NUM];    // Card객체 배열을 포함

    Deck(){ // Deck의 카드를 초기화한다.
        int i=0;

        for(int k = Card.KIND_MAX; k > 0; k--){
            for(int n=0; n<Card.NUM_MAX; n++){
                cardArr[i++] = new Card(k, n+1);
            }
        }
    }

    Card pick(int index){   // 지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
        return cardArr[index];
    }

    Card pick(){
        int index = (int)(Math.random()*CARD_NUM);
        return pick(index);
    }

    void shuffle(){ // 카드의 순서를 섞는다.
        for(int i=0; i < cardArr.length; i++){
            int r = (int)(Math.random() * CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }

}   // Deck클래스의 끝