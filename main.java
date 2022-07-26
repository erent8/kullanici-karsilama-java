import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {

        String password,userName,passwordReset,newPassword;

        Scanner inp=new Scanner(System.in);

        System.out.println("Enter your username:");
        userName= inp.nextLine();

        System.out.println("Enter the password:");
        password= inp.nextLine();

        if (userName.equals("eren") && password.equals("123456")){
            System.out.println("kullanıcı adı ve şifre doğru\nGiriş yaptınız");
        } else {
            System.out.println("Hatalı Şifre\nYeni bir parola belirlemek istiyorsanız onaylayın\"hayır\" veya \"evet\"");
            passwordReset= inp.nextLine();

            if (passwordReset.equals("hayır")){
                System.out.println("Oturum Sonlandırıldı");
            } else if (passwordReset.equals("evet")) {
                System.out.println("Yeni şifrenizi girin :");
                newPassword= inp.nextLine();
                if (newPassword.equals("123456")||newPassword.equals(password)){
                }else {
                    System.out.println("Yanlış giriş, yeni şifre girin");

                    System.out.println("Şifre başarıyla güncellendi");
                }
            }else{
                System.out.println("Yanlış deneme!");
            }
        }

    }
}
