import java.util.Set;

public class BankService {

    private final Client CLIENT1 = new Client("Иванов", "1", 20000);
    private final Client CLIENT2 = new Client("Петров", "2", 60000);
    private final Client CLIENT3 = new Client("Сидоров", "3", 80000);
    private final Client CLIENT4 = new Client("Пупкин", "4", 35000);
    private final Client CLIENT5 = new Client("Васюткин", "5", 40000);
    private final Client CLIENT6 = new Client("Рогов", "6", 55000);
    private final Client CLIENT7 = new Client("Старов", "7", 78000);
    private final Client CLIENT8 = new Client("Коленов", "8", 64000);
    private final Client CLIENT9 = new Client("Попов", "9", 51000);
    private final Client CLIENT10 = new Client("Охрипов", "10", 65000);

    private Set<Client> clients = Set.of(CLIENT1, CLIENT2, CLIENT3, CLIENT4, CLIENT5, CLIENT6, CLIENT7, CLIENT8, CLIENT9, CLIENT10);

    public boolean getHypothec() {
        return true;
    }
}
