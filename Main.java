public class Reader {
    private String fullName;
    private int readerTicketNumber;
    private String faculty;
    private String birthDate;
    private String phoneNumber;

    // Конструктор
    public Reader(String fullName, int readerTicketNumber, String faculty, String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.readerTicketNumber = readerTicketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    // Методы takeBook() и returnBook() с перегрузкой
    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги");
    }

    public void takeBook(String... bookNames) {
        System.out.print(fullName + " взял книги: ");
        for (String book : bookNames) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги");
    }

    public void returnBook(String... bookNames) {
        System.out.print(fullName + " вернул книги: ");
        for (String book : bookNames) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Создание массива из пяти объектов класса Reader
        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Петров В. В.", 12345, "Информатика", "01.01.1990", "+7 (123) 456-7890");
        readers[1] = new Reader("Иванов А. И.", 67890, "Математика", "15.05.1985", "+7 (987) 654-3210");
        readers[2] = new Reader("Сидоров Г. П.", 11111, "Физика", "20.12.1995", "+7 (111) 222-3333");
        readers[3] = new Reader("Козлов Н. В.", 22222, "Химия", "05.08.1988", "+7 (222) 333-4444");
        readers[4] = new Reader("Смирнов Л. М.", 33333, "Биология", "10.03.1992", "+7 (333) 444-5555");

        // Пример использования методов
        readers[0].takeBook(3);
        readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");

        readers[2].returnBook("История", "Поэзия");
        readers[3].returnBook(2);
    }
}
