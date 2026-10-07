package Office2026;

public class Main {


    public static void main(String[] args) {
        NameEmployee director = new NameEmployee("Иван Иванов", "Директор");

        DirectorEmployeeSearcher searcher = new DirectorEmployeeSearcher();
        searcher.addSubordinate(new NameEmployee("Пётр Петров", "Менеджер"));
        searcher.addSubordinate(new NameEmployee("Анна Сидорова", "Бухгалтер"));
        searcher.addSubordinate(new NameEmployee("Олег Кузнецов", "Инженер"));

        searcher.searchByName(director, "Анна Сидорова");
        searcher.searchByName(director, "Мария Смирнова");
    }
}


