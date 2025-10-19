package lab_lis_ordinario;

public class Desktop extends Computer {
    private double caseHeigth;

    public Desktop(Strinf model, String manufacture, String operatingSystem, double caseHeigth) {
        super(model, manufacture, operatingSystem);
        this.caseHeigth = caseHeigth;
    }

    public double getCaseHeigth() {
        return caseHeigth;
    }


    public void setCaseHeigth(double caseHeigth) {
        this.caseHeigth = caseHeigth;
    }

    @Override
    public String getComputerType(){
        return "Computadora de escritorio";
    }

    @Override
    public int calculatePortabilityScore(){
        return (int) Math.round(5 + caseHeigth / 20.0);
    }

    @Override
    public String toString() {
        return "Desktop [caseHeigth=" + caseHeigth + "]";
    }
    
}
