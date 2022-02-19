public class Developer {
    private String name;
    private int salariu;
    private int vechimea;
    private String tip;

    public Developer(String name, int salariu, int vechimea, String tip){
        this.name = name;
        this.salariu = salariu;
        this.vechimea = vechimea;
        this.tip = tip;
    }
    public String setName(String Name) {
        this.name = name;
        return name;
    }
    public String setsalariu(int salariu) {
        this.salariu = salariu;
        return salariu;
    }

    public String setvechimea(int vechimea) {
        this.vechimea = vechimea;
        return vechimea;
    }
    public String settip(String tip) {
        this.tip = tip;
        return tip;
    }

    public String toString() {
        return ("Nume: " + this.name + " salariu: " + this.salariu + " vechimea: " + this.vechimea + " tipul: " + this.tip);
    }
}
