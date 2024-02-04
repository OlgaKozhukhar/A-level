package ua.kozhukhar.hw9;

public class Task1 {

    public static void main(String[] args) {
        try {
            // Выбрасываем исключение с аргументом "Пример исключения"
            throw new Exception("Пример исключения");
        } catch (Exception e) {
            // Перехватываем исключение и печатаем аргумент String
            System.out.println("Перехвачено исключение: " + e.getMessage());
        } finally {
            // Блок finally, который будет выполнен в любом случае
            System.out.println("Блок finally выполнен.");
        }
    }
}
