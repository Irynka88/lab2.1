import java.util.List;
import java.util.Scanner;

public class Costumer {
    String name;
    int money;

    public Costumer(){

    }
    void greetings(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ім'я");
        name = scanner.nextLine();
        System.out.println("Власні кошти");
        money = scanner.nextInt();
        if(money < 200){
            System.out.println("У вас недостатньо коштів , мінімальна вартість процедури 200грн");
        }
    }

    int chooseServise(){
        System.out.println("Доброго дня! " + name + ", яку процедуру бажаєте? ");
        System.out.println("Щоб отримати список введіть кодове число '11' ");
        Scanner sc = new Scanner(System.in);
        int service = sc.nextInt();
        return service;
    }
    public void favorChoose () {
        System.out.println("Оберіть будь ласка , процедуру:");
        System.out.println("1.Фарбування брів фарбою/хною");
        System.out.println("2.Ламінування брів");
        System.out.println("3.Ламінування вій");
        System.out.println("4.Нарощення вій (класика / 2Д / 3Д + різні ефекти)");
        System.out.println("5.Макіяж нюд / вечірній / весільний");
        System.out.print("№: ");
    }


}
