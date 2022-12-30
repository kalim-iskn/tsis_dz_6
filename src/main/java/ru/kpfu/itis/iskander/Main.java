package ru.kpfu.itis.iskander;

public class Main {

    private static int orderPrice = 1000;
    private static int deliveryPrice = 1500;
    private static int itemPrice = 150;
    private static int dailyUsage = 100;
    private static int dailyStoragePricePerItem = 1;

    public static void main(String[] args) {
        // Затраты на оформление и доставку одной паркии (K)
        int orderFixedCost = orderPrice + deliveryPrice;
        //  Размер оптимальной партии (по формуле Уилсона Q) sqrt((2*K*v)/s )
        double orderVolume = Math.sqrt(2 * orderFixedCost * dailyUsage / dailyStoragePricePerItem);
        // Время между поставками (тау τ) Q/v
        double timeBetweenOrders = orderVolume / dailyUsage;
        //Средний объем запаса (Z) Q/2
        double averageStorage = orderVolume / 2;
        System.out.println("Размер оптимальной партии: " + orderVolume + " кг");
        System.out.println("Время между поставками: " + timeBetweenOrders + " дней");
        System.out.println("Средний объем запасов: : " + orderVolume + " кг");
    }
}
