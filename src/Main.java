public class Main {
    public static void main(String[] args) {
        // Задание №1
        System.out.println("\nЗадание №1");
        String firstName = "Ivanov"   ;
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);

        // Задание №2
        System.out.println("\nЗадание №2");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        // Задание №3
        System.out.println("\nЗадание №3");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace('ё', 'е');
        System.out.println("Данные Ф.И.О. сотрудника — " + fullName2);




    }
}