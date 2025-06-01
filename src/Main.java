public class Main {
    public static void main(String[] args) {
        // Задание №1
        System.out.println("\nЗадание №1");
        String firstName = "Ivanov"   ;
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullNAme = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника — " + fullNAme);

        // Задание №2
        System.out.println("\nЗадание №2");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullNAme.toUpperCase());
        // Задание №3
        System.out.println("\nЗадание №3");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace('ё', 'е');
        System.out.println("Данные Ф.И.О. сотрудника — " + fullName2);




    }
}