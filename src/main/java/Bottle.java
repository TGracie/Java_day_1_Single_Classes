public class Bottle {
    private int volume;

    public Bottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int drink(int i) {
        if (volume >= (10 * i)) {
            return this.volume - (10 * i);
        } else {
            this.volume = 0;
            return this.volume;
        }
    }

    public int empty() {
        this.volume = 0;
        return this.volume;
    }

    public int fill() {
        this.volume = 100;
        return this.volume;
    }
}
