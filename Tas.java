public class Tas {
//Variabel
    private String Model;
    private String Warna;
    private Merk namamerk;

//Constructor
    public Tas(Merk namamerk, String warna, String model) {
        this.namamerk = namamerk;
        Warna = warna;
        Model = model;
    }

//Setter
    public void setModel(String model) {
        Model = model;
    }

    public void setWarna(String warna) {
        Warna = warna;
    }

    public void setNamamerk(Merk namamerk) {
        this.namamerk = namamerk;
    }

//Getter
    public String getModel() {
        return Model;
    }

    public String getWarna() {
        return Warna;
    }

    public Merk getNamamerk() {
        return namamerk;
    }

    @Override
    public String toString() {
        return "Tas{" +
                "Model='" + Model + '\'' +
                ", Warna='" + Warna + '\'' +
                ", namamerk=" + namamerk +
                '}';
    }
}
