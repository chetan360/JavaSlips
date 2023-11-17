class EmailId {
    public String username;
    public String password;
    
    EmailId() {
        this.username = "";
        this.password = "";
    }
    
    EmailId(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public boolean verifyUsername() {
        int i = username.indexOf('@');
        if(username.isEmpty() || i == -1 || username.length() <  10 || username.length() > 50) {
            return false;
        }
        return true;
    }
    
    public boolean verifyPassword() {
        boolean hasSpecialSymbol = password.matches("[a-zA-Z0-9]*");
        boolean hasCapital = !password.equals(password.toLowerCase());
        
        if(!hasSpecialSymbol || !hasCapital || password.isEmpty() || password.length() < 8 || password.length() > 20) {
            return false;
        }
        return true;
    }
}

class InvalidUsernameException extends Exception {
    InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}

public class Slip11Q2 {
    public static void main(String[] args) {
        //accept input from command line
        if(args.length < 2) {
            System.out.println("Please provide 2 arguments.");
            return;
        }
        
        EmailId user = new EmailId(args[0], args[1]);
        
        try {
            if(!user.verifyUsername()) {
                throw new InvalidUsernameException("Envalid username.");
            } else if(!user.verifyPassword()) {
                throw new InvalidPasswordException("Envalid password.");
            }
            
            System.out.println("Login Succesfull.");
        } catch(InvalidUsernameException | InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
