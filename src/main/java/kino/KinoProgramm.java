package kino;


import pattern.ProgrammInterface;

public class KinoProgramm implements ProgrammInterface {

    private String programm;

    KinoProgramm(){

    }

    public String getProgramm() {
        return programm;
    }

    void setProgramm(String programm) {
        this.programm = programm;
    }
}
