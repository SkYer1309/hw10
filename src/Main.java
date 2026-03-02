
public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1");
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich ";
        String foolName = (firstName + middleName + lastName);
        System.out.println("Ф. И. О. сотрудника — " + foolName);

        System.out.println("\nЗадача 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + foolName.toUpperCase());

        System.out.println("\nЗадача 3");
        foolName = "Иванов Семён Семёнович";
        foolName = foolName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника  — " + foolName);
    }
}