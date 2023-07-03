public class JvmComprehension {

    public static void main(String[] args) {
        int i = 1;                      // Загружается ClassLoader, примитивная переменная добавляется в Stack Memory
        Object o = new Object();        // Оператор new выделит объем памяти в куче, создаётся конструктор в выделенном объеме памяти, объект будет находиться в куче, а ссылка на него в Stack Memory
        Integer ii = 2;                 // Объект будет находиться в куче, а ссылка на него в Stack Memory
        printAll(o, i, ii);             // Под метод создаётся новый фрейм в стеке, ссылка на объект копируется из кучи
        System.out.println("finished"); // Создаётся фрейм, в который будет передано значение
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // Объект будет находиться в куче, а ссылка на него в Stack Memory. Неиспользуемый объект, можен быть удалён сборщиком мусора
        System.out.println(o.toString() + i + ii);  // Создаётся объект строки в куче; создаётся фрейм, в который будет передано значение выражения
    }
}
