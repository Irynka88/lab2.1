import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("――――PARADISE――――");

        Costumer client = new Costumer();
        client.greetings();

        Costumer chooseFavor = new Costumer();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        Employee firstBrow = new Employee("Олена", "бровист", "початківець");
        Employee firstLash = new Employee("Юлія", "lash-мейкер", "початківець");
        Employee firstMu = new Employee("Катерина", "візажист", "початківець");

        //Дні для акції
        Sale day1 = new Sale("вівторок");
        Sale day2 = new Sale("субота");

        Service paintBrow = new Service("Фарбування брів фарбою/хною", 200, 1.0);
        Service lamiBrow = new Service("Ламінування брів", 400, 1.0);
        Service lashLami = new Service("Ламінування вій", 400, 1.0);
        Service extension = new Service("Нарощення вій класика / 2Д /3Д + ефекти", 650, 2.5);
        Service makeup = new Service("Макіяж нюд / вечірній / весільний", 800, 2.5);


        //Вибір послуги і майстра

        switch (client.chooseServise()) {
            case 11:
                chooseFavor.favorChoose();
                int choose = s.nextInt();
                switch (choose) {
                    case 1:
                        paintBrow.moreInfo();
                        System.out.print("Майстер Олена: ");
                        firstBrow.employee();
                        paintBrow.findPrice(firstBrow);
                        break;
                    case 2:
                        lamiBrow.moreInfo();
                        System.out.print("Майстер Олена: ");
                        firstBrow.employee();
                        lamiBrow.findPrice(firstBrow);
                        break;
                    case 3:
                        lashLami.moreInfo();
                        System.out.print("Майстер Юлія: ");
                        firstLash.employee();
                        lashLami.findPrice(firstLash);
                        break;
                    case 4:
                        extension.moreInfo();
                        System.out.print("Майстер Юлія: ");
                        firstLash.employee();
                        extension.findPrice(firstLash);
                        break;
                    case 5:
                        makeup.moreInfo();
                        System.out.println("Майстер Катерина: ");

                        firstMu.employee();
                        makeup.findPrice(firstMu);
                        break;
                    default:
                        System.out.println("В нас немає даної процедури ");
                }
                break;

        }
        System.out.print("Обери день : ");
        String day = s1.nextLine();
        switch (day){
            case "вівторок":
                day1.sale();
                break;
            case "субота":
                day2.sale();
                break;
            default:
                System.out.println("У вівторок та суботу у нас працює акція  , на жаль на обраний день акцій немає( ");
        }
    }
}