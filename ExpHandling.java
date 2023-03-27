class UserNameException extends Exception{
    public UserNameException(String message){
        super(message);
    }
}

class PasswordException extends Exception{
    public PasswordException(String message){
        super(message);
    }
}

class CheckLogin{
    String username="Sivapriya";
    String password="Sivapriya03";

    public void CheckLoginUser(String username1)throws UserNameException {

        if (username1 == null || username1 != username)
            throw new UserNameException("Invalid username");

        else {
            System.out.println("Valid username");
        }
    }

    public void CheckLoginPass(String password1)throws PasswordException {
        if (password1.length() >= 8) {
            if (password1 == null || password1 != password) {
                throw new PasswordException("Invalid password");
            }
            else{
                System.out.println("Valid Password");

            }
        }
        else{
            System.out.println("Not having sufficient length");
        }
    }
}

    class ExpHandling{
    public static void main(String args[]){
        CheckLogin login = new CheckLogin();

        try{
           login.CheckLoginUser("Sivapriya");
        }
        catch(UserNameException e){
            System.out.println(e.getMessage());
        }
        try{
            login.CheckLoginPass("Sivapriya03");
        }
        catch(PasswordException e){
            System.out.println(e.getMessage());
        }
    }
    }






