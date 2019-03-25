package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    List<Lab> labs;

    public Student() {
        this.labs = new ArrayList<>();
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (Lab l : this.labs) {
            if(l.getName().equals(labName)){
                return l;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if (getLab(labName) == null){
            throw new UnsupportedOperationException();
        }
        getLab(labName).setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        if(getLab(lab.getName()) == null){
            this.labs.add(lab);
        }
        lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    public String toString() {
        Collections.sort(labs);
        StringBuilder results = new StringBuilder();
        for (Lab l : this.labs) {
            results.append(l.getName() + " > " + l.getStatus() + "\n");
        }
        return results.substring(0, results.length()-1);
    }
}
