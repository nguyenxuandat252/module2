package ss19_string_regex.thuchanh.bai2;


public class AccountExampleTest {
    private static ClassExample accountExample;
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_"};

    public static void main(String args[]) {
        accountExample = new ClassExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Email is " + account + " is valid: " + isvalid);
        }
        for (String email : invalidAccount) {
            boolean isvalid = accountExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
    }
}
