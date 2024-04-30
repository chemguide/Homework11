public class Main {
    public static void main(String[] args) {
        int year = 2024;
        checkLeap(year);
        int clientDeviceYear = 2015;
        int deviceOS = 1;
        checkAppVersion(clientDeviceYear, deviceOS);
        int deliveryDistance = 95;
        calculateDeliveryTime(deliveryDistance);
    }

    public static void checkLeap(int year) {
        System.out.println("\n\nЗадача 1");
        long yearRestDivFour = year % 4;
        long yearRestDivOneHundred = year % 100;
        long yearRestDivFourHundred = year % 400;
        boolean divFour = yearRestDivFour == 0;
        boolean divOneHundred = yearRestDivOneHundred == 0;
        boolean divFourHundred = yearRestDivFourHundred == 0;
        boolean validYear = year >= 1584;
        if (validYear) {
            if (divFourHundred) {
                System.out.printf("%s год - високосный год", year);
            } else if (divFour && !divOneHundred) {
                System.out.printf("%s год - високосный год", year);
            } else {
                System.out.printf("%s год - невисокосный год", year);
            }
        } else {
            System.out.print("Введите год позднее 1584");
        }
    }

    public static void checkAppVersion(int deviceYear, int deviceOS) {
        System.out.println("\n\nЗадача 2");
        int deviceBorderYear = 2015;
        boolean oldDevice = deviceYear < deviceBorderYear;
        if (deviceOS == 1) {
            if (oldDevice) {
                System.out.print("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.print("Установите версию приложения для Android по ссылке");
            }
        } else if (oldDevice) {
            System.out.print("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.print("Установите версию приложения для iOS по ссылке");
        }
    }
    public static void calculateDeliveryTime(int deliveryDistance) {
        System.out.println("\n\nЗадача 3");
        boolean oneDay = deliveryDistance <= 20;
        boolean twoDays = (deliveryDistance > 20) && (deliveryDistance <= 60);
        boolean threeDays = (deliveryDistance > 60) && (deliveryDistance <= 100);
        boolean noLogistic = deliveryDistance > 100;
        if (oneDay) {
            System.out.println("Потребуется дней: 1");
        }
        if (twoDays) {
            System.out.println("Потребуется дней: 2");
        }
        if (threeDays) {
            System.out.println("Потребуется дней: 3");
        }
        if (noLogistic) {
            System.out.println("Доставки нет");
        }
    }
}