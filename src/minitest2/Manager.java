package minitest2;

public interface Manager {
    void displayAll();

    void addHuman(Human human);

    Human searchById(int id);

    Human deleteById(int id);

    Human updateById(int id);

    void sortByAveragePoint();

    double totalAveragePoint();
}
