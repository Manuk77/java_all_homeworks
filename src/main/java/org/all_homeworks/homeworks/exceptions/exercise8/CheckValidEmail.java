package org.all_homeworks.homeworks.exceptions.exercise8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CheckValidEmail {
    private Pattern pattern;
    private Matcher matcher;
    private final String PATTERN_MATCHER = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public CheckValidEmail(){
        pattern = Pattern.compile(PATTERN_MATCHER);
    }

    /**
     *
     * @param emailStr
     * @return if the given String emailStr is valid or not
     */
    public boolean isValidEmail(final String emailStr){
        matcher = pattern.matcher(emailStr);
        return matcher.matches();
    }
}
