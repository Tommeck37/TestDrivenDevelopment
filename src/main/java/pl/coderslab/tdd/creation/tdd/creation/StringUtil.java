package pl.coderslab.tdd.creation.tdd.creation;

public class StringUtil {

    public String reverse(String input){
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString();
    }

}
