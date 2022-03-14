import java.util.*;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('G', 'C');
        map.put('C', 'G');
        map.put('T', 'A');
        map.put('A', 'U');

        StringBuffer res = new StringBuffer();
        for(char ntd: dnaStrand.toCharArray()){
            res.append(map.get(ntd));
        }


        return res.toString();
    }

}