package OS;

public class SecondMan {
    public static void main(String[] args) {

        FirstMan anotherTread = new FirstMan();
        System.out.println("Запуск потока...");

        try {
            anotherTread.run();
            anotherTread.join();
            System.out.println("Принял\nВыключаюсь...");
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {}
    }
}
