public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper(){
        return this.paper;
    }

    public int getToner(){
        return this.toner;
    }

    public int print(int num1, int num2) {
        if (this.paper >= (num1 * num2)) {
            return this.paper - (num1 * num2);
            return this.toner - (num1 * num2);
        }else{
            return this.paper;
            return this.toner;
        }
    }

    public int refill(int i) {
        this.paper = 100;
        return this.paper;
    }


}
