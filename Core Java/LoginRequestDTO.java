public class LoginRequestDTO {
    String userName = "";
    String PassWord = "";
    String Email = "";
    String City = "";
    int id ;
    String fathername;
    String mothername;
    Long MobileNumber ;
public LoginRequestDTO(String UserName, String PassWord, String Email, String City, int id, String fathername, String mothername, Long MobileNumber ) {
    this.userName = UserName;
    this.PassWord = PassWord;
    this.Email = Email;
    this.City = City;
    this.id = id;
    this.fathername = fathername;
    this.mothername = mothername;
    this.MobileNumber = MobileNumber;
    
}
public static void main(String[] args) {
    LoginRequestDTO user1 = new LoginRequestDTO("Shravani", "1234", "Shravani@gamil.com", "Hyderabad", 23, "prabhakar reddy", "prasanna", 9391171626L);
    System.out.println(user1.userName);
    System.out.println(user1.PassWord);
    System.out.println(user1.Email);
    System.out.println(user1.City);
    System.out.println(user1.id);
    System.out.println(user1.fathername);
    System.out.println(user1.mothername);
    System.out.println(user1.MobileNumber);
    

    }

}