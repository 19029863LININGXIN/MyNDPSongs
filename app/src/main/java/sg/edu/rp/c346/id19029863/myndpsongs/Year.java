package sg.edu.rp.c346.id19029863.myndpsongs;

import java.io.Serializable;

public class Year implements Serializable {
    private int year;

    public Year(int year) {
        this.year = year;
    }

    public String toString() {
        return String.valueOf(year);
    }
}


