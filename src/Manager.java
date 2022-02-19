public class Manager {
    private String name;
    private int salariu;
    private int vechimea;

    public Manager(String name, int salariu, int vechimea){
        this.name = name;
        this.salariu = salariu;
        this.vechimea = vechimea;
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

    public String toString() {
        return ("Nume: " + this.name + " salariu: " + this.salariu + " vechimea: " + this.vechimea);
    }
}
}
