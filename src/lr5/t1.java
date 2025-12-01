package lr5;

public class t1 {
    private char symbol;

    //1 method
    public void setSymbol(char value) {
        this.symbol = value;
    }

    //2 method
    public int getCharCode() {
        return (int) this.symbol;
    }

    //3 method
    public void printSymbolAndCode() {
        System.out.println("Символ: '" + this.symbol + "', Код: " + (int) this.symbol);
    }


    public static void main(String[] args) {

        t1 pro = new t1();

        pro.setSymbol('A');

        pro.printSymbolAndCode();

    }
}
