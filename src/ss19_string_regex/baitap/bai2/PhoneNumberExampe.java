package ss19_string_regex.baitap.bai2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExampe {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PHONE_REGEX= "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    public PhoneNumberExampe(){
        pattern= Pattern.compile(PHONE_REGEX);
    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
