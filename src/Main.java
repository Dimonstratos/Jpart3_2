public class Main {

    public static void main(String[] args) {
        int client = 100; // на счете клиента
        int i = 1001; // сумма пополнения счета

        int bonus;
        if (i > 1000) {
            bonus = i / 100 + client + i;
        } else {
            bonus = i + client;
        }
        System.out.println((bonus) +  "рублей на Вашем счете с учетом бонусов.");
    }
}