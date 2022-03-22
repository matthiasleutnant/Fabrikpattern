package konzert;

import pattern.ProgrammInterface;

public class KonzertProgramm implements ProgrammInterface {

    private String programm;

    KonzertProgramm() {

    }

    public String getProgramm() {
        return programm;
    }

    void setProgramm(String programm) {
        this.programm = programm;
    }
}
