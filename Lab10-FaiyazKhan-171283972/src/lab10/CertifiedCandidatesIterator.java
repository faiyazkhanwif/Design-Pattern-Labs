/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author faiya
 */
public class CertifiedCandidatesIterator implements Iterator {
    private String type;
    private int position = 0;
    private AllCandidates allCandidates;
    private ArrayList<Candidate> certifiedCandidate;

    public CertifiedCandidatesIterator(String type, AllCandidates allCandidates) {
        this.type = type;
        this.allCandidates = allCandidates;
        certifiedCandidate = new ArrayList<>();
        
        initializeCandidate(type);
    }

    private void initializeCandidate(String type) {       
        Iterator iterator = this.allCandidates.getAllCandidatesIterator();
        while (iterator.hasNext()) {
            Candidate candidate = (Candidate) iterator.next();
            if (candidate.getCERTIFICATION().equalsIgnoreCase(type)) {
                certifiedCandidate.add(candidate);
            }
        }
        if(certifiedCandidate.size()<=0){
            System.out.println("No candidate with that certification");
        }
    }
 
    @Override
    public boolean hasNext() {
        return (position<certifiedCandidate.size());
    }

    @Override
    public Candidate next() {
        Candidate candidate = certifiedCandidate.get(position);
        position += 1;
        return candidate;
    }
}
