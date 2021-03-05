package com.kovunov;

public class Main {
    public static void main(String[] args) {
        SoccerPlayer player = new SoccerPlayer.SoccerPlayerBuilder()
                .firstName("dfd")
                .lastName("dfd")
                .transferMarketId("ffdsf")
                .build();

        SoccerPlayer player1 = new SoccerPlayer.SoccerPlayerBuilder()
                .firstName("dfd")
                .lastName("dfd")
                .transferMarketId("ffdsf")
                .build();


        System.out.println(player);
        System.out.println(player.equals(player1));
    }
}
