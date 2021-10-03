package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Card[] cards = new Card[20];
        cards = setMyFirstCardSet(1);
        for (Card c : cards) {
            System.out.println(c);
        }

    }

    public static Card[] setMyFirstCardSet(int fate) {
        // 創建空的卡牌陣列
        Card[] myFirstCardSet = new Card[20];
        //1.戰士 2.牧師 3.法師 4.武僧
        // 創建指定職業的牌組物件
        WarriorSet warriorSet = new WarriorSet();
//        switch (fate){
//            case 1:
//               WarriorSet warriorSet = new WarriorSet();
//                break;
//        }


        // 使用迴圈將指定職業的牌組物件內的卡牌陣列( warriorSet.getWarriorSet() )
        for (int i = 0; i < warriorSet.getWarriorSet().length; i++) {
            // 移到 myFirstCardSet 位置 0~9
            myFirstCardSet[i] = warriorSet.getWarriorSet()[i];
            // 移到 myFirstCardSet 位置 10~19
            myFirstCardSet[i + 10] = warriorSet.getWarriorSet()[i];
        }
        // 回傳卡牌陣列
        return myFirstCardSet;
    }

}
