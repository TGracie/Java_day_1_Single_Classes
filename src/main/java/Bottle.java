public class Bottle {
    private int volume;

    public Bottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int drink(int i) {
        return this.volume - (10 * i);
    }
}
