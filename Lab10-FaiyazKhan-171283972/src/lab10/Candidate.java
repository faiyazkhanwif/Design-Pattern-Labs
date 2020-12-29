/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author faiya
 */
public class Candidate {
    private final String NAME, CERTIFICATION, WORK_LOCATION;

    public Candidate(String NAME, String CERTIFICATION, String WORK_LOCATION) {
        this.NAME = NAME;
        this.CERTIFICATION = CERTIFICATION;
        this.WORK_LOCATION = WORK_LOCATION;
    }

    public String getNAME() {
        return NAME;
    }

    public String getCERTIFICATION() {
        return CERTIFICATION;
    }
    
    public String getWORK_LOCATION() {
        return WORK_LOCATION;
    }
}
