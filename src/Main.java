public class Main {
    public static void main(String[] args) {

        int initialAccount = 100; // Сумма на счету клиента
        int firstDeposit = 1250; // Сумма депозита
        int totalAmount = (initialAccount + firstDeposit);
        System.out.println("Сумма на счете после внесения депозита " + totalAmount);
        int bonusAmount = 100;
        int bonus;
        if (firstDeposit > 1000) {
            bonus = (firstDeposit / bonusAmount);
        } else {
            bonus = 0;
        }
        System.out.println("Количество начисленных бонусов " + bonus);
        int finalAmount = (bonus + totalAmount);
        System.out.println("Итоговая сумма на счете " + finalAmount);
    }
}




