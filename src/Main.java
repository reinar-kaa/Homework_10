public class Main {
    public static void main(String[] args) {
        String phone = "+960-415-75-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
//            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79872028921";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        task1();
        task2();
        task3();
    }

    private static void task3() {
        //Система, в которой мы работаем, не принимает символ “ё”.
        //Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        //В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        //Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
        String fullName = "Иванов Семён Семёнович";
        String swapLetter = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника  — " + swapLetter);
    }

    private static void task2() {
        //Напишите программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
        //В качестве строки с исходными данными используйте строку fullName.
        //Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase);
     }

    private static void task1() {
        //Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в неструктурированном формате,
        // и бухгалтерия попросила написать программу, в которой можно работать с Ф.И.О. сотрудников.
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println(lastName + firstName + middleName);
    }
}