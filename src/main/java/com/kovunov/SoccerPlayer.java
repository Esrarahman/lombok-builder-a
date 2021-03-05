package com.kovunov;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SoccerPlayer {
    private final String firstName;
    private final String lastName;
    private final String transferMarketId;
    private int age;
    private String team;
    private int height;
    private Foot strongFoot;
    private String agentName;
    public enum Foot {
        RIGHT, LEFT
    }
}
