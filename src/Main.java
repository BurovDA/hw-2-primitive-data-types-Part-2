public class Main {
    public static void main(String[] args) {

        int initialAccount = 100; // Сумма на счету клиента
        int firstDeposit = 1250; // Сумма депозита
        int totalAmount = (initialAccount + firstDeposit);
        System.out.println("Сумма на счете после внесения депозита " + totalAmount);
        boolean accruals = true;

        int criteria;
        if (accruals) {
            criteria = 100;
        } else {
            criteria = 0;
        }
        int bonus = (firstDeposit / criteria);
        System.out.println("Количество начисленных бонусов " + bonus);

        int finalAmount = (bonus + totalAmount);
        System.out.println("Итоговая сумма на счете " + finalAmount);
    }
}




