package Fundamentals.kyu8;

/*
Create a function which translates a given DNA string into RNA.
For example:
"GCAT"  =>  "GCAU"
 */

public class DNAToRNAConversion {
    public String dnaToRna(String dna) {
        return dna.replace("T", "U");
    }
}
