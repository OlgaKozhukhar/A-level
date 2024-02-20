package ua.kozhukhar.hw9;

public class Task2 {
    public static void main(String[] args) {
        try {
            // Вызов метода f(), который может выбросить исключение
            f();
        } catch (CustomException e) {
            // Перехватываем исключение из метода f() и печатаем сообщение
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }
    }

    static void f() throws CustomException {
        try {
            // Вызываем метод g(), который может выбросить исключение
            g();
        } catch (Exception e) {
            // Перехватываем исключение из метода g() и выбрасываем другое исключение
            throw new CustomException("Исключение в методе f() из-за исключения в методе g()");
        }
    }

    static void g() throws Exception {
        // Генерируем исключение в методе g()
        throw new Exception("Исключение в методе g()");
    }

    // Класс для пользовательского исключения
    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }
}

