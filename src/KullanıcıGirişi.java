import java.util.Scanner;

public class KullanıcıGirişi {
    public static void main(String[] args) {
        String username, password;
        String usennameValue = "berk";
        String passwordValue =  "rumeysa123";
        String newPassword, newPasswordC;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız: ");
        username = input.nextLine();

        System.out.print("Şifrenizi girinz: ");
        password = input.nextLine();

        if (usennameValue.equals(username))
        {
            if(password.equals(passwordValue))
            System.out.println("Başarılı Giriş Yaptınız");
            else
             {
                System.out.println("Şifrenizi sıfırlamak isterseniz 1 istemezseniz 2 yazınız.");
                System.out.print("Şeçiminiz: ");
                int a = input.nextInt();
                switch (a)
                {
                    case 1:
                         System.out.println("Yeni şifrenizi giriniz: ");
                         newPassword = input.nextLine();
                         if(newPassword.equals(passwordValue)){
                            System.out.println("Eski şifreyle aynı değer girildi tekrar deneyin.");
                        }
                         else
                        {
                            passwordValue = newPassword;
                            System.out.println("Başarıyla şifre değiştirildi Yeni şifre ile girildi");
                        }
                        break;
                    case 2:
                         break;
                    default:
                        System.out.println("Yanlış değer girdinizç");
                        break;
                }
            }
        }
        else
        {
            System.out.println("Kullanıcı adı bulunamadı.");
        }
    }
}
