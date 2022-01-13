package example1;

public class Part {
   private String ProducerName;
   private String idNUmber;
   private String model;
   private String batch;

    public String getProducerName() {
        return ProducerName;
    }

    public void setProducerName(String producerName) {
        ProducerName = producerName;
    }

    public String getIdNUmber() {
        return idNUmber;
    }

    public void setIdNUmber(String idNUmber) {
        this.idNUmber = idNUmber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}
