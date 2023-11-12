
import java.awt.*;
import java.awt.event.*;

class Invalid extends Exception {
    Invalid(String message) {
        super(message);
    }
}

class LoginScreen {
    private TextField userField, passField;
    private Button loginBtn, clrBtn;
    private int loginAttempts = 0;
    
    public LoginScreen() {
        Frame frame = new Frame("Login Form");
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 2));
        
        Label userLabel = new Label("Username :");
        Label passLabel = new Label("Password :");
        
        userField = new TextField();
        passField = new TextField();
        passField.setEchoChar('*');
        
        loginBtn = new Button("Login");
        clrBtn = new Button("Clear");
        
        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginBtn);
        frame.add(clrBtn);
        
        loginBtn.addActionListener((ActionEvent e) -> {
            try {
                validateLogin();
            } catch(Invalid x) {
                System.out.println(x.getMessage());
            }
        });
        
        clrBtn.addActionListener((ActionEvent e) -> {
            clearFields();
        });
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        frame.setVisible(true);
    }
    
    private void validateLogin() throws Invalid {
        String user = userField.getText();
        String pass = passField.getText();
        
        if(!user.equals(pass)) {
            loginAttempts++;
            if(loginAttempts >= 3) {
                throw new Invalid("Maximum login attempts reached. Access denied");
            } else {
                throw new Invalid("Username and password do not match. Remaining Attempts : " + (3 - loginAttempts));
            }
        } else {
            System.out.println("Login Successfull!");
            clearFields();
        }
    }
    
    private void clearFields() {
        userField.setText("");
        passField.setText("");
    }
    
}

public class Slip4Q2 {
    public static void main(String[] args) {
        new LoginScreen();
    }
}
