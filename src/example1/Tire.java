package example1;

import example1.Part;

public class Tire extends Part {
    private int size;
    private int width;

    public Tire (String producerName, String idNumber, String model, String batch,
    int size,int width){
        setProducerName(producerName);
        setIdNUmber(idNumber);
        setModel(model);
        setBatch(batch);
        this.size = size;
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
