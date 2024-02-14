public class Team extends Human implements IFeatures{
    public Team(String name, String gender, int old, String city) {
        super(name, gender, old, city);
    }

    @Override
    public void loop(String name) {

    }

    @Override
    public void play(Team team) {
        System.out.println(team.city);
    }

    @Override
    public void stop(Team team) {
        System.out.println(team.name+" Sezonu erken kapattın!");
    }
}
