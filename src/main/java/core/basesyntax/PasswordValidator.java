package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password != null && repeatPassword != null) {
            if (password.length() >= 10 && repeatPassword.equals(password)) {
                return;
            } else {
                throw new PasswordValidationException("Wrong passwords");
            }
        } else {
            System.out.println("Your password is empty");
        }
    }
}
