import java.util.Objects;

public class Notebook {
    private int id;
    private String model;
    private String processor;
    private int ram;
    private int hdd;
    private String videoCard;
    private String os;
    private int price;

    public Notebook(int id, String model, String processor, int ram, int hdd, String videoCard, String os, int price) {
        this.id = id;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.videoCard = videoCard;
        this.os = os;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public String getOs() {
        return os;
    }

    public int getPrice() {
        return price;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, модель: %s, цена: %d", id, model, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return id == notebook.id &&
                ram == notebook.ram &&
                hdd == notebook.hdd &&
                price == notebook.price &&
                Objects.equals(model, notebook.model) &&
                Objects.equals(processor, notebook.processor) &&
                Objects.equals(videoCard, notebook.videoCard) &&
                Objects.equals(os, notebook.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, processor, ram, hdd, videoCard, os, price);
    }
}
