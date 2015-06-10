public class TestTas {

    public static void main(String[]args){
        Merk Converse = new Merk("Converse","Converse","USA");
        System.out.println(Converse.toString());

        Tas Ransel = new Tas(Converse,"Biru","SlingBag");
        System.out.println(Ransel.toString());
        System.out.println(Ransel.getNamamerk().getDesigner());
    }
}
