package example1;

public class ExhaustPart extends Part {
    private boolean IsConformToEU;

    public ExhaustPart (String producerName, String idNumber, String model, String batch,
                 boolean IsConformToEU){
        setProducerName(producerName);
        setIdNUmber(idNumber);
        setModel(model);
        setBatch(batch);
        this.IsConformToEU = IsConformToEU;

    }

    public ExhaustPart(boolean isconformToEU) {
        IsConformToEU = isconformToEU;
    }

    public boolean isConformToEU() {
        return IsConformToEU;
    }

    public void setConformToEU(boolean conformToEU) {
        IsConformToEU = conformToEU;
    }
}
