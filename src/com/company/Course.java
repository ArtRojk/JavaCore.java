package com.company;

public class Course{
    String result;
    private int run;
    private int swim;
    private int jump;

    public Course(int run, int swim, int jump) {
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public String doIt(Team team) {
        result = "Команда номер: " + team.getName() + " " + '\n';
        for (Participant participant : team.getParticipants()) {
            result += "Имя клиента: " + participant.getName() + " " + '\n';
            int value = participant.getDistance();
            testRun(value)
                    .testSwim(value)
                    .testJump(value);
        }
        return result;
    }

    private Course testRun(int value) {
        if (value < run) result += "Пробежал - выполнил " + '\n';
        return this;
    }

    private Course testSwim(int value) {
        if (value < run + 100) result += "Проплыл - выполнил " + '\n';
        return this;
    }

    private Course testJump(int value) {
        if (value < jump - 50) result += "Прыгнул - выполнил " + '\n';
        return this;
    }
}
