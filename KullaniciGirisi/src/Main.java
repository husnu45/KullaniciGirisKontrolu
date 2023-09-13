
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        String username;
        String password;
        
        Scanner getDataFromUser = new Scanner (System.in);
        
        System.out.print("Enter Your Username : ");
        
        username = getDataFromUser.nextLine();
        
        System.out.print("Enter Your Password : ");
        
        password = getDataFromUser.nextLine();
        
        
        
        if(username.equals("husnu45") && password.equals("12345")){
            
            System.out.println("Login Success...Welcome");
            
        }
        
        else if(!username.equals("husnu45") && !password.equals("12345")){
            
            System.out.println("Login Failed...");
            System.out.println("Username and Password are incorrect !!! ");
            
            
        }
        
        else if(!username.equals("husnu45")){
            
            System.out.println("Username is incorrect !!!");
            
        }
        
        else if(!password.equals("12345")){
            
            System.out.println("Password is incorrect !!!");
            
            System.out.print("Would you like to reset your password ? : Enter  Yes or No :  " );
            
            String reset = getDataFromUser.nextLine();
            
            if(reset.equals("Yes")){
                
                System.out.print("Please Enter Your New Password : ");
                String newPassword = getDataFromUser.nextLine();
                
                
                if(newPassword.equals("12345")){
                    
                    System.out.println("New Password Cant Created...");
                    System.out.println("New Password Cannot be Same with Old Password !!");
                    System.out.println("Please Enter Different Password...");
                    
                    System.out.print("Please Enter Your New Password : ");
                    newPassword = getDataFromUser.nextLine();
                    
                }
                
                else{
                    
                    System.out.println("Password changed successfully");
                    System.out.println("Your New Password is " + newPassword);
                    System.out.println("Do not share your password with 3rd person !!!");
                    password = newPassword; 
                    
                    
                }
                
            }
            
            if(reset.equals("No")){
                
                System.out.println("Password not changed...");
                
            }
            
        }
        
        
        
    }
    
}
