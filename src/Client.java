public class Client {

    private String fio;
    private String id;
    public int monthlyPay;

    public Client(String fio, String id, int monthlyPay){
        this.fio = fio;
        this.id = id;
        this.monthlyPay = monthlyPay;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
