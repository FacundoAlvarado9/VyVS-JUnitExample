public class StringToolbox {

    public String repeat(String word, int times){
        return String.format("%0" + times + "d", 0).replace("0", word);
    }

    public long countOccurrences(char c, String word){
        String wAux = word.toLowerCase();
        char cAux = Character.toLowerCase(c);
        return wAux.chars().filter(ch -> ch == cAux).count();
    }

    private boolean isVowel(char c){
        boolean result = false;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for(int i = 0; (i < vowels.length) && !result; i++){
            if(c == vowels[i] || c == Character.toUpperCase(vowels[i])){
                result = true;
            }
        }

        return result;
    }

    public boolean startsWithVowel(String word) {
        boolean result;
        if(word.length() > 0){
            result = isVowel(word.charAt(0));
        } else{
            result = false;
        }
        return result;
    }
}
