//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //constructer'li new kullanımı
        Human father=new Human("Süleyman","Erkek",47,"Giresun");
        Human mother=new Human("Nurcan","Kadın",45,"Samsun");
        System.out.println(mother.name);

        //team sınıfında human sınıfını extend ettik.
        Team team=new Team("Beşiktaş","Erkek",120,"İstanbul");
        team.play(team);

        Power power=new Power();
        //Interface sınıfından implementler
        power.loop("Yunus");
        team.stop(team);

        System.out.println("***********************");

        //abstract sınıf örnek.
        Tff tff=new Tff();

        tff.rules();
        tff.tactics();


    }
}