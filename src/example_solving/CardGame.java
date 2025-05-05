package example_solving;

import java.util.*;

class Player{
    String playerNickname;
    Card[] hand = new Card[5];

    final int playerMoney = 10000;

    Player(String nickname) {
        this.playerNickname = nickname;
    }

    int getTotal(){
        int sum = 0;
        for(Card c : hand){
            sum += c.getNumber();
        }
        return sum;
    }

    // 포커 게임
    int getComparison(){
        int[] count = new int[Card.NUM_MAX];

        for(Card c : hand)
            count[c.getNumber() -1]++;

        boolean flush = this.flush();
        boolean staight = this.straight();
        boolean royal = this.royalFlush();

        int four = 0, three = 0, pairs = 0;

        for(int c : count){
            if(c == 4) four++;
            else if(c == 3) three++;
            else if(c == 2) pairs++;
        }

        if(this.royalFlush()){
            // System.out.println("로얄 플러시");
            return 9;
        } else if(this.flush() && this.straight()){
            // System.out.println("스트레이트 플러시");
            return 8;
        } else if(four >= 1){
            // System.out.println("포카드");
            return 7;
        } else if(three == 1 && pairs == 1){
            // System.out.println("풀하우스");
            return 6;
        } else if(flush){
            // System.out.println("플러쉬");
            return 5;
        } else if(staight){
            // System.out.println("스트레이트");
            return 4;
        } else if(three == 1){
            // System.out.println("트리플");
            return 3;
        } else if(pairs == 2){
            // System.out.println("투페어");
            return 2;
        } else if(pairs == 1){
            // System.out.println("원페어");
            return 1;
        } else {
            // System.out.println("하이 카드");
            return 0;
        }
    }

    // 스트레이트
    boolean straight(){
        int[] num = new int[5];
        for(int i=0; i< num.length; i++){
            num[i] = hand[i].getNumber();
        }
        Arrays.sort(num);
        for(int i=0; i<num.length-1; i++) {
            if(num[i+1] != num[i] + 1) {
                return false;
            }
        }
        return true;
    }

    // 플러쉬
    boolean flush(){
        int kind = hand[0].kind;
        for(int i=0; i<hand.length; i++){
            if(hand[i].kind != kind)
                return false;
        }
        return true;
    }

    boolean royalFlush(){
        int[] royal = {1, 13, 12, 11, 10};      // A, K, Q, J, 10
        boolean[] found = new boolean[5];
        int kind = hand[0].kind;

        // hand에 있는 카드 문양을 c에 하나하나 넣어서 검사
        for (Card c : hand) {
            // 하나라도 다르면 false
            if (c.kind != kind) return false;

            /*
                카드의 숫자를 가져옴
                카드 갯수 만큼 반복
                해당 숫자가 있을때 true
            */
            int num = c.getNumber();
            for (int i = 0; i < royal.length; i++) {
                if (num == royal[i]) {
                    found[i] = true;
                    break;
                }
            }
        }

        /*
        * 앞에 검사했던 문양,숫자 부분 저장 후 반복
        * 하나라도 false가 있다면 false 반환
        * */
        for(boolean b: found)
            if(!b) return false;

        return true;
    }
}

class Deck{
    final int CARD_NUM = 52;
    Card cardArr[] = new Card[CARD_NUM];

    Deck(){
        int i=0;

        for(int k=Card.KIND_MAX; k>0; k--){
            for(int n=0; n<Card.NUM_MAX; n++){
                cardArr[i++] = new Card(k, n+1);
            }
        }
    }

    Card pick(int index){
        return cardArr[index];
    }

    Card pick(){
        int index = (int)(Math.random() * CARD_NUM);

        return pick(index);
    }

    void shuffle(){
        for(int i=0; i<cardArr.length; i++){
            int r = (int)(Math.random() * CARD_NUM);

            Card tmp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = tmp;
        }
    }
}

class Card{
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    Card(){
        this(SPADE, 1);
    }

    Card(int kind, int number){
        this.kind = kind;
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public int getComparison(){
        return 0;
    }

    public String toString(){
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};   // 카드 모양
        String numbers = "0123456789XJQK";                              // 카드 숫자

        return kinds[this.kind] + ", number : " + numbers.charAt(this.number);
    }
}

public class CardGame {
    public static void main(String[] args) {

        //게임 참가 인원 설정
        System.out.print("게임에 참가할 플레이어수를 설정하세요.> ");
        Scanner scanner = new Scanner(System.in);

        int playerNum = scanner.nextInt();

        // 인원 설정 제한
        while (!(1 < playerNum && playerNum <= 4)) {
            System.out.print("플레이어가 너무 적거나, 많습니다, 재설정 해주세요.> ");
            scanner = new Scanner(System.in);
            playerNum = scanner.nextInt();
        }

        // 플레이어 몇명인지 출력
        System.out.println("플레이어: " + playerNum + "명");
        System.out.println();

        Player[] player = new Player[playerNum];
        String playername = "";

        for (int i = 1; i <= playerNum; i++) {
            System.out.printf("플레이어%d의 닉네임을 입력해주세요.> ", i);
            scanner = new Scanner(System.in);
            playername = scanner.nextLine();

            while (playername.length() >= 20) {
                System.out.print("닉네임을 20자 이내로 해주세요.> ");
                scanner = new Scanner(System.in);
                playername = scanner.nextLine();
            }

            player[i-1] = new Player(playername);
        }

        // 덱 섞기
        Deck d = new Deck();
        d.shuffle();
        int cardIndex = 0;

        // 총 점수
        int total = 0;
        int comparison = 0;

        //게임시작
        System.out.println("게임을 시작합니다.");
        for(int i=0; i<playerNum; i++){
            System.out.println();
            System.out.println("플레이어 " + playername + "의 카드");
            for (int j = 0; j < player[i].hand.length; j++) {
                player[i].hand[j] = d.pick(cardIndex++); // 카드 중복 없이 분배
                System.out.println(player[i].hand[j]);
            }
        }

        int winnerIndex = 0;
        int winnerScore = player[0].getComparison();

        for (int i = 0; i < player.length; i++) {
            int currentScore = player[i].getComparison();
            System.out.println("플레이어 " + player[i].playerNickname + " 점수: " + currentScore);

            if (currentScore > winnerScore) {
                winnerScore = currentScore;
                winnerIndex = i;
            }
        }
        System.out.println();
        System.out.println("\n승자는 플레이어 " + (winnerIndex + 1) + "입니다!");
    }
}


