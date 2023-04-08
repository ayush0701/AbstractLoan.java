
public class Main {
    public static  void call(Loan loan){
        loan.loanType();
        loan.loanRate(1);
    }
    public static void main(String[] args) {
        call(new HomeLoan());
        call(new EtdLoan());
        call(new PersonalLoan());
    }
}
