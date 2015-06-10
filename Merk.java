public class Merk {
//private variabel
    private String designer;
    private String namapabrik;
    private String alamatpabrik;

    public Merk(String designer, String namapabrik, String alamatpabrik) {
        this.designer = designer;
        this.namapabrik = namapabrik;
        this.alamatpabrik = alamatpabrik;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public void setAlamatpabrik(String alamatpabrik) {
        this.alamatpabrik = alamatpabrik;
    }

    public void setNamapabrik(String namapabrik) {
        this.namapabrik = namapabrik;
    }

    public String getDesigner() {
        return designer;
    }

    public String getNamapabrik() {
        return namapabrik;
    }

    public String getAlamatpabrik() {
        return alamatpabrik;
    }

    @Override
    public String toString() {
        return "Merk{" +
                "designer='" + designer + '\'' +
                ", namapabrik='" + namapabrik + '\'' +
                ", alamatpabrik='" + alamatpabrik + '\'' +
                '}';
    }
}


