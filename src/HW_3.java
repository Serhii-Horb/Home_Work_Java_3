public class HW_3 {


    public static void main(String[] args) {
        /* 1. Создайте строку через new - I study Basic Java! */
        String str = new String("I study Basic Java!");
        /* 3. Распечатать пред-последний символ строки. Используем метод String.charAt().*/
        System.out.println(str.charAt(str.length() - 2));
        /* 4. Вырезать строку Java c помощью метода String.substring().*/
        System.out.println(str.substring(14, 18));
        /* 5. Преобразуйте строку к верхнему регистру.*/
        String upperCase = str.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCase);
        /* 6. Преобразуйте строку к нижнему регистру.*/
        String lowerCase = str.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCase);
        /* Вызов созданых методов */
        additionMethod(2, 2);
        subtractionMethod(2, 2);
        multiplicationMethod(2, 2);
        divisionMethod(2, 2);
    }

    /* 2. Напишите метод, который принимает в качестве параметра строку,
             передайте в этот метод строку, которую создали в п.1 */
    public void myString(String input) {
        System.out.println("Вы ввели строку: " + input);
    }

    /* 7. Создайте методы с математическими операциями +, -, *, /
          Каждый метод принимает два числа в параметрах и возвращает результат
          Вызовите все методы в main
          Результат распечатайте в консоль */
    public static void additionMethod(double a, double b) {
        System.out.println("Сумма введённых чисел: " + (a + b));
    }

    public static void subtractionMethod(double a, double b) {
        System.out.println("Разность введённых чисел: " + (a - b));
    }

    public static void multiplicationMethod(double a, double b) {
        System.out.println("Произведение введённых чисел: " + (a * b));
    }

    public static void divisionMethod(double a, double b) {
        System.out.println("Частное введённых чисел: " + (a / b));
    }
}