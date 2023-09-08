package AlgorithmsArrays.Sorting;

import java.util.Arrays;

public class SortString {

    private final String[] words = {
            "bacd",
            "aabc",
            "bcca",
            "aaaa",
            "aaba",
            "aaca",
            "aaab"
    };

    public static void main(String[] args) {
        SortString sortString = new SortString();
        sortString.sortAlphabet();
        Arrays.stream(sortString.words).forEach(System.out::println);
    }

    public void sortAlphabet(){
        for(int k =0; k < words[0].length(); k++) {
            System.out.println();
            for (int i = 0; i < words.length; i++) {
                // accumulate first word
                    int wordI =0;
                    for(int wI=0; wI <= k; wI++)
                        wordI += words[i].charAt(wI);
                    System.out.println(words[i]+" "+wordI);
                for (int j = i+1; j < words.length; j++) {
                    // accumulate each next word
                        int wordJ =0;
                        for(int wJ=0; wJ <= k; wJ++)
                            wordJ += words[j].charAt(wJ);
                    System.out.println(" <<<<<=========="+words[j]+" "+wordJ);

                    if(wordI > wordJ){
                        System.out.println("---------------- Swapping "+words[i] + " <and> "+words[j]);
                        String temp = words[i];
                        words[i] = words[j];
                        words[j] = temp;
                    }
                    wordI =0;
                    for(int wI=0; wI <= k; wI++)
                        wordI += words[i].charAt(wI);
                    System.out.println(words[i]+" "+wordI);
                }
            }
        }
    }
}
