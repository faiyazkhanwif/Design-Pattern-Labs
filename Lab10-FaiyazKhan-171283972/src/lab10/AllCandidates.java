/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author faiya
 */
public class AllCandidates {
    private ArrayList<Candidate> data;

    public AllCandidates() {
        data = new ArrayList<>();
        try {
            BufferedReader inputStream = new BufferedReader(new FileReader("Candidates.txt"));
            String input = inputStream.readLine();
            do {
                String[] info = input.split(",");
                data.add(new Candidate(info[0], info[1], info[2]));
            } while ((input = inputStream.readLine()) != null);

            inputStream.close();
        } catch (IOException e) {
        }
    }

    public Iterator<Candidate> getAllCandidatesIterator() {
        return data.iterator();
    }

    public Iterator<Candidate> getCertifiedCandidatesIterator(String type) {
        return new CertifiedCandidatesIterator(type, this);
    }

}
