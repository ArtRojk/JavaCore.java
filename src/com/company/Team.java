package com.company;

public class Team {

        private String name;
        private Participant[] participants;

        public Team(String name, Participant[] participants) {
            this.name = name;
            this.participants = participants;
        }

        public String getName() {
            return name;
        }

        public Participant[] getParticipants() {
            return participants;
        }
    }



