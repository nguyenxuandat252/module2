package ss19_string_regex.baitap.bai2;


public class PhoneNumberExampeTest {
    private static PhoneNumberExampe phoneNumberExample;
    public static final String[] validPhone = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidPhone = new String[]{"(a8)-(22222222)","(84)-(22b22222)","(84)-(9978489648)"};

    public static void main(String args[]) {
        phoneNumberExample = new PhoneNumberExampe();
        for (String phone : validPhone) {
            boolean isvalid = phoneNumberExample.validate(phone);
            System.out.println("Email is " + phone + " is valid: " + isvalid);
        }
        for (String phone : invalidPhone) {
            boolean isvalid = phoneNumberExample.validate(phone);
            System.out.println("Email is " + phone + " is valid: " + isvalid);
        }
    }
}
