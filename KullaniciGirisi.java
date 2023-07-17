import java.util.Scanner;
public class KullaniciGirisi  {
    public static void main(String[] args) {
        String userName, password, answer, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız");
        userName = inp.nextLine();

        System.out.print("Şifreniz :");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");

        } else if (userName.equals("patika") && !(password.equals("java123"))) {
            System.out.print("Bilgileriniz Yanlış ! Şifrenizi sıfırlamak ister misiniz? (Evet veya Hayır) ");
            answer = inp.nextLine();

            if (answer.equals("Evet") || answer.equals("evet")) {
                System.out.print("Önceden kullanmadığınız yeni bir şifre giriniz:");
                newPassword = inp.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                } else
                    System.out.println("Şifre oluşturuldu");

            } else {
                System.out.println("Şifre oluşturmadınız.");
            }
        } else {
            System.out.println("Bilgiler yanlış");
        }
    }
}